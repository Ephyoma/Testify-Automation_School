package org.example;

//Go to google.
//search for "testify ltd"
//Click on the search that result with www.testifyltd.com
//sroll down the testify website and click on the linkedIn icon.
//Get the description text on the userpage.(image; https://i.imgur.com/PmrWDXa.png )


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class Task11 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\Testify\\CI-CD-Lesson\\Testify-Automation_School\\Module4D\\Tasks\\src\\chromedriver.exe");
        //Launch Web Browser
        ChromeOptions options = new ChromeOptions();
        //prevents password prompts
        //options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);
        //Maximax web browser
        driver.manage().window().maximize();
        //Navigate the url
        driver.navigate().to("https://www.bing.com/");
        //Wait time to allow browser load properly
        Thread.sleep(5000);

        driver.findElement(By.id("sb_form_q")).sendKeys("testify ltd");

        Thread.sleep(5000);

        driver.findElement(By.cssSelector("svg[aria-hidden='true'][width='25']")).click();
        Thread.sleep(5000);
        String parentWindow = driver.getWindowHandle();

        driver.findElement(By.xpath("//cite[normalize-space()='https://www.testifyltd.com']")).click();

        Set<String> windows = driver.getWindowHandles();
        for (String window:windows) {
            driver.switchTo().window(window);
            Thread.sleep(5000);
            System.out.println(driver.getCurrentUrl());
            if (driver.getCurrentUrl().equalsIgnoreCase("https://www.testifyltd.com/")) {
                Thread.sleep(5000);

            }
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("a[href='https://www.linkedin.com/company/testifyorg']")).click();

        String testifyWindow = driver.getWindowHandle();

        for (String window : driver.getWindowHandles()) {
            if (!window.equals(testifyWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }

        System.out.println("On LinkedIn: " + driver.getCurrentUrl());


    }

}
