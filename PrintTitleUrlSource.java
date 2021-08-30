package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTitleUrlSource {
	   public static void main(String[] args) throws Exception {
		    
		   System.setProperty("webdriver.chrome.driver","C:\\SOFT\\sdet 2\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	       	               
	        driver.get("https://google.com/");
	        Thread.sleep(2000);
	        //print page title 
	        String title = driver.getTitle();
	        System.out.println("title: "+title);   
	       //Print Url
	        String Url=driver.getCurrentUrl();
	        System.out.println("Url: "+Url);   
	        //Print Page Source
	        String PageSource=driver.getPageSource();
	        //System.out.println("PageSource: "+PageSource);   
	       

	 

	        driver.close();
	   }

}
