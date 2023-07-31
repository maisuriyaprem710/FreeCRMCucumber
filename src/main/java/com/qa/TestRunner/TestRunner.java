package com.qa.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\QA\\SeleniumWorkSpace\\APageObjectmodelwithBDD\\src\\main\\java\\com\\qa\\feature\\freeCRM.feature"},//the path of the feature files
		glue={"stepdefinations"},//step Defination Package Name
		plugin = {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		monochrome=true,
		dryRun=false
	
		)





public class TestRunner {

}
