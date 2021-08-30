package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforesuiteAnnotation 
{@Test
    public void beforeSuiteTesting()
	{
	System.out.println("before Suite execution");
	}
	@BeforeSuite
	public void before_suite() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\SOFT\\sdet 2\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.close();
	}

}