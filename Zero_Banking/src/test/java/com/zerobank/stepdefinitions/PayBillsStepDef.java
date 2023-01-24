package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Map;

public class PayBillsStepDef {

    PayBillsPage payBills = new PayBillsPage();

    @Given("Add New Payee tab")
    public void add_new_payee_tab() {
        payBills.addNewPayeeTab.click();
    }

    @Then("message {string} was successfully created. should be displayed")
    public void message_was_successfully_created_should_be_displayed(String string) {
        Assert.assertTrue(payBills.messageAlert.getText().contains(string));
    }

    @And("User clicks on Pay Bills option")
    public void userClicksOnPayBillsOption() {
        payBills.payBillsLink.click();
    }

    @Then("User should verify Add new payee tab")
    public void userShouldVerifyAddNewPayeeTab() {
        payBills.addNewPayeeTab.isDisplayed();
    }

    @When("creates new payee using following information")
    public void createsNewPayeeUsingFollowingInformation(Map<String,String> userInfo) {
        payBills.payeeName.sendKeys(userInfo.get("Payee Name"));
        payBills.payeeAddress.sendKeys(userInfo.get("Payee Address"));
        payBills.accountField.sendKeys((userInfo.get("Account")));
        payBills.payeeDetails.sendKeys(userInfo.get("Payee Details"));
        payBills.addNewPayeeBtn.click();
    }

}
