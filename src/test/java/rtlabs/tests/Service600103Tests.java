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
                    //.removeBanners()
                    .setLogin("")
                    .setPassword("")
                    .login();
        });
        step("Пройти услугу", () -> {
            service600103
                        //.removeBanners()
                         .selectTypeReference()
                         .service();
        });

    }

}
