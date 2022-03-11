import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmailandclickButton(String Email) {
        driver.findElement(By.id("txtUserName")).sendKeys(Email);
        driver.findElement(By.id("btnLogin")).click();
    }

    public void setPasswordandclickButton(String password) {
        driver.findElement(By.id("txtPassword")).sendKeys(password);
        driver.findElement(By.id("btnEmailSelect")).click();
    }

    public boolean controlAccountPage() {
        return driver.findElement(By.xpath("//div[@id='oldHeader_01be184c-a6f4-4b12-2a58-bfee7abefbe3']//span//span[1]"))
                .getText().equals("Hesabım");
    }

}
