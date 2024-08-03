package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HOMEPAGE {
    private  WebDriver driver;


    public HOMEPAGE(WebDriver driver) {
        this.driver = driver;
    }

    public RegisterPage clickregister() {
        driver.findElement(By.linkText("Register")).click();
         return new RegisterPage(driver);
    }
}