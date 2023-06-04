package Handling_WebElements;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOperatinDragDrop { //drag and drop
static WebDriver driver;
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement src=driver.findElement(By.xpath("//div[@id='box5']"));
			
			WebElement dest=driver.findElement(By.xpath("//div[text()='South Korea']"));
			Actions action=new Actions(driver);
			action.dragAndDrop(src, dest).perform();
	}

}
