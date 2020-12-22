package com.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass {
	public static WebDriver driver;
	
	  public static final String AUTOMATE_USERNAME = "manojkumar158";
	  public static final String AUTOMATE_ACCESS_KEY = "qz7CPyDUZwCnKdTwHgdC";
	  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

	
	public static void getBrowserStackChrome() throws MalformedURLException {
		    DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("os_version", "10");
		    caps.setCapability("resolution", "1920x1080");
		    caps.setCapability("browser", "Chrome");
		    caps.setCapability("browser_version", "latest");
		    caps.setCapability("os", "Windows");
		    caps.setCapability("name", "My cucumberTest"); // test name
		    caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
		     driver = new RemoteWebDriver(new URL(URL), caps);
		   
	}
	
	public WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ManoKutty\\eclipse-workspace\\Cucumber04.30PM\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		return driver;
	}
	
	
	public void launchUrl(String url) {
		driver.get(url);
	}

	public void fill(WebElement e, String s) {
		e.sendKeys(s);
	}

	public void btnClick(WebElement e) {
		e.click();
	}

	public void quitBrowser() {
		driver.quit();
	}
}
