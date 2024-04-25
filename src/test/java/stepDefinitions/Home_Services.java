package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CarService;
import pageObjects.Homepage;

public class Home_Services {
	
	WebDriver driver;
	Homepage hp;
	CarService cs;

	@Given("User Opened Website With The URL")
	public void user_opened_website_With_The_URL() {
		BaseClass.getLogger().info("Open DoorWash Website");
		
		hp=new Homepage(BaseClass.getDriver());
		cs=new CarService(BaseClass.getDriver());
	}

	@When("User Select Service Type As {string}")
	public void user_select_service_type_as(String string) {
		BaseClass.getLogger().info("Selecting Service Type");
		
	    hp.selecttype();
	}

	@When("User Select SubCategory AS {string}")
	public void user_select_sub_category_as(String string) {
		BaseClass.getLogger().info("Selecting SubCategory");
		
	    hp.selectcar();
	}

	@When("User Click On {string} Button")
	public void user_click_on_button(String string) {
		BaseClass.getLogger().info("Click On Go For It Button");
	    hp.Go_for_it_Button();
	    
	}

	@Then("User Navigate to the Services Details Displayed Page")
	public void user_navigate_to_the_services_details_displayed_page() {
		cs=new CarService(BaseClass.getDriver());
		boolean targetpage=cs.ServiceDetailPage();
				
		Assert.assertEquals(targetpage, true); 
		
		BaseClass.getLogger().info("Redirected to Car Service Details Page");
	}

	@Then("Captures The Service Name")
	public void captures_the_service_name() throws IOException {
		BaseClass.getLogger().info("Capture Service Name");
	    cs.Service();
		
	}

	@Then("Captures The Booking Amount")
	public void captures_the_booking_amount() throws IOException {
		BaseClass.getLogger().info("Capture Booking Amount");
	    cs.Price();
	    
	}
	}

