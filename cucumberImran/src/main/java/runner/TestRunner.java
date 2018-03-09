package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:/cucumberImran/src/main/java/featureFile"
		,glue={"stepDefinition"}
		)

public class TestRunner {
	


}
