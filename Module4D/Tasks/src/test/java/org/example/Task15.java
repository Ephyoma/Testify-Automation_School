package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task15 {
    //Structure your TestNG file to run Naviagte to google and search for testify.
    //close the browser
    //Naviagate to https://www.mcdonalds.com/us/en-us.html .
    // print out the colour - code of the order now button.
    // All test should be done in one class and utilize your knowldge of tesNG annotation)
    WebDriver driver = null;
@BeforeMethod
    public void openBr0wser() {
    System.setProperty("webdriver.chrome.driver", "F:\\Testify\\CI-CD-Lesson\\Testify-Automation_School\\Module4D\\Tasks\\src\\chromedriver.exe");
    //Launch Web Browser
    driver  = new ChromeDriver();
    //prevents password prompts
    //options.addArguments("--incognito");
     driver = new ChromeDriver();
    //Maximax web browser
    driver.manage().window().maximize();
    System.out.println("---Br0wser launched----");

//Navigate the url
    }
@Test
    public void searchGoogle() throws InterruptedException {
    driver.navigate().to("https://www.bing.com/");
    driver.findElement(By.id("sb_form_q")).sendKeys("testify");
    Actions key = new Actions(driver);
    Thread.sleep(5000);
    key.sendKeys("").sendKeys(Keys.ENTER).build().perform();

    System.out.println("----Searching---");
    }
@Test
    public void cl0seBr0wser() {
    driver.quit();

    }

    @Test
    public void Navigatemcdonalds() {
        driver.navigate().to("https://www.mcdonalds.com/us/en-us.html");
        String colr=driver.findElement(By.cssSelector("#button-ordernow")).getCssValue("color");
        System.out.println(colr);






    }

}
