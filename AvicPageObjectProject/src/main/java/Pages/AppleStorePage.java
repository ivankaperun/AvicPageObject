package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppleStorePage extends BasePage{

    public AppleStorePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='brand-box__title']/a[contains(@href,'macbook')]")
    private WebElement macbookButton;

    public void clickOnMacbookButton() {
        macbookButton.click();
    }
}
