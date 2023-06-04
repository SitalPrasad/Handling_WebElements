package Handling_WebElements;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class AutoCompleteGoogle {
public static WebDriver driver;
public static void main(String[] args) {

   WebDriverManager.chromedriver().setup();
   driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	String partialText="Contract"; String textToSelect="Full-Time Contract";
		
	WebElement total=driver.findElement(By.xpath("//label[text()='Employment Status']/parent::div/following-sibling::div//div[2]/i"));
	total.click();
	WebElement role=driver.findElement(By.xpath("//div[@role='listbox']"));//The one which is hidden
	String innerHTML=role.getAttribute("innerHTML");
	System.out.println(innerHTML);
	System.out.println("==============");
	String innerHTML1=role.getAttribute("class");
	System.out.println(innerHTML1);
	List <WebElement> elements=role.findElements(By.tagName("div"));
	for(WebElement el:elements) {
		System.out.println(el.getText());
	}
}}