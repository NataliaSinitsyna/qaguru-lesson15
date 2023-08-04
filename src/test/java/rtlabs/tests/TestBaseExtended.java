package rtlabs.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBaseExtended {
    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "2560*1440";
        Configuration.baseUrl = "https://pgu-uat-fed.test.gosuslugi.ru";
    }
}
