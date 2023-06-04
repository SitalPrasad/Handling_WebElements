package Handling_WebElements;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUpAuthentication {
static WebDriver driver;
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//driver.get("http://the-internet.herokuapp.com/basic_auth");
			//Syntax
      //http://admin:admin@the-internet.herokuapp.com/basic_auth
     //http://user:password@URL
			driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
