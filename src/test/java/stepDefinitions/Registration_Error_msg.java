package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RegistrationPage;

public class Registration_Error_msg {

	WebDriver driver;
	RegistrationPage rp=new RegistrationPage(BaseClass.getDriver());
	
	
	@Given("User Click on Register Button")
	public void user_click_on_register_button() {
		BaseClass.getLogger().info("Clicking On Register");
	    rp.register();
	}

	@When("User Enters Other Details along with Invalid Email")
	public void user_enters_other_details_along_with_invalid_email() {
		BaseClass.getLogger().info("Entering User Details");
	    rp.Entry();
	}
	
	@When("User Click On SignUp Button")
	public void user_click_on_sign_up_button() {
		BaseClass.getLogger().info("Clicking On Signup Button");
	    rp.Signup();
		
	}

	@Then("User Get Error Message")
	public void user_get_error_message() throws IOException {
		BaseClass.getLogger().info("Displaying Error Message");
	    rp.ErrorMsg();
		
	}

}
