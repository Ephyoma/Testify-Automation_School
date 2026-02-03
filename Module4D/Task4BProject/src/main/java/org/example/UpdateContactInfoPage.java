package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateContactInfoPage {

    //create gbobal webdriver
    WebDriver udriver = null;


    //create a constructor of the class
    public UpdateContactInfoPage(WebDriver driver) {
        //linking the global driver to the constructor

        udriver = driver;

        PageFactory.initElements(driver, this);

    }

    @FindBy (xpath = "//a[normalize-space()='Update Contact Info']")

    private WebElement updateContactInfo;
    public WebElement getUpdateContactInfo(){
        return updateContactInfo;
    }

//a[normalize-space()='Update Contact Info']

    @FindBy (xpath = "//input[@id='customer.address.zipCode']")

    private WebElement customerZipAddress;
    public WebElement getCustomerZipAddress(){
        return customerZipAddress;
    }

    @FindBy (xpath = "//input[@id='customer.phoneNumber']")

    private WebElement customerPhoneNumber;
    public WebElement getCustomerPhoneNumber(){
        return customerPhoneNumber;
    }
    @FindBy (xpath = "//input[@value='Update Profile']")

    private WebElement updateCCustomerProfile;
    public WebElement getUpdateCCustomerProfile(){
        return updateCCustomerProfile;
    }



}
