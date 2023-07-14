package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SortSearchResultsPage extends BasePage{

    public SortSearchResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='two-column-wrapper ']//div[@class='sort-holder']/span[starts-with(@class, 'select2')]//span[starts-with(@id,'select2-sort-')]")
    private WebElement sortButton;

    @FindBy(xpath = "//span[@class='select2-results']/ul/li[contains(text(), 'Від дорогих до дешевих')]")
    private WebElement sortFromExpensiveToCheap;

    public void clickOnSortButton(){
        sortButton.click();
    }

    public void selectSortFromExpensiveToCheapOption(){
        sortFromExpensiveToCheap.click();
    }
}
