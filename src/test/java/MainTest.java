import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by zp300424 on 27.05.2017.
 */
public class MainTest {

    WebDriver driver;
    LoginPage1 loginPage;


    @Before
    public void openTestArena() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = PageFactory.initElements(driver, LoginPage1.class);
        loginPage.openLoginPage();


    }
    @After
    public void logout() {
        driver.close();
    }

}
