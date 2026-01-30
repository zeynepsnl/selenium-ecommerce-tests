import com.thoughtworks.gauge.Step;

public class LoginPageStepImpl extends LoginPage {

    LoginPage loginPage = new LoginPage();

    @Step("<url> open app")
    public void openAppImpl(String url){
        loginPage.openApp(url);
    }

    @Step("Press to login button")
    public void pressTo(){
        loginPage.press();
    }

    @Step("Login")
    public void tryLogin(){
        loginPage.login();
    }

    @Step("Verify user logged in")
    public void user(){
        loginPage.verifyUser();
    }

}

