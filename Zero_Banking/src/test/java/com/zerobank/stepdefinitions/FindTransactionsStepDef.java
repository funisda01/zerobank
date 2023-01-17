package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.Driver;
import com.zerobank.utilities.WebTableUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Collections;

public class FindTransactionsStepDef {

    AccountActivityPage accountActivityPage = new AccountActivityPage();

    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_find_transactions_tab() {
        accountActivityPage.findTransactionsTab.click();
    }
    @When("the user enters date range from {string} to {string}")
    public void theUserEntersDateRangeFromTo(String fromDate, String toDate) {
        accountActivityPage.fromDateInput.clear();
        accountActivityPage.toDateInput.clear();
        accountActivityPage.fromDateInput.sendKeys(fromDate);
        accountActivityPage.toDateInput.sendKeys(toDate);
    }

    @When("clicks search")
    public void clicks_search() {
        accountActivityPage.findBtn.click();
    }
    @Then("results table should only show transactions dates between {string} to {string}")
    public void resultsTableShouldOnlyShowTransactionsDatesBetweenTo(String fromDate, String toDate) {
        ArrayList<Integer> dates = WebTableUtilities.dates(accountActivityPage.table);
        Collections.sort(dates);
        Integer fromDateWODash = Integer.parseInt(fromDate.replace("-", ""));
        Integer toDateWODash = Integer.parseInt(toDate.replace("-", ""));

        Assert.assertTrue(fromDateWODash.equals(dates.get(0)) && toDateWODash.equals(dates.get((dates.size() - 1))));


    }
    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {
        ArrayList<Integer> dates = WebTableUtilities.dates(accountActivityPage.table);
        Integer mostRecentDate = 0;
        for (Integer date : dates) {
            if(date > mostRecentDate){
                mostRecentDate = date;
            }
        }
        Assert.assertEquals(dates.get(0), mostRecentDate);
    }
    @Then("the results table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String expDate) {

        String expDateWODash = expDate.replace("-", "");
        ArrayList<Integer> dates = WebTableUtilities.dates(accountActivityPage.table);
        Assert.assertFalse(dates.contains(Integer.parseInt(expDateWODash)));

    }




    @When("the user enters description {string}")
    public void the_user_enters_description(String str) {
   accountActivityPage.descriptionBox.clear();
    accountActivityPage.descriptionBox.sendKeys(str);

    }
    @Then("results table should only show descriptions containing {string}")
    public void results_table_should_only_show_descriptions_containing(String str) {
        ArrayList<String> description = WebTableUtilities.description(accountActivityPage.table);
        System.out.println(description);
       boolean contains = true;
        for (String desc : description) {
            if (desc.contains(str)){
                contains = true;
            }else {
                contains = false;
            }
        }
        Assert.assertTrue(contains);
    }


    @Then("results table should not show descriptions containing {string}")
    public void results_table_should_not_show_descriptions_containing(String str) {
        ArrayList<String> description = WebTableUtilities.description(accountActivityPage.table);
        boolean contains = true;
        for (String desc : description) {
            if (desc.contains(str)){
                contains = false;
            }else {
                contains = true;
            }
        }
        Assert.assertTrue(contains);
    }


    @Then("results table should only show descriptions containings {string}")
    public void resultsTableShouldOnlyShowDescriptionsContainings(String arg0) {
        ArrayList<String> description = WebTableUtilities.description(accountActivityPage.table);
        System.out.println(description);
        boolean contains = true;
        for (String desc : description) {
            if (desc.contains(arg0)){
                contains = true;
            }else {
                contains = false;
            }
        }
        Assert.assertTrue(contains);
    }




}





