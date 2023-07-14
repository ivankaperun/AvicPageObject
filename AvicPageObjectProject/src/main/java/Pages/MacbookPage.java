package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MacbookPage extends BasePage{
    public MacbookPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//label[@for='fltr-seriya-air']/a[contains(text(), 'MacBook Air')]")
    private WebElement filterCheckBox;

    @FindBy(xpath = "//a[@class='prod-cart__buy']")
    private List<WebElement> addToCartButton;

    @FindBy(xpath = "//button[@class='fancybox-button fancybox-close-small']")
    private WebElement closeModalWindowButton;

    @FindBy(xpath = "//div[contains(@class,'header-bottom__cart')]//div[@class='active-cart-item js_cart_count']")
    private WebElement elementToWaitFor;

    @FindBy(id = "js_cart")
    private WebElement addToCartPopup;

    public void clickOnFilterMacbookAirCheckbox(){
        filterCheckBox.click();
    }

    public void clickOnAddToCartButton(){
        addToCartButton.get(3).click();
    }

    public void clickOnCloseModalWindowButton(){
        closeModalWindowButton.click();
    }

    public WebElement getElementToWaitFor(){
        return elementToWaitFor;
    }

    public WebElement getAddToCartPopup(){
        return addToCartPopup;
    }
}
