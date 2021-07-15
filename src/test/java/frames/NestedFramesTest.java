package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.NestedFramesPage;

import static org.testng.Assert.assertEquals;

public class NestedFramesTest extends BaseTests {

    //------------>Chapter 8 task<------------//
    @Test
    public void testGetTextFromLeftFrameBody(){
        NestedFramesPage nestedFramesPage = homePage.clickNestedFrames();
        assertEquals(nestedFramesPage.getTextFromLeftFrameBody(), "LEFT", "Frame body text is incorrect");
    }

    @Test
    public void testGetTextFromBottomFrameBody(){
        NestedFramesPage nestedFramesPage = homePage.clickNestedFrames();
        assertEquals(nestedFramesPage.getTextFromBottomFrameBody(), "BOTTOM", "Frame body text is incorrect");
    }
    //------------>Chapter 8 task<------------//
}
