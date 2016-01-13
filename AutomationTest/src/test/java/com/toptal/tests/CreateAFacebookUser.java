package com.toptal.tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.toptal.webpages.FaceBookMainPage;


import java.util.concurrent.TimeUnit;

/**
 * Created by marlongarcia on 1/12/16.
 */
public class CreateAFacebookUser {

    WebDriver driver;

    @Before
    public void setup(){

        //use firefox driver
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @Test
    public void applyAsFacebookUser(){


        FaceBookMainPage user = new FaceBookMainPage(driver);

        user.CreateUser("jose", "pineda", "kajskdajskdja@aol.com", "testing@aol.com", "87192382jhhsjkads");


    }




}
