package rtlabs.pages.components.results;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.checkerframework.checker.units.qual.C;
import rtlabs.tests.TestData;

import static com.codeborne.selenide.Selenide.*;

public class ResultsService600371 {
    TestData testData = new TestData();
    private SelenideElement
            header = $$(".head").last(),
            fullName = $$(".data-group__title.mb-12").first(),
            birthday = $$(".data-item__value").first(),
            serialAndNumberPassport = $$(".data-item__value").get(1),
            dateExtraditionPassport = $$(".data-item__value").get(2),
            placeExtraditionPassport = $$(".data-item__value").get(3),
            code = $$(".data-item__value").get(4),
            placeBurn = $$(".data-item__value").get(5),
            orderPage = $("[href=orders]"),
            checkHeaderReference = $$("h4.feed-title.text-plain.truncate").first(),
            statusReference = $$("p.truncate").last();


    public ResultsService600371 verifyData() {
        header.shouldBe(Condition.text("Проверьте ваши данные"));
        fullName.shouldBe(Condition.text(testData.fullName));
        birthday.shouldBe(Condition.text(testData.birthday));
        serialAndNumberPassport.shouldBe(Condition.text(testData.serialAndNumberPassport));
        dateExtraditionPassport.shouldBe(Condition.text(testData.dateExtraditionPassport));
        placeExtraditionPassport.shouldBe(Condition.text(testData.placeExtraditionPassport));
        code.shouldBe(Condition.text(testData.code));
        placeBurn.shouldBe(Condition.text(testData.placeBurn));

        return this;
    }


    public ResultsService600371 verifyReference() {
        orderPage.click();
        sleep(2000);
        checkHeaderReference.shouldBe(Condition.text("Получение ИНН"));
        statusReference.shouldBe(Condition.text("Ожидает подписание в Госключе"));

        return this;
    }

}
