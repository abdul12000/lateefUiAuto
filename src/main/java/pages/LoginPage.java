package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    //create a webDriver object to use to findElements
    protected WebDriver driver;

    private By username = By.id("Email");
    private By password = By.id("Password");
    private By secondLoginButton = By.xpath("//button[@class='button-1 login-button']");
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void enterUsername(String uName){
        driver.findElement(username).sendKeys(uName);
    }
    public void enterPassword(String pWord){
        driver.findElement(password).sendKeys(pWord);
    }
    public void clickLogin2(){
        driver.findElement(secondLoginButton).click();
    }


}
