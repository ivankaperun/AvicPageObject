package avic_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppleBrandPageTests extends BaseTest{
    private static final String EXPECTED_URL_TEXT = "brand-apple";

    @Test
    public void checkAbilityToOpenAppleBrandPageByClickOnAppleIcon(){
        getHomePage().clickOnAppleBrandLogoButton();
        getAppleBrandPage().waitVisibilityOfElement(30, getAppleBrandPage().getAppleBrandMainTitle());
        Assert.assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_URL_TEXT));
    }
}
