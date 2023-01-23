package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class PayBillsStepDef {

    PayBillsPage payBills = new PayBillsPage();

    @Given("Add New Payee tab")
    public void add_new_payee_tab() {
        payBills.addNewPayeeTab.click();
    }
    @Given("creates new payee using following {string} information {string}")
    public void creates_new_payee_using_following_information(String dataField, String value) {
        /*ArrayList<WebElement> listOfFields = new ArrayList<>();
        listOfFields.add(payBills.payeeName);
        listOfFields.add(payBills.payeeAddress);
        listOfFields.add(payBills.accountField);
        listOfFields.add(payBills.payeeDetails);

        for (WebElement field : listOfFields) {

            field.sendKeys(value);

        }*/



    }
    @Then("message {string} was successfully created. should be displayed")
    public void message_was_successfully_created_should_be_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




}
