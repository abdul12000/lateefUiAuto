package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NopCommerceStepDef {
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
//    }


    @Given("I am on Nopcommerce home page")
    public void i_am_on_nopcommerce_home_page() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        DesiredCapabilities dp = new DesiredCapabilities();
        dp.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(dp);
        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com");
    }
    @Given("I have no item in the shopping cart")
    public void i_have_no_item_in_the_shopping_cart() {
        assertThat(driver.findElement(By.cssSelector("span[class = 'cart-qty']")).getText(), is(equalTo("(0)")));
    }
    @Given("I click on login link")
    public void i_click_on_login_link() {
        WebElement loginButton;
        loginButton = driver.findElement(By.xpath("//a[@class='ico-login']"));
        loginButton.click();
    }
    static int pNumber()
    {
        Random ran = new Random();
        return ran.nextInt(1000);
    }
    @When("I attempt to login using incorrect credentials with email as {string} and password as {string}")
    public void i_attempt_to_login_using_incorrect_credentials_with_email_as_and_password_as(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click login button")
    public void i_click_login_button() {
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
    }
    @Then("I should get the appropriate error message displayed")
    public void i_should_get_the_appropriate_error_message_displayed() {
        assertThat(driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).isDisplayed(), is(true));

    }
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
}
