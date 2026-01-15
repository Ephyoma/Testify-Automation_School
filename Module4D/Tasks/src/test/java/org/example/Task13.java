package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

//Go to https://selenium08.blogspot.com/
// search for "Demo dropdown" form the search field.
// on the drop down page, select Nigeria from the country list and
// select january february and march from the moths list. (image; https://i.imgur.com/sIgQwwG.png)
public class Task13 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\Testify\\CI-CD-Lesson\\Testify-Automation_School\\Module4D\\Tasks\\src\\chromedriver.exe");
        //Launch Web Browser
        ChromeOptions options = new ChromeOptions();
        //prevents password prompts
        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);
        //Maximax web browser
        driver.manage().window().maximize();
        //Navigate the url
        driver.navigate().to("https://selenium08.blogspot.com/");
        //Wait time to allow browser load properly
        Thread.sleep(5000);
        //click on search icon
        driver.findElement(By.xpath("//div[@class='search-expand-text']")).click();
        Thread.sleep(5000);
        //enter the text to search
        driver.findElement(By.xpath("//input[@placeholder='Search this blog']")).sendKeys("Demo dropdown");
        //Apply tne keyboard Action
        Actions key = new Actions(driver);
        Thread.sleep(5000);
        key.sendKeys("").sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(5000);


        driver.findElement(By.cssSelector("a[title='Demo Dropdown List']")).click();
        Thread.sleep(5000);

        //scroll to read more to see dropdown list
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");


        //getting to select Nigeria
        WebElement selectmenu = driver.findElement(By.xpath("//select[@name='country']"));

        Select select = new Select(selectmenu);
        select.selectByVisibleText("Nigeria");

        Thread.sleep(5000);

        //getting to select Month
        WebElement selectmonth = driver.findElement(By.xpath("//select[@name='Month']"));

        Select janSelect = new Select(selectmonth);
        janSelect.selectByIndex(1);
        janSelect.selectByIndex(2);
        janSelect.selectByIndex(3);



    }
}
