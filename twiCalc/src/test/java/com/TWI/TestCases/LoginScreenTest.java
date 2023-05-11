package com.TWI.TestCases;

import com.TWI.Base.PageBase;
import com.TWI.Screens.LoginScreen;
import com.TWI.Utils.ConfigUtils;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.sql.Driver;
import java.time.Duration;

public class LoginScreenTest extends PageBase {
    LoginScreen loginScreen = new LoginScreen(driver);

//    public LoginScreenTest() {
//        super(driver);
//    }

    @Test(priority = 1)
    public void shouldNotBeAbleToLoginWrongCredentials() {
        // login with invalid password
        LoginScreen loginScreen = new LoginScreen(driver);
        loginScreen.shouldNotBeAbleToLoginWrongCredentials();
        Assert.assertEquals(driver.switchTo().alert().getText(), "Alert\nLogin failed");
    }

    @Test(priority = 2)
    public void shouldNotBeAbleToLoginEmptyCredentials() {
        // login with empty password
        loginScreen.shouldNotBeAbleToLoginEmptyCredentials();
        Assert.assertEquals(driver.switchTo().alert().getText(), "Alert\nLogin failed");
    }

    @Test(priority = 3)
    public void shouldBeAbleToLogin() {
        // Happy Scenario
        loginScreen.Login();
        WebDriverWait wd = new WebDriverWait(driver, Duration.ofSeconds(10));
        wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConfigUtils.getInstance().getHistoryXpath())));
        Assert.assertEquals(driver.findElement(By.xpath(ConfigUtils.getInstance().getHistoryXpath())).getText(), "HISTORY");
    }


}
