package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task17InteractionsTest extends Task17Setup {

@Test
    public void InteractionsTest() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.findElement(By.xpath("//h5[normalize-space()='Interactions']")).click();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("interaction"),
                "This is Interactions page");
    }
}
