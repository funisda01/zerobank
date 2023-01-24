package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBillsPage {

    public PayBillsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "pay_bills_link")
    public WebElement payBillsLink;

    @FindBy(linkText = "Add New Payee")
    public WebElement addNewPayeeTab;

    @FindBy(id = "np_new_payee_name")
    public WebElement payeeName;

    @FindBy(id = "np_new_payee_address")
    public WebElement payeeAddress;

    @FindBy(id = "np_new_payee_account")
    public WebElement accountField;

    @FindBy(id = "np_new_payee_details")
    public WebElement payeeDetails;

    @FindBy(id = "add_new_payee")
    public WebElement addNewPayeeBtn;

    @FindBy(id = "alert_content")
    public WebElement messageAlert;

    @FindBy(linkText = "Purchase Foreign Currency")
    public WebElement purchaseForeignCurrency;

    @FindBy(id = "pc_currency")
    public WebElement currencyDropdown;

    @FindBy(id = "pc_calculate_costs")
    public WebElement calculateCostsBtn;


}
