package Hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HooksFeature {

    WebDriver driver;

    @Before(order=1)
    public void setUp(){
        System.out.println("Inside setup 1");
        driver = new FirefoxDriver();
    }

    @Before(value="smoke1", order=-2)
    public void setUpTwo(){
        System.out.println("Inside setup 2");
    }

    @After(order=1)
    public void tearDown(){
        System.out.println("Inside tearDown 1");
        driver.close();
    }

    @After(value="@smoke", order=-2)
    public void tearDownTwo(){
        System.out.println("Inside tearDown 2");
    }

    @Given("User tries to login")
    public void givenMethod(){
        System.out.println("First given");
    }

    @When("User passes valid credentials")
    public void whenMethod(){
        System.out.println("First when");
    }

    @And("User clicks on submit button")
    public void andMethod(){
        System.out.println("First and");
    }

    @Then("User should be logged in successfully")
    public void firstThen(){
        System.out.println("First then");
    }
}
