package com.cybertek.pages;


import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    public LoginPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "prependedInput")
    public WebElement enterUsername;

    @FindBy(id = "prependedInput2")
    public WebElement enterPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;


    public void login(String Username) {
        BrowserUtils.sleep(2);
        enterUsername.sendKeys(Username);
        enterPassword.sendKeys("UserUser123");
        loginButton.click();

    }

}
