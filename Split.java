package Handling_WebElements;



public class Split {
//static WebDriver driver;
	public static void main(String[] args) {
		//Reference: 105326
//	WebDriverManager.chromedriver().setup();
//	driver=new ChromeDriver();
		String str="Reference: 105326";
		String a[]=str.split(" ");
		//a[0]="Reference:";
		//a[1]="105326";
		System.out.println(a[0]); 
		System.out.println(a[1]); 
		
		

	}

}
