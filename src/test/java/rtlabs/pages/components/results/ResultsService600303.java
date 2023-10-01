package rtlabs.pages.components.results;

import com.codeborne.pdftest.PDF;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.DownloadOptions;
import com.codeborne.selenide.FileDownloadMode;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.files.FileFilters;

import java.io.File;

import static com.codeborne.pdftest.PDF.*;
import static com.codeborne.selenide.Configuration.timeout;
import static com.codeborne.selenide.files.FileFilters.withExtension;
import static org.hamcrest.MatcherAssert.assertThat;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ResultsService600303 {

    private SelenideElement
            lk = $("div.button-container.small-paddings"),
            qualityControl = $(byText("Оцените удобство портала Госуслуг")),
            closeQC = $("a.close"),
            checkHeaderReference = $$("h4.feed-title.text-plain.truncate").first(),
            checkStatusReference = $$("p.truncate").first(),
            reference = $$("div.flex-container-md.flex-container-lg.align-items-center-lg.feed-item-content")
                    .first();

    public ResultsService600303 verifyReference() {
        lk.click();
        sleep(4000);
        if (qualityControl.exists()) {
            closeQC.click();
        }
        checkHeaderReference.shouldBe(Condition.text("«Информирование зарегистрированных лиц о состоянии их " +
                "индивидуальных лицевых счетов в системе обязательного пенсионного страхования согласно Федеральным " +
                "законам «Об индивидуальном (персонифицированном) учете в системе обязательного пенсионного " +
                "страхования» и «Об инвестировании средств для финансирования накопительной пенсии " +
                "в Российской Федерации»»"));
        checkStatusReference.shouldBe(Condition.text("Услуга оказана"));

        return this;
    }

    public ResultsService600303 verifyData() throws Exception {
        reference.click();
        sleep(1000);
        File referenceFile = $(byText("Скачать")).download(DownloadOptions.using(FileDownloadMode.FOLDER)
                .withFilter(FileFilters.withExtension("pdf")));
        PDF content = new PDF(referenceFile);
        assertThat(content, containsText("Сведения о состоянии индивидуального лицевого счета застрахованного " +
                "лица"));

        return this;
    }
}
