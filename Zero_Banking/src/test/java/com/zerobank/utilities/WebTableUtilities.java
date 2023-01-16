package com.zerobank.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class WebTableUtilities {

    public static void main(String[] args) {
        Driver.getDriver().get("http://zero.webappsecurity.com/bank/account-activity.html");
        System.out.println(rowNum(Driver.getDriver()));
    }
   public static int rowNum(WebDriver driver) {


      WebElement table = driver.findElement(By.tagName("table"));

      List<WebElement> date = table.findElements(By.xpath("//*[@id='filtered_transactions_for_account']/table/tbody/tr/td[1]"));

     // for (WebElement webElement : date) {
       //  webElement.getText();
  return date.size();
      }


}
