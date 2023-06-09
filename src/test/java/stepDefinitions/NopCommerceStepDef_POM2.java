//package stepDefinitions;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import pages.HomePage;
//import pages.LoginPage;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.Random;
//import java.util.concurrent.TimeUnit;
//
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.MatcherAssert.assertThat;
//
//public class NopCommerceStepDef_POM2 {
//    WebDriver driver;
//
//    @Before
//    public void innitialize(){
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        DesiredCapabilities dp = new DesiredCapabilities();
//        dp.setCapability(ChromeOptions.CAPABILITY, options);
//        options.merge(dp);
//        driver = new ChromeDriver(options);
//    }
//
//
//    @Given("I am on Nopcommerce home page")
//    public void i_am_on_nopcommerce_home_page() {
////        WebDriverManager.chromedriver().setup();
////        ChromeOptions options = new ChromeOptions();
////        options.addArguments("--remote-allow-origins=*");
////        DesiredCapabilities dp = new DesiredCapabilities();
////        dp.setCapability(ChromeOptions.CAPABILITY, options);
////        options.merge(dp);
////        driver = new ChromeDriver(options);
//
//        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.navigate().to("https://demo.nopcommerce.com");
//    }
//    @Given("I have no item in the shopping cart")
//    public void i_have_no_item_in_the_shopping_cart() {
//        assertThat(driver.findElement(By.cssSelector("span[class = 'cart-qty']")).getText(), is(equalTo("(0)")));
//    }
//    @Given("I click on login link")
//    public void i_click_on_login_link() {
//        HomePage homePage = new HomePage(driver);
//        homePage.clickLogin1();
//    }
//    static int pNumber()
//    {
//        Random ran = new Random();
//        return ran.nextInt(1000);
//    }
//    @When("I attempt to login using incorrect credentials with email as {string} and password as {string}")
//    public void i_attempt_to_login_using_incorrect_credentials_with_email_as_and_password_as(String uName, String pWord) {
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.enterUsername(uName);
//        loginPage.enterPassword(pWord);
//
//    }
//    @When("I click login button")
//    public void i_click_login_button() {
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.clickLogin2();    }
//    @Then("I should get the appropriate error message displayed")
//    public void i_should_get_the_appropriate_error_message_displayed() {
//        assertThat(driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).isDisplayed(), is(true));
//
//    }
//    @After
//    public void tearDown() throws InterruptedException, IOException {
//        takeScreenShot();
//        Thread.sleep(2000);
//        driver.close();
//        driver.quit();
//    }
//    private void takeScreenShot() throws IOException {
//        TakesScreenshot scrShot =((TakesScreenshot)driver);
//        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(SrcFile, new File ("target/screenshot" + System.currentTimeMillis()+ ".png"));
//
//
//    }
//}
