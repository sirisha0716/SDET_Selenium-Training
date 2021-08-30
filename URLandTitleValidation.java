package test;

 

import org.openqa.selenium.WebDriver;

 

import org.openqa.selenium.chrome.ChromeDriver;

 


public class URLandTitleValidation {

 

    public static void main(String[] args) {
    
        System.setProperty("webdriver.chrome.driver","C:\\SOFT\\sdet 2\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        
        
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        String title = driver.getTitle();
        
    
        System.out.println(title);
       

 

        driver.close();
    }

 

}