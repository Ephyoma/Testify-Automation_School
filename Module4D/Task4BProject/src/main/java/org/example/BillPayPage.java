package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillPayPage {

    //create gbobal webdriver
    WebDriver bdriver = null;


    //create a constructor of the class
    public BillPayPage(WebDriver driver) {
        //linking the global driver to the constructor

        bdriver = driver;

        PageFactory.initElements(driver, this);

    }

        @FindBy (xpath = "//a[normalize-space()='Bill Pay']")
                private WebElement clickBillsPay;
    public  WebElement getClickBillsPay() {
        return clickBillsPay;
    }

    @FindBy (xpath = "//input[@name='payee.name']")
    private WebElement senderName;
    public WebElement getSenderName() {
        return senderName;
    }
 @FindBy (xpath = "//input[@name='payee.address.street']")
    private WebElement sendStreet;
    public WebElement getSendStreet() {
        return sendStreet;
    }

    @FindBy (xpath = "//input[@name='payee.address.city']")

    private WebElement sendCity;
    public WebElement getSendCity() {
        return sendCity;
    }

    @FindBy (xpath = "//input[@name='payee.address.state']")

    private WebElement senderState;
    public WebElement getSenderState() {
        return senderState;
    }
    @FindBy (xpath = "//input[@name='payee.address.zipCode']")

    private WebElement zipCode;
    public WebElement getZipCode() {
        return zipCode;
    }
    @FindBy (name = "payee.phoneNumber")

    private WebElement phoneNumber;
    public WebElement getPhoneNumber() {
        return phoneNumber;
    }

    @FindBy (xpath = "//input[@name='payee.accountNumber']")
    private WebElement receiverAccountNumber;
    public WebElement getReceiverAccountNumber(){
        return receiverAccountNumber;
    }

    @FindBy (xpath = "//input[@name='verifyAccount']")

    private WebElement receiverAccount;
    public WebElement getReceiverAccount() {
        return receiverAccount;
    }
    @FindBy (xpath = " //select[@name='fromAccountId']")

    private WebElement senderAccount;
    public WebElement getSenderAccount() {
        return senderAccount;
    }

    @FindBy (xpath = "//input[@name='amount']")
    private WebElement amount;
    public WebElement getAmount() {
        return amount;
    }
@FindBy (xpath = " //input[@value='Send Payment']")
    private WebElement send;
    public WebElement getSend() {
        return send;
    }


}

