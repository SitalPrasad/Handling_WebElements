package Handling_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		String baseUrl="https://money.rediff.com/gainers";
		driver.manage().window().maximize();
		driver.get(baseUrl);
		List <WebElement> rows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("Total Rows="+rows.size());
		List <WebElement> cols=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		System.out.println("Total Cols="+cols.size());
		for(int i=1; i<=10; i++) { //rows.size()
		//	System.out.println("+++++++"+row.getText());
			for(int j=1; j<=cols.size(); j++) { //table[@class='dataTable']/tbody/tr[1]/td
				System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]")).getText()+"     ");
			}
			System.out.println();
			
	//		System.out.println("||||||"+col.getText());
	//	}
		
	}
		driver.quit();
	}}
