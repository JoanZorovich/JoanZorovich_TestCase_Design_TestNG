package org.espn.tests;

import org.testng.annotations.Test;

import javax.swing.*;

import static org.hamcrest.Matchers.is;


public class LoginUserTest extends BaseTest{
    private final String EMAIL = "joan.zorovich@globant.com";
    private final String PASSWORD = "Joan123#";
    private final String USER_NAME = "Joan!";


    @Test()
    public void loginUser(){
        checkThat("Navbar is displayed", home.isNavbarDisplayed(), is(true) );
        checkThat("Profile Logo is displayed", home.isUserProfileLogoDisplayed(), is(true) );
        home.placeMouseOverProfileLogo();
        checkThat("Profile Menu is displayed", home.isProfileMenuDisplayed(), is(true) );
        home.clickOnLoginLink();
        home.switchLoginUserFormIframe();
        checkThat("ESPN logo is displayed", home.isESPNFormLogoDisplayed(), is(true) );
        checkThat("Submit Button is displayed", home.isSubmitButtonDisplayed(), is(true) );
        checkThat("Sign Up Button is displayed", home.isSignUpButtonDisplayed(), is(true) );
        home.typeLoginInfo(EMAIL, PASSWORD);
        checkThat("Login is success!!", home.getUserName(), is(USER_NAME) );
    }
}
