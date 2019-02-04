package MasterPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {
	
	 
	
	
	public void homepagevalidation(WebDriver dr, String value) throws InterruptedException {
		Thread.sleep(2000);
		WebElement e1 = dr.findElement(By.xpath("//div[@class='page-links']//div[text()='"+value+"']"));
		System.out.println("logged in =  "  + e1.isEnabled());
	}

	
	public  void selectPageLinks(WebDriver dr, String value) {
		WebElement e1 = dr.findElement(By.xpath("//div[@class='page-links']//div[text()='"+value+"']"));
		e1.click();
	}
}
