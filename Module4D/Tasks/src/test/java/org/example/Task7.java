package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.lang.reflect.Type;
import java.time.Duration;
import java.util.List;
import java.util.Optional;

//Navigate to https://worldweather.wmo.int/en/home.html.
//Search for your city in the search field. When the result loads, print the days and weather description for each of the days shown in a readable and understandable manner.
//GetText Task
public class Task7 {
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
        driver.get("https://worldweather.wmo.int/en/home.html");
        String autocom = driver.findElement(By.cssSelector("input#q_search")).getAttribute("autocomplete");
        System.out.println(autocom);
        //Search for the city New York City
        driver.findElement(By.cssSelector("input#q_search")).sendKeys("New York City");
        //5sec sleep to allow the page load properly
        Thread.sleep(5000);
        //Search button submit
        driver.findElement(By.cssSelector(".top_searchbox_submit")).click();
        Thread.sleep(5000);

        //Get all forecast rows
        String date= driver.findElement(By.cssSelector("div[class='city_container'] div:nth-child(1) div:nth-child(1) div:nth-child(1)")).getText();
        String desc = driver.findElement(By.cssSelector("div[class='city_container'] div:nth-child(1) div:nth-child(4)")).getText();

        String date2= driver.findElement(By.cssSelector("div[class='city_container'] div:nth-child(2) div:nth-child(1) div:nth-child(1)")).getText();
        String desc2 = driver.findElement(By.cssSelector("div[class='city_container'] div:nth-child(2) div:nth-child(4)")).getText();

        String date3= driver.findElement(By.cssSelector("div[class='city_container'] div:nth-child(3) div:nth-child(1) div:nth-child(1)")).getText();
        String desc3 = driver.findElement(By.cssSelector("div[class='city_container'] div:nth-child(3) div:nth-child(4)")).getText();

        String date4= driver.findElement(By.cssSelector("div[class='city_container'] div:nth-child(4) div:nth-child(1) div:nth-child(1)")).getText();
        String desc4 = driver.findElement(By.cssSelector("div[class='city_container'] div:nth-child(4) div:nth-child(4)")).getText();

        String date5= driver.findElement(By.cssSelector("div[class='city_container'] div:nth-child(5) div:nth-child(1) div:nth-child(1)")).getText();
        String desc5 = driver.findElement(By.cssSelector("div[class='city_container'] div:nth-child(5) div:nth-child(4)")).getText();

        String date6= driver.findElement(By.cssSelector("div[class='city_container'] div:nth-child(6) div:nth-child(1) div:nth-child(1)")).getText();
        String desc6 = driver.findElement(By.cssSelector("div[class='city_container'] div:nth-child(6) div:nth-child(4)")).getText();

        String date7= driver.findElement(By.cssSelector("div[class='city_container'] div:nth-child(7) div:nth-child(1) div:nth-child(1)")).getText();
        String desc7 = driver.findElement(By.cssSelector("div[class='city_container'] div:nth-child(7) div:nth-child(4)")).getText();

        System.out.println("Weather Forecast for New York City");
        System.out.println("---------------------------");
        System.out.println(date + ( " " ) + desc);
        System.out.println("---------------------------");
       System.out.println(date2 + ( " " ) + desc2);
        System.out.println("---------------------------");
        System.out.println(date3 + ( " " ) + desc3);
        System.out.println("---------------------------");
        System.out.println(date4 + ( " " ) + desc4);
        System.out.println("---------------------------");
        System.out.println(date5 + ( " " ) + desc5);

        System.out.println("---------------------------");
        System.out.println(date6 + ( " " ) + desc6);

        System.out.println("---------------------------");
        System.out.println(date7 + ( " " ) + desc7);








    }
}
