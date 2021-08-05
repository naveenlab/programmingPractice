package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\navee\\AutomationFramework\\CucumberBDDFramework\\src\\main\\java\\Features\\Login.feature",
glue= {"StepImplementation"}
		)

public class TestRunner {

}
