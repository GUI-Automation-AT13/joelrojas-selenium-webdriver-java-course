package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    //------------>Chapter 4 task<------------//
    public ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }
    //------------>Chapter 4 task<------------//

    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    //------------>Chapter 6 task<------------//
    public HorizontalSliderPage clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }
    //------------>Chapter 6 task<------------//

    public AlertsPage clickJavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    //------------>Chapter 7 task<------------//
    public ContextMenuPage clickContextMenu(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }
    //------------>Chapter 7 task<------------//

    public WysiwygEditorPage clickWysiwygEditor(){
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }

    //------------>Chapter 8 task<------------//
    public NestedFramesPage clickNestedFrames(){
        clickLink("Nested Frames");
        return new NestedFramesPage(driver);
    }
    //------------>Chapter 8 task<------------//

    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDomPage clickLargeAndDeepDom(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}