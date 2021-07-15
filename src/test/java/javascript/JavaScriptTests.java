package javascript;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;
import pages.NestedFramesPage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }

    //------------>Chapter 10 task<------------//
    @Test
    public void testSelectDropdownOption(){
        DropdownPage dropdownPage = homePage.clickDropDown();
        dropdownPage.selectOptionsByJavascript();
        List<String> optionList = List.of("Option 1", "Option 2");
        optionList.forEach(dropdownPage::selectFromDropDown);
        List<String> selectedOptionList = dropdownPage.getSelectedOptions();
        assertTrue(selectedOptionList.containsAll(optionList), "Not all options selected");
        assertEquals(selectedOptionList.size(), optionList.size(), "The number of selected items does not match");
    }
    //------------>Chapter 10 task<------------//
}
