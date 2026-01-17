package org.example;
//Task16:using TestNG Assert method


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

//Navigate to https://testifyltd.com/ .
//Assert that the Our contact column at the footer of the homepeage has the follwing correct details, EMAIL: info@testifyltd.co.uk
//LOCATION: Nigeria
//PHONE: (+234)904-882-0971
public class Task16 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setupBrowser() {

        System.setProperty("webdriver.chrome.driver", "F:\\Testify\\CI-CD-Lesson\\Testify-Automation_School\\Module4D\\Tasks\\src\\chromedriver.exe");
        //Launch Web Browser

        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    }

    @Test
    public void verifyFooterContactDetails() {
        driver.get("https://testifyltd.com/");

        //Scroll down to click the accept

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        String contact = driver.findElement(By.cssSelector("div[class='order-2 md:order-none']")).getText();
        System.out.println(contact);

        Assert.assertTrue(contact.contains("info@testifyltd.co.uk"));
        Assert.assertTrue(contact.contains("Nigeria"));
        Assert.assertTrue(contact.contains("(+234)904-882-0971"));
        System.out.println("contact is Correct");

    }

    @Test
    public void verifyFooterContactDetailsWithSoftAssert() {
        driver.get("https://testifyltd.com/");

        //Scroll down to click the accept

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        String contact = driver.findElement(By.cssSelector("div[class='order-2 md:order-none']")).getText();
        System.out.println(contact);

        SoftAssert soft = new SoftAssert();
        soft.assertTrue(contact.contains("Nigeria"));
        soft.assertTrue(contact.contains("info@testifyltd.co.uk"));
        soft.assertTrue(contact.contains("(+234)904-882-0971"));
        System.out.println("---contact printed is Difernt from what is expected");

    }

}