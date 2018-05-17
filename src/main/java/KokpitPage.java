import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by zp300424 on 27.05.2017.
 */
public class KokpitPage {

    WebDriver driver;

    public KokpitPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void assertUserIsLoggedIn(){
        Assert.assertTrue(driver.findElement(By.id("header_logo")).isDisplayed());
    }

    public void clickZadania(){
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/ul/li[7]/a")).click();
    }

}
