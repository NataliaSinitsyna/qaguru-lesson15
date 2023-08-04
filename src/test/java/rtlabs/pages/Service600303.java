package rtlabs.pages;

import com.codeborne.selenide.SelenideElement;
import rtlabs.pages.components.results.ResultsService600303;

import static com.codeborne.selenide.Selenide.$;

public class Service600303 {

    // /600303/1/form
    ResultsService600303 resultsService600303 = new ResultsService600303();

    private SelenideElement
        requestInput = $(".cdk-textarea-autosize.multiline.ng-tns-c138-4.ng-valid.ng-touched.ng-dirty"),
        requestInput2 = $("aria-label=Введите запрос…");
}
