package tests;

import org.junit.jupiter.api.Test;
import page.objects.LandingPage;

public class OpenHomePageTest extends TestBase {

    @Test
    public void openHomePage() {
        LandingPage landingPage = new LandingPage();
        landingPage.clickOnHeaderLogo();
    }
}
