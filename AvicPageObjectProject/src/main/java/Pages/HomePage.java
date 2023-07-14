package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='input_search']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[@class='button-reset search-btn']")
    private WebElement searchButton;

    @FindBy(xpath = "//span[@class='sidebar-item']")
    private WebElement productCatalogButton;

    @FindBy(xpath = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'apple-store')]")
    private WebElement appleStoreButton;

    @FindBy(xpath = "//div[contains(@class, 'header-bottom__cart')]/div[@class='active-cart-item js_cart_count']")
    private WebElement miniCartCount;

    @FindBy(xpath = "//a[@href='/ua/brand-apple']//img[contains(@alt, 'Apple')]")
    private WebElement appleBrandLogoButton;

    public void searchByKeyword(final String keyword){
        searchInput.sendKeys(keyword);
        searchButton.click();
    }

    public void clickOnProductCatalog() {
        productCatalogButton.click();
    }

    public void clickOnAppleStoreButton() {
        appleStoreButton.click();
    }

    public String getMiniCartCountOfProducts() {
        return miniCartCount.getText();
    }

    public void clickOnAppleBrandLogoButton(){
        appleBrandLogoButton.click();
    }

}
