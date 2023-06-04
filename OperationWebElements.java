package Handling_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OperationWebElements {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		String baseUrl="https://courses.letskodeit.com/practice/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		List <WebElement> elements=driver.findElements(By.xpath("//*[@id=\"page\"]/div[2]/div[2]/div/div/div/div"));
		for(int i=0; i<elements.size(); i++) {
		System.out.println(elements.size());
		//for(WebElement ele:elements) {
		
		System.out.println(elements.get(i).getClass());
		System.out.println(elements.get(i).getTagName());
		System.out.println(elements.get(i).getText());
			driver.quit();
		}
		
	}

}
