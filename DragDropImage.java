package Handling_WebElements;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DragDropImage {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		for(WebElement frame: frames) {
			System.out.println(frame.getAttribute("name"));
		}
		//switchto frame by xpath of iframe (if no id, name, index)
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		WebElement src=driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
		
		WebElement dest=driver.findElement(By.xpath("//div[@id='trash']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(src, dest).perform();
	}

}
