package MasterPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PatientSearch {
	
	public void searchPatient(WebDriver dr, String value) throws InterruptedException {
		Thread.sleep(2000);
		WebElement e1 = dr.findElement(By.id("searchInput"));
		e1.sendKeys(value);
		dr.findElement(By.id("srchbtn")).click();
	}

}
