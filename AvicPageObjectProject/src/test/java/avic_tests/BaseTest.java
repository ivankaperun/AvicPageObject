package avic_tests;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {
    private WebDriver driver;
    private static final String AVIC_URL = "https://avic.ua/";

    @BeforeTest
    public void profileSetUp(){
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AVIC_URL);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    public WebDriver getDriver(){
        return driver;
    }

    public HomePage getHomePage(){
        return new HomePage(getDriver());
    }

    public MacbookPage getMacbookPage(){
        return new MacbookPage(getDriver());
    }

    public AppleStorePage getAppleStorePage(){
        return new AppleStorePage(getDriver());
    }

    public SortSearchResultsPage getSortSearchResultsPage(){
        return new SortSearchResultsPage(getDriver());
    }

    public AppleBrandPage getAppleBrandPage(){
        return new AppleBrandPage(getDriver());
    }

}
