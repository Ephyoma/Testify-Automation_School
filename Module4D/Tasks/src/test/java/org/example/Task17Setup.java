package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

//Run the following tests on https://demoqa.com   as a Testsuite (All test must be in diffrent classes)
//Navigate to the homepage and click on the Elements tile
// Assert that you are on the Elements page
//Navigate to the homepage and click on the Forms tile
//Assert that you are on the Forms page
//Navigate to the homepage and click on the Widgets tile
//Assert that you are on the Widgets page
//Navigate to the homepage and click on the Interactions tile
//Assert that you are on the Interactions page
public class Task17Setup {
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
    driver.get("https://demoqa.com/");

//    JavascriptExecutor js = (JavascriptExecutor) driver;
//    js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//    driver.findElement(By.xpath("//h5[normalize-space()='Elements']")).click();
//    System.out.println(driver.getCurrentUrl());
    }
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}