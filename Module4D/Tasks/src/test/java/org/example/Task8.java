package org.example;

//Task8: Element State
//Navigate to https://idorenyinankoh.github.io/loginPage/
//check if the " create account" button is enabled"
//fill all the fields
//check if the "create account"is enabled

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task8 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\Testify\\CI-CD-Lesson\\Testify-Automation_School\\Module4D\\Tasks\\src\\chromedriver.exe");
        //Set Chrome option to use incognitor
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--incognito");
        //launch webdriver
        WebDriver driver = new ChromeDriver(options);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        //Maximax webbroswer
        driver.manage().window().maximize();

        //Navigate url
        driver.navigate().to("https://idorenyinankoh.github.io/loginPage/");
        Thread.sleep(5000);

        //check if the " create account" button is enabled before filling the form"
        boolean state = driver.findElement(By.id("create")).isEnabled();
        System.out.println(state + " Before filling form");
//fill all the fields
        driver.findElement(By.cssSelector("#firstName")).sendKeys("Ifeoma");
        driver.findElement(By.cssSelector("#lastName")).sendKeys("Onye");
        driver.findElement(By.cssSelector("#email")).sendKeys("me4me@gmail.com");
//        Thread.sleep(5000);
//        WebElement male = driver.findElement(By.xpath("//label[normalize-space()='male']"));
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", male);
//
//        Thread.sleep(5000);
//
//        WebElement female = driver.findElement(By.xpath("//label[normalize-space()='female']"));
//        JavascriptExecutor js2 = (JavascriptExecutor) driver;
//        js2.executeScript("arguments[0].scrollIntoView(true);", female);
//        female.click();
//
//        Thread.sleep(5000);
//        WebElement others =  driver.findElement(By.xpath("//input[@id='other']"));
//        JavascriptExecutor js3 = (JavascriptExecutor) driver;
//        js3.executeScript("arguments[0].scrollIntoView(true);", others);
        driver.findElement(By.cssSelector("#female")).click();



        driver.findElement(By.cssSelector("#password")).sendKeys("qwerty");
        driver.findElement(By.cssSelector("#confirmPass")).sendKeys("qwerty");
        driver.findElement(By.cssSelector("#xpLevel")).sendKeys("Tell me");
        Thread.sleep(5000);

        //check if the "create account"is enabled

        boolean state2 = driver.findElement(By.id("create")).isEnabled();
        System.out.println(state2 + " After filling form");


    }
}
