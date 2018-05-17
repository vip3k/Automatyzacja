import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by zp300424 on 27.05.2017.
 */
public class ZadaniaTest extends MainTest{
    WebDriver driver;
    LoginPage loginPage;
    KokpitPage kokpitPage;
    ZadaniaPage zadaniaPage;
    EditZadaniePage editZadaniePage;


        @Test
        public void addFieldsToZadania() {
            loginPage.openLoginPage();
            kokpitPage.clickZadania();
            zadaniaPage.addZadanie();
            editZadaniePage.addName("Nowa nazwa");
            editZadaniePage.addOpis("nazwa nazwa 123");


        }


    }


