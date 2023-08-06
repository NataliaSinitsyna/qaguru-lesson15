package rtlabs.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import rtlabs.pages.components.CalendarComponent;
import rtlabs.pages.components.UploadFileComponent;
import rtlabs.pages.components.results.ResultsService600103;
import rtlabs.tests.TestData;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Service600103 {

//    /600103/1/form
    TestData testData = new TestData();
    private UploadFileComponent uploadFileComponent = new UploadFileComponent();
    private ResultsService600103 resultsService600103 = new ResultsService600103();

    private SelenideElement
            //catalogReferences = $("[aria-label='Справки Выписки']"), //ошибка
            windowDraft = $(byText("У вас есть черновик заявления")),
            draft = $(byText("Начать заново")),
            catalogReferences = $$(".catalog-link-item.ng-star-inserted").get(23),
    //$$("div.flex-container-lg.catalog-link-item-wrap.ng-star-inserted").last().sibling(1),
                    //$$("div.catalog-link-item.ng-star-inserted").get(23),
            service = $(byText("Справка об отсутствии судимости")),
            buttonStart = $(byText("Начать")),
            typeReference = $(byText("Электронная справка")),
            referenceForMe = $(byText("На меня")),
            formReference = $(byText("Перейти к заявлению")),
            buttonTrue = $(byText("Верно")),
            confirmAddress = $(byText("Да")),
            changeFio = $(byText("Нет")),
            livesAnotherRegions = $(byText("Нет")),
            chooseFormatDownloadDocuments = $$(".button-container.small-paddings").first(),
            cont = $(byText("Далее")),
            buttonEnd = $(".button-container");


/*    public Service600103 removeBanners() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }*/

    public Service600103 selectTypeReference() {
        catalogReferences.click();
        service.click();

        return this;
    }

    public Service600103 service() {
        sleep(500);
        if (windowDraft.exists()) {
            draft.click();
        }
        sleep(500);
        buttonStart.click();
        sleep(200);
        typeReference.click();
        sleep(200);
        referenceForMe.click();
        sleep(200);
        formReference.click();
        sleep(200);
        resultsService600103.verifyData();
        sleep(200);
        buttonTrue.click();
        sleep(200);
        buttonTrue.click();
        sleep(200);
        resultsService600103.verifyPhone();
        sleep(200);
        buttonTrue.click();
        sleep(200);
        resultsService600103.verifyEmail();
        sleep(200);
        buttonTrue.click();
        sleep(200);
        resultsService600103.verifyAddress();
        sleep(200);
        buttonTrue.click();
        sleep(200);
        confirmAddress.click();
        sleep(200);
        changeFio.click();
        sleep(200);
        livesAnotherRegions.click();
        sleep(200);
        chooseFormatDownloadDocuments.click();
        sleep(200);
        uploadFileComponent.addFile(testData.documentFile);
        sleep(200);
        cont.click();
        sleep(200);
        buttonEnd.click();

        return this;
    }
}
