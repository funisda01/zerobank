package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountSummaryStepDef {

    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();


    @Given("User click on online banking")
    public void user_click_on_online_banking() {
        accountSummaryPage.OnlineBankingBtn.click();


    }

    @When("User click on account summary")
    public void user_click_on_account_summary() {
        accountSummaryPage.AccountSummaryBtn.click();

    }

    @Then("Any user should verify zero account page")
    public void any_user_should_verify_zero_account_page() {

        String ExpectedTitle = "Zero - Account Summary";
        String ActualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(ExpectedTitle,ActualTitle);

    }


}
