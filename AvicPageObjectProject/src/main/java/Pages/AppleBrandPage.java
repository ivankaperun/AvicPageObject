package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppleBrandPage extends BasePage{
    public AppleBrandPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[@class='page-title']")
    private WebElement appleBrandMainTitle;

    public WebElement getAppleBrandMainTitle(){
        return appleBrandMainTitle;
    }
}
