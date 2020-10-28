package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;

import static generic.assertions.AssertWebElement.assertThat;

public class LandingPage extends BasePage {

    @FindBy(id = "header_logo")
    WebElement headerLogo;

    public LandingPage clickOnHeaderLogo() {
        WaitForElement.waitUntilElementIsClickable(headerLogo);
        headerLogo.click();
        log().info("Clicked on the header logo");
        assertThat(headerLogo).isDisplayed();

        return new LandingPage();
    }
}
