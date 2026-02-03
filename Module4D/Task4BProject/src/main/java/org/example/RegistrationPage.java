package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    //create gbobal webdriver
    WebDriver rdriver = null;


    //create a constructor of the class
    public RegistrationPage(WebDriver driver) {
        //linking the gbobal driver to the construtor

        rdriver = driver;

        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//a[normalize-space()='Register']")
    private WebElement register;

    public WebElement getRegister() {
        return register;
    }

    @FindBy(xpath = "//input[@id='customer.firstName']")
    private WebElement firstName;

    public WebElement getFirstName() {
        return firstName;
    }

    @FindBy(xpath = "//input[@id='customer.lastName']")
    private WebElement lastName;

    public WebElement getLastName() {
        return lastName;
    }


    @FindBy(xpath = "//input[@id='customer.address.street']")
    private WebElement street;

    public WebElement getStreet() {
        return street;
    }


    @FindBy(xpath = "//input[@id='customer.address.city']")
    private WebElement city;

    public WebElement getCity() {
        return city;
    }


    @FindBy(xpath = "//input[@id='customer.address.state']")
    private WebElement state;

    public WebElement getState() {
        return state;
    }

    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    private WebElement zipCode;

    public WebElement getZipCode() {
        return zipCode;
    }

    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    private WebElement phoneNumber;

    public WebElement getPhoneNumber() {
        return phoneNumber;
    }


    @FindBy(xpath = "//input[@id='customer.ssn']")
    private WebElement ssn;

    public WebElement getSsn() {
        return ssn;
    }

    @FindBy(xpath = "//input[@id='customer.username']")
    private WebElement username;

    public WebElement getUsername() {
        return username;
    }

    @FindBy(xpath = "//input[@id='customer.password']")
    private WebElement password;

    public WebElement getPassword() {
        return password;
    }

    @FindBy(xpath = "//input[@id='repeatedPassword']")
    private WebElement confirm;

    public WebElement getConfirm() {
        return confirm;
    }

    @FindBy(xpath = "//input[@value='Register']")
    private WebElement create;

    public WebElement getCreate() {
        return create;
    }
    @FindBy(xpath = "//a[normalize-space()='Log Out']")
    private WebElement logout;

    public WebElement getLogout() {
        return logout;
    }


}