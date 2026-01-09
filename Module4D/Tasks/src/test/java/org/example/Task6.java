package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//Navigate to https://www.saucedemo.com/
//Login using username and password.
//Click on the login button,
//click on the "add to cart" button of any product (Add only one item)
//click the cart icon on the top right.
//Click on checkout.  USE ONLY CSS LOCATION STRATEGY
public class Task6 {
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
        driver.get("https://www.saucedemo.com/");
        //Wait time to allow browser load properly
        Thread.sleep(5000);
        //Navigate Login
        //Enter Username
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
        //Enter password
        driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
        //Click on login
        driver.findElement(By.cssSelector("input#login-button")).click();
        //Navigate to item backpack and click add to cart
        driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-bolt-t-shirt")).click();
        //Navigate to shopping cart link
        driver.findElement(By.cssSelector("a.shopping_cart_link")).click();
        Thread.sleep(5000);
        //Checkout
        driver.findElement(By.cssSelector("button#checkout")).click();
    }
}
