import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SolutionCentrePage {
    WebDriver driver;

    public SolutionCentrePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSolutionCentre() {
        driver.findElement(By.xpath("//a[@title='Çözüm Merkezi']")).click();
    }

    public void clickQuestionAboutmyOrder() {
        driver.findElement(By.xpath("//button[contains(text(),'Siparişim ile ilgili sorum var')]")).click();
    }

    public void clickSelectOrder() {
        driver.findElement(By.xpath("//span[normalize-space()='Per, 23:25']")).click();
    }

    public void clickDifferentQuestion() {
        driver.findElement(By.xpath("//span[contains(text(),'Farklı bir konuda sorum var')]")).click();
    }

    public void clickProductInformation() {
        driver.findElement(By.xpath("//span[normalize-space()='Ürün bilgisi']")).click();
    }

    public void clickAreTheProductsOriginal() {
        driver.findElement(By.xpath("//span[normalize-space()='Ürünler orijinal midir?']")).click();
    }

    public void clickCallMe() {
        driver.findElement(By.xpath("//span[contains(text(),'Beni şimdi arayın')]")).click();
    }


}
