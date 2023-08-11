package rtlabs.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import rtlabs.pages.LoginPage;

import static com.codeborne.selenide.FileDownloadMode.PROXY;

public class TestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://pgu-uat-fed.test.gosuslugi.ru";
        //Configuration.proxyEnabled = true;
        //Configuration.fileDownload = PROXY;
    }
}
