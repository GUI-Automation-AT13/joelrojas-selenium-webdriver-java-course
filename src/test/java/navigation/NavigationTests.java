package navigation;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample1Page;
import pages.DynamicLoadingExample2Page;
import pages.DynamicLoadingPage;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigator(){
        DynamicLoadingExample1Page dynamicLoadingExample1Page = homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
//        getWindowManager().goTo("https://google.com");
        Assert.assertTrue(dynamicLoadingExample1Page.isStartButton(), "Start button is not showed");
    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }

    //------------>Chapter 11 task<------------//
    @Test
    public void testSwitchTabsBetweenDynamicLoadingPages(){
        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoading();
        DynamicLoadingExample2Page dynamicLoadingExample2Page = dynamicLoadingPage.rightClickOnExample2();
        getWindowManager().switchToNewTab();
        Assert.assertTrue(dynamicLoadingExample2Page.isStartButton(), "Start button is not showed");
    }
    //------------>Chapter 11 task<------------//
}
