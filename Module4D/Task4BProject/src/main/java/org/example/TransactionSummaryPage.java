package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionSummaryPage {
    //create gbobal webdriver
    WebDriver tdriver = null;
    //create a constructor of the class
    public TransactionSummaryPage(WebDriver driver) {
        //linking the global driver to the constructor

        tdriver = driver;

        PageFactory.initElements(driver, this);

    }
@FindBy (xpath = "//a[normalize-space()='Find Transactions']")
    private WebElement findTransactions;
    public  WebElement getFindTransactions() {
        return findTransactions;
    }

    @FindBy (xpath = "//select[@id='accountId']")
    private WebElement accountId;
    public  WebElement getAccountId() {
        return accountId;
    }

    @FindBy (xpath = "//input[@id='amount']")
    private WebElement amount;
    public  WebElement getAmount() {
        return amount;
    }

    @FindBy (xpath = "//button[@id='findByAmount']")
    private WebElement findByAmount;
    public  WebElement getFindByAmount() {
        return findByAmount;
    }

    @FindBy (xpath = "//div[@id='rightPanel']")
    private WebElement transactionResult;
    public  WebElement getTransactionResult() {
        return transactionResult;
    }



}
