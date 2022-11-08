

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
}
