package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    //create a webDriver object to use to findElements
    WebDriver driver;

    By loginButton = By.cssSelector("//a[@class='ico-login']");
    By username = By.id("Email");
    By password = By.id("//a[@class='ico-login']");
    By secondLoginButton = By.xpath("//button[@class='button-1 login-button']");
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickLogin1(){
        driver.findElement(loginButton).click();
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
