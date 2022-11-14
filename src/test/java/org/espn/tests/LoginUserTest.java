package org.espn.tests;

import org.espn.pages.HomePage;
import org.testng.annotations.Test;

public class LoginUserTest extends BaseTest{

    @Test
    public void clickInProfileUSer(){
        home.isUserProfileLogoDisplayed();
    }
}
