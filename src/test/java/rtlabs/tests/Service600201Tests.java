package rtlabs.tests;

import org.junit.jupiter.api.Test;
import rtlabs.pages.*;

import static io.qameta.allure.Allure.step;

public class Service600201Tests extends TestBase {
    LoginPage loginPage = new LoginPage();
    Service600201 service600201 = new Service600201();

/*
    @Test
    void successGivenElectronicReference() {
        step("Авторизоваться", () -> {
            loginPage.openPage()
                    .setLogin("natalya.sinitsyna@rtlabs.ru")
                    .setPassword("QY~rW56;fv")
                    .login();
        });
        step("Пройти услугу по получению справки об отсутствии судимости", () -> {
            service600201.selectTypeReference()
                    .service600201();
        });
        step("Проверить направление заявления в ведомство", () -> {
            service600201.resultsService();
        });

    }
*/

}
