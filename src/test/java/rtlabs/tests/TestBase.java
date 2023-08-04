package rtlabs.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import rtlabs.pages.LoginPage;

public class TestBase {

    //LoginPage loginPage = new LoginPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://pgu-uat-fed.test.gosuslugi.ru";
    }
}
