package Handling_WebElements;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DatePick1 {
	static WebDriver driver;
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
			driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@id='dob']")).click();
		  String mon="Jan"; String yr="1971"; String dt="6";
			WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
			Select selectMonth=new Select(month);
			selectMonth.selectByVisibleText(mon);
			WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
			Select selectYear=new Select(year);
			selectYear.selectByVisibleText(yr);
			
		List<WebElement> actDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
			for(WebElement ad: actDates) {
			if(ad.getText().equals(dt)) {
				ad.click(); break;
			}}
			

	}

}
