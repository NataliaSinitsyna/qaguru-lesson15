package rtlabs.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import rtlabs.helpers.Attach;
import static com.codeborne.selenide.FileDownloadMode.FOLDER;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import java.util.Map;


public class TestBaseExtended {
    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1600x900"; //1366x768 1600x900
        Configuration.baseUrl = "https://pgu-uat-fed.test.gosuslugi.ru";
        Configuration.remote = "http://45.155.207.31:4444/wd/hub";
        Configuration.fileDownload = FOLDER;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true,
                "videoScreenSize", "1600x900",
                "videoFrameRate", 6
                //"videoCodec", "mpeg4"
        ));
        Configuration.browserCapabilities = capabilities;

    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();

        closeWebDriver();
    }
}