package org.espn.tests;

import org.espn.configuration.Driver;

import static java.lang.String.format;
import static org.espn.reporting.Reporter.info;
import static org.espn.reporting.Reporter.error;

import org.espn.pages.HomePage;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
    private Driver driver;
    protected HomePage home;
    @Parameters({"browser", "url"})

    @BeforeTest()
    public void testSetUp(String browser, String url){
        driver = new Driver(browser);
        info("Deleting all cookies");
        driver.getDriver().manage().deleteAllCookies();
        info(format("Navigating to: " + url));
        driver.getDriver().get(url);
        driver.getDriver().manage().window().maximize();
        home = new HomePage(driver.getDriver());
    }

    @AfterTest
    public void tearDown() {driver.getDriver().quit();}
    protected <T> void checkThat(
            String description, T actualValue, Matcher<? super T> expectedValue) {
        info(
                format("Checking that " + description.toLowerCase() + " [Expectation: %s]", expectedValue));
        try {
            MatcherAssert.assertThat(actualValue, expectedValue);
        } catch (AssertionError e) {
            error(format("Assertion Error: [%s]", e.getMessage().replaceAll("\n", "")));
        }
    }
}
