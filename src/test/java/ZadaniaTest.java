import org.junit.Test;

/**
 * Created by zp300424 on 27.05.2017.
 */
public class ZadaniaTest extends MainTest {




    @Test
    public void addFieldsToZadania() {
//        loginPage.();
        kokpitPage.clickZadania();
        zadaniaPage.addZadanie();
        editZadaniePage.addName("Nowa nazwa");
        editZadaniePage.addOpis("nazwa nazwa 123");


    }


}


