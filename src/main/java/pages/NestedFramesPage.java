package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    //------------>Chapter 8 task<------------//
    private WebDriver driver;
    private String leftFrameName = "frame-left";
    private String topFrameName = "frame-top";
    private String bottomFrameName = "frame-bottom";
    private By frameBody = By.tagName("body");

    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }

    public String getTextFromLeftFrameBody() {
        switchToTopFrame();
        switchToLeftFrame();
        String text = driver.findElement(frameBody).getText();
        switchToMainFrame();
        switchToMainFrame();
        return text;
    }

    public String getTextFromBottomFrameBody() {
        switchToBottomFrame();
        String text = driver.findElement(frameBody).getText();
        switchToMainFrame();
        return text;
    }

    private void switchToLeftFrame(){
        driver.switchTo().frame(leftFrameName);
    }

    private void switchToTopFrame(){
        driver.switchTo().frame(topFrameName);
    }

    private void switchToBottomFrame(){
        driver.switchTo().frame(bottomFrameName);
    }

    private void switchToMainFrame(){
        driver.switchTo().parentFrame();
    }

    //------------>Chapter 8 task<------------//
}
