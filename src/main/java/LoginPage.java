
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by zp300424 on 27.05.2017.
 */
public class LoginPage {
    WebDriver driver;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage openLoginPage() {
        driver.get("http://demo.testarena.pl/zaloguj");
        return this;
    }

    public LoginPage setEmail(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
        return this;

    }

    public LoginPage setPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
        return this;
    }

    public LoginPage assertWrongFormatEmail() {
        WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Adres e-mail i/lub hasło są niepoprawne.')]"));
        Assert.assertEquals("Adres e-mail i/lub hasło są niepoprawne.", element.getText());
        return this;

    }

    public KokpitPage clickLoginButton() {
        driver.findElement(By.id("login")).click();
        return new KokpitPage(driver);

    }


}
