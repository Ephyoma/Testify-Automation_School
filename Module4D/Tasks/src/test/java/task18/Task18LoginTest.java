package task18;

import org.example.Task18CartPage;
import org.example.Task18LoginPage;
import org.example.Task18ProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Task18LoginTest {
    WebDriver driver = null;

    @Test
    public void task18Test() {

        System.setProperty("webdriver.chrome.driver", "F:\\Testify\\CI-CD-Lesson\\Testify-Automation_School\\Module4D\\Tasks\\src\\chromedriver.exe");
        //Launch Web Browser
        ChromeOptions options = new ChromeOptions();
        //prevents password prompts
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        //Maximax web browser
        driver.manage().window().maximize();
        //navigate to the url
        driver.get("https://www.saucedemo.com/");
        //Creating object of the loginpage
        Task18LoginPage login = new Task18LoginPage(driver);
        //A link is created on Task18ogin page to link the driver here so that the driver can be used there
        login.getUsername().sendKeys("standard_user");
        login.getPassword().sendKeys("secret_sauce");
        login.getSendLogin().click();
//Creating object of the productpage
        Task18ProductPage product = new Task18ProductPage(driver);
        //Add product to cart
        product.selectProduct().click();

        //Go to cart
        product.getAddCart().click();



    //Creating object of the cartpage
    Task18CartPage checkout = new Task18CartPage(driver);
//check out
        checkout.getCheckout().click();

    }

}