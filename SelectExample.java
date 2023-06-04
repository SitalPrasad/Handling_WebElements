package Handling_WebElements;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class SelectExample {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	String baseUrl="https://www.wikipedia.org/";
	driver.get(baseUrl);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  /*  WebElement element=driver.findElement(By.xpath("//select[@id='searchLanguage']"));
    Select select=new Select(element);
    //select.selectByVisibleText("Eesti");   // select.selectByValue("ast");    //select.selectByIndex(0); 
    for(int i=0; i<select.getOptions().size(); i++) {
         System.out.println( select.getOptions().get(i).getText());  */
  List<WebElement> elements=driver.findElements(By.tagName("option"));
  System.out.println(elements.size());
   /*   for(WebElement ele:elements) {
      System.out.println(ele.getText()); 
      }*/
  for(int i=0; i<elements.size(); i++) {
	  System.out.println(elements.get(i).getText());  System.out.println(elements.get(i).getText());
  }
    
    
   
    
//	driver.quit();
}}//main class  
    
    
    
    
	
	



