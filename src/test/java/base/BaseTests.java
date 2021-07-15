package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BaseTests {

    private EventFiringWebDriver driver;
    protected HomePage homePage;

    public void setUpFirstTask(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new EventFiringWebDriver(new ChromeDriver());
        String homePage = "https://the-internet.herokuapp.com/";
        driver.get(homePage);

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        inputsLink.click();

        //------------>Chapter 3 task<------------//
        driver.get(homePage);
        WebElement shiftingContent = driver.findElement(By.cssSelector("a[href=\"/shifting_content\"]"));
        shiftingContent.click();

        WebElement menuElement = driver.findElement(By.cssSelector("a[href=\"/shifting_content/menu\"]"));
        menuElement.click();

        List<WebElement> menuElements = driver.findElements(By.cssSelector("li"));
        System.out.println(menuElements.size());
        //------------>Chapter 3 task<------------//

        driver.quit();
    }

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        driver.register(new EventReporter());
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        goHome();
//        setCookie();
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @AfterMethod
    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus())
        {
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try{
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        //options.setHeadless(true);
        return options;
    }

    private void setCookie(){
        Cookie cookie = new Cookie.Builder("tau", "123")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
        //------------>Chapter 14 task<------------//
        driver.manage().deleteCookieNamed("optimizelyBuckets");
        //------------>Chapter 14 task<------------//
    }
}