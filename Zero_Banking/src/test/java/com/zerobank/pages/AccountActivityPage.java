package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountActivityPage {

    public AccountActivityPage() {

        PageFactory.initElements(Driver.getDriver(), this);


    }

    @FindBy(xpath = "//a[.='Savings']")
    public WebElement SavingBtn;

    @FindBy(xpath = "//a[.='Account Activity']")
    public WebElement AccountActivityBtn;

    @FindBy(id = "aa_accountId")
    public WebElement AccountDropDownBtn;




}
