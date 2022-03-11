import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void homepage() {
        driver.get(Constants.url);
    }

    public void clickLogin() {
        driver.findElement(By.id("login")).click();
    }

    public void hoverElement() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.className("sf-OldMyAccount-PhY-T"))).build().perform();
    }
}
