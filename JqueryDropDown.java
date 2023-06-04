package Handling_WebElements;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class JqueryDropDown {
static WebDriver driver;
	public static void main(String[] args) {
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		 selectChoiceValues(driver,"choice 1");
	//	 selectChoiceValues(driver,"choice1", "choice2", "choice 1 2");
	//     selectChoiceValues(driver,"all");
	}			
		public static void selectChoiceValues(WebDriver driver, String... value) {
			
			List<WebElement> choice=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
			for(WebElement ch:choice) {
				String v1=ch.getText();
				for(String val: value) {
				if(val.equals(v1)) {
					ch.click(); break;
				}}
				
			}
		}

	}
