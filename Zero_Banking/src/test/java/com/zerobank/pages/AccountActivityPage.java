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

    @FindBy(linkText = "Find Transactions")
    public WebElement findTransactionsTab;

    @FindBy(id = "aa_fromDate")
    public WebElement fromDateInput;

    @FindBy(id = "aa_toDate")
    public WebElement toDateInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement findBtn;

    @FindBy(xpath = "//div[@id='all_transactions_for_account']/table/tbody/tr[1]/td[1]")
    public WebElement transactionsDate1;

    @FindBy(xpath = "//div[@id='all_transactions_for_account']/table/tbody/tr[2]/td[1]")
    public WebElement transactionsDate2;

    @FindBy(xpath = "//div[@id='all_transactions_for_account']/table/tbody/tr[3]/td[1]")
    public WebElement transactionsDate3;

    @FindBy(xpath = "//*[@id='filtered_transactions_for_account']/table")
    public WebElement table;
    @FindBy(id = "aa_description")
    public WebElement descriptionBox;

    @FindBy(id = "aa_type")
    public WebElement transactionType;

    @FindBy(xpath = "//div[@class='well']")
    public WebElement noResultsWarning;
}
