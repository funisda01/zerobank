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

    public static List<WebElement> deposits(WebElement table){

        List<WebElement> list = table.findElements(By.xpath("//div[@id='filtered_transactions_for_account']/table/tbody/tr/td[3]"));

        return list;
    }

    public static List<WebElement> withdrawals(WebElement table){

        List<WebElement> list = table.findElements(By.xpath("//div[@id='filtered_transactions_for_account']/table/tbody/tr/td[4]"));

        return list;
    }


}



