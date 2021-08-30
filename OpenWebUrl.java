package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OpenWebUrl 
{
	@Test
  
	public void testopenurl() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\SOFT\\sdet 2\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://google.com/");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.close();
	}

}