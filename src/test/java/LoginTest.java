import org.junit.Test;

/**
 * Created by zp300424 on 27.05.2017.
 */
public class LoginTest extends MainTest{


    @Test
    public void shouldLogin() {

        super.loginPage
                .setEmail("administrator@testarena.pl")
                .setpPasswordInput("sumXQQ72$L")
                .loginButton()
                .assertUserIsLoggedIn();

    }


    @Test
    public void shouldNotLogin() {
       super.loginPage.openLoginPage()
        .setEmail("test@testarena.pl")
        .setpPasswordInput("haslo123")
        .loginButton();

    }


}
