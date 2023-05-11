package com.TWI.Screens;

import com.TWI.Base.PageBase;
import com.TWI.Utils.ConfigUtils;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.time.Duration;


public class LoginScreen extends PageBase {


    public LoginScreen(AndroidDriver driver) {
        this.driver = driver;

    }

    public void shouldNotBeAbleToLoginWrongCredentials() {
        driver.findElement(By.xpath(ConfigUtils.getInstance().getUsernameFieldXpath()))
                .sendKeys(ConfigUtils.getInstance().getValidUsername());
        driver.findElement(By.xpath(ConfigUtils.getInstance().getPasswordFieldXpath()))
                .sendKeys(ConfigUtils.getInstance().getInvalidPassword());
        driver.findElement(By.xpath(ConfigUtils.getInstance().getLoginButtonXpath()))
                .click();
    }

    public void shouldNotBeAbleToLoginEmptyCredentials() {
        driver.findElement(By.xpath(ConfigUtils.getInstance().getUsernameFieldXpath()))
                .sendKeys(ConfigUtils.getInstance().getValidUsername());
        driver.findElement(By.xpath(ConfigUtils.getInstance().getPasswordFieldXpath()))
                .sendKeys("");
        driver.findElement(By.xpath(ConfigUtils.getInstance().getLoginButtonXpath()))
                .click();
    }

    public CalcScreen Login() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath(ConfigUtils.getInstance().getUsernameFieldXpath()))
                .sendKeys(ConfigUtils.getInstance().getValidUsername());
        driver.findElement(By.xpath(ConfigUtils.getInstance().getPasswordFieldXpath()))
                .sendKeys(ConfigUtils.getInstance().getValidPassword());
        driver.findElement(By.xpath(ConfigUtils.getInstance().getLoginButtonXpath()))
                .click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return new CalcScreen(driver);
    }
}
