package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LambdaHomePage;
import pages.LambdaMyAccountPage;
import pages.LambdaRegistrationConfirmationPage;
import pages.LambdaRegistrationPage;

import java.time.Duration;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LambdaRegisterAnAccountStepDefWithPOM {
    WebDriver driver;
//    @Before
//    public void innitialize(){
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        DesiredCapabilities dp = new DesiredCapabilities();
//        dp.setCapability(ChromeOptions.CAPABILITY, options);
//        options.merge(dp);
//        driver = new ChromeDriver(options);
//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();

//    }


    @Given("I am on the Lambdatest home page {string}")
    public void i_am_on_the_lambdatest_home_page(String lambdaUrl) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        DesiredCapabilities dp = new DesiredCapabilities();
        dp.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(dp);
        driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(lambdaUrl);

    }

    @When("I click on MyAccount Menu")
    public void i_click_on_my_account_menu() {
        // Write code here that turns the phrase above into concrete actions
        LambdaHomePage lambdaHomePage = new LambdaHomePage(driver);
        lambdaHomePage.clickMyAccount();
    }

    @When("I click on Continue under the New Customer")
    public void i_click_on_continue_under_the_new_customer() {
        // Write code here that turns the phrase above into concrete actions
        LambdaMyAccountPage lambdaMyAccountPage = new LambdaMyAccountPage(driver);
        lambdaMyAccountPage.clickContinueButton();
    }

    @Then("the Register Account page should be displayed")
    public void the_register_account_page_should_be_displayed() throws InterruptedException {
//      assertThat(driver.findElement(By.cssSelector("h1.page-title.h3")).getText(), is (equalTo("Register Account")));
        LambdaRegistrationPage lambdaRegistrationPage = new LambdaRegistrationPage(driver);
        assertThat(lambdaRegistrationPage, is(equalTo("Register Account")));

    }


    @When("I enter valid details for First Name as {string}, Last Name as {string}, E-mail as {string}, Telephone as {string}, Password as {string}")
    public void i_enter_valid_details_for_first_name_as_last_name_as_e_mail_as_telephone_as_password_as(String fName, String lName, String eMail, String phone, String pWord) {
        // Write code here that turns the phrase above into concrete actions
//        driver.findElement(By.id("input-firstname")).sendKeys(fName);
//        driver.findElement(By.id("input-lastname")).sendKeys(lName);
//        driver.findElement(By.id("input-email")).sendKeys(eMail);
//        driver.findElement(By.id("input-telephone")).sendKeys(phone);
//        driver.findElement(By.id("input-password")).sendKeys(pWord);
//        driver.findElement(By.id("input-confirm")).sendKeys(pWord);
        LambdaRegistrationPage lambdaRegistrationPage = new LambdaRegistrationPage(driver);
        lambdaRegistrationPage.enterFirstName(fName);
        lambdaRegistrationPage.enterLastName(lName);
        lambdaRegistrationPage.enterEmail(eMail);
        lambdaRegistrationPage.enterTelephoneNumber(phone);
        lambdaRegistrationPage.enterPassword(pWord);
        lambdaRegistrationPage.enterConfirmPassword(pWord);

    }

    @When("I accept the privacy policy")
    public void i_accept_the_privacy_policy() {
//   driver.findElement(By.cssSelector("div.custom-control.custom-checkbox.custom-control-inline")).click();
        LambdaRegistrationPage lambdaRegistrationPage = new LambdaRegistrationPage(driver);
        lambdaRegistrationPage.clickOnPP();
    }

    @When("I click on Continue button on the Register and Account page")
    public void i_click_on_continue_button_on_the_register_and_account_page() {
        // Write code here that turns the phrase above into concrete actions
//        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        LambdaRegistrationPage lambdaRegistrationPage = new LambdaRegistrationPage(driver);
        lambdaRegistrationPage.clickOnContinueButton();
    }

    @Then("Register Confirmation page is displayed")
    public void register_confirmation_page_is_displayed() throws InterruptedException {
//        WebElement a = driver.findElement(By.cssSelector("h1.page-title.my-3"));
//        System.out.println(a.getText());
//        assertThat(a.getText(), is(equalTo("Your Account Has Been Created!")));
//        Thread.sleep(2000);
        LambdaRegistrationConfirmationPage lambdaRegistrationConfirmationPage = new LambdaRegistrationConfirmationPage(driver);
        assertThat(lambdaRegistrationConfirmationPage.getPageHeader(), is(equalTo("Your Account Has Been Created!")));
    }

    @When("I click on Login from MyAccount Menu")
    public void iClickOnLoginFromMyAccountMenu() {

        List<WebElement> myAccountMenu = driver.findElements(By.xpath("//span[contains(text(),'My account')]"));
        new Actions(driver).moveToElement(myAccountMenu.get(1)).perform();
        // Perform mouse move action onto the element
        WebElement registerlink = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Login')]")));
        registerlink.click();
    }

    @When("I click on rgeister from MyAccount Menu")
    public void iClickOnRgeisterFromMyAccountMenu() {
        List<WebElement> myAccountMenu = driver.findElements(By.xpath("//span[contains(text(),'My account')]"));
        new Actions(driver).moveToElement(myAccountMenu.get(1)).perform();
        // Perform mouse move action onto the element
        WebElement registerlink = driver.findElement(By.xpath("//span[contains(text(),'Register')]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Register')]")));
        registerlink.click();
    }

    @When("I search for htc")
    public void iSearchForHtc() {

        driver.findElement(By.cssSelector("input[name='search']")).sendKeys("htc");
        driver.findElement(By.cssSelector("button.type-text")).sendKeys(Keys.ENTER);
        assertThat(driver.findElement(By.xpath("//h1[contains(text(),'Search - htc')]")).isDisplayed(), is(true));
        System.out.println(driver.getTitle());
    }
    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
