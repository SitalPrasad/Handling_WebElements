package Handling_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsCommands {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		String baseUrl="https://courses.letskodeit.com/practice/";
		driver.manage().window().maximize();
		driver.get(baseUrl);
		driver.findElement(By.xpath("//*[@id='alert-example-div']//child::fieldset/input[1]")).sendKeys("Sital Prasad");
		driver.findElement(By.xpath("//div[@id='alert-example-div']/child::fieldset/input[3]")).click();
		//driver.findElement(By.xpath("//div[@id='alert-example-div']/child::fieldset/input[3]")).submit();
}}//main class
