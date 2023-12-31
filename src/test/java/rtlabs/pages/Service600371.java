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
            catalogReferences = $("[aria-label='Ведомства']"),
            FNS = $(byText("ФОМС")), //тут нужен скролл до ФНС
            service = $(byText("Получение ИНН")),
            buttonStart = $(byText("Начать")),
            formReference = $(byText("Перейти к заявлению")),
            buttonTrue = $(byText("Верно")),
            callCalender = $("input.text-input"),
            signed = $(byText("Подписать"));



    public Service600371 selectTypeReference() {
        catalogReferences.click();
        FNS.scrollIntoView(true);
        service.click();

        return this;
    }

    public Service600371 service600371() {
        sleep(5000);
        if (windowDraft.exists()) {
            sleep(500);
            draft.click();
        }
        sleep(1000);
        buttonStart.click();
        sleep(500);
        formReference.click();
        sleep(500);
        resultsService600371.verifyData();
        sleep(500);
        buttonTrue.click();
        sleep(1000);
        callCalender.click();
        sleep(1000);
        calendarComponent.setDate(10, 4, 2020);
        sleep(500);
        buttonTrue.click();
        sleep(500);
        signed.click();

        return this;
    }

    public Service600371 resultsService() {
        sleep(10000);
        resultsService600371.verifyReference();
        sleep(10000);

        return this;
    }}
