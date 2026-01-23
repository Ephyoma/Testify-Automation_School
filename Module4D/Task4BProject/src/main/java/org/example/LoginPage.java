package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    //create gbobal webdriver
    WebDriver ldriver = null;

    //create a constructor of the class
    public LoginPage(WebDriver driver) {

        //linking the gbobal driver to the construtor
        ldriver = driver;
        //create pagefactory
        PageFactory.initElements(driver, this);

    }

    @FindBy (xpath = "//input[@name='username']")

    private WebElement username;
    public WebElement getUsername() {
        return username;
    }

    @FindBy (xpath = "//input[@name='password']")

    private WebElement password;
    public WebElement getPassword() {
        return password;
    }

    @FindBy (xpath = "//input[@value='Log In']")

    private WebElement logIn;
    public WebElement getLogIn() {
        return logIn;
    }


    @FindBy (xpath = "//p[@class='smallText']")
    private WebElement verify;
    public WebElement getVerify() {
        return verify;
    }

}
