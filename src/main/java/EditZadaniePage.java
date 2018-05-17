import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by zp300424 on 27.05.2017.
 */
public class EditZadaniePage {

    WebDriver driver;


    public EditZadaniePage(WebDriver driver) {
        this.driver = driver;
    }
    public void addName(String name){
        driver.findElement(By.id("title")).sendKeys(name);
    }

    public void addOpis (String opis){
        driver.findElement(By.id("description")).sendKeys(opis);
    }

}
