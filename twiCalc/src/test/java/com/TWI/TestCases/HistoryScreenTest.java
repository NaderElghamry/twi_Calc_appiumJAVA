package com.TWI.TestCases;

import com.TWI.Base.PageBase;
import com.TWI.Screens.LoginScreen;
import com.TWI.Utils.ConfigUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HistoryScreenTest extends PageBase {
    LoginScreen loginScreen = new LoginScreen(driver);
    @Test
    public void validateDelete(){
        loginScreen
                .Login()
                .validateAddition()
                .validateMultiplication()
                .validateHistoryButton()
                .validateDeleteButton();
        Assert.assertFalse(driver.findElement(By.xpath(ConfigUtils.getInstance().getCheckBox1Xpath())).isDisplayed());
        //BUG the delete button deletes only 1 history per time even if all checkboxes are selected
    }
}
