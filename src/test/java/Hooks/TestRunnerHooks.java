package Hooks;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features_Hooks/Hooks.feature", glue={"Hooks"}, tags="@smoke", plugin={"pretty","html:target/htmlReports/reports.html","json:target/jsonReports/reports.json","junit:target/junitReports/reports.xml"},monochrome=true)
public class TestRunnerHooks {
}
