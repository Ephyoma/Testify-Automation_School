package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//Navigate to https://jqueryui.com/
//click on the dialog menu from the left pane
//click on the close icon to close the dialogue box in the middle
public class Task10 {
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
        driver.navigate().to("https://jqueryui.com/");
        //Wait time to allow browser load properly
        Thread.sleep(5000);
        //Click on the Dialog link
        driver.findElement(By.xpath("//a[normalize-space()='Dialog']")).click();

        Thread.sleep(5000);
//Switching to iframe to access the close icon
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-closethick']")).click();
    }
}
