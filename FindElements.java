package Handling_WebElements;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class FindElements {
public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Single WebElement--returns single webelement
/*		WebElement element=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        //Multiple WebElements using findelement returns single webelement
		WebElement element1=driver.findElement(By.xpath("//a"));
		System.out.println(element1.getText());  */
		
     List<WebElement> elements=driver.findElements(By.xpath("//a"));
     List<WebElement> singleElement=driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
     System.out.println(elements.size());
     System.out.println(singleElement.size());
     for(WebElement ele: elements) {
   //  System.out.println(ele.getText());
     System.out.println(ele.getAttribute("href"));
     }

}	}
