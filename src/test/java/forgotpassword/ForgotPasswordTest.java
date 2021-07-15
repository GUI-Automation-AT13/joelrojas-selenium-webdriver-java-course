package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTest extends BaseTests {
    //------------>Chapter 4 task<------------//
    @Test
    public void testFailedPasswordRetrieve(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("tau@example.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrievePasswordBtn();
        assertTrue(emailSentPage.getSentEmailText().contains("Internal Server Error"),
                "Sent email text is incorrect");
    }
    //------------>Chapter 4 task<------------//
}
