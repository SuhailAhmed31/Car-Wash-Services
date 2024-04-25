package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.OurCenter;

public class Our_Centers {

	WebDriver driver;
	OurCenter ocenter=new OurCenter(BaseClass.getDriver());
	
	@Given("User Navigate Back to Home Page")
	public void user_navigate_back_to_home_page() {
		BaseClass.getLogger().info("Navigate Back To Home Page");
	    ocenter.Navigate();
	}

	@When("Click On Our Centers")
	public void click_on_our_centers() {
		BaseClass.getLogger().info("Click On Our Centers");
		ocenter.OCclick();
	}

	@When("User Selects State1 and City1 and Click on Search Button")
	public void user_selects_state1_and_city1_and_click_on_search_button() {
		BaseClass.getLogger().info("Selecting First Set Of State and City");
		 try {
			ocenter.Select_State1_City1();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	@When("User Selects State2 and City2 and Click on Search Button")
	public void user_selects_state2_and_city2_and_click_on_search_button() {
		BaseClass.getLogger().info("Selecting Second Set Of State and City");
		try {
			ocenter.Select_State2_City2();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	@When("User Selects State3 and City3 and Click on Search Button")
	public void user_selects_state3_and_city3_and_click_on_search_button() {
		BaseClass.getLogger().info("Selecting Third Set Of State and City");
		try {
			ocenter.Select_State3_City3();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	@Then("User Gets The List Of Car Cleaning Service Addresses")
	public void user_gets_the_list_of_car_cleaning_service_addresses(){
		BaseClass.getLogger().info("Getting the list of Service Addresses");
	    try {
			ocenter.Display();
		} catch (Exception e) {
			e.printStackTrace();
	  }
	}
}
