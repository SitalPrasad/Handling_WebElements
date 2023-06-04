package Handling_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		String baseUrl="https://courses.letskodeit.com/practice/";
		driver.manage().window().maximize();
		driver.get(baseUrl);
		WebElement block=driver.findElement(By.xpath("//*[@id=\"checkbox-example-div\"]"));
		List <WebElement> lists=block.findElements(By.name("cars"));
		System.out.println(lists.size());
		for(int i=0;i<lists.size();i++) {
			lists.get(i).click();
		                                          }
		
	}

}
