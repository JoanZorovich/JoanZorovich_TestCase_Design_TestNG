package org.espn.tests;

import org.testng.annotations.Test;

import static org.hamcrest.Matchers.is;

public class LogOutUserTest extends BaseTest{
    private final String EMAIL = "p@prueba.com";
    private final String PASSWORD = "prueba123456";
    private final String WELCOME_MESSAGE = "Welcome!";
    @Test
    public void logOutUser(){
        checkThat("Promo Banner is displayed", home.isPromoBannerDisplayed(), is(true) );
        home.doLogin(EMAIL,PASSWORD);
        home.logOutSession();
        checkThat("Log Out Link is displayed", home.isLogOutLinkDisplayed(), is(true) );
        checkThat("The user has logged out successfully ", home.getWelcomeMessage(), is(WELCOME_MESSAGE) );
    }
}
