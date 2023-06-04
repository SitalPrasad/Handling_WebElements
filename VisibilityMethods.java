package Handling_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VisibilityMethods {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		String baseUrl="https://courses.letskodeit.com/practice/";
		driver.manage().window().maximize();
		driver.get(baseUrl);
		boolean b1=driver.findElement(By.xpath("//*[@id=\"enabled-example-input\"]")).isEnabled();
		System.out.println("Text field Enabled is>"+b1); 
		driver.findElement(By.xpath("//*[@id=\"disabled-button\"]")).click();
		System.out.println("After clicking on disable button Text field>>>");
		boolean b2=driver.findElement(By.xpath("//*[@id=\"enabled-example-input\"]")).isEnabled();
		System.out.println("Text field Enabled is>"+b2);
		boolean b11=driver.findElement(By.xpath("//*[@id=\"displayed-text\"]")).isDisplayed();
		System.out.println("Text field Displayed is>"+b11);
		driver.findElement(By.xpath("//*[@id=\"hide-textbox\"]")).click();
		System.out.println("After clicking on hide button");
		boolean b22=driver.findElement(By.xpath("//*[@id=\"displayed-text\"]")).isDisplayed();
		System.out.println("Text field Displayed is>"+b22);
		boolean b3=driver.findElement(By.xpath("//*[@id=\"bmwcheck\"]")).isSelected();
		System.out.println("Check box  selected is>"+b3);
		driver.findElement(By.xpath("//*[@id=\"bmwcheck\"]")).click();
		System.out.println("After Selecting checkbox");
		boolean b4=driver.findElement(By.xpath("//*[@id=\"bmwcheck\"]")).isSelected();
		System.out.println("Check box  selected is>"+b4);
		
		//driver.quit();
	}

}
