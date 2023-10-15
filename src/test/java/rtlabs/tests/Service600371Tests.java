package rtlabs.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import rtlabs.pages.*;

import static io.qameta.allure.Allure.step;

public class Service600371Tests extends TestBaseExtended {

    LoginPage loginPage = new LoginPage();
    Service600371 service600371 = new Service600371();

    @Test
    @Tag("remote_test")
    @Tag("owner")
    @DisplayName("Успешное прохождение услуги по получению ИНН")
    void successGivenElectronicReference() {
        step("Авторизоваться", () -> {
            loginPage.login()
                     .closeWindowGoscan();
        });
        step("Пройти услугу по получению ИНН", () -> {
            service600371.selectTypeReference()
                         .service600371();
        });
        step("Проверить направление заявления в Госключ", () -> {
            service600371.resultsService();
        });

    }

}
