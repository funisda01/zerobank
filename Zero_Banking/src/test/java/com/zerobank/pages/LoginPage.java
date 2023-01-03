package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage (){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy (id="user_login")
    public WebElement login;

    @FindBy (id="user_password")
    public WebElement password;

    @FindBy (xpath="//input[@name='submit']")
    public WebElement signButton;

    @FindBy (xpath/html/body/div[1]/div[2]/div/div/div/form/div[1]


}
