import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddBasket extends MainPage implements AddBasketLocator {

    private static String actualValue;

    public void search(String product){
        WebElement searchbar = findElement(elementInput);
        searchbar.sendKeys(product);
        searchbar.sendKeys(Keys.ENTER);
    }

    public void sort(){
        WebElement sorting = findElement(sortElement);
        scrollToElement(sorting);
        sorting.click();
    }

    public void storeScore(){
        WebElement scoreButton = findElement(storeScoreOptions);
        scrollToElement(scoreButton);
        scoreButton.click();
    }

    /*public void choosePhone(){
        WebElement choosing = findElement(phone);
        scrollToElement(choosing);
        choosing.click();
    */
    public void selectProduct(){
        actualValue = getText(firstProductName);
        scrollToElement(findElement(BTN_ADD_SCROLL));
        click(BTN_ADD_BASKET);
    }



    public void controlBasket(){
        WebElement quantityInput = findElement(numberElement);
        String quantity = quantityInput.getText();
        if(!quantity.equals("0")) {
            System.out.println("------------------------------------");
            System.out.println("Product added to the basket.");
            click(goToBasket);
        }else{
            System.out.println("------------------------------------");
            System.out.println("Basket is empty, no redirection.");
        }
    }

   public void verifyProductName() {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(By.xpath("//div[@class='prodInfo']"))).build().perform();
       String expectedValue = getText(basketProductName);
        //scrollToElement(name);
        if (!actualValue.equals(expectedValue)) {
            System.out.println("Actual value: " + actualValue + " Expected Value: " + expectedValue);
            System.out.println("------------------------------------");
            throw new RuntimeException("!!! Wrong product name !!!");
        }
        else
            System.out.println("------------------------------------");

    }

}
