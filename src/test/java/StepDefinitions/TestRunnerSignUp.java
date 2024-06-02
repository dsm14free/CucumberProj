package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/SignUp.feature", glue={"StepDefinitions"}, tags="@smoke", plugin={"pretty", "html:target/htmlReports/reports.html", "json:target/jsonReports/jsonReports.json", "junit:target/junitReports/junitReport.xml"}, monochrome = true)
        public class TestRunnerSignUp {
}
