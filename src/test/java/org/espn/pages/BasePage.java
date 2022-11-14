package org.espn.pages;

import org.espn.configuration.WebOperations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage extends WebOperations {

    //incluir la Nav bar aqui
    // espere por 10 segundos la nav bar y si no falla
    //Que elemento es comun en toda las pàginas
    //Se inicializan los elementos comunes a las paginas que vamos a testear
    //esta pagina es visible? --> nav bar
    // puedo hacer un OR para validar si la nav bar existe-> ojo, solo colocar el metodo, no logica
    //no se si ese if deba ir ahi

    @FindBy(id = "global-user-trigger")
    private WebElement userProfileLogo;

    public BasePage(WebDriver driver) {
        super(driver);
    }

    public boolean isUserProfileLogoDisplayed(){
        return userProfileLogo.isDisplayed();
    }
    public HomePage actionForClickUserButton(){
        super.waitForVisibility(userProfileLogo);

        if(isUserProfileLogoDisplayed()){
            super.clickElement(userProfileLogo);
            return new HomePage(super.getDriver());
        }

        return null;
    }
}
