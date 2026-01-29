package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundTransferPage {


    //create gbobal webdriver
    WebDriver fdriver = null;


    //create a constructor of the class
    public FundTransferPage(WebDriver driver) {
        //linking the gbobal driver to the construtor

        fdriver = driver;

        PageFactory.initElements(driver, this);
    }


    //h1[normalize-space()='Transfer Complete!']
    @FindBy(xpath = "//a[normalize-space()='Transfer Funds']")
    private WebElement transfer;

    public WebElement getTransfer() {
        return transfer;
    }

    @FindBy(xpath = "//input[@id='amount']")
    private WebElement amount;

    public WebElement getAmount() {
        return amount;
    }

    @FindBy(xpath = "//select[@id='fromAccountId']")
    private WebElement fromAccount;

    public WebElement getFromAccount() {
        return fromAccount;
    }

    @FindBy(xpath = "//select[@id='toAccountId']")

    private WebElement toAccount;

    public WebElement getToAccount() {
        return toAccount;
    }

    @FindBy(xpath = "//input[@value='Transfer']")

    private WebElement submit;

    public WebElement getSubmit() {
        return submit;
    }

    @FindBy(xpath = "//div[@id='showResult']")
    private WebElement showResult;

    public WebElement getShowResult() {
        return showResult;
    }
}