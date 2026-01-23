package org.example;
//Extending the class to the class Task17setup


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task17ElementsTest extends Task17Setup {

@Test
    public void verifyElementsPage() {
//    JavascriptExecutor js = (JavascriptExecutor) driver;
//    js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    driver.findElement(By.xpath("//h5[normalize-space()='Elements']")).click();
    System.out.println(driver.getCurrentUrl());
    Assert.assertTrue(driver.getCurrentUrl().contains("elements"),
            "This is Elements page");


    }


}