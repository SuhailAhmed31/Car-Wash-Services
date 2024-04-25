package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import pageObjects.CarService;
import pageObjects.Homepage;
import pageObjects.OurCenter;
import pageObjects.RegistrationPage;
import utilities.DriverSetup;

public class Test_base {

	public WebDriver driver;
	Homepage hp;
	CarService cs;
	OurCenter oc;
	RegistrationPage rg;
	JavascriptExecutor js;
	
	@BeforeSuite
	public void driverConfig() {
		driver=DriverSetup.driverInstantiate("chrome");
		hp=new Homepage(driver);
		cs=new CarService(driver);
		oc=new OurCenter(driver);
		rg=new RegistrationPage(driver);
		js=(JavascriptExecutor)driver;
		
	}
	
	@AfterSuite
	public void closeDriver() {
			DriverSetup.driverTearDown();
	}
}
