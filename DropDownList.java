package Handling_WebElements;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DropDownList {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	String baseUrl="https://www.wikipedia.org";//"https://www.way2automation.com/way2auto_jquery/index.php";
	driver.manage().window().maximize();
	driver.get(baseUrl);
//	driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]")).sendKeys("Euskara");
  /*  WebElement element=driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]"));
       Select select=new Select(element);    //Using Select Class
	   select.selectByValue("bn"); 	select.selectByVisibleText(""); select.selectByIndex(0); */
/*       List<WebElement> elements=driver.findElements(By.tagName("a"));    //Dropdown using SfindElements
       System.out.println(elements.size());   System.out.println(elements.get(4).getText());
       for(int i=0;i<elements.size();i++) {
    	   System.out.println(elements.get(i).getText());System.out.println(elements.get(i).getAttribute("href"));
    	 } */
	WebElement block=driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[2]"));
	List <WebElement> elements=block.findElements(By.tagName("a"));
	System.out.println(elements.size());
	for(WebElement element: elements) {
	//	System.out.println(element.getText());
		System.out.println(element.getAttribute("href"));
	}
	driver.quit();
	
}}//main class
