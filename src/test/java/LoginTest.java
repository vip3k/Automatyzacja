import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by zp300424 on 27.05.2017.
 */
public class LoginTest extends MainTest {


    @Test
    public void shouldLogin() {


        getKokpitPage("administrator@testarena.pl", "sumXQQ72$L");

        Assert.assertTrue(driver.findElement(By.id("header_logo")).isDisplayed());


    }


    @Test
    public void shouldNotLogin() {
        getKokpitPage("Test@email.pl", "hehehe1");

        Assert.assertTrue(driver.findElement(By.xpath("//*[@class=\"login_form_error\"]")).isDisplayed());

    }

    private KokpitPage getKokpitPage(String email, String password) {
        return super.loginPage
                .setEmail(email)
                .setPasswordInput(password)
                .loginButton();
    }


}
