package Handling_WebElements;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class MouseOperations {  //Right Click
static WebDriver driver;
	public static void main(String[] args) {
		  WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://swisnl.github.io/jQuery-contextMenu/demo/trigger-hover-autohide.html");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			//WebElement element=driver.findElement(By.xpath("//select[@id='input-country']"));
		  //   Select select=new Select(element);
			
			WebElement btn=driver.findElement(By.xpath("//span[text()='hover over me']"));
			Actions action=new Actions(driver);
			action.contextClick(btn).perform();  //Right Click
			
	}

}
