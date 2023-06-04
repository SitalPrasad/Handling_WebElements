package Handling_WebElements;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Frames {
static WebDriver driver;
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			
			driver.switchTo().frame("packageListFrame");
			driver.findElement(By.xpath("//a[@href='org/openqa/selenium/bidi/package-frame.html']")).click();
			
			driver.switchTo().defaultContent();
			
			driver.switchTo().frame("packageFrame");
			
			driver.findElement(By.xpath("//a[@href='BiDi.html']")).click();
			
			driver.switchTo().defaultContent();
			driver.switchTo().frame("classFrame");
	        System.out.println(driver.findElement(By.xpath("//a[text()='Concrete Methods']")).getText());


}	}//main class
