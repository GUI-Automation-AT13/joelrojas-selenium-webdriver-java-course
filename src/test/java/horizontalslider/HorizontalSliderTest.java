package horizontalslider;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTest extends BaseTests {
    //------------>Chapter 6 task<------------//
    @Test
    public void testMoveHorizontalSlider(){
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSlider();
        String expectedValue = "2";
        horizontalSliderPage.setHorizontalSlider(expectedValue);
        assertEquals(expectedValue, horizontalSliderPage.getHorizontalSliderValue(), "Slider value incorrect");
    }
    //------------>Chapter 6 task<------------//
}
