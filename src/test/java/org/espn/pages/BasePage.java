package org.espn.pages;

import org.espn.configuration.WebOperations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage extends WebOperations {

    @FindBy(id="global-nav")
    private WebElement navbar;

    @FindBy(id = "global-user-trigger")
    private WebElement userProfileLogo;

    public BasePage(WebDriver driver) {
        super(driver);
    }
    public boolean isNavbarDisplayed(){
        return navbar.isDisplayed();
    }

    public boolean isUserProfileLogoDisplayed(){
        return userProfileLogo.isDisplayed();
    }

}
