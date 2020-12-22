package com.stepdefinition;

import java.io.IOException;
import java.net.MalformedURLException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.base.BaseClass;
import com.base.GenerateExtendedReprot;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	@Before()
	public void beforeScenario1() throws MalformedURLException {
		System.out.println("Before scenario.....1");
		GenerateExtendedReprot.startup(
				System.getProperty("user.dir")+"\\src\\test\\resources\\Extent Reports\\report.html");
		launchBrowser();
		// getBrowserStackChrome();
		launchUrl("https://www.facebook.com/");
	}
	@Before(value = "@Sanity or @Smoke", order = 1)
	public void beforeScenario2() {
		System.out.println("Before scenario.....2");
	}

	@After()
	public void afterScenario1(Scenario sc) throws IOException {
		System.out.println("After Scenario.....1");
		GenerateExtendedReprot.generateTest(sc);
		if (sc.isFailed()) {
			TakesScreenshot tk = (TakesScreenshot) driver;
			byte[] b = tk.getScreenshotAs(OutputType.BYTES);
			sc.embed(b, "image/png");
		}
		// quitBrowser();
	}
	@After()
	public void afterScenario2() {
		System.out.println("After Scenario.....2");
	}

}
