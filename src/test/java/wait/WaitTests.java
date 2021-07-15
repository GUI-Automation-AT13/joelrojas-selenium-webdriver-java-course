package wait;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample2Page;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }

    //------------>Chapter 9 task<------------//
    @Test
    public void testWaitUntilHiddenExample2(){
        DynamicLoadingExample2Page dynamicLoadingExample2Page = homePage.clickDynamicLoading().clickExample2();
        dynamicLoadingExample2Page.clickStart();
        assertEquals(dynamicLoadingExample2Page.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
    //------------>Chapter 9 task<------------//
}
