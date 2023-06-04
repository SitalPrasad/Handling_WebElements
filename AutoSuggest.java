package Handling_WebElements;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggest {
	static WebDriver driver;
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
			
			List <WebElement> lists1=driver.findElements(By.xpath("//ul[@role='listbox']//span"));
		
				for(WebElement list1:lists1) {
					System.out.println(lists1.size());
					System.out.println(list1.getText());
			if(list1.getText().contains("benefits")) {
				    list1.click();
					break;
				} 
					
			
			}  



	
	}	}
