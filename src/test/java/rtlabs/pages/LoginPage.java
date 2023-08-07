package rtlabs.pages;

import com.codeborne.selenide.SelenideElement;
import rtlabs.tests.TestData;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class LoginPage {

    TestData testData = new TestData();
    private SelenideElement
        nalogNotification = $("button.cross.ng-star-inserted"),
        buttonGatewayLogin = $("[aria-label=Войти]"),
        loginInput = $("#login"),
        passwordInput = $("#password"),
        buttonLogin = $(".plain-button.plain-button_wide");

    public LoginPage openPage() {
        open("/");
        sleep(5000);
        if (nalogNotification.exists()) {
            nalogNotification.click();
        }
        buttonGatewayLogin.click();

        return this;
    }

    public LoginPage setLogin() {
        loginInput.setValue(testData.login);

        return this;
    }

    public LoginPage setPassword() {
        passwordInput.setValue(testData.password);

        return this;
    }

    public LoginPage login() {
        buttonLogin.click();

        return this;
    }
}
