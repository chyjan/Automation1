package com.testrun;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"json:target/cucumber.json"}, // generate report = cucumber maven report
		features = {"./src/main/resources/LoginScenario.feature"}, // feature file location or path
		glue = {"com.generic"}, // step definition package name
		tags = {"@Smoke","@Positive"}, // which scenario = Positive/ negative or which Test type to run
		dryRun = false,// check feature file correct or not
		strict = true, // step definition automation code correct or not
		monochrome = true // remove all ? mark and make easy to read console
		)

 

public class Runner extends AbstractTestNGCucumberTests{ // run feature file & generate report
	
	// cucumber hook
	

	
	
	
}
