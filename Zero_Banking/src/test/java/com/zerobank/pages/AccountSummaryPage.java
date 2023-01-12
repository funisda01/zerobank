package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
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


    @FindBy(xpath= "//h2[@class='board-header'][1]")
    public WebElement CashAccounts;

    @FindBy(xpath= "//h2[@class='board-header'][2]")
    public WebElement InvestmentAccounts;

    @FindBy(xpath= "//h2[@class='board-header'][3]")
    public WebElement CreditAccounts;
    @FindBy(xpath= "//h2[@class='board-header'][4]")
    public WebElement LoanAccounts;

    @FindBy(xpath = "//th[.='Credit Card']/preceding-sibling::*")
    public WebElement AccountHeader;

    @FindBy(xpath = "//th[.='Credit Card']")
    public WebElement CreditCardHeader;

    @FindBy(xpath = "//th[.='Credit Card']/following-sibling::*")
    public WebElement BalanceHeader;

    @FindBy(linkText = "Brokerage")
    public  WebElement BrokerageBtn;

    @FindBy(linkText = "Checking")
    public WebElement CheckingBtn;

    @FindBy(linkText = "Credit Card")
    public WebElement CreditCardBtn;

    @FindBy(linkText = "Loan")
    public WebElement LoanBtn;

}