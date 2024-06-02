package StepDefinitions;

import PageFactory.SignUpObject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SignUpFeature_PF {

    WebDriver driver;
    SignUpObject signupfeature;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
    }

    @Given("User logins in to the starbucks website")
    public void userLogsInToWebsite(){
        signupfeature = new SignUpObject(driver);
        signupfeature.instantiateWebPage();
    }

    @When("^User provides (.*) (.*) (.*) and (.*)$")
    public void userProvidesDetails(String firstName, String lastName, String email, String password){
        signupfeature.setUserDetails(firstName, lastName, email, password);
        signupfeature.userClickCheckbox();
    }

    @And("Clicks on signup button")
    public void userClicksOnButton(){
        signupfeature.userClickSubmit();
    }

    @Then("User should be signed up successfully")
    public void userRedirected(){
        boolean bool = driver.getPageSource().contains("Hello");
        Assert.assertTrue(bool);
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
