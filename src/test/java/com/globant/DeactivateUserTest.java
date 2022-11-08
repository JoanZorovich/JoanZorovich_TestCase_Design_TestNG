package com.globant;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeactivateUserTest extends App {

    @BeforeMethod
    public void logIn(){
        log.info("perform the actions to login");
    }

    @Test
    public void deactivateUser(){
        log.info("click on the profile icon");
        log.info("From the drop-down menu, click on ESPN profile button");
        log.info("Check if the window with Update Your Account options opens");
        log.info("Click on Delete Account");
        log.info("check if window -Are you sure?- opens");
        log.info("In the -Are you sure?- window, click on the -Yes, delete this account- button");
        log.info("check if window -Your account has been deleted.- opens");
        log.info("In the -Your account has been deleted.- window, click the OK button");
        log.info("check if the user was deactivated correctly");
        System.out.println("-------------");
    }
}
