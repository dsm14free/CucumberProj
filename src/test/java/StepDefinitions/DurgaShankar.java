package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/LoginTest.feature", glue = {"StepDefinitions"}, tags="@smoke", plugin={"html:target/htmlReports/reports.html"})
public class DurgaShankar {

}
