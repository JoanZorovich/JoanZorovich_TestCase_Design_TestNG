package org.espn.tests;

import org.testng.annotations.Test;

import static org.hamcrest.Matchers.is;

public class HomePageTest extends BaseTest{

    @Test
    public void isAHomePage(){
        checkThat("Navbar is displayed", home.isNavbarDisplayed(), is(true) );
        checkThat("Score Board is displayed", home.isScoreBoardDisplayed(), is(true) );
        checkThat("There is a main content", home.isMainContentDisplayed(), is(true) );
    }
}
