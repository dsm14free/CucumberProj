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
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class SignUpFeature {

//    WebDriver driver;
//
//    @Before
//    public void setUp(){
//        driver = new FirefoxDriver();
//    }
//
//    @Given("User logins in to the starbucks website")
//    public void user_logins_in_to_the_starbucks_website(){
//        driver.navigate().to("https://www.starbucks.com/");
//        driver.findElement(By.xpath("//a[contains(@class, 'sb-button sb-button--positive sb-button--black')]")).click();
//        boolean bool = driver.getPageSource().contains("Create an account");
//        System.out.println("The boolean value for account page is: "+bool);
//        Assert.assertTrue(bool);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//    }
//
//    @When("^User provides (.*) and (.*) with other details$")
//    public void user_provides_all_the_valid_details(String email, String password) throws InterruptedException {
//        driver.findElement(By.id("firstName")).sendKeys("FirstNameStar");
//        driver.findElement(By.id("lastName")).sendKeys("LastNameStar");
//        driver.findElement(By.id("emailAddress")).sendKeys(email);
//        driver.findElement(By.id("password")).sendKeys(password);
//
//        List<WebElement> checkBxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
//
//        for(WebElement checkBox : checkBxes){
//            JavascriptExecutor javaScriptExecutor = (JavascriptExecutor)driver;
//            javaScriptExecutor.executeScript("arguments[0].click();", checkBox);
//        }
//
//    }
//
//    @And("Clicks on signup button")
//    public void clicks_on_signup_button(){
//        System.out.println("The user tries to click on the submit button.");
////        driver.findElement(By.xpath("//button[@type='submit']")).click();
//    }
//
//    @Then("User should be signed up successfully")
//    public void user_should_be_signed_up_successfully(){
//        System.out.println("The signed up message is seen");
//    }
//
//    @After
//    public void tearDown(){
//        driver.close();
//    }
}
