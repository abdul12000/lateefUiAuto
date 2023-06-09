package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LambdaHomePage {
    //create a webDriver object to use to findElements
    protected WebDriver driver;

    private By myAccountButton = By.xpath("//span[contains(text(),'My account')]");

    public LambdaHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMyAccount() {
        driver.findElements(myAccountButton).get(1).click();

    }

    public String getPageTitle(){
        return driver.getTitle();
    }


}
