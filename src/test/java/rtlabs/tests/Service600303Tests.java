package rtlabs.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import rtlabs.pages.*;

import static io.qameta.allure.Allure.step;

public class Service600303Tests extends TestBaseExtended {

    LoginPage loginPage = new LoginPage();
    Service600303 service600303 = new Service600303();

    @Test
    @Tag("remote_test")
    @DisplayName("Успешное прохождение услуги по получению выписки из СФР")
    void successGivenElectronicReference() {
        step("Авторизоваться", () -> {
            loginPage.login()
                     .closeWindowGoscan();
        });
        step("Пройти услугу по получению выписки из СФР", () -> {
            service600303.selectTypeReference()
                         .service600303();
        });
        step("Проверить оказание услуги", () -> {
            service600303.resultsService();
        });
        step("Проверить сформированное заявление", () -> {
            service600303.resultsData();
        });
    }
}
