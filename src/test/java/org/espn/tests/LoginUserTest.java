package org.espn.tests;

import org.espn.pages.WatchPage;
import org.testng.annotations.Test;

import javax.swing.*;

import static org.hamcrest.Matchers.is;


public class LoginUserTest extends BaseTest{
    private final String EMAIL = "prueba@p.com";
    private final String PASSWORD = "p12345678";
    private final String USER_NAME = "Joan!";
    private final String WELCOME_MESSAGE = "Welcome!";

    @Test
    public void loginUser(){
        checkThat("Navbar is displayed", home.isNavbarDisplayed(), is(true) );
        checkThat("Promo Banner is displayed", home.isPromoBannerDisplayed(), is(true) );
        checkThat("Profile Logo is displayed", home.isUserProfileLogoDisplayed(), is(true) );
        home.placeMouseOverProfileLogo();
        checkThat("Profile Menu is displayed", home.isProfileMenuDisplayed(), is(true) );
        home.clickOnLoginLink();
        home.switchToIframeForm();
        checkThat("ESPN logo is displayed", home.isESPNFormLogoDisplayed(), is(true) );
        checkThat("Submit Button is displayed", home.isSubmitButtonDisplayed(), is(true) );
        checkThat("Sign Up Button is displayed", home.isSignUpButtonDisplayed(), is(true) );
        home.typeLoginInfo(EMAIL, PASSWORD);
        checkThat("Login is success!!", home.getUserName(), is(USER_NAME) );
        WatchPage watchPage = home.goToWatchPage();
        checkThat("There is at least one carousel on the Page", watchPage.thereIsACarousel(), is(true) );
        checkThat("Cards in the Carousel", watchPage.cardsNumber(), is(10) );
        checkThat("Each card in the first carousel has a title", watchPage.getCardsTitle(), is(true) );
        checkThat("Each card in the first carousel has a Description", watchPage.getCardsDescription(), is(true) );
        watchPage.clickOnSecondCard();
        checkThat("Light Box is displayed", watchPage.isAContentBoxDisplayed(), is(true) );
        checkThat(" Close light Box button is displayed", watchPage.isAContentBoxDisplayed(), is(true) );
        watchPage.clickOnCloseLightBoxButton();
        watchPage.backToHomePage();
        checkThat("Log Out Link is displayed", home.isLogOutLinkDisplayed(), is(true) );
        home.logOutSession();
        checkThat("The user has logged out successfully ", home.getWelcomeMessage(), is(WELCOME_MESSAGE) );
    }
}
