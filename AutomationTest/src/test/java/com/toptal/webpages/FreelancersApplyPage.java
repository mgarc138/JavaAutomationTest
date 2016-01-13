package com.toptal.webpages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


/**
 * Created by marlongarcia on 1/2/16.
 */
public class FreelancersApplyPage {

    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div/div/header/div/h1")
    WebElement heading;

    @FindBy(xpath = "/html/body/div[1]/div/div/header/form/section/div/div[1]/fieldset/div[3]/input")
    WebElement mail;

    @FindBy(xpath = "/html/body/div[1]/div/div/header/form/section/div/div[1]/fieldset/div[4]/input")
    WebElement freelancers_password;

    @FindBy(xpath = "/html/body/div[1]/div/div/header/form/section/div/div[1]/fieldset/div[5]/input")
    WebElement freelancers_password_confirmation;

    @FindBy(xpath = "/html/body/div[1]/div/div/header/form/section/div/div[1]/fieldset/div[6]/input")
    WebElement freelancers_full_name;

    @FindBy(xpath = "/html/body/div[1]/div/div/header/form/section/div/div[1]/fieldset/div[7]/input")
    WebElement freelancers_skype;

    @FindBy(how = How.LINK_TEXT, using = "Join Toptal")
    WebElement join_toptal_button;

   // @FindBy(xpath = "/html/body/div[1]/div/div/header/form/section/div/div[1]/fieldset/div[2]/div[1]")
   // WebElement select;

    //Constructor
    public FreelancersApplyPage(WebDriver driver){

        this.driver = driver;

        PageFactory.initElements(this.driver, this);

    }

    public void SetDropDownSelection(String selection){


       // String path = ".//*[@id='new_talent']/section/div/div[1]/fieldset/div[2]/div[2]/div[1]/div[1]";
       // driver.findElement(By.xpath(path)).click();

        /*
        //WebElement select = driver.findElement(By.id("custom_select-options_item"));
        List<WebElement> options = this.select.findElements(By.tagName("custom_select_options"));
        for(WebElement option: options){

            if(selection.equals(option.getText())){

                option.click();
            }

        }


*/


    //   Select mnt = new Select(driver.findElement(By.id("What's your specialty?")));
        //  mnt.selectByIndex(1);



    }

    public void ClickOnJoinToptal(){

        this.join_toptal_button.click();
    }

    public void setFreelancerUserName(String name){

        this.freelancers_full_name.clear();
        this.freelancers_full_name.sendKeys(name);

    }

    public void setFreelancerSkype(String skype){

        this.freelancers_skype.clear();
        this.freelancers_skype.sendKeys(skype);
    }


    public void setEmail(String email){

        this.mail.clear();
        this.mail.sendKeys(email);
    }

    public void setFreelancerPassword(String password){

        this.freelancers_password.clear();
        this.freelancers_password.sendKeys(password);

    }

    public void setFreelancerConfirmationPassword(String confirmationPass){

        this.freelancers_password_confirmation.clear();
        this.freelancers_password_confirmation.sendKeys(confirmationPass);

    }




    public boolean isPageOpened(){

        return this.heading.getText().toString().contains("Apply to Join our Network of" );

    }



}
