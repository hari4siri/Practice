package MasterPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PatientReports {

	public void validatePatientSummary(WebDriver dr) throws InterruptedException {
		WebDriverWait w1 = new WebDriverWait(dr, 10);
		WebElement e1 = w1.until(ExpectedConditions.visibilityOfElementLocated(By.id("demographics")));
	    System.out.println("clinical Summary loads = " +e1.isDisplayed());
			 
	}
	
	
	public void clickPatientList(WebDriver dr) throws InterruptedException {
		Thread.sleep(2000);
		WebElement e2 = dr.findElement(By.xpath("//div[@id='backBtnDiv']//span[contains(text(),'Patient')]"));
		e2.click();
	}
	
	
	public void selectComponent(WebDriver dr, String value) throws InterruptedException {
		Thread.sleep(2000);
		WebElement e2 = dr.findElement(By.xpath("//span[@class='sec-name' and contains(text(), '"+value+"')]"));
		e2.click();
	}
	
	public void selectComponentlist(WebDriver dr, String value) throws InterruptedException {
		Thread.sleep(2000);
		WebElement e2 = dr.findElement(By.xpath("//span[@class='sec-name' and text()='"+value+"']"));
		e2.click();
	}
}
