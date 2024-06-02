package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.LoginPage;

import java.time.Duration;
import java.util.List;

public class SignUpFeature_POM {

//    WebDriver driver;
//    LoginPage loginPageObj;
//
//    @Before
//    public void setUp(){
//        driver = new FirefoxDriver();
//    }
//
//    @Given("User logins in to the starbucks website")
//    public void user_logs_into_website(){
//        driver.navigate().to("https://www.starbucks.com/");
//        driver.findElement(By.xpath("//a[contains(@class, 'sb-button sb-button--positive sb-button--black')]")).click();
//        boolean bool = driver.getPageSource().contains("Create an account");
//        System.out.println("The boolean value for account page is: "+bool);
//        Assert.assertTrue(bool);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//    }
//
//    @When("^User provides (.*) (.*) (.*) and (.*)$")
//    public void userProvidesDetails(String firstName, String lastName, String email, String password){
//        loginPageObj = new LoginPage(driver);
//        loginPageObj.enterUserDetails(firstName, lastName, email, password);
//        loginPageObj.clickCheckbox();
//    }
//
//    @And("Clicks on signup button")
//    public void clicks_on_signup_button(){
//        loginPageObj.userClicksOnSubmit();
//    }
//
//    @Then("User should be signed up successfully")
//    public void user_should_be_signed_up(){
//        loginPageObj.validateSignUp();
//    }
//
//    @After
//    public void tearDown(){
//        driver.close();
//    }

}
