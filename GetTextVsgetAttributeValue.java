package Handling_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextVsgetAttributeValue {
public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(); driver.manage().window().maximize();
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.findElement(By.xpath("//input[@id='Email']")).clear();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Sital");
		WebElement  element=driver.findElement(By.xpath("//input[@id='Email']"));
		System.out.println(element.getAttribute("value"));  //value is attribute which is displayed on website's field
		System.out.println(element.getText());  //No text available
		System.out.println(element.getAttribute("name")); //Attribute name is name value comes as Email
		//capture text on button
		WebElement el=driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(el.getText());  //inner text on button  //div[@class='page-title']/h1
		
		//capture heading
		WebElement el1=driver.findElement(By.xpath("//div[@class='page-title']/h1"));
		System.out.println(el1.getText());

	}

}
