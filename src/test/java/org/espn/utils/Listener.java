package org.espn.utils;

import org.espn.reporting.Reporter;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static org.espn.reporting.Reporter.info;

public class Listener implements ITestListener {
    @Override
    public void onTestSuccess(ITestResult result){
        info("Test: " + result.getName() + " [PASSED]");
    }

    @Override
    public void onTestFailure(ITestResult result){
        Reporter.error("Test: " + result.getName() + " [FAILED]");
    }
}
