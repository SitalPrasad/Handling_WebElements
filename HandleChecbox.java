package Handling_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleChecbox {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://itera-qa.azurewebsites.net/home/automation");
	driver.manage().window().maximize();
	//1 Select specifc checkbox
  //  driver.findElement(By.xpath("//input[@id='monday']")).click();
	   //2 Select all day check Boxes
    List<WebElement> allDays=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id, 'day')]"));
  //  for(WebElement day: allDays) {
   // 	String id=day.getAttribute("id");//3 day.click(); for all
    //	if(id.equals("monday") || id.equals("tuesday")) {    //4 for specific checkboxes
    	//day.click();
    	
    	for(int i=allDays.size()-2;i<allDays.size(); i++) {  //5 last 2 checkbox u want to tick total chkboxes-no of check boxes to be selected
    		allDays.get(i).click();
    	
    
    	}
 //   } 
    //check all male female radio button
    

}}
