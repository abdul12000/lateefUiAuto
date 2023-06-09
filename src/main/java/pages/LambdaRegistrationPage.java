package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class LambdaRegistrationPage {
    //create a webDriver object to use to findElements
    protected WebDriver driver;

    private By pageHeader = By.id("h1.page-title.h3");
    private By firstName = By.id("input-firstname");
    private By lastName = By.id("input-lastname");
    private By emailAddress = By.id("input-email");
    private By telephoneNumber = By.id("input-telephone");
    private By password = By.id("input-password");
    private By confirmPassword = By.id("input-confirm");
    private By  privacyPolicy = By.cssSelector("div.custom-control.custom-checkbox.custom-control-inline");
    private By continueButton = By.xpath("//input[@value='Continue']");

    public LambdaRegistrationPage(WebDriver driver){
        this.driver = driver;
    }
    public String getPageHeader(){
        return driver.findElement(pageHeader).getText();
    }
    public void enterFirstName(String fName){
        driver.findElement(firstName).sendKeys(fName);
    }
    public void enterLastName(String lName){
        driver.findElement(lastName).sendKeys(lName);
    }
    public void enterEmail(String email){
        driver.findElement(emailAddress).sendKeys(pNumber()+email);
    }
    public void enterTelephoneNumber(String telephone){
        driver.findElement(telephoneNumber).sendKeys(telephone);
    }
    public void enterPassword(String pWord){
        driver.findElement(password).sendKeys(pWord);
    }
    public void enterConfirmPassword(String pWord){
        driver.findElement(confirmPassword).sendKeys(pWord);
    }
    public void clickOnPP(){
        driver.findElement(privacyPolicy).click();
    }
    public void clickOnContinueButton(){
        driver.findElement(continueButton).click();
    }

    static int pNumber() {
        Random ran = new Random();
        return ran.nextInt(1000);
    }

    public String getPageTitle(){
        return driver.getTitle();
    }
}
