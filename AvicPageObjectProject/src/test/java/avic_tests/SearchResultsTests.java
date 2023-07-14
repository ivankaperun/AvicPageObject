package avic_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchResultsTests extends BaseTest {
    private static final String SEARCH_KEYWORD = "iPhone 13 Pro Max";
    private static final String EXPECTED_QUERY = "query=iPhone+13+Pro+Max";

    @Test
    public void checkThatUrlContainsSearchWord() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        Assert.assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_QUERY));
    }


}
