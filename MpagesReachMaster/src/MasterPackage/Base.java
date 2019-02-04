package MasterPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	
	public Base(WebDriver dr) {
		Base.driver=dr;

	}
	
	public void launchBrowser(String URL) {
		
System.setProperty("webdriver.chrome.driver", "C://Temp//javascript prog//chromedriver_win32//chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(URL);	
		
	}
	
	public void closeBrowser() {
		driver.quit();
	}
}
