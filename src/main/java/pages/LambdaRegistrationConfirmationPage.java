package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LambdaRegistrationConfirmationPage {
    //create a webDriver object to use to findElements
    protected WebDriver driver;

    private By pageHeader = By.cssSelector("h1.page-title.my-3");

    public LambdaRegistrationConfirmationPage(WebDriver driver){
        this.driver = driver;
    }
    public String getPageHeader(){
        return driver.findElement(pageHeader).getText();
    }
    public String getPageTitle(){
        return driver.getTitle();
    }
}
