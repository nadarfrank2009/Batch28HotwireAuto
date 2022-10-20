package com.auto.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
features = "Feature/",
glue = {"com.auto.hooks", "com.auto.stepDefinition"},
plugin = {"json:target/myreport.json"},
dryRun = false,
monochrome = true
		
)

public class Runner extends AbstractTestNGCucumberTests{
	
}

/*
@CucumberOptions(
features = "Feature/",
glue = {"com.auto.hooks", "com.auto.stepDefinition"},
"com.auto.hooks", "com.auto.stepDefinition"
monochrome = true,
dryRun = false
//tags = "@Smoke" 
)
*/