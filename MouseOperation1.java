package Handling_WebElements;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class MouseOperation1 {  //double click
public static WebDriver driver;
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            System.out.println(driver.findElement(By.tagName("iframe")));
            List<WebElement> frames=driver.findElements(By.tagName("iframe"));
            for(WebElement frame: frames) {
            	System.out.println(frame.getAttribute("id"));
            }
            driver.switchTo().frame("iframeResult");
		
            driver.findElement(By.xpath("//input[@id='field1']")).clear();
			driver.findElement(By.xpath("//input[@id='field1']")).sendKeys("Sital");
            
            WebElement btn=driver.findElement(By.xpath("//button[text()='Copy Text']"));
            Actions dblclk=new Actions(driver);
            dblclk.doubleClick(btn).perform();
	}

}
