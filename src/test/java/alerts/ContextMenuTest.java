package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTests {
    //------------>Chapter 7 task<------------//
    @Test
    public void testGetTextFromContextMenuAlert(){
        ContextMenuPage contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickContextMenu();
        assertEquals(contextMenuPage.getAlertText(), "You selected a context menu", "Alert text incorrect");
    }
    //------------>Chapter 7 task<------------//
}
