package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2b {
    //Navigating https://signon.oracle.com/signin
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","F:\\Testify\\CI-CD-Lesson\\Testify-Automation_School\\Module4D\\Tasks\\src\\chromedriver.exe");

        //Launch Web Browser
        WebDriver driver = new ChromeDriver();
        //Maximax web browser
        driver.manage().window().maximize();
        //Navigate the url
        driver.get("https://signon.oracle.com/signin");
    }
}
