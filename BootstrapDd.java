package Handling_WebElements;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDd {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Product Type
		
		driver.findElement(By.xpath("//div[@class='drp1']")).click();
	    List<WebElement> options1=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
	    clickOnOptions(options1,"Cards");
		System.out.println(options1.size());
	/*	for(WebElement opt1:options1) {
			if(opt1.getText().equals("Cards")) {
				opt1.click();
			}
		}*/
		//Product 
		driver.findElement(By.xpath("//div[@class='drp2']")).click();
		List<WebElement> options2=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		clickOnOptions(options2,"Credit Cards");
		System.out.println(options2.size());
	
	/*	for(WebElement opt11:options2) {
		     	if(opt11.getText().equals("Credit Cards")) {
				opt11.click(); break;
		     	}
		}*/
	
		
		//List<WebElement> options2=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
	//	System.out.println(options2.size());
	}
	public static void clickOnOptions(List<WebElement> elements, String value) {
		for(WebElement opt1:elements) {
			if(opt1.getText().equals(value)) {
				opt1.click(); break;
			}
	}

}}
			
			



