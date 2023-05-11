package com.TWI.TestCases;

import com.TWI.Base.PageBase;
import com.TWI.Screens.CalcScreen;
import com.TWI.Screens.LoginScreen;
import com.TWI.Utils.ConfigUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcScreenTest extends PageBase {


    LoginScreen loginScreen = new LoginScreen(driver);

    @Test(priority = 1)
    public void testAddition() {
        loginScreen
                .Login()
                .validateAddition();
        Assert.assertEquals(driver.findElement(By.xpath(ConfigUtils.getInstance().getResultXpath())).getText(), "11");
    }

    @Test(priority = 2)
    public void testMulti() {
        loginScreen
                .Login()
                .validateMultiplication();
        Assert.assertEquals(driver.findElement(By.xpath(ConfigUtils.getInstance().getResultXpath())).getText(), "30");
        //BUG in the Multiplication calculation ,  result = result + 1 , example 5*6=31 instead of 30
    }

    @Test(priority = 3)
    public void testHistoryButton() {
        loginScreen
                .Login()
                .validateHistoryButton();
        Assert.assertEquals(driver.findElement(By.xpath(ConfigUtils.getInstance().getDeleteXpath())).getText(), "DELETE");
    }
}
