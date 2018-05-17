import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by zp300424 on 27.05.2017.
 */
public class LoginPage1 {
WebDriver driver;

    @FindBy(id = "email")
    WebElement emailInput;
    @FindBy(id = "password")
    WebElement passwordInput;
    @FindBy(id = "login")
    WebElement loginButton;

    public LoginPage1(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage1 setEmail(String email) {
        emailInput.sendKeys(email);
        //driver.findElement(By.id("emial").sendKeys(emial) to samo co emailInput.sendKeys(email);
        return this;
    }


    public LoginPage1 setpPasswordInput(String password) {
        passwordInput.sendKeys(password);
        return this;
    }


    public KokpitPage loginButton() {
        loginButton.click();
        return new KokpitPage(driver);
    }

    public LoginPage1 openLoginPage() {
        driver.get("http://demo.testarena.pl/zaloguj");
        return this;
    }
}
