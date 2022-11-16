package org.espn.tests;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.is;

public class DeactivateUserTest extends BaseTest{
    private final String EMAIL = "p10@prueba.com";
    private final String PASSWORD = "prueba123456";



    @Test
    public void deactivateUser() {
        checkThat("Promo Banner is displayed", home.isPromoBannerDisplayed(), is(true) );
        home.doLogin(EMAIL, PASSWORD);
        checkThat("is ESPN Profile Link Displayed", home.isESPNProfileLinkDisplayed(), is(true) );
        home.clickOnESPNProfileLink();
        home.switchToIframeForm();
        home.clickOnDeleteAccountLink();
        checkThat("Terms of delete account are displayed", home.isTextBoxDisplayed(), is(true) );
        home.clickOnDeleteAccountButton();
        checkThat("is success Delete Text", home.isSuccessDeleteTextDisplayed(), is(true) );
        home.clickOnDeleteAccountButton();
        home.doLogin(EMAIL, PASSWORD);
        checkThat("is Account Deleted Message ", home.isAccountDeletedMessageDisplayed(), is(true) );

    }
}
