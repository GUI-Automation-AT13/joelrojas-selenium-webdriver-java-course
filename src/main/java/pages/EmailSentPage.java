package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {
    //------------>Chapter 4 task<------------//
    private WebDriver driver;
    private By emailSentText = By.cssSelector("h1");
    public EmailSentPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getSentEmailText(){
        return driver.findElement(emailSentText).getText();
    }
    //------------>Chapter 4 task<------------//
}
