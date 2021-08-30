package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class VerifypageTitleTestmethod
{
    static WebDriver driver ;
	public static  void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\SOFT\\sdet 2\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		try {
			String Name = "Admin";
			String Psword = "admin123";
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(Name);
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(Psword);
			driver.findElement(By.id("btnLogin")).click();
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		@SuppressWarnings("unused")
		OrangeHrpPages orgpg = new OrangeHrpPages(driver);
		driver.findElement(By.linkText("Admin"));
		Thread.sleep(2000);
		String ReqText = Admin();
		System.out.println(ReqText);
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(2000);
		String PIMpage = PIM();
		System.out.println(PIMpage);
		driver.findElement(By.id("menu_dashboard_index")).click();
		Thread.sleep(2000);
		String Dashboardpage = LeaveDashBoard();
		System.out.println(Dashboardpage);
		driver.findElement(By.id("menu_directory_viewDirectory")).click();
		Thread.sleep(2000);
		String Directorypage = Directory();
		System.out.println(Directorypage);
		driver.findElement(By.id("menu_maintenance_purgeEmployee")).click();
		Thread.sleep(2000);
		String Maintainencepage = Maintanence();
		System.out.println(Maintainencepage);
}
	public static String Admin() {
		String ReqText = driver.findElement(By.id("menu_admin_UserManagement")).getText();
		return ReqText;
	}

	public static String PIM() {
		String ReqText = driver.findElement(By.id("menu_pim_viewEmployeeList")).getText();
		return ReqText;
	}

	public static String LeaveDashBoard() {
		String ReqText = driver.findElement(By.id("menu_dashboard_index")).getText();
		return ReqText;
	}

	public static String Directory() {
		String ReqText = driver.findElement(By.id("menu_directory_viewDirectory")).getText();
		return ReqText;
	}

	public static String Maintanence() {
		String ReqText = driver.findElement(By.id("menu_maintenance_purgeEmployee")).getText();
		return ReqText;
	}

}