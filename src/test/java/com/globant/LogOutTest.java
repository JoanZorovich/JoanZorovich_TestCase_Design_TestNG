package com.globant;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogOutTest extends App {

    @BeforeMethod
    public void logIn(){
        log.info("perform the actions to login");
    }

    @Test
    public void logOut(){
        log.info("click on the profile icon");
        log.info("From the drop-down menu, click on the Log Out button");
        log.info("check if the session was closed correctly - The login button appears");
        System.out.println("-------------");
    }
}
