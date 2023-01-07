package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
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


    @And("User verifies the Credit Accounts is displayed")
    public void userVerifiesTheCreditAccountsIsDisplayed() {
        Assert.assertTrue(accountSummaryPage.CreditAccounts.isDisplayed());
        
    }

    @Then("User verifies the Cash Accounts is displayed")
    public void userVerifiesTheCashAccountsIsDisplayed() {
        Assert.assertTrue(accountSummaryPage.CashAccounts.isDisplayed());
    }

    @And("User verifies the Investment Accounts is displayed")
    public void userVerifiesTheInvestmentAccountsIsDisplayed() {
        Assert.assertTrue(accountSummaryPage.InvestmentAccounts.isDisplayed());
    }

    @And("User verifies the Loan Accounts is displayed")
    public void userVerifiesTheLoanAccountsIsDisplayed() {
        Assert.assertTrue(accountSummaryPage.LoanAccounts.isDisplayed());
    }

    @Then("User verifies Credit Accounts table has Account column")
    public void user_verifies_credit_accounts_table_has_account_column() {
        Assert.assertTrue(accountSummaryPage.AccountHeader.isDisplayed());

    }
    @Then("User verifies Credit Accounts table has Credit Card column")
    public void user_verifies_credit_accounts_table_has_credit_card_column() {
        Assert.assertTrue(accountSummaryPage.CreditCardHeader.isDisplayed());
    }
    @Then("User verifies Credit Accounts table has Balance column")
    public void user_verifies_credit_accounts_table_has_balance_column() {
        Assert.assertTrue(accountSummaryPage.BalanceHeader.isDisplayed());
    }


}
