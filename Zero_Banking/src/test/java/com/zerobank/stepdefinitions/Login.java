package com.zerobank.stepdefinitions;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Login {

    LoginPage loginPage = new LoginPage();
    @Given("User navigates to the url")
    public void user_navigates_to_the_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("User enters the valid Login")
    public void user_enters_the_valid_login() {
      loginPage.login.sendKeys(ConfigurationReader.getProperty("Login"));
    }
    @When("User enters valid Password")
    public void user_enters_valid_password() {
      loginPage.password.sendKeys(ConfigurationReader.getProperty("Password"));
    }
    @When("User clicks on Sign-in Button")
    public void user_clicks_on_sign_in_button() {
      loginPage.signButton.click();
      Driver.getDriver().navigate().back();
    }
    @Then("Any User should verify the homepage")
    public void any_user_should_verify_the_homepage() {
   String ExpectedTitle = "Zero - Personal Banking - Loans - Credit Cards";
   String ActualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(ExpectedTitle,ActualTitle);
    }

    @When("User enters the invalid Login")
    public void userEntersTheInvalidLogin() {
        loginPage.login.sendKeys("usernane");
    }

    @Then("Any User should verify the error-message")
    public void anyUserShouldVerifyTheErrorMessage() {


        Assert.assertTrue(loginPage.ErrorMessage.isDisplayed());
    }

    @And("User enters invalid Password")
    public void userEntersInvalidPassword() {

        loginPage.password.sendKeys("passwor");

    }

    @When("User keeps Login blank")
    public void userKeepsLoginBlank() {
        loginPage.login.sendKeys("");
    }

    @And("User keeps Password blank")
    public void userKeepsPasswordBlank() {
        loginPage.password.sendKeys("");

    }
}
