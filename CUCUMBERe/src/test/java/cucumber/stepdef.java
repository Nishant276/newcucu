package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdef {
	@Given("user navigate to home page")
	public void user_navigate_to_home_page() {
		common.LaunchBrowser();
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		common.Login();
	}

	@Then("message user logged in successfully")
	public void message_user_logged_in_successfully() {
	    
	}
}
