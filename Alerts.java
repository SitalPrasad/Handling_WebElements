package Handling_WebElements;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
static WebDriver driver;
	public static void main(String[] args) {
	
			 WebDriverManager.chromedriver().setup();
			    driver=new ChromeDriver();
				driver.manage().window().maximize();http://the-internet.herokuapp.com/javascript_alerts
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("www.the-internet.herokuapp.com/javascript_alerts");
				 // accept
				//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
				//driver.switchTo().alert().accept(); 
				
				//accept/dismiss
				//driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
				//driver.switchTo().alert().accept();
			   //driver.switchTo().alert().dismiss();
			
				driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
				Alert alertWindow=driver.switchTo().alert();
				System.out.println(driver.switchTo().alert().getText());  //capture text
				alertWindow.sendKeys("Sital");              //entered value on alert window
			//	alertWindow.accept();
				alertWindow.dismiss();        //cancel
	}

}
