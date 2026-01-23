package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccountPage {

    //create gbobal webdriver
    WebDriver adriver = null;

    //create a constructor of the class
    public NewAccountPage(WebDriver driver) {

        //linking the gbobal driver to the construtor
        adriver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//a[normalize-space()='Open New Account']")
    private WebElement newAccount;

    public WebElement getNewAccount() {
        return newAccount;
    }


    @FindBy(xpath = "//select[@id='type']")
    private WebElement accountType;
    //Select select = new Select(accountType);
    //public WebElement getAccountType() {
        //return accountType;

    public void selectAccountTypeByText(String type) {
        Select select = new Select(accountType);
        select.selectByVisibleText(type);
    }

    @FindBy(xpath = "//input[@value='Open New Account']")
    private WebElement createNewAccount;

    public WebElement getCreateNewAccount() {
        return createNewAccount;
    }

    @FindBy(xpath = "//b[normalize-space()='Your new account number:']")
    private WebElement accountSuccessMessage;

    public WebElement getAccountSuccessMessage() {
        return accountSuccessMessage;
    }


}