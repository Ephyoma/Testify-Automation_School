package module4BProject;

import org.example.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class TAS4BProjectTest {
    WebDriver driver = null;
    // Controls whether we create a NEW browser session before a test
    //private boolean reuseExistingSession = false;


    @BeforeClass
    public void setUpTest() throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "F:\\Testify\\CI-CD-Lesson\\Testify-Automation_School\\Module4D\\Tasks\\src\\chromedriver.exe");
        //Launch Web Browser
        ChromeOptions options = new ChromeOptions();
        //prevents password prompts
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        //Maximax web browser
        driver.manage().window().maximize();


    }
//    @AfterMethod
//    public void tearDown() {
//// Close only when we are NOT reusing session
//        if (!reuseExistingSession && driver != null) {
//            driver.quit();
//            driver = null;
//        }
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
        registration.getUsername().sendKeys("tstguse79");
        registration.getPassword().sendKeys("TestPassword");
        registration.getConfirm().sendKeys("TestPassword");
        registration.getCreate().click();
        Thread.sleep(5000);

        registration.getLogout().click();

        Thread.sleep(5000);

    }

    //Login with the new account
    @Test(dependsOnMethods = "register")
    public void login() throws InterruptedException {
//navigate to the url
        //        driver.get("https://parabank.parasoft.com/");
//        Thread.sleep(5000);
//navigate back to the login url
        Thread.sleep(5000);


        //Creating object of the LoginPage
        LoginPage loginPage = new LoginPage(driver);

        loginPage.getUsername().sendKeys("tstguse79");
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



// using this session for the next test
        //reuseExistingSession = true;


    }
@Test(dependsOnMethods = "login")
    public void openNewAccount() throws InterruptedException {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    //Creating object of the NewAccountPage
    NewAccountPage openAccount = new NewAccountPage(driver);

    //navigate to the url
//    driver.get("https://parabank.parasoft.com/");
//    Thread.sleep(5000);
//
//    //Creating object of the LoginPage
//    LoginPage loginPage = new LoginPage(driver);
//
//    loginPage.getUsername().sendKeys("testnguser");
//    loginPage.getPassword().sendKeys("TestPassword");
//    loginPage.getLogIn().click();


    // Ensure user is fully logged in
//    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[normalize-space()='Account Services']")
//    ));

    // WAIT until the link is clickable
    wait.until(ExpectedConditions.elementToBeClickable(openAccount.getNewAccount())).click();
    openAccount.selectAccountTypeByText("SAVINGS");
    Thread.sleep(5000);
    openAccount.getCreateNewAccount().click();

    Thread.sleep(5000);

        String successMessage = openAccount.getAccountSuccessMessage().getText();
    System.out.println(successMessage);
    Thread.sleep(5000);
    String newaccount = openAccount.getNewaccount().getText();
    System.out.println(newaccount);

    Thread.sleep(5000);

    SoftAssert message = new SoftAssert();
    message.assertTrue(successMessage.contains("account ID"));
    System.out.println(successMessage + " " + newaccount + " :account ID not found, Rather account number ");



    }
@Test(dependsOnMethods = "openNewAccount")
    public void fundTransfer() throws InterruptedException {
        //creating object of the FundTransferPage
        FundTransferPage transfer = new FundTransferPage(driver);

        Thread.sleep(5000);

        transfer.getTransfer().click();
        Thread.sleep(1000);

        int amount = 100;
        transfer.getAmount().sendKeys(String.valueOf(amount));

        Thread.sleep(1000);

        WebElement selectFromAccount = transfer.getFromAccount();

        Select select = new Select(selectFromAccount);
        select.selectByIndex(0);

        Thread.sleep(5000);

        WebElement selectToAccount = transfer.getToAccount();

        Select toAccount = new Select(selectToAccount);
        select.selectByIndex(1);

        transfer.getSubmit().click();

        String transferResult = transfer.getShowResult().getText();

        System.out.println(transferResult);



    }
