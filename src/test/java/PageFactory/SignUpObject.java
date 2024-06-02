package PageFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class SignUpObject {

    WebDriver driver;

    @FindBy(xpath = "//a[contains(@class, 'sb-button sb-button--positive sb-button--black')]")
    @CacheLookup
    WebElement txt_signupbutton_signup;

    @FindBy(id = "firstName")
    @CacheLookup
    WebElement txt_firstname_signup;

    @FindBy(id = "lastName")
    @CacheLookup
    WebElement txt_lastname_signup;

    @FindBy(id = "emailAddress")
    @CacheLookup
    WebElement txt_email_signup;

    @FindBy(id = "password")
    @CacheLookup
    WebElement txt_password_signup;

    @FindBy(xpath = "//*[@type='checkbox']")
    @CacheLookup
    List<WebElement> txt_checkbox_signup;

    @FindBy(xpath = "//button[@type='submit']")
    @CacheLookup
    WebElement txt_submitting_signup;


    public SignUpObject(WebDriver driver){
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
        PageFactory.initElements(factory, this);
    }


    public void instantiateWebPage(){
        driver.navigate().to("https://www.starbucks.com/");
        txt_signupbutton_signup.click();
    }

    public void setUserDetails(String firstName, String lastName, String email, String password){
        txt_firstname_signup.sendKeys(firstName);
        txt_lastname_signup.sendKeys(lastName);
        txt_email_signup.sendKeys(email);
        txt_password_signup.sendKeys(password);
    }

    public void userClickCheckbox(){
        for(WebElement checkBox : txt_checkbox_signup){
            JavascriptExecutor javaScriptExecutor = (JavascriptExecutor)driver;
            javaScriptExecutor.executeScript("arguments[0].click();", checkBox);
        }
    }

    public void userClickSubmit(){
        txt_submitting_signup.click();
    }

}
