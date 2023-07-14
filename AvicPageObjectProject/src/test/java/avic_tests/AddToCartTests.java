package avic_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTests extends BaseTest{
    private String EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART = "1";

    @Test
    public void checkSearchFilterAndAddToCartFunctionality(){
        getHomePage().clickOnProductCatalog();
        getHomePage().clickOnAppleStoreButton();
        getAppleStorePage().clickOnMacbookButton();
        getMacbookPage().waitForPageLoadToComplete(30);
        getMacbookPage().clickOnFilterMacbookAirCheckbox();
        getMacbookPage().waitForPageLoadToComplete(30);
        getMacbookPage().clickOnAddToCartButton();
        getMacbookPage().waitVisibilityOfElement(30, getMacbookPage().getAddToCartPopup());
        getMacbookPage().clickOnCloseModalWindowButton();
        getMacbookPage().waitVisibilityOfElement(30, getMacbookPage().getElementToWaitFor());
        Assert.assertEquals(getHomePage().getMiniCartCountOfProducts(), EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART);
    }
}
