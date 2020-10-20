package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginClass {

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {

		System.out.println("Inside Step - User is on the Login page!");
	    }

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		
		System.out.println("Inside Step - User enters username and password!");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		
		System.out.println("Inside Step - User clicks on login page!");
	}

	@Then("user is navigated to user account page")
	public void user_is_navigated_to_user_account_page() {
		
		System.out.println("Inside Step - User is redirected to My Account page");
	}


}
