package com.globant;

import org.testng.annotations.Test;

public class LogInTest extends App{

    @Test
    public void logIn(){
        log.info("click on the profile icon");
        log.info("From the drop-down menu, click on the Login button");
        log.info("check if the window with the login form opens");
        log.info("In the window form, enter the username or email address in the first input text");
        log.info("In the second input text enter the password");
        log.info("Click on the log in button");
        log.info("check if the login is correct- the title of the user profile dropdown menu is Welcome Username!");
        System.out.println("-------------");
    }
}
