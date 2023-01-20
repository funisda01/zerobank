package com.zerobank.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class WebTableUtilities {

    public static ArrayList<Integer> dates(WebElement table) {

        List<WebElement> date = table.findElements(By.xpath("//div[@id='filtered_transactions_for_account']/table/tbody/tr/td[1]"));
        ArrayList<Integer> dateStrings = new ArrayList<>();

        for (WebElement webElement : date) {
            dateStrings.add(Integer.parseInt(webElement.getText().replace("-", "")));
        }

        return dateStrings;
    }


    public static ArrayList<String> description(WebElement table) {

        List<WebElement> description = table.findElements(By.xpath("//div[@id='filtered_transactions_for_account']/table/tbody/tr/td[2]"));
        ArrayList<String> descStrings = new ArrayList<>();

        for (WebElement webElement : description) {
            descStrings.add(webElement.getText());
        }

        return descStrings;
    }

    public static ArrayList<String> deposits(WebElement table){

        List<WebElement> deposits = table.findElements(By.xpath("//div[@id='filtered_transactions_for_account']/table/tbody/tr/td[3]"));
        ArrayList<String> depositStr = new ArrayList<>();

        for (WebElement webElement : deposits) {
            depositStr.add("" + webElement.getText());
        }

        return depositStr;
    }

    public static ArrayList<String> withdrawals(WebElement table){

        List<WebElement> withdrawals = table.findElements(By.xpath("//div[@id='filtered_transactions_for_account']/table/tbody/tr/td[4]"));
        ArrayList<String> strWithdrawals = new ArrayList<>();

        for (WebElement withdrawal : withdrawals) {
            strWithdrawals.add("" + withdrawal.getText());
        }

        return strWithdrawals;
    }


}



