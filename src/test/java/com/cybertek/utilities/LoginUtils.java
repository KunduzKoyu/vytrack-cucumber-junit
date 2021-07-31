package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginUtils {
    public static void login(String username) {

        WebElement usernameElement = Driver.getDriver().findElement(By.name("_username"));
        usernameElement.sendKeys(username);

        WebElement password = Driver.getDriver().findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");

        WebElement loginButton = Driver.getDriver().findElement(By.id("_submit"));
        loginButton.click();
        BrowserUtils.sleep(3);
    }
}

