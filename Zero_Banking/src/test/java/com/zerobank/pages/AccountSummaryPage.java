package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSummaryPage {

    public AccountSummaryPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }


@FindBy(id = "onlineBankingMenu")
            public WebElement OnlineBankingBtn;



@FindBy(id = "account_summary_link")
public WebElement AccountSummaryBtn;

}