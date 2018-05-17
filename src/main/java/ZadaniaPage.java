import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by zp300424 on 27.05.2017.
 */
public class ZadaniaPage {
    WebDriver driver;


    public ZadaniaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addZadanie(){
        driver.findElement(By.xpath("//a[@href='http://demo.testarena.pl/task_add']")).click();

    }

}
