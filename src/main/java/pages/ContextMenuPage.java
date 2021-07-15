package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    //------------>Chapter 7 task<------------//
    private WebDriver driver;
    private By contextMenu = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void rightClickContextMenu(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(contextMenu)).build().perform();
//        driver.findElement(contextMenu).click();
    }

    public void clickToAlertAccept(){
        driver.switchTo().alert().accept();
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }
    //------------>Chapter 7 task<------------//
}
