package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LambdaRegistrationPage {
    //create a webDriver object to use to findElements
    WebDriver driver;

    By pageHeader = By.id("h1.page-title.h3");
    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By emailAddress = By.id("input-email");
    By telephoneNumber = By.id("input-telephone");
    By password = By.id("input-password");
    By confirmPassword = By.id("input-confirm");
    By  privacyPolicy = By.cssSelector("div.custom-control.custom-checkbox.custom-control-inline");
    By continueButton = By.xpath("//input[@value='Continue']");

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
        driver.findElement(emailAddress).sendKeys(email);
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
}
