package testscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import MasterPackage.HomePage;
import MasterPackage.Base;
import MasterPackage.LoginPage;
import MasterPackage.PatientList;
import MasterPackage.PatientReports;
import MasterPackage.PatientSearch;


public class LoginTest extends Base {

	public LoginTest() throws IOException {
		super(driver);
		String path = "C:\\Users\\hb024026\\eclipse-workspace\\MpagesReachMaster\\src\\MasterPackage\\TestData.properties";
		FileInputStream fs = new FileInputStream(path);
		prop.load(fs);
	}

	

		Base b = new Base(driver);
		LoginPage lp = new LoginPage();
		HomePage hp = new HomePage();
		PatientList pl = new PatientList();
		PatientReports pr = new PatientReports();
		PatientSearch ps = new PatientSearch();
		Properties prop = new Properties();
	
		
		public void main(String[] args) throws InterruptedException {
			
		b.launchBrowser(prop.getProperty("URL"));
		lp.EnterUserName(driver, prop.getProperty("UserName"));
		lp.EnterPassword(driver, prop.getProperty("Password"));
		lp.ClickOnLogin(driver);
		hp.homepagevalidation(driver, prop.getProperty("linkname"));
		hp.selectPageLinks(driver, prop.getProperty("linkname"));
		pl.selectTab(driver, prop.getProperty("TabName"));
		pl.displayPatientList(driver);
		pl.selectPatientList(driver, prop.getProperty("PatientList"));
		pl.getSelectedOption(driver);
		pl.patientGrid(driver);
		pl.selectSorting(driver, prop.getProperty("sortingbyname"));
		pl.sortedAlphabatically(driver);
		pl.selectSorting(driver, prop.getProperty("sortingbyage"));
		pl.sortedAgeWise(driver);
		pl.selectSorting(driver, prop.getProperty("sortingbygender"));
		pl.sortedGenderWise(driver);
		pl.selectSorting(driver, prop.getProperty("sortingbylocation"));
		pl.sortedLocationWise(driver);
		pl.selectPatientfromlist(driver, prop.getProperty("patientname"));
		pr.validatePatientSummary(driver);
		pr.clickPatientList(driver);
		pl.selectTab(driver, prop.getProperty("searchTab"));
		ps.searchPatient(driver, prop.getProperty("patientname"));
		try {
			pl.selectPatientfromlist(driver, prop.getProperty("patientname"));
		}
		catch(StaleElementReferenceException e) {
			driver.navigate().refresh();
			pl.selectPatientfromlist(driver, prop.getProperty("patientname"));
		}
		pr.validatePatientSummary(driver);
		pr.clickPatientList(driver);
	    pl.selectTab(driver, prop.getProperty("scheduleTab"));
	    pl.selectTab(driver, prop.getProperty("TabName"));
	    pl.displayPatientList(driver);
		pl.selectPatientList(driver, prop.getProperty("PatientList"));
		try {
			pl.selectPatientfromlist(driver, prop.getProperty("patientname"));
		}
		catch(StaleElementReferenceException e) {
			driver.navigate().refresh();
			pl.selectPatientfromlist(driver, prop.getProperty("patientname"));
		}
		pr.selectComponent(driver, prop.getProperty("ComponentName1"));
		pr.selectComponent(driver, prop.getProperty("ComponentName1"));
		pr.selectComponent(driver, prop.getProperty("ComponentName2"));
		pr.selectComponent(driver, prop.getProperty("ComponentName2"));
		pr.selectComponent(driver, prop.getProperty("ComponentName3"));
		pr.selectComponent(driver, prop.getProperty("ComponentName3"));
		pr.selectComponent(driver, prop.getProperty("ComponentName4"));
		pr.selectComponent(driver, prop.getProperty("ComponentName4"));
		pr.selectComponent(driver, prop.getProperty("ComponentName5"));
		pr.selectComponent(driver, prop.getProperty("ComponentName5"));
		lp.ClickOnLogout(driver);
		b.closeBrowser();
		
	}

}
