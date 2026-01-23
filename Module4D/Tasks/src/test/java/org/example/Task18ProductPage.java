package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task18ProductPage {

    WebDriver pdriver = null;

    public Task18ProductPage(WebDriver driver) {//the webdriver here is linked to the webdriver on the Test18Test class

        pdriver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")

    private WebElement product;

    public WebElement selectProduct() {
        return product;
    }
@FindBy(xpath = "//a[@class='shopping_cart_link']")
    private  WebElement addCart;
    public WebElement getAddCart() {
        return  addCart;
    }


    }