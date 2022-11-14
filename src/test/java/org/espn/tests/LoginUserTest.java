package org.espn.tests;

import org.testng.annotations.Test;

import static org.hamcrest.Matchers.is;


public class LoginUserTest extends BaseTest{

    @Test
    public void clickInProfileUSer(){
        checkThat("Navbar is displayed", home.isNavbarDisplayed(), is(true) );
        checkThat("Si esta la imagen", home.isUserProfileLogoDisplayed(), is(true) );
    }
}
