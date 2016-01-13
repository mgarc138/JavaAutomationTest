package com.toptal.tests;

import com.toptal.webpages.FreelancersApplyPage;
import com.toptal.webpages.HomePage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by marlongarcia on 1/2/16.
 */
public class ApplyAsFreeLancer {

    WebDriver driver;

    @Before
    public void setup(){

        //use firefox driver
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void ApplyAsFreelancer(){

        // create a homepage object
        HomePage home = new HomePage(driver);
        home.clickOnFreelancerApplyButton();

        FreelancersApplyPage applyPage = new FreelancersApplyPage(this.driver);


        // Check that page is open
        Assert.assertTrue(applyPage.isPageOpened());

        applyPage.SetDropDownSelection("Designer");
        applyPage.setEmail("hi@hotmail.com");
        applyPage.setFreelancerPassword("11213123132312");
        applyPage.setFreelancerConfirmationPassword("test");
        applyPage.setFreelancerUserName("atb");
        applyPage.setFreelancerSkype("skypetest");



    }

}
