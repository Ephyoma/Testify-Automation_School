package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task17FormsTest extends Task17Setup {
@Test
    public void verifyFormsPage() {
    wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.findElement(By.xpath("//h5[normalize-space()='Forms']")).click();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("form"),
                "This is Form page");

    }
}