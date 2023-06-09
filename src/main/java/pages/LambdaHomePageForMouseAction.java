package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LambdaHomePageForMouseAction {
    //create a webDriver object to use to findElements
    protected WebDriver driver;

    private By myAccountButton = By.xpath("//span[contains(text(),'My account')]");
    private By registerButton = By.xpath("//span[contains(text(),'Register')]");

    public LambdaHomePageForMouseAction(WebDriver driver) {
        this.driver = driver;
    }

//    public void clickMyAccount() {
//        driver.findElements(myAccountButton).get(1).click();

//    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void hoverOnMyAccountAndClicRegister() {
        List<WebElement> myAccountMenu = driver.findElements(myAccountButton);
        new Actions(driver).moveToElement(myAccountMenu.get(1)).perform();
        // Perform mouse move action onto the element
//    WebElement registerlink = driver.findElement(By.xpath("//span[contains(text(),'Register')]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerButton));
        driver.findElement(registerButton).click();
    }

}
