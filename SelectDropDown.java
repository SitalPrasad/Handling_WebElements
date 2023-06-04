package Handling_WebElements;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {
public static WebDriver driver;
	public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.get("https://www.opencart.com/index.php?route=account/register");
    driver.manage().window().maximize();
    /*    WebElement options=driver.findElement(By.xpath("//select[@id='input-country']"));
       Select select=new Select(options);  //select tag using select
    //	select.selectByIndex(1);
    //	select.selectByValue("2");
    	select.selectByVisibleText("Australia"); */
    WebElement selectTag=driver.findElement(By.xpath("//select[@id='input-country']"));
    Select select=new Select(selectTag);
    List<WebElement> options=select.getOptions();
    System.out.println(options.size());
    for(WebElement option:options)
    {
    //	System.out.println(select.getText());
    //System.out.println(select.getAttribute("value"));
    //	System.out.println(select.getTagName());
    if(option.getText().equals("Australia"))	{
    	System.out.println(option.getText());
    	option.click(); break;}}
    //Without Select class
/*    List<WebElement> options=driver.findElements(By.xpath("//select[@id='input-country']/option"));
    System.out.println(options.size());
    for(WebElement option:options)
    {
    //	System.out.println(select.getText());
    //System.out.println(select.getAttribute("value"));
    //	System.out.println(select.getTagName());
    if(option.getText().equals("Australia"))	{
    	System.out.println(option.getText());
    	option.click(); break;
    }  } */
    	
	}} 	
    	
    	
  
    
		  
			




