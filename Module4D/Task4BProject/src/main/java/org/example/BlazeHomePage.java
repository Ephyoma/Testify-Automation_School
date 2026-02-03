package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BlazeHomePage {


    //create gbobal webdriver
    WebDriver bdriver = null;


    //create a constructor of the class
    public BlazeHomePage(WebDriver driver) {
        //linking the global driver to the constructor

        bdriver = driver;

        PageFactory.initElements(driver, this);
    }


    //select[@name='fromPort']

    //select[@name='toPort']

    //input[@value='Find Flights']

    //tbody/tr[1]/td[1]/input[1]

    //   p:nth-child(2)

    //input[@id='inputName']

    //input[@id='address']

    //input[@id='city']

    //input[@id='state']

    //input[@id='zipCode']

    //select[@id='cardType']

    //input[@id='nameOnCard']




}
