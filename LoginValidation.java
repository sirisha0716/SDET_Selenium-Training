package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

 public class LoginValidation {

 

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
	   
	   driver.findElement(By.xpath("//b[contains(text(),'Admin')]")) ;
	   WebElement Admin = driver.findElement(By.xpath("//b[contains(text(),'Admin')]"));
	   Admin.click();
	   
	    if(driver.findElement(By.cssSelector("#menu_admin_UserManagement"))!= null)
          {
            System.out.println("User Management is Present");
          }
          else
          {
            System.out.println("User Managementis Absent");
          }
         
          if(driver.findElement(By.cssSelector("#menu_admin_Job"))!= null)
          {
            System.out.println("Job is Present");
          }
          else
          {
            System.out.println("User Managementis Absent");
          }
         
          if(driver.findElement(By.cssSelector("#menu_admin_Organization"))!= null)
          {
            System.out.println("Organization is Present");
          }
          else
          {
            System.out.println("Organization is Absent");
          }
         
          if(driver.findElement(By.cssSelector("#menu_admin_Qualifications"))!= null)
          {
            System.out.println("Qualification Present");
          }
          else
          {
            System.out.println("Qualification Absent");
          }
	   
	   driver.close();
    }

 }