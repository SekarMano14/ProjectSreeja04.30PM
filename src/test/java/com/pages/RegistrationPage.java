package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class RegistrationPage extends BaseClass {

	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@role='button'])[1]")
	private WebElement btnCreate;

	@FindBy(name = "firstname")
	private WebElement FName;

	@FindBy(name = "lastname")
	private WebElement LName;

	public WebElement getBtnCreate() {
		return btnCreate;
	}

	public WebElement getFName() {
		return FName;
	}

	public WebElement getLName() {
		return LName;
	}

}
