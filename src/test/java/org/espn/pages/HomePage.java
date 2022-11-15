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
    public void switchLoginUserFormIframe(){
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

    public boolean isLogOutLinkDisplayed(){
        super.placeMouseOverElement(userProfileLogo);
        return logOutLink.isDisplayed();
    }
    public void logOutSession(){;
        super.placeMouseOverElement(userProfileLogo);
        super.clickAnElement(logOutLink);
    }
    public String getWelcomeMessage(){
        super.placeMouseOverElement(userProfileLogo);
        return welcomeMessage.getText();
    }

    public void doLogin(String email, String password){
        placeMouseOverProfileLogo();
        clickOnLoginLink();
        switchLoginUserFormIframe();
        typeLoginInfo(email, password);
    }
}
