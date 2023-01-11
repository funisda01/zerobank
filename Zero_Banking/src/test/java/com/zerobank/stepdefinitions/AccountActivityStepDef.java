package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityStepDef {

    AccountActivityPage accountActivityPage = new AccountActivityPage();
    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        System.out.println("this step handled by background scenario");
    }
    @When("the user clicks on Savings link on the Account Summary page")
    public void the_user_clicks_on_savings_link_on_the_account_summary_page() {
        accountSummaryPage.OnlineBankingBtn.click();
        accountSummaryPage.AccountSummaryBtn.click();
        accountActivityPage.SavingBtn.click();


    }
    @Then("the Account Activity page should be displayed")
    public void the_account_activity_page_should_be_displayed() {
        String expectedTitle = "Zero - Account Activity";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Then("Account drop down should have Savings selected")
    public void account_drop_down_should_have_savings_selected() {
        Select select = new Select(accountActivityPage.AccountDropDownBtn);
        String actualSelection = select.getFirstSelectedOption().getText();
        String expectedSelection = "Savings";
        Assert.assertEquals(actualSelection,expectedSelection);

    }

}
