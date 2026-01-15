package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

//Navigate to https://www.toolsqa.com/
//close the dialogue box that pops up after a few seconds
//Click on the tutorial button on the top left corner of the page
public class Task14 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\Testify\\CI-CD-Lesson\\Testify-Automation_School\\Module4D\\Tasks\\src\\chromedriver.exe");
        //Launch Web Browser
        ChromeOptions options = new ChromeOptions();
        //prevents password prompts
        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);
        //Maximax web browser
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //Navigate the url
        driver.navigate().to("https://www.toolsqa.com/");
        //using unconditional wait method
//        Thread.sleep(3000);
//
//        //Scroll down to click the accept
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//
//        Thread.sleep(2000);
//
//        driver.findElement(By.xpath("//button[@id='accept-cookie-policy']")).click();
//
//        //Wait before clicking on tutorial button
//        Thread.sleep(2000);
//
//        driver.findElement(By.xpath("//span[@class='navbar__tutorial-menu--text']")).click();

        //using conditional wait method(implicitlyWait)
        //Scroll down to click the accept

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//
//        driver.findElement(By.xpath("//button[@id='accept-cookie-policy']")).click();
//
//        //Wait before clicking on tutorial button
//
//        driver.findElement(By.xpath("//span[@class='navbar__tutorial-menu--text']")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Wait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='accept-cookie-policy']")));
        driver.findElement(By.xpath("//button[@id='accept-cookie-policy']")).click();

        driver.findElement(By.xpath("//span[@class='navbar__tutorial-menu--text']")).click();





    }
}
