package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", glue={"StepDefinitions"}, 
				monochrome =true, 
				plugin={"pretty","junit:target/JUNITreports/report.xml", 
									"html:target/HTMLreports/index.html", 
										"json:target/JSONreports/report.json"}
			//	, tags = "@SmokeTest"
				)
public class TestRunner {

}
