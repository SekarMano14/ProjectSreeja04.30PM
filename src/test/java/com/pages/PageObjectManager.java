package com.pages;

public class PageObjectManager {

	public static PageObjectManager manager;
	private LoginPage loginPage;
	private RegistrationPage registrationPage;

	private PageObjectManager() {
	}

	public static PageObjectManager getInstance() {
		return (manager == null) ? manager = new PageObjectManager() : manager;

	}

	public LoginPage getLoginPage() {
		return (loginPage == null) ? new LoginPage() : loginPage;
	}

	public RegistrationPage getRegistrationPage() {
		return (registrationPage==null)? new RegistrationPage(): registrationPage;
	}
}
