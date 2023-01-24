package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class ForeignCurrencyStepDef {

    PayBillsPage payBillsPage = new PayBillsPage();

    @Given("the user accesses the Purchase foreign currency cash tab")
    public void theUserAccessesThePurchaseForeignCurrencyCashTab() {
        payBillsPage.purchaseForeignCurrency.click();
    }

    @Then("following currencies should be available")
    public void followingCurrenciesShouldBeAvailable(List<String> currencies) {

        Select select = new Select(payBillsPage.currencyDropdown);

        List<WebElement> actualCurrencyOptions = select.getOptions();
        List<String> actualCurrenciesStr = new ArrayList<>();

        for (WebElement option : actualCurrencyOptions) {
            actualCurrenciesStr.add(option.getText());
        }

        //actualCurrenciesStr.remove(0);

        System.out.println("actualCurrenciesStr = " + actualCurrenciesStr);
        System.out.println("currencies = " + currencies);

        for (String currency : currencies) {
            Assert.assertTrue(actualCurrenciesStr.contains(currency));

        }

        for (WebElement option : actualCurrencyOptions) {
            Assert.assertTrue(option.isEnabled());
        }
    }

    @When("user tries to calculate cost without selecting a currency")
    public void userTriesToCalculateCostWithoutSelectingACurrency() {
        payBillsPage.calculateCostsBtn.click();
    }

    @Then("error message should be displayed")
    public void errorMessageShouldBeDisplayed() {

    }
}
