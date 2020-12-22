package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.GenerateExtendedReprot;
import com.base.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "com.stepdefinition", dryRun = false, monochrome = true, tags = {
		"@Smoke"}, plugin = { "pretty", "html:src\\test\\resources\\HTML Report",
				"json:src\\test\\resources\\JSON Reports\\report.json",
				"junit:src\\test\\resources\\JUnit Report\\output.xml",
				"rerun:src\\test\\resources\\FailedScenarios\\failed.txt" })
public class TestRunner {

	@AfterClass
	public static void report() {
		JVMReport.generatJVMReport("src\\test\\resources\\JSON Reports\\report.json");
		GenerateExtendedReprot.tearDown();
	}

}
