package tests;

import driver.manager.DriverManager;
import driver.manager.DriverUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import page.objects.BasePage;

import static navigation.ApplicationUrls.APPLICATION_URL;

public class TestBase extends BasePage {

    protected WebDriver driver;

    @BeforeEach
    public void beforeTest() {
        driver = DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateToPage(APPLICATION_URL);
    }

    @AfterEach
    public void afterTest() {
        DriverManager.disposeDriver();
    }
}
