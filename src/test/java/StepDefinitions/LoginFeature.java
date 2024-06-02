package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.checkerframework.checker.interning.qual.UnknownInterned;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginFeature {
//	WebDriver driver;
//
//	@Before
//	public void setUp(){
//		System.out.println("Setting up the driver");
//		driver = new FirefoxDriver();
//	}
//
//	@After
//	public void tearDown(){
//		System.out.println("Closing the driver");
//		driver.close();
//	}
//
//	@Given("User is in the login page")
//	public void user_is_in_the_login_page() {
//	    System.out.println("User is in the login page");
//	    driver.get("https://www.starbucks.com/");
//		driver.findElement(By.xpath("//a[@class='sb-button sb-button--default sb-button--black mr3']")).click();
//
//	}
//
//	@When("^User provides (.*) and (.*)$")
//	public void user_provides_username_and_password(String username, String password) {
//		System.out.println("User passed username and password");
//
//		driver.findElement(By.id("username")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//		WebElement checkBx = driver.findElement(By.xpath("//label[@class='option option--checkbox']"));
//		checkBx.click();
//		System.out.println("Is the checkbox enabled: "+checkBx.isEnabled());
//		System.out.println("Is the checkbox selected: "+checkBx.isSelected());
//		System.out.println("Is the checkbox displayed: "+checkBx.isDisplayed());
//		try{
//			Thread.sleep(2000);
//		}catch(InterruptedException ex){
//			System.out.println(ex.getMessage());
//		}
//
//
//	}
//
//	@And("Clicks on login button")
//	public void clicks_on_login_button() {
//		System.out.println("User clicked on login button");
//		driver.findElement(By.xpath("//button[@class='sb-frap sb-frap--centerSVG']")).click();
//	}
//
//	@Then("Take proper action on the user")
//	public void take_proper_action_on_the_user() {
//		System.out.println("Action is taken on the user");
//		Boolean bool = driver.getPageSource().contains("Sign in unsuccessful.");
//		System.out.println(bool);
//		Assert.assertTrue(bool);
////		driver.quit();
//	}

}
