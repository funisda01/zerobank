package com.zerobank.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class WebTableUtilities {

    //Method #1 info:
    //• Name: returnOrderDate ()
    //• Return type: String
    //• Arg1: WebDriver driver
    //• Arg2: String costumerName
    //This method should accept a costumerName and return the costumer order date
    //as a String.


    public static String returnOrderDate(WebDriver driver, String transactionDate){

        //this code should be done in dynamic way for our project!!!
        String locator = "//td[.='"+ transactionDate +"']/following-sibling::td[1]";

        ////div[@id="all_transactions_for_account"]/table/tbody/tr/td[1]
        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        return customerDateCell.getText();
    }

    /*public static String returnOrderDate2(WebDriver driver, String customerName){
        return driver.findElement(By.xpath("//td[.='"+ customerName +"']/following-sibling::td[3]")).getText();
    }*/

    //...

    //Method #2 info:
    //• Name: orderVerify ()
    //• Return type: void
    //• Arg1: WebDriver driver
    //• Arg2: String costumerName
    //• Arg3: String expectedOrderDate
    //This method should accept above-mentioned arguments and internally assert
    //expectedOrderDate matching actualOrderDate.

    public static void orderVerify(WebDriver driver, String customerName, String expectedOrderDate){

        String locator = "//td[.='"+ customerName +"']/following-sibling::td[3]";

        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        String actualOrderDate = customerDateCell.getText();

        Assert.assertEquals(expectedOrderDate, actualOrderDate);

    }

}