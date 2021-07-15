package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    //------------>Chapter 4 task<------------//
    private WebDriver driver;
    private By emailTxtBox = By.id("email");
    private By retrievePasswordBtn = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmail(String email){
        driver.findElement(emailTxtBox).sendKeys(email);
    }

    public EmailSentPage clickRetrievePasswordBtn(){
        driver.findElement(retrievePasswordBtn).click();
        return new EmailSentPage(driver);
    }
    //------------>Chapter 4 task<------------//
}
