package com.automation.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	@Before
	public void setUp(){

	}

	@After
	public void cleanup(){}


	@Given("user opens the website")
	public void user_opens_the_website() {

	}

	@Given("verify user is on login page")
	public void verify_user_is_on_login_page() {

	}

	@When("user enters valid credentials")
	public void user_enters_valid_credentials() {

	}

	@Then("verify user is on home page")
	public void verify_user_is_on_home_page() {

	}

	@When("user clicks on add to cart button of any random item")
	public void user_clicks_on_add_to_cart_button_of_any_random_item() {

	}

	@When("click on cart icon")
	public void click_on_cart_icon() {

	}

	@Then("verify user is on cart page")
	public void verify_user_is_on_cart_page() {

	}

	@Then("verify item details on the cart page")
	public void verify_item_details_on_the_cart_page() {

	}

	@When("user click on continue shopping button")
	public void user_click_on_continue_shopping_button() {

	}

	@When("user clicks on remove button of item")
	public void user_clicks_on_remove_button_of_item() {

	}

	@Then("verify item is removed from the cart")
	public void verify_item_is_removed_from_the_cart() {

	}

}