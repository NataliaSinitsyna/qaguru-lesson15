package rtlabs.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class LoginPage {
 //"natalya.sinitsyna@rtlabs.ru"
 //"QY~rW56;fv"
    private SelenideElement
        nalogNotification = $("button.cross.ng-star-inserted"),
        buttonGatewayLogin = $("[aria-label=Войти]"),
        loginInput = $("#login"),
        passwordInput = $("#password"),
        buttonLogin = $(".plain-button.plain-button_wide");

    public LoginPage openPage() {
        open("/");
        sleep(500);
        nalogNotification.click();
        buttonGatewayLogin.click();

        return this;
    }

/*    public LoginPage removeBanners() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }*/

    public LoginPage setLogin(String login) {
        loginInput.setValue(login);

        return this;
    }

    public LoginPage setPassword(String password) {
        passwordInput.setValue(password);

        return this;
    }

    public LoginPage login() {
        buttonLogin.click();

        return this;
    }
}
