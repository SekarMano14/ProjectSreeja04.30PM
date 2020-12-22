package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features="@src\\test\\resources\\FailedScenarios\\failed.txt", 
                 glue="com.stepdefinition"           
                 )
public class TestReRunner {
	
	

}
