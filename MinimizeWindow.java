package test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MinimizeWindow {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\SOFT\\sdet 2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(1000);
		Dimension d = new Dimension(300,1080);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
	    driver.close();
	}


}