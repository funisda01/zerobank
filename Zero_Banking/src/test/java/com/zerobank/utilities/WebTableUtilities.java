package com.zerobank.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class WebTableUtilities {

    public static ArrayList<Integer> dates(WebElement table) {

        List<WebElement> date = table.findElements(By.xpath("//*[@id='filtered_transactions_for_account']/table/tbody/tr/td[1]"));
        ArrayList<Integer> dateStrings = new ArrayList<>();

        for (WebElement webElement : date) {
            dateStrings.add(Integer.parseInt(webElement.getText().replace("-", "")));
        }

        return dateStrings;
    }



}
