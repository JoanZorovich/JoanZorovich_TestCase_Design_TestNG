package org.espn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(className = "main-content")
    private WebElement mainContent;
    @FindBy(id = "global-scoreboard")
    private WebElement scoreBoard;
    @FindBy(id = "global-user-trigger")
    private WebElement userProfileLogo;
    @FindBy(className = "global-user")
    private WebElement profileUserMenu;
    @FindBy(css = "li a[tref=\"/members/v3_1/login\"]")
    private WebElement loginLink;
    @FindBy (id = "oneid-iframe")
    private WebElement iframeUserForm;
    @FindBy(id = "logo")
    private WebElement espnFormLogo;
    @FindBy(id = "InputLoginValue")
    private WebElement inputUser;
    @FindBy(id = "InputPassword")
    private WebElement inputPassword;
    @FindBy(id = "BtnSubmit")
    private WebElement submitButton;
    @FindBy(id = "BtnCreateAccount")
    private WebElement signUpButton;
    @FindBy(css = "li.display-user>span")
    private WebElement welcomeUser;
    @FindBy(css = "div.global-user li:last-child a.small")
    private WebElement logOutLink;
    @FindBy(css = "li.display-user")
    private WebElement welcomeMessage;
    @FindBy(css = "li a[tref=\"/members/v3_1/modifyAccount\"]")
    private WebElement ESPNProfile;
    @FindBy(id = "Title")
    private WebElement updateAccountTitle;
    @FindBy(id = "AccountDeleteLink")
    private WebElement deleteAccountLink;
    @FindBy(css = "form.form-section")
    private WebElement deleteAccountForm;
    @FindBy(css = "form.form-section.delete-profile-success")
    private WebElement deleteProfileSuccessForm;

    @FindBy (css = ".promo-banner-container iframe")
    private WebElement promoBanner;

    @FindBy (css = "div.PromoBanner__CloseBtn")
    private WebElement closeBanner;

    @FindBy (css = "li.pillar.watch")
    private WebElement watchLink;



    public HomePage(WebDriver driver) {
        super(driver);
    }
    public boolean isMainContentDisplayed(){
       return mainContent.isDisplayed();
    }
    public boolean isScoreBoardDisplayed(){
        return scoreBoard.isDisplayed();
    }
    public boolean isUserProfileLogoDisplayed(){
        return userProfileLogo.isDisplayed();
    }
    public void placeMouseOverProfileLogo(){
        super.placeMouseOverElement(userProfileLogo);
    }
    public boolean isProfileMenuDisplayed(){
        super.waitForVisibility(profileUserMenu);
        return profileUserMenu.isDisplayed();
    }
    public void clickOnLoginLink(){
        super.clickAnElement(loginLink);
    }
    public void switchToIframeForm(){
        super.switchToIframe(iframeUserForm);
    }

    public boolean isESPNFormLogoDisplayed(){
        return espnFormLogo.isDisplayed();
    }
    public boolean isSignUpButtonDisplayed(){
        return signUpButton.isDisplayed();
    }
    public boolean isSubmitButtonDisplayed(){
        return submitButton.isDisplayed();
    }
    public void typeLoginInfo(String email, String password){
        super.typeOnInput(inputUser, email);
        super.typeOnInput(inputPassword, password);
        super.clickAnElement(submitButton);
    }
    public String getUserName(){
        super.placeMouseOverElement(userProfileLogo);
        return welcomeUser.getText();
    }

    public WatchPage goToWatchPage(){
        super.clickAnElement(watchLink);
        return new WatchPage(getDriver());
    }

    public boolean isLogOutLinkDisplayed(){
        super.placeMouseOverElement(userProfileLogo);
        return logOutLink.isDisplayed();
    }
    public void logOutSession(){;
        super.placeMouseOverElement(userProfileLogo);
        super.clickAnElement(logOutLink);
    }
    public String getWelcomeMessage(){
        super.refreshBrowser();
        super.placeMouseOverElement(userProfileLogo);
        return welcomeMessage.getText();
    }


    public void doLogin(String email, String password){
        placeMouseOverProfileLogo();
        clickOnLoginLink();
        switchToIframeForm();
        typeLoginInfo(email, password);
    }

    public boolean isESPNProfileLinkDisplayed(){
        placeMouseOverProfileLogo();
        return ESPNProfile.isDisplayed();
    }
    public void clickOnESPNProfileLink(){
        placeMouseOverProfileLogo();
        super.clickAnElement(ESPNProfile);
    }
    public String getTitleForm(){
        return updateAccountTitle.getText();
    }
    public void clickOnDeleteAccount(){
        clickAnElement(deleteAccountLink);
    }

    public boolean isDeleteAccountFormDisplayed(){
        return deleteAccountForm.isDisplayed();
    }

    public void clickOnDeleteAccountButton(){
        super.clickAnElement(submitButton);
    }

    public boolean isDeleteSuccessFormDisplayed(){
        return deleteProfileSuccessForm.isDisplayed();
    }

    public boolean isPromoBannerDisplayed(){
        boolean banner = false;
        if(promoBanner.isDisplayed()){
            super.switchToIframe(promoBanner);
            super.clickAnElement(closeBanner);
            banner = true;
        }
        return banner;
    }

}
