package org.espn.tests;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.is;

public class DeactivateUserTest extends BaseTest{
    private final String EMAIL = "p1234@p123.com";
    private final String PASSWORD = "prueba123";
    private final String UPDATE_ACCOUNT_TITLE = "Update Your Account";
    private final String ACCOUNT_DEACTIVATE_TITLE = "Account Deactivated";


    @Test
    public void deactivateUser() {
        checkThat("Promo Banner is displayed", home.isPromoBannerDisplayed(), is(true) );
        home.doLogin(EMAIL, PASSWORD);
        checkThat("ESPN Profile Link is displayed", home.isESPNProfileLinkDisplayed(), is(true) );
        home.clickOnESPNProfileLink();
        home.switchToIframeForm();
        checkThat("Update Account Form is displayed", home.getTitleForm(), is(UPDATE_ACCOUNT_TITLE) );
        home.clickOnDeleteAccount();
        checkThat("Delete terms Form is displayed", home.isDeleteAccountFormDisplayed(), is(true) );
        home.clickOnDeleteAccountButton();
        //checkThat("Update Account Form is displayed", home.getTitleForm(), is("Hello") );
        //checkThat("Delete Success Form is displayed", home.isDeleteSuccessFormDisplayed(), is(true) );
        //home.clickOnDeleteAccountButton();
        //home.doLogin(EMAIL, PASSWORD);
        //checkThat("Account Deactivated title is displayed", home.getTitleForm(), is(ACCOUNT_DEACTIVATE_TITLE));
    }
}
