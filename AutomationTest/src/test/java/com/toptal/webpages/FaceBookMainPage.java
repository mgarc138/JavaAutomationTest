package com.toptal.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;


import java.util.List;

/**
 * Created by marlongarcia on 1/12/16.
 */
public class FaceBookMainPage {

    private WebDriver driver;

    @FindBy(xpath = ".//*[@id='u_0_1']")
    WebElement FirstName;

    @FindBy(xpath = ".//*[@id='u_0_3']")
    WebElement LastName;


    @FindBy(xpath = ".//*[@id='u_0_5']")
    WebElement Email;

    @FindBy(xpath = ".//*[@id='u_0_8']")
    WebElement ReEnterEmail;

    @FindBy(xpath = ".//*[@id='u_0_a']")
    WebElement Password;



    public FaceBookMainPage(WebDriver driver){

        this.driver = driver;
        this.driver.get("wwww.facebook.com");

        PageFactory.initElements(this.driver, this);
    }


    public void CreateUser(String firname, String lastname, String email, String reenteremail, String password){


        this.FirstName.clear();
        this.FirstName.sendKeys(firname);
        this.LastName.clear();
        this.LastName.sendKeys(lastname);
        this.Email.clear();
        this.Email.sendKeys(email);
        this.ReEnterEmail.clear();
        this.ReEnterEmail.sendKeys(reenteremail);
        this.Password.clear();
        this.Password.sendKeys(password);

        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByIndex(1);

        Select Day = new Select(driver.findElement(By.id("day")));
        Day.selectByIndex(1);

        Select Year = new Select(driver.findElement(By.id("year")));
        Year.selectByIndex(1);


        List<WebElement> RadioButtonsList = driver.findElements(By.name("sex"));

         RadioButtonsList.get(0).click();

        RadioButtonsList.get(1).click();

        List<WebElement> CheckBoxList = driver.findElements(By.name("persistent"));

        CheckBoxList.get(0).click();



    }



}
