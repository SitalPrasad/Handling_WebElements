package Handling_WebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LaunchBrowser {
public static WebDriver driver;
public static void main(String[] args) {  
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://courses.letskodeit.com/practice/");// driver.navigate().to("https://courses.letskodeit.com/practice/");
	driver.get("https://courses.letskodeit.com");  //for navigation as xpath hard to find for links pseudo code::
	//getTitle() getCurrentUrl() getPageSource()
/*	String str=driver.getTitle(); System.out.println(str);
	String url=driver.getCurrentUrl(); System.out.println(url);
	String pgSource=driver.getPageSource(); System.out.println(pgSource); */
	
	//isDisplaye(), isSelected(), isEnabled()
/*	WebElement element=driver.findElement(By.xpath("//legend[text()='Checkbox Example']"));
	System.out.println(element.isDisplayed());
	
	WebElement ele=driver.findElement(By.xpath("//input[@id='bmwradio']"));
	System.out.println("BMW radio button is selected ="+ele.isSelected());
	
	driver.findElement(By.xpath("//input[@id='bmwradio']")).click();
	System.out.println("BMW radio button is selected ="+ele.isSelected());
	
	WebElement ele1=driver.findElement(By.xpath("//input[@id='disabled-button']"));
	System.out.println(ele1.isEnabled()); */
	//navigate().forward() navigate().back(), navigate().refresh()
	driver.findElement(By.xpath("//a[@class='btn btn-default btn-wide btn-lg dynamic-button']")).click();
	
	
	driver.navigate().back(); System.out.println("Backward"+driver.getTitle());
	
	driver.navigate().forward();System.out.println("Forward"+driver.getTitle());
	driver.navigate().refresh();
	
	
	
		

	}

}
