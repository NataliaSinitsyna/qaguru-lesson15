package rtlabs.pages.components.results;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import rtlabs.tests.TestData;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ResultsService600103 {

    TestData testData = new TestData();
    private SelenideElement
            header = $$(".head").last(),
            fullName = $$(".data-group__title.mb-12").first(),
            birthday = $$(".data-item__value").first(),
            serialAndNumberPassport = $$(".data-item__value").get(1),
            dateExtraditionPassport = $$(".data-item__value").get(2),
            placeExtraditionPassport = $$(".data-item__value").last(),
            data = $(".value-text"),
            lk = $(".button-container"),
            checkHeaderReference = $$(".feed-title.text-plain.truncate").first(),
            statusReference = $$(".truncate").last();


    public ResultsService600103 verifyData() {
        header.shouldBe(Condition.text("Проверьте корректность ваших данных"));
        fullName.shouldBe(Condition.text(testData.fullName));
        birthday.shouldBe(Condition.text(testData.birthday));
        serialAndNumberPassport.shouldBe(Condition.text(testData.serialAndNumberPassport));
        dateExtraditionPassport.shouldBe(Condition.text(testData.dateExtraditionPassport));
        placeExtraditionPassport.shouldBe(Condition.text(testData.placeExtraditionPassport));

        return this;
    }

    public ResultsService600103 verifyPhone() {
        data.shouldBe(Condition.text(testData.userPhone));

        return this;
    }

    public ResultsService600103 verifyEmail() {
        data.shouldBe(Condition.text(testData.userEmail));

        return this;
    }

    public ResultsService600103 verifyAddress() {
        data.shouldBe(Condition.text(testData.address));

        return this;
    }

    public ResultsService600103 verifyReference() {
        lk.click();
        checkHeaderReference.shouldBe(Condition.text("Справка об отсутствии судимости"));
        statusReference.shouldBe(Condition.text("Заявление отправлено в ведомство"));

        return this;
    }

}
