package com.globant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;


public class App {
    protected static Logger log= LoggerFactory.getLogger(App.class);

    @BeforeSuite
    public void validateESPNAccount(){
        log.info("Must have a valid ESPN account");
    }

    @BeforeTest
    public void openAndCleanBrowser(){
        System.out.println("-------------");
        log.info("Open Browser");
        log.info("clean cookies");
        log.info("go to ESPN page https://www.espnqa.com/?_adbock=true&src=com&espn=cloud");
        log.info("validate if it is the ESPN page");
        log.info("Validate that the title of the page is equal to ESPN: Serving sports fans. Anytime. Anywhere.");
    }

    @AfterTest
    public void closeBrowser(){
        log.info("Close Browser");
        System.out.println("-------------");
    }
}
