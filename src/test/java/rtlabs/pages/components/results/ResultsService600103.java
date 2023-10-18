package rtlabs.pages.components.results;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import rtlabs.tests.TestData;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

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
            checkHeaderReference = $$("h4.feed-title.text-plain.truncate").first(),
            statusReference = $$("a.feed-item.text-plain.feed-ORDER.feed-orders.is-updated.feed-header-unread")
                    .first();


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
        sleep(3000);
        lk.click();
        sleep(5000);
        checkHeaderReference.shouldBe(Condition.text("Справка об отсутствии судимости"));
        statusReference.shouldBe(Condition.text("Заявление отправлено в ведомство"));

        return this;
    }

}
