package rtlabs.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import rtlabs.pages.*;

import static io.qameta.allure.Allure.step;

public class Service600103Tests extends TestBaseExtended {

    LoginPage loginPage = new LoginPage();
    Service600103 service600103 = new Service600103();

    @Test
    @Tag("remote_test")
    @Tag("owner")
    @DisplayName("Успешное прохождение услуги по получению справки об отсутствии судимости")
    void successGivenElectronicReference() {
        step("Авторизоваться", () -> {
            loginPage.login()
                     .closeWindowGoscan();
        });
        step("Пройти услугу по получению справки об отсутствии судимости", () -> {
            service600103.selectTypeReference()
                         .service600103();
        });
        step("Проверить направление заявления в ведомство", () -> {
            service600103.resultsService();
        });

    }

}