package com.TWI.Screens;

import com.TWI.Base.PageBase;
import com.TWI.Utils.ConfigUtils;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HistoryScreen extends PageBase {
    public HistoryScreen(AndroidDriver driver) {
        this.driver = driver;
    }

    public void validateDeleteButton() {
        driver.findElement(By.xpath(ConfigUtils.getInstance().getCheckBox1Xpath()))
                .click();
        driver.findElement(By.xpath(ConfigUtils.getInstance().getCheckBox2Xpath()))
                .click();
        driver.findElement(By.xpath(ConfigUtils.getInstance().getDeleteXpath()))
                .click();

    }
}
