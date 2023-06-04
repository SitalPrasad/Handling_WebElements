package Handling_WebElements;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DatePicker {
static WebDriver driver;
	public static void main(String[] args) {
		   WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
			driver.manage().window().maximize();
		    driver.get("https://www.redbus.in/");
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Month and Year Selection
			String year="2023"; String month="Jun"; String date="7";
			
			driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
			while(true) {
					
			WebElement monthYear=driver.findElement(By.xpath("//td[@class='monthTitle']"));
			String mYear=monthYear.getText();
			String arr[]=mYear.split(" ");
			 String mon=arr[0]; String yr=arr[1];
			 
			 if(mon.equals(month) && yr.equals(year)) {
				 break;
			 }
			 else {
				 driver.findElement(By.xpath("//table[@class='rb-monthTable first last']//td[3]")).click();
			 }
        } //while   
		//date Selection
		List<WebElement> elDate=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		for(WebElement elD : elDate) {
			if(elD.getText().equals(date)) {
				elD.click(); break;
			}
		}
		
			}}//main class
