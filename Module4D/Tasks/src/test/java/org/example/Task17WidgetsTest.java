package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task17WidgetsTest extends Task17Setup {

@Test

    public void WidgetsTest() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.findElement(By.xpath("//div[4]//div[1]//div[3]")).click();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("widgets"),
                "This is Widgets page");
    }
}
