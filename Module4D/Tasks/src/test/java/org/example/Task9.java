package org.example;
//Task9: Browser Navigator
//Navigate to saucedemo.com
//Login with username and password
//navigate back to login screen from the homepage
//print out the Login button attribut "VALUE" to verify that you are back on the login screen
//navigate forward to the homepage, print out a name of a product to verify that you are back on the homepage

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task9 {
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
        driver.navigate().to("https://www.saucedemo.com/");
        //Wait time to allow browser load properly
        Thread.sleep(5000);
        //Navigate Login
        //Enter Username
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        //Enter password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        //Click on login
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        //Wait 5 sec to navigate back to login page
        Thread.sleep(5000);
        driver.navigate().back();
        //Printout the attribute value to confirm back to login page
        String value = driver.findElement(By.xpath("//input[@id='login-button']")).getAttribute("value");
        Thread.sleep(5000);
        System.out.println("Back to " + value + " Page");

       //Sleep 5sec to navigate forward to homepage

        Thread.sleep(5000);
        driver.navigate().forward();

        //Print out a product to verify back to Homepage
        //driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        String productName = driver.findElement(By.cssSelector("a[id='item_4_title_link'] div[class='inventory_item_name ']")).getText();

        System.out.println("I want to order " + productName);





    }
}
