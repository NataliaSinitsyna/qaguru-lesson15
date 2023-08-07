package rtlabs.pages;

import com.codeborne.selenide.SelenideElement;
import rtlabs.pages.components.results.ResultsService600303;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.sleep;

public class Service600303 {

    ResultsService600303 resultsService600303 = new ResultsService600303();
    private SelenideElement
            windowDraft = $(byText("У вас есть черновик заявления")),
            draft = $(byText("Начать заново")),
            catalogReferences = $$("div.catalog-link-item.ng-star-inserted").get(1),
            service = $(byText("Извещение о состоянии лицевого счета в СФР")),
            button = $(byText("Получить выписку"));

    public Service600303 selectTypeReference() {
        catalogReferences.click();
        service.click();

        return this;
    }

    public Service600303 service600303() {
        sleep(5000);
        if (windowDraft.exists()) {
            sleep(500);
            draft.click();
        }
        sleep(500);
        button.click();

        return this;
    }

    public Service600303 resultsService() {
        sleep(30000);
        resultsService600303.verifyReference();

        return this;
    }

    public Service600303 resultsData() throws Exception {
        sleep(1000);
        resultsService600303.verifyData();

        return this;
    }
}
