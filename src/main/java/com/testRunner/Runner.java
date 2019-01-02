package com.testRunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "/Users/ahasan/eclipse-workspace/com.classA/src/main/java/com/Features"
,glue= {"/Users/ahasan/eclipse-workspace/com.classA/src/main/java/com/stepDefinitions"},
plugin = { "pretty","html:target/cucumber-reports" },
dryRun=true, //to check mapping is proper between feature file and step definition file
monochrome=true,//display the console output in proper way
strict=true//it will check if any step is not defined 
)




public class Runner {
	

}
