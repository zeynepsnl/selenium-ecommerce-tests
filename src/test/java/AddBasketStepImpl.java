import com.thoughtworks.gauge.Step;

public class AddBasketStepImpl{

    AddBasket addBasket = new AddBasket();

    @Step("<product> search")
    public void searchElement(String product){
        addBasket.search(product);
    }


    @Step("Short Element")
    public void sortElement() {
        addBasket.sort();
    }


    @Step("Choose Store Score")
    public void score(){
        addBasket.storeScore();
    }

   /* @Step("Choose Mobile Phone")
    public void phone(){
        addBasket.choosePhone();
    }
*/
    @Step("Select and add basket first product")
    public void select(){
        addBasket.selectProduct();
    }

    @Step("Redirect to basket")
    public void redirect(){
        addBasket.controlBasket();
    }
    @Step("Verify product name")
    public void product(){
        addBasket.verifyProductName();
    }


}
