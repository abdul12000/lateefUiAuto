package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LambdaMyAccountPage {
    //create a webDriver object to use to findElements
    protected WebDriver driver;

    private By continueButtonElement = By.linkText("Continue");
    public LambdaMyAccountPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickContinueButton(){
        driver.findElement(continueButtonElement).click();
    }


    public String getPageTitle(){
        return driver.getTitle();
    }
}
