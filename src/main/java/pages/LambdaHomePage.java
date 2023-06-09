package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    //create a webDriver object to use to findElements
    WebDriver driver;

    By loginButton = By.xpath("//a[@class='ico-login']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogin1() {
        driver.findElement(loginButton).click();
    }


}
