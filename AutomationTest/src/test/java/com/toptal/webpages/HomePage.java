package com.toptal.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
/**
 * Created by marlongarcia on 1/2/16.
 */
public class HomePage {

    private WebDriver driver;

    // Page URL
    private static String Page_URL = "http://www.toptal.com";

    // Apply as Developer Button
    @FindBy(how = How.LINK_TEXT, using = "APPLY AS A FREELANCER")
    private  WebElement FreeLancerApplyButton;

    //Constructor
    public HomePage(WebDriver driver){

        this.driver = driver;
        this.driver.get(Page_URL);

        PageFactory.initElements(this.driver, this);

    }

    public void clickOnFreelancerApplyButton(){

        FreeLancerApplyButton.click();

    }



}
