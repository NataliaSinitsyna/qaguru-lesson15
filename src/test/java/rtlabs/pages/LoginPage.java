package rtlabs.pages;

import com.codeborne.selenide.SelenideElement;
import rtlabs.tests.TestData;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class LoginPage {

    TestData testData = new TestData();
    private SelenideElement
        nalogNotification = $("button.cross.ng-star-inserted"),
        buttonGatewayLogin = $(byText("Войти")),
        loginInput = $("#login"),
        passwordInput = $("#password"),
        buttonLogin = $(".plain-button.plain-button_wide"),
        windowGoscan = $("div.popup.flex-container.ng-star-inserted"),
        buttonCloseGoscan = $("button.cross.ng-star-inserted");

    public LoginPage login() {
        open("/");
        sleep(5000);
        if (nalogNotification.exists()) {
            nalogNotification.click();
        }
        if (buttonGatewayLogin.exists()) {
            buttonGatewayLogin.click();
            sleep(3000);
            loginInput.setValue(testData.login);
            passwordInput.setValue(testData.password);
            buttonLogin.click();
            sleep(5000);
        }

        return this;
    }

    public LoginPage closeWindowGoscan() {
        if (windowGoscan.exists()) {
            buttonCloseGoscan.click();
        }

        return this;
    }
}
