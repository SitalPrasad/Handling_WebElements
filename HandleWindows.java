package Handling_WebElements;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class HandleWindows {
       static WebDriver driver;
		public static void main(String[] args) {
			 WebDriverManager.edgedriver().setup();
			    driver=new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
			String  wid=driver.getWindowHandle();
			System.out.println(wid);
			driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
              Set<String> wids=driver.getWindowHandles();
                //using Iterator method
           /*   Iterator<String> itr=wids.iterator();
              String parentWindowId=itr.next();System.out.println("parent  -->"+parentWindowId);
              String childWindowId=itr.next();System.out.println("child --> "+childWindowId);*/
              //using List/ArrayList
              List<String> list=new ArrayList(wids);  //converting Set to List
   /*           String firstWindowId=list.get(0);  System.out.println("parent  -->"+firstWindowId);
              String secondWindowId=list.get(1);System.out.println("child --> "+secondWindowId);
              
           //Swithing windows   
           driver.switchTo().window(firstWindowId);
           System.out.println(driver.getTitle());
           driver.switchTo().window(secondWindowId);
           System.out.println(driver.getTitle());       */
              for(String id: list) {
            	 // System.out.println(id);
            	  String title=driver.switchTo().window(id).getTitle();
            	  System.out.println(title);
            	  
            	  if(title.equalsIgnoreCase("OrangeHrm")){
            		  driver.close();
            	  }
            	                                                                                               //driver.quit();  //close all window
            	                                                                                              // driver.close();  //single browser window will close
              }
              
              
              
}	}
