package rtlabs.pages;

import com.codeborne.selenide.SelenideElement;
import rtlabs.pages.components.CalendarComponent;
import rtlabs.pages.components.results.ResultsService600371;
import rtlabs.tests.TestData;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.sleep;

public class Service600371 {

    TestData testData = new TestData();
    private CalendarComponent calendarComponent = new CalendarComponent();
    private ResultsService600371 resultsService600371 = new ResultsService600371();

    private SelenideElement
            windowDraft = $(byText("У вас есть черновик заявления")),
            draft = $(byText("Начать заново")),
            catalogReferences = $$("div.catalog-link-item.ng-star-inserted").get(9),
            more = $("[tabindex=68]"),
            service = $(byText("Получение ИНН")),
            buttonStart = $(byText("Начать")),
            formReference = $(byText("Перейти к заявлению")),
            buttonTrue = $(byText("Верно")),
            signed = $(byText("Подписать")),
            mainPage = $("[href=https://pgu-uat-fed.test.gosuslugi.ru]");


    public Service600371 selectTypeReference() {
        catalogReferences.click();
        more.click();
        service.click();

        return this;
    }

    public Service600371 service600371() {
        sleep(5000);
        if (windowDraft.exists()) {
            sleep(500);
            draft.click();
        }
        sleep(500);
        buttonStart.click();
        sleep(500);
        formReference.click();
        sleep(500);
        resultsService600371.verifyData();
        sleep(500);
        buttonTrue.click();
        sleep(500);
        calendarComponent.setDate("10", "Апрель", "2020");
        buttonTrue.click();
        sleep(500);
        signed.click();
        sleep(500);
        mainPage.click();

        return this;
    }

    public Service600371 resultsService() {
        sleep(1000);
        resultsService600371.verifyReference();

        return this;
    }}