@Test(dependsOnMethods = "fundTransfer")

    public void billsPay() throws InterruptedException {
        //creating object of the BillPayPage
        BillPayPage billsPayment = new BillPayPage(driver);

        Thread.sleep(5000);
        billsPayment.getClickBillsPay().click();
        Thread.sleep(5000);

        billsPayment.getSenderName().sendKeys("Test1");
        billsPayment.getSendStreet().sendKeys("Jakunde");
        billsPayment.getSendCity().sendKeys("Lekki");
        billsPayment.getSenderState().sendKeys("Lag");
        billsPayment.getZipCode().sendKeys("123456");
        billsPayment.getPhoneNumber().sendKeys("08012345678");
        billsPayment.getReceiverAccountNumber().sendKeys("47199");
        billsPayment.getReceiverAccount().sendKeys("47199");
        int billAmount = 50;
        billsPayment.getAmount().sendKeys(String.valueOf(billAmount));
        Thread.sleep(5000);
    Thread.sleep(5000);
        WebElement selectFromAccount = billsPayment.getSenderAccount();

        Select select = new Select(selectFromAccount);
        select.selectByIndex(0);
    Thread.sleep(5000);
        billsPayment.getSend().click();


    }
//@Test(dependsOnMethods = "billsPay")
//    public void tranSummary() throws InterruptedException {
//
//        //creating object of the TransactionSummaryPage
//        TransactionSummaryPage transSummary = new TransactionSummaryPage(driver);
//
//        Thread.sleep(5000);
//
//        transSummary.getFindTransactions().click();
//        Thread.sleep(5000);
//
//        WebElement selectAccountId = transSummary.getAccountId();
//
//        Select select = new Select(selectAccountId);
//        select.selectByIndex(0);
//        Thread.sleep(5000);
//
//        int transactionAmount = 100;
//
//        transSummary.getAmount().sendKeys(String.valueOf(transactionAmount));
//        Thread.sleep(5000);
//
//
//
//        transSummary.getFindByAmount().click();
//        String summaryDisplay = transSummary.getTransactionResult().getText();
//        System.out.println(summaryDisplay);
//
//
//    Assert.assertTrue(summaryDisplay.contains("100.00"), "Results table does not contain amount $100.00.");
//    Thread.sleep(5000);
//
//    int lessAmount = 70;
//
//    transSummary.getFindByAmount().click();
//    String summaryEmptyDisplay = transSummary.getTransactionResult().getText();
//    System.out.println("<<<>>> " + summaryEmptyDisplay);
//
//    Assert.assertTrue(summaryEmptyDisplay.toLowerCase().contains("no transactions"));
//    }

    @Test(dependsOnMethods = "billsPay")
    public void updateContactInfo() throws InterruptedException {

//creating object of the UpdateContactInfoPage
        UpdateContactInfoPage updateContact = new UpdateContactInfoPage(driver);

        Thread.sleep(5000);

        updateContact.getUpdateContactInfo().click();

        String phone = updateContact.getCustomerPhoneNumber().getAttribute("value");
        System.out.println("Phone raw: " + phone);
        Thread.sleep(5000);


        String digitsOnly = phone.replaceAll("\\D", "");

        Thread.sleep(5000);

        String lastFiveDigits = digitsOnly.substring(digitsOnly.length() - 5);

        Thread.sleep(5000);

        System.out.println("Last 5 digits: " + lastFiveDigits);

        // Clear ZIP code
        WebElement zipCodeField = updateContact.getCustomerZipAddress();
        zipCodeField.clear();

        // Paste last 5 digits into ZIP
        zipCodeField.sendKeys(lastFiveDigits);

        // click update button

        updateContact.getUpdateContactInfo().click();


    }
    public void sectionB_BlazeDemo_ThenPasteFlightNumberIntoParaBankZip() {

        // Store ParaBank window
        String paraBankWindow = driver.getWindowHandle();

        // Open a new tab for BlazeDemo
        driver.switchTo().newWindow(WindowType.TAB);
        String blazeWindow = driver.getWindowHandle();

        // --- BlazeDemo flow ---
        driver.get("https://blazedemo.com/");
        BlazeHomePage blazeHome = new BlazeHomePage(driver);


    }

}