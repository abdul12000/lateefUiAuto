//package stepDefinitions;
//
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import java.util.concurrent.TimeUnit;
//
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.MatcherAssert.assertThat;
//
//public class LambdaRegisterAnAccountStepDef {
//    WebDriver driver;
////    @Before
////    public void innitialize(){
////        WebDriverManager.chromedriver().setup();
////        ChromeOptions options = new ChromeOptions();
////        options.addArguments("--remote-allow-origins=*");
////        DesiredCapabilities dp = new DesiredCapabilities();
////        dp.setCapability(ChromeOptions.CAPABILITY, options);
////        options.merge(dp);
////        driver = new ChromeDriver(options);
////        WebDriverManager.firefoxdriver().setup();
////        driver = new FirefoxDriver();
//
////    }
//
//
//    @Given("I am on the Lambdatest home page {string}")
//    public void i_am_on_the_lambdatest_home_page(String lambdaUrl) {
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        DesiredCapabilities dp = new DesiredCapabilities();
//        dp.setCapability(ChromeOptions.CAPABILITY, options);
//        options.merge(dp);
//        driver = new ChromeDriver(options);
////        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get(lambdaUrl);
//
//    }
//    @When("I click on MyAccount Menu")
//    public void i_click_on_my_account_menu() {
//        // Write code here that turns the phrase above into concrete actions
//driver.findElements(By.xpath("//span[contains(text(),'My account')]")).get(1).click();
//    }
//    @When("I click on Continue under the New Customer")
//    public void i_click_on_continue_under_the_new_customer() {
//        // Write code here that turns the phrase above into concrete actions
//        driver.findElement(By.linkText("Continue")).click();
//
//    }
//    @Then("the Register Account page should be displayed")
//    public void the_register_account_page_should_be_displayed() throws InterruptedException {
//      assertThat(driver.findElement(By.cssSelector("h1.page-title.h3")).getText(), is (equalTo("Register Account")));
//
//
//    }
//
//
//    @When("I enter valid details for First Name as {string}, Last Name as {string}, E-mail as {string}, Telephone as {string}, Password as {string}")
//    public void i_enter_valid_details_for_first_name_as_last_name_as_e_mail_as_telephone_as_password_as(String fName, String lName, String eMail, String phone, String pWord) {
//        // Write code here that turns the phrase above into concrete actions
//        driver.findElement(By.id("input-firstname")).sendKeys(fName);
//        driver.findElement(By.id("input-lastname")).sendKeys(lName);
//        driver.findElement(By.id("input-email")).sendKeys(eMail);
//        driver.findElement(By.id("input-telephone")).sendKeys(phone);
//        driver.findElement(By.id("input-password")).sendKeys(pWord);
//        driver.findElement(By.id("input-confirm")).sendKeys(pWord);
//    }
//    @When("I accept the privacy policy")
//    public void i_accept_the_privacy_policy() {
//   driver.findElement(By.cssSelector("div.custom-control.custom-checkbox.custom-control-inline")).click();
//    }
//    @When("I click on Continue button on the Register and Account page")
//    public void i_click_on_continue_button_on_the_register_and_account_page() {
//        // Write code here that turns the phrase above into concrete actions
//       driver.findElement(By.xpath("//input[@value='Continue']")).click();
//    }
//    @Then("Register Confirmation page is displayed")
//    public void register_confirmation_page_is_displayed() throws InterruptedException {
//        WebElement a = driver.findElement(By.cssSelector("h1.page-title.my-3"));
//        System.out.println(a.getText());
//        assertThat(a.getText(),is(equalTo("Your Account Has Been Created!")));
//        Thread.sleep(2000);
//        driver.close();
//        driver.quit();
//    }
//
//}
