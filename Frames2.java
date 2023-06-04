package Handling_WebElements;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Frames2 {
			static WebDriver driver;
	     	public static void main(String[] args) {
			 WebDriverManager.chromedriver().setup();
			    driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
				driver.get("https://demo.automationtesting.in/Frames.html");
				//driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
				List<WebElement> frames=driver.findElements(By.tagName("iframe"));
				System.out.println(frames.size());
				for(WebElement frame:frames) {
				//	System.out.println(frame.getText());
				//	System.out.println(frame.getAttribute("name"));
				//	System.out.println(frame.getAttribute("innerHTML"));
				System.out.println(frame.getAttribute("id"));
					
					
				}
				
				
				
			//	driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
				
          //      WebElement outerFrame=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));

           //    WebElement singleFrame=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
}	}
