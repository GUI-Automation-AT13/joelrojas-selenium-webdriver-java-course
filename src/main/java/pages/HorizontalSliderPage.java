package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    //------------>Chapter 6 task<------------//
    private WebDriver driver;
    private By horizontalSlider = By.cssSelector(".sliderContainer input");
    private By horizontalSliderValue = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setHorizontalSlider(String value){
        while(!getHorizontalSliderValue().equals(value)) {
            driver.findElement(horizontalSlider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getHorizontalSliderValue(){
        return driver.findElement(horizontalSliderValue).getText();
    }
    //------------>Chapter 6 task<------------//
}
