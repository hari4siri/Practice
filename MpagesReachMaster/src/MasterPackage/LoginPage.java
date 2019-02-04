package MasterPackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {


	public void EnterUserName(WebDriver dr, String value) throws InterruptedException {
		WebElement e1 = dr.findElement(By.id("username"));
		Thread.sleep(2000);
		e1.clear();
		e1.sendKeys(value);
		
			}
		
	public void EnterPassword(WebDriver dr, String value) throws InterruptedException {
		WebElement e2 = dr.findElement(By.id("password"));
		Thread.sleep(2000);
			e2.clear();
			e2.sendKeys(value);
			}
	
	public void ClickOnLogin(WebDriver dr) throws InterruptedException {
		WebElement e3 = dr.findElement(By.id("loginBtn"));
		Thread.sleep(2000);
		e3.click();
		}
	
	public void ClickOnLogout(WebDriver dr) throws InterruptedException {
		WebElement e3 = dr.findElement(By.id("logout-button"));
		Thread.sleep(2000);
		e3.click();
		}
}