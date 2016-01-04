package com.eviltester.webdriver;

import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by marlongarcia on 1/2/16.
 */

public class MyFirstTest {
    @Test
    public void startWebDriver(){

        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://seleniumsimplified.com");
        Assert.assertTrue("title should start with Selenium Simplified", driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();
        driver.quit();
    }




}
