import org.openqa.selenium.By;

public interface LoginPageLocator {
    By tryLogin = By.cssSelector("a[title='Giriş Yap']");
    By emailInput = By.id("email");
    By passwordInput = By.id("password");
    By loginButton = By.className("btnPrimary");
    By userElement = By.cssSelector("a.user[title='Hesabım']");
}
