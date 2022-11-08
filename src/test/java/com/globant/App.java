

package com.globant;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class App {
    protected static Logger log= LoggerFactory.getLogger(App.class);

    @BeforeSuite
    public void goesToESPN(){
        log.info("goes to ESPN page");
    }

    @BeforeTest
    public void isLoggedOut(){
        log.info("validate if there is a user logged in and if so, log him out");
    }

    @Test
    public void Hello(){
        String a = "Hello";
        String b = " Joan";
        String result = a + b;
        Assert.assertEquals(result, "Hello Joan");
    }

    @AfterSuite
    public void closeBrowser(){
        log.info("Close browser");
        log.info("End session- (selenium)");
    }

    // abrir el browser
    //ir a la pagina de ESPN https://www.espnqa.com/?_adbock=true&src=com
    //Seleccionar el incono de perfil
    //Del menu desplegable seleccionar la opcion Log in
    //ingresar el user name o correo electronico
    //ingresar el password


    //Si no tiene cuenta....los mismos pasos de arriba
    // Dar click en Sign UP
    // llenar las datos
    //fist name
    //last name
    //Email Address
    //Password
    // click en Sign UP


    //Log out --- tienes que estar logueado
    //ingresar al avatar
    //click en log out


    //Desactivar usuario ---tiene que estar logueado
    //ingresar a la pagina
    //DAr click en el avatar
    //Dar clic en ESPN profile
    //Dar click en delete Account
    //click en Yes,delete this account
    //Dar click en OK



}
