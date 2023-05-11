package com.TWI.Screens;

import com.TWI.Base.PageBase;
import com.TWI.Utils.ConfigUtils;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class CalcScreen extends PageBase {
    public CalcScreen(AndroidDriver driver) {
        this.driver = driver;
    }


    public CalcScreen validateAddition() {
        driver.findElement(By.xpath(ConfigUtils.getInstance().getButton5Xpath()))
                .click();
        driver.findElement(By.xpath(ConfigUtils.getInstance().getPlusButtonXpath()))
                .click();
        driver.findElement(By.xpath(ConfigUtils.getInstance().getButton6Xpath()))
                .click();
        driver.findElement(By.xpath(ConfigUtils.getInstance().getEqualButtonXpath()))
                .click();
        return this;
    }

    public CalcScreen validateMultiplication() {
        driver.findElement(By.xpath(ConfigUtils.getInstance().getButton5Xpath()))
                .click();
        driver.findElement(By.xpath(ConfigUtils.getInstance().getMultiXpath()))
                .click();
        driver.findElement(By.xpath(ConfigUtils.getInstance().getButton6Xpath()))
                .click();
        driver.findElement(By.xpath(ConfigUtils.getInstance().getEqualButtonXpath()))
                .click();
        return this;
    }

    public HistoryScreen validateHistoryButton() {
        driver.findElement(By.xpath(ConfigUtils.getInstance().getHistoryXpath()))

                .click();
        return new HistoryScreen(driver);

    }
}
