package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

 public class ReadDashboardHeading {

 

    public static void main(String[] args) {
	
	    
    
        System.setProperty("webdriver.chrome.driver","C:\\SOFT\\sdet 2\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        
        
        driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']"));
        WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
       
	     driver.findElement(By.xpath("//input[@id='txtPassword']"));
        WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));

             username.sendKeys("Admin");
             password.sendKeys("admin123");
             driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
 
       String actualUrl="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
	     
       String expectedUrl= driver.getCurrentUrl();
	   
       Assert.assertEquals(expectedUrl,actualUrl);
	   
	   System.out.println("Login is Successful");
	   
	   driver.findElement(By.linkText("Dashboard")).click();
			String DashHead = driver.findElement(By.xpath("//div[@class='head']//child::h1")).getText();
			System.out.println(DashHead);
			
	   driver.close();
    }

 }