package org.espn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(className = "main-content")
    private WebElement mainContent;

    @FindBy(id = "global-scoreboard")
    private WebElement scoreBoard;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isMainContentDisplayed(){
       return mainContent.isDisplayed();
    }
    public boolean isScoreBoardDisplayed(){
        return scoreBoard.isDisplayed();
    }
}
