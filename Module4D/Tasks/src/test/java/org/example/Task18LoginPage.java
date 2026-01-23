package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;

public class Task18LoginPage {
//create a global webdriver
    WebDriver sdriver = null;
    public Task18LoginPage(WebDriver driver) {//the webdriver here is linked to the webdriver on the Test18Test class

        sdriver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy (xpath = "//input[@id='user-name']")
    private WebElement username;
    public  WebElement getUsername() {
        return username;
    }

    @FindBy (xpath = "//input[@id='password']")
    private WebElement password;
    public  WebElement getPassword() {
        return  password;
    }


    @FindBy (xpath = "//input[@id='login-button']")
    private WebElement sendLogin;
    public WebElement getSendLogin() {
        return sendLogin;

    }
}