public class LoginPage extends MainPage implements LoginPageLocator{

    public void openApp(String url){
        driver.get(url);
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        System.out.println("------------------------------------");
    }

    public void press(){
        click(tryLogin);
    }

    public void login() {
        clearAndWrite(emailInput,"xxx@gmail.com");
        clearAndWrite(passwordInput,"xxxxxxxx");
        click(loginButton);
    }

    public void verifyUser(){
        if (!findElement(userElement).isDisplayed())
            throw new RuntimeException("!!! Login Unsuccessful !!!");
        else
            System.out.println("Login Successful");
    }
}
