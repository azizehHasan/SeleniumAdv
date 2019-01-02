package com.stepDefinitions;

import com.Util.TestBase;
import com.WebsitePages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends TestBase{
	LoginPage loginpage = new LoginPage();
	
	@Given("user on gameprint website")
	public void user_on_gameprint_website() {
		TestBase.initialization();
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		loginpage.login("email", "pass");
	}

	@When("fill the {string} and {string}")
	public void fill_the_and(String string, String string2) {
	}

	@Then("the user should be able to see user menu")
	public void the_user_should_be_able_to_see_user_menu() {
	}

	@Then("the user should be able to see Homepage title")
	public void the_user_should_be_able_to_see_Homepage_title() {
	}


}
