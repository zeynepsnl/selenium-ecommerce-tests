import org.openqa.selenium.By;

public interface AddBasketLocator {
    By elementInput = By.id("searchData");
    By sortElement = By.className("iconSortBy");
    By storeScoreOptions = By.cssSelector("div.item.i7[data-value='SELLER_GRADE']");
    //By phone = By.cssSelector("a[data-value='Cep Telefonu']");
    By firstProductName = By.xpath("//ul[@id='listingUl']//div[@class='pro']//div[@class='topLeftBadgeField']//div[contains(@class,'special')]/ancestor::a//h3");
    By BTN_ADD_BASKET = By.xpath("//ul[@id='listingUl']//div[@class='pro']//div[@class='topLeftBadgeField']//div[contains(@class,'special')]/ancestor::div[@class='pro']//span[@class='btnBasket']");
    By BTN_ADD_SCROLL = By.xpath("//ul[@id='listingUl']//div[@class='pro']//div[contains(@class,'cargoBadgeField')]");
    By basketProductName = By.xpath("//table[@class='productGroup']//div[@class='prodInfo']//a");
    By numberElement = By.xpath("//div[@class='myBasketHolder']//a//span");
    By goToBasket = By.xpath("//div[@class='myBasketHolder']//a");
}
