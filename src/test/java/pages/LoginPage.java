package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class LoginPage {

//    protected WebDriver driver;
//
//    public LoginPage(WebDriver driver){
//        this.driver = driver;
//        boolean titlePresence = driver.getTitle().contains("Create a Starbucks Account: Starbucks Coffee Company");
//        Assert.assertTrue(titlePresence);
//    }
//
//    private By txt_firstname_signup = By.id("firstName");
//    private By txt_lastname_signup = By.id("lastName");
//    private By txt_email_signup = By.id("emailAddress");
//    private By txt_password_signup = By.id("password");
//    private By txt_checkbox_signup = By.xpath("//*[@type='checkbox']");
//    private By txt_submit_signup = By.xpath("//button[@type='submit']");
//
//    public void enterUserDetails(String firstName, String lastName, String email, String password){
//        driver.findElement(txt_firstname_signup).sendKeys(firstName);
//        driver.findElement(txt_lastname_signup).sendKeys(lastName);
//        driver.findElement(txt_email_signup).sendKeys(email);
//        driver.findElement(txt_password_signup).sendKeys(password);
//    }
//
//    public void clickCheckbox(){
//        List<WebElement> checkBxes = driver.findElements(txt_checkbox_signup);
//
//        for(WebElement checkBox : checkBxes){
//            JavascriptExecutor javaScriptExecutor = (JavascriptExecutor)driver;
//            javaScriptExecutor.executeScript("arguments[0].click();", checkBox);
//        }
//
//    }
//    public void userClicksOnSubmit(){
//        driver.findElement(txt_submit_signup).submit();
//    }
//
//    public void validateSignUp(){
//        boolean bool = driver.getPageSource().contains("Something went wrong on our end.");
//        System.out.println("Verify whether the signup string is seen or not: " +bool);
//    }


}
