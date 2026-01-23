package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task18CartPage {

    //create a global webdriver
    WebDriver cdriver = null;
    public Task18CartPage(WebDriver driver) {//the webdriver here is linked to the webdriver on the Test18Test class

        cdriver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//a[@class='shopping_cart_link']")
    private WebElement cart;
    public WebElement getCart() {
        return cart;
    }


@FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkout;
    public WebElement getCheckout() {
        return checkout;
    }
}