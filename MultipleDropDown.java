package Handling_WebElements;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class MultipleDropDown {
public static WebDriver driver;
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(DurationOfSeconds(10));
			driver.get("https://www.opencart.com/index.php?route=account/register");
	/*		Approach1--with select class having multiple dropdowns
			Select select1=new Select(driver.findElement(By.xpath("")));
			select1.selectByVisibleText("");
			Select select2=new Select(driver.findElement(By.xpath("")));
			select2.selectByVisibleText("");
			Select select3=new Select(driver.findElement(By.xpath("")));
			select3.selectByVisibleText("");  */
	//2nd approach
			WebElement opt1=driver.findElement(By.xpath(""));
			selectFromMultipleDropdown(opt1,"");
			WebElement opt2=driver.findElement(By.xpath(""));
			selectFromMultipleDropdown(opt2,"");
			WebElement opt3=driver.findElement(By.xpath(""));
			selectFromMultipleDropdown(opt3,"");

}	
public static void selectFromMultipleDropdown(WebElement element, String value)	{
	Select select=new Select(element);
	List<WebElement> options=select.getOptions();
	for(WebElement option:options) {
		if(option.getText().equals(value)) {
			option.click();break;
		}	}
}}



