package MasterPackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.Ordering;

public class PatientList {

	
	public void selectTab(WebDriver dr, String value) throws InterruptedException {
		WebDriverWait w1 = new WebDriverWait(dr, 10);
		
		WebElement e1 = w1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='buttons']//span[text()='"+value+"']")));
		e1.click();
	}
	
	public void selectPatientList(WebDriver dr, String value) throws InterruptedException {
		Thread.sleep(2000);
		WebElement e1 = dr.findElement(By.id("pldropdown"));
		Select sl = new Select(e1);
		sl.selectByVisibleText(value);	
	}
	
	public void displayPatientList(WebDriver dr) throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> e1 = dr.findElements(By.id("pldropdown"));
		for(int i =0; i<e1.size(); i++)
		System.out.println(e1.get(i).getText());	
	}
	
	public void getSelectedOption(WebDriver dr) throws InterruptedException {
		Thread.sleep(2000);
		WebElement e1 = dr.findElement(By.id("pldropdown"));
		Select sl = new Select(e1);
		System.out.println(sl.getFirstSelectedOption().getText());
		
		
	}
	
	public void patientGrid(WebDriver dr) throws InterruptedException {
		Thread.sleep(2000);
		WebElement e1 = dr.findElement(By.id("patlist"));
	    System.out.println("patient Grid = " + e1.isDisplayed());
	}
	
	public void selectSorting(WebDriver dr, String value) throws InterruptedException {
		Thread.sleep(2000);
		WebElement e1 = dr.findElement(By.id("sort-drop-down"));
		Select sl= new Select(e1);
	    sl.selectByVisibleText(value);
	}
	
	public void sortedAlphabatically(WebDriver dr) throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> elementList= dr.findElements(By.xpath("//ol[@class='patients']//dd[@class='pat-nm']"));
		for(WebElement we:elementList){
		   System.out.println(we.getText());
		}
		   
		}
		
	public void sortedAgeWise(WebDriver dr) throws InterruptedException {
			Thread.sleep(2000);
			List<WebElement> elementList= dr.findElements(By.xpath("//ol[@class='patients']//dd[@class='pat-dob']"));
			for(WebElement we:elementList){
			   System.out.println(we.getText());
			   
			}
	}
	
	public void sortedGenderWise(WebDriver dr) throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> elementList= dr.findElements(By.xpath("//ol[@class='patients']//dd[@class='pat-sex']"));
		for(WebElement we:elementList){
		   System.out.println(we.getText());
		   
		}
}
	public void sortedLocationWise(WebDriver dr) throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> elementList= dr.findElements(By.xpath("//ol[@class='patients']//dd[@class='pat-attend']"));
		for(WebElement we:elementList){
		   System.out.println(we.getText());
		   
		}
}
	
	
	public void selectPatientfromlist(WebDriver dr, String value) throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> elementList= dr.findElements(By.xpath("//ol[@class='patients']//dd[@class='pat-nm']/div"));
		for(WebElement e: elementList) {
		if(e.getText().equals(value)) {
			e.click();
		}
		}
}
}
