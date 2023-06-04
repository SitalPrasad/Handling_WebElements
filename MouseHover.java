package Handling_WebElements;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {// mouse hover
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       WebElement element= driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
       WebElement element1= driver.findElement(By.xpath("//a[text ()='Show All Laptops & Notebooks']"));
     
       Actions action=new Actions(driver);
       action.moveToElement(element).perform();
       action.moveToElement(element1).perform();
       
	}

}
