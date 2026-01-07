import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    //Create three different classes and launch any three websites of your choice from each of them
    //Navigating google.com site https://www.google.com/

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","F:\\Testify\\CI-CD-Lesson\\Testify-Automation_School\\Module4D\\Tasks\\src\\chromedriver.exe");
        //Launch Driver
        WebDriver driver = new ChromeDriver();
        //maximax the browser
        driver.manage().window().maximize();
        //Navigate to the url
        driver.get("https://www.google.com/");

    }
}
