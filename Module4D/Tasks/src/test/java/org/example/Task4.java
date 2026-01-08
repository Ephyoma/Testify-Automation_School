package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

    //Navigate to http://demo.guru99.com/
    //Click on the security Project menu.
    // Input any text in the email and password field.

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","F:\\Testify\\CI-CD-Lesson\\Testify-Automation_School\\Module4D\\Tasks\\src\\chromedriver.exe");

        //Launch Web Browser
        WebDriver driver = new ChromeDriver();
        //Maximax web browser
        driver.manage().window().maximize();
        //Navigate the url
        driver.get("http://demo.guru99.com/ ");
        //Add wait time to alow the browser load fully
        Thread.sleep(5000);
        driver.findElement(By.linkText("Security Project")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("uid")).sendKeys("demologin");
        Thread.sleep(5000);
        driver.findElement(By.name("password")).sendKeys("P@ass");
        driver.findElement(By.name("btnLogin")).click();


    }
}
