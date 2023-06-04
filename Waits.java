package Handling_WebElements;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Waits{
static WebDriver driver;
public static void main(String[] args ) {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	String baseUrl="http://www.google.com";
	driver.get(baseUrl);
	//Implicitly Wait

	/*	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//h3[text()='Selenium']")).click(); */
	
   // Explicitly Wait until a condition occurs--Element not interactable

	/*	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='q']"))).sendKeys("Selenium");
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//h3[text()='Selenium']")).click(); */
	
	//Fluent Wait polling time and ignoring exception
	
	Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
			                                        .withTimeout(Duration.ofSeconds(10))
			                                        .pollingEvery(Duration.ofSeconds(5))
	                                                .ignoring(NoSuchElementException.class);          
	
	
	
}

}

