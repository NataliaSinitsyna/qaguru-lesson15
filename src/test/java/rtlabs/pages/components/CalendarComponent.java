package rtlabs.pages.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CalendarComponent {
    public void setDate(int day, int month, int year) {
        $$("div.field-arrow").get(0).click();
        $$("div.item.ng-star-inserted").get(month+1).click();
        $$("div.field-arrow").get(2).click();
        $$("div.item.ng-star-inserted").get(year-1912).click();
        $$("div.calendar-day-content.ng-tns-c89-1").get(day+1).click();

    }
}
