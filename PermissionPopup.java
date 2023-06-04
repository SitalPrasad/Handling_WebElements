package Handling_WebElements;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PermissionPopup {
	static WebDriver driver;
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		    
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("--disable-notifications");
		 
		    driver=new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://www.redbus.in/");

	
	
	
	
	
	}}
