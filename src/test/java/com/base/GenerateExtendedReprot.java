package com.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import cucumber.api.TestStep;
import io.cucumber.core.api.Scenario;
import io.cucumber.core.event.Status;


public class GenerateExtendedReprot   {
	public static ExtentReports r;
	public static ExtentHtmlReporter html;
	
	public static void startup(String loc) {
		 html=new ExtentHtmlReporter(loc);
		html.config().setDocumentTitle("Cucumber FaceBook");
		html.config().setReportName("Manoj");
		html.config().setTheme(Theme.DARK);
		
		r= new ExtentReports();
		r.attachReporter(html);
		r.setSystemInfo("BrowserName", "Chrome");
		r.setSystemInfo("Version", "87");
		r.setSystemInfo("OS", "Windows");
		r.setSystemInfo("Environment", "QA");
	}
	
	public static void generateTest(Scenario sc) {
		String scenarioName = sc.getName();
		Status st = sc.getStatus();
		switch (st) {
		case PASSED:
			r.createTest(scenarioName).pass("Scenario_passed");
			break;
		case FAILED:
			r.createTest(scenarioName).fail("Scenario_faile");
		default:
			r.createTest(scenarioName).skip("scenario_skipped");
			break;
		}
	}
	public static  void tearDown() {
		r.flush();
	}
}
