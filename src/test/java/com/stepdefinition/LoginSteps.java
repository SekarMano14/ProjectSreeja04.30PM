package com.stepdefinition;

import org.junit.Assert;

import com.base.BaseClass;
import com.pages.LoginPage;
import com.pages.PageObjectManager;
import com.pages.RegistrationPage;

import io.cucumber.java.en.*;


public class LoginSteps extends BaseClass {
	PageObjectManager page;
	LoginPage l;
	RegistrationPage r;

	@Given("The user should be in Fblogin page")
	public void the_user_should_be_in_Fblogin_page() {
		
	}

	@When("The has to be fill {string} and {string}")
	public void the_has_to_be_fill_and(String user, String pass) {
		page = PageObjectManager.getInstance();
		 l = page.getLoginPage();
		fill(l.getTxtUserName(), user);
		fill(l.getTxtPassword(), pass);
	}

	@When("The user has to click login button")
	public void the_user_has_to_click_login_button() {
		btnClick(l.getBtnLogin());
	}

	@Then("The user sshould be in invalid login Page")
	public void the_user_sshould_be_in_invalid_login_Page() {
		Assert.assertTrue(false);
		System.out.println("User in Invalid Login page");
		quitBrowser();
	}

	
	@When("The user  has to fill the firstname, lastname and details")
	public void the_user_has_to_fill_the_firstname_lastname_and_details() {
		 r = page.getRegistrationPage();
		btnClick(r.getBtnCreate());
		fill(r.getFName(), "Manoj");
		fill(r.getLName(), "Kumar");

	}

	@Then("The user successfull registered")
	public void the_user_successfull_registered() {
		quitBrowser();
		System.out.println("User Register successfully");

	}
}
