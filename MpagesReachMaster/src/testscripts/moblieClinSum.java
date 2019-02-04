package testscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.StaleElementReferenceException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import MasterPackage.Base;
import MasterPackage.HomePage;
import MasterPackage.LoginPage;
import MasterPackage.PatientList;
import MasterPackage.PatientReports;
import MasterPackage.PatientSearch;

public class moblieClinSum extends Base {

	ExtentReports report;
	ExtentTest test;
	
	public moblieClinSum() throws IOException {
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

@BeforeClass
 public protected test(){
	report = new ExtentReports("C:\\selenium\\Sel Reports.html");
	test = report.startTest("verify test");
		}
		
@Test(priority=1)
  public void LaucnMpageMobile(){
	    b.launchBrowser(prop.getProperty("URL"));
}

@Test(priority=2)
public void enterUserName()throws InterruptedException {
	lp.EnterUserName(driver, prop.getProperty("UserName"));
}

@Test(priority=3)
public void enterPassword() throws InterruptedException{
	lp.EnterPassword(driver, prop.getProperty("Password"));
}

@Test(priority=4)
public void clickLogin() throws InterruptedException {
	lp.ClickOnLogin(driver);
	hp.homepagevalidation(driver, prop.getProperty("linkname"));
	hp.selectPageLinks(driver, prop.getProperty("linkname"));
}


@Test(priority=5)
public void clickListTab() throws InterruptedException{
	pl.selectTab(driver, prop.getProperty("TabName"));
	pl.displayPatientList(driver);
}

@Test(priority=6)
public void clickListDropDown() throws InterruptedException {
	pl.selectPatientList(driver, prop.getProperty("PatientList"));
	pl.getSelectedOption(driver);
	pl.patientGrid(driver);
}

@Test(priority=7)
public void sortByName() throws InterruptedException {
	pl.selectSorting(driver, prop.getProperty("sortingbyname"));
	pl.sortedAlphabatically(driver);
}

@Test(priority=8)
public void sortByAge() throws InterruptedException {
	pl.selectSorting(driver, prop.getProperty("sortingbyage"));
	pl.sortedAgeWise(driver);
}

@Test(priority=9)
public void sortByGender() throws InterruptedException {
	pl.selectSorting(driver, prop.getProperty("sortingbygender"));
	pl.sortedGenderWise(driver);
}

@Test(priority=10)
public void sortByLocation() throws InterruptedException {
	pl.selectSorting(driver, prop.getProperty("sortingbylocation"));
	pl.sortedLocationWise(driver);
}

@Test(priority=11)
public void selectPatient() throws InterruptedException {
	pl.selectPatientfromlist(driver, prop.getProperty("patientname"));
	pr.validatePatientSummary(driver);
}

@Test(priority=12)
public void selectPatientList() throws InterruptedException {
	pr.clickPatientList(driver);
}

@Test(priority=13)
public void selectPatientbysearch() throws InterruptedException {
	pl.selectTab(driver, prop.getProperty("searchTab"));
	ps.searchPatient(driver, prop.getProperty("patientname"));
}


@Test(priority=14)
public void selectPatientfromsearch() throws InterruptedException {
	try {
		pl.selectPatientfromlist(driver, prop.getProperty("patientname"));
	}
	catch(StaleElementReferenceException e) {
		driver.navigate().refresh();
		pl.selectPatientfromlist(driver, prop.getProperty("patientname"));
	}
	pr.validatePatientSummary(driver);
}

@Test(priority=15)
public void selectPatientListback() throws InterruptedException {
	pr.clickPatientList(driver);
}

@Test(priority=16)
public void selectScheduleTab() throws InterruptedException {
	pl.selectTab(driver, prop.getProperty("scheduleTab"));
}

@Test(priority=17)
public void selectPatientTab() throws InterruptedException {
	pl.selectTab(driver, prop.getProperty("TabName"));
	pl.displayPatientList(driver);
}

@Test(priority=18)
public void selectPatientlist() throws InterruptedException {
	pl.selectPatientList(driver, prop.getProperty("PatientList"));
	try {
		pl.selectPatientfromlist(driver, prop.getProperty("patientname"));
	}
	catch(StaleElementReferenceException e) {
		driver.navigate().refresh();
		pl.selectPatientfromlist(driver, prop.getProperty("patientname"));
	}
}

@Test(priority=19)
public void validateDiagnosis() throws InterruptedException {
	pr.selectComponent(driver, prop.getProperty("ComponentName1"));
	pr.selectComponent(driver, prop.getProperty("ComponentName1"));
}


@Test(priority=20)
public void validateAllergies() throws InterruptedException {
	pr.selectComponent(driver, prop.getProperty("ComponentName2"));
	pr.selectComponent(driver, prop.getProperty("ComponentName2"));
}

@Test(priority=21)
public void validateVital() throws InterruptedException {
	pr.selectComponent(driver, prop.getProperty("ComponentName3"));
	pr.selectComponent(driver, prop.getProperty("ComponentName3"));
}

@Test(priority=22)
public void validateProblems() throws InterruptedException {
	pr.selectComponent(driver, prop.getProperty("ComponentName4"));
	pr.selectComponent(driver, prop.getProperty("ComponentName4"));
}

@Test(priority=23)
public void validateMedications() throws InterruptedException {
	pr.selectComponent(driver, prop.getProperty("ComponentName5"));
	pr.selectComponent(driver, prop.getProperty("ComponentName5"));
}

@Test(priority=24)
public void Quit() throws InterruptedException {
lp.ClickOnLogout(driver);
b.closeBrowser();
}
}
