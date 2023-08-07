package rtlabs.tests;

import org.junit.jupiter.api.Test;
import rtlabs.pages.*;

import static io.qameta.allure.Allure.step;

public class Service600103Tests extends TestBase { //change on TestBaseExtented

    LoginPage loginPage = new LoginPage();
    Service600103 service600103 = new Service600103();

    @Test
    void successGivenElectronicReference() {
        step("Авторизоваться", () -> {
            loginPage.openPage()
                     .setLogin()
                     .setPassword()
                     .login();
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