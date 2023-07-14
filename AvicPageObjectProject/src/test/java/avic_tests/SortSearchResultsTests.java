package avic_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SortSearchResultsTests extends BaseTest{
    private static final String SEARCH_KEYWORD = "MacBook Air";
    private static final String EXPECTED_QUERY = "sort--pricedesc?query=MacBook+Air";

    @Test
    public void checkSortFunctionality() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        getSortSearchResultsPage().waitForPageLoadToComplete(30);
        getSortSearchResultsPage().clickOnSortButton();
        getSortSearchResultsPage().selectSortFromExpensiveToCheapOption();
        getSortSearchResultsPage().waitForPageLoadToComplete(30);
        Assert.assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_QUERY));
    }
}
