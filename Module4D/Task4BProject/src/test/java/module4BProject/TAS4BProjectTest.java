package module4BProject;

import org.example.LoginPage;
import org.example.NewAccountPage;
import org.example.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TAS4BProjectTest {
    WebDriver driver = null;


    @BeforeClass
    public void setUpTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\Testify\\CI-CD-Lesson\\Testify-Automation_School\\Module4D\\Tasks\\src\\chromedriver.exe");
        //Launch Web Browser
        ChromeOptions options = new ChromeOptions();
        //prevents password prompts
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        //Maximax web browser
        driver.manage().window().maximize();


    }

//        @AfterMethod
//    public void cl0seBr0wser() {
//        driver.quit();
//    }
    //Register as a new user and take note of your username.
    @Test
    public void register() throws InterruptedException {
        //navigate to the url
        driver.get("https://parabank.parasoft.com/");
        Thread.sleep(5000);

        //Creating object of the RegistrationPage
        RegistrationPage registration = new RegistrationPage(driver);

        registration.getRegister().click();
        registration.getFirstName().sendKeys("Ayam");
        registration.getLastName().sendKeys("Stanley");
        registration.getStreet().sendKeys("Ajiran");
        registration.getCity().sendKeys("lekki");
        registration.getState().sendKeys("Lagos");
        registration.getZipCode().sendKeys("1234566");
        registration.getPhoneNumber().sendKeys("+1234567890");
        registration.getSsn().sendKeys("123456789");
        registration.getUsername().sendKeys("projectused2");
        registration.getPassword().sendKeys("TestPassword");
        registration.getConfirm().sendKeys("TestPassword");
        registration.getCreate().click();

    }

    //Login with the new account
    @Test(dependsOnMethods = "register")
    public void login() throws InterruptedException {

        //Wait 5 sec to navigate back to login page
        Thread.sleep(5000);
        driver.navigate().back();

        //Creating object of the LoginPage
        LoginPage loginPage = new LoginPage(driver);

        loginPage.getUsername().sendKeys("projectused2");
        loginPage.getPassword().sendKeys("TestPassword");
        loginPage.getLogIn().click();

        //Assert that the user sees the text: Welcome testuser Your account was created successfully. You are now
        //logged in

        String welcomeNote = loginPage.getVerify().getText();
        System.out.println(welcomeNote);

        SoftAssert soft = new SoftAssert();

        soft.assertTrue(welcomeNote.contains("‘Welcome projectuser Your account was created successfully. You are now\n" +
                "logged in"));
        System.out.println(welcomeNote + " :Account creation success message not found");


    }
@Test(dependsOnMethods = "login")
    public void openNewAccount() {

        //Creating object of the NewAccountPage
        NewAccountPage openAccount = new NewAccountPage(driver);
        openAccount.getNewAccount().click();
        openAccount.selectAccountTypeByText("SAVINGS");
        openAccount.getCreateNewAccount().click();
        String successMessage = openAccount.getAccountSuccessMessage().getText();
    System.out.println(successMessage);

    SoftAssert message = new SoftAssert();
    message.assertTrue(successMessage.contains("account ID"));
    System.out.println(successMessage + " :account ID not found, Rather account number ");

    }
}