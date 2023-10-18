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

    TestData testData = new TestData();
    private UploadFileComponent uploadFileComponent = new UploadFileComponent();
    private ResultsService600103 resultsService600103 = new ResultsService600103();

    private SelenideElement
            windowDraft = $(byText("У вас есть черновик заявления")),
            draft = $(byText("Начать заново")),
            catalogReferences = $("[aria-label='Справки Выписки']"),
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
            buttonEnd = $(byText("Отправить заявление"));


    public Service600103 selectTypeReference() {
        catalogReferences.click();
        service.click();

        return this;
    }

    public Service600103 service600103() {
        sleep(5000);
        if (windowDraft.exists()) {
            sleep(500);
            draft.click();
        }
        sleep(500);
        buttonStart.click();
        sleep(500);
        typeReference.click();
        sleep(500);
        referenceForMe.click();
        sleep(500);
        formReference.click();
        sleep(500);
        resultsService600103.verifyData();
        sleep(500);
        buttonTrue.click();
        sleep(500);
        buttonTrue.click();
        sleep(500);
        resultsService600103.verifyPhone();
        sleep(500);
        buttonTrue.click();
        sleep(500);
        resultsService600103.verifyEmail();
        sleep(500);
        buttonTrue.click();
        sleep(500);
        resultsService600103.verifyAddress();
        sleep(500);
        buttonTrue.click();
        sleep(500);
        confirmAddress.click();
        sleep(500);
        changeFio.click();
        sleep(1000);
        livesAnotherRegions.click();
        sleep(500);
        chooseFormatDownloadDocuments.click();
        sleep(500);
        uploadFileComponent.addFile(testData.documentFile);
        sleep(5000);
        cont.click();
        sleep(1000);
        buttonEnd.click();

        return this;
    }

    public Service600103 resultsService() {
        sleep(1000);
        resultsService600103.verifyReference();
        sleep(10000);

        return this;
    }
}
