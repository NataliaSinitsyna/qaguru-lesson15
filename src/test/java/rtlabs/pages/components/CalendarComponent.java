package rtlabs.pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setDate(String day, String month, String year) {
        $(".react-datepicker__month-select").selectOption(month); //month-field field
        $(".react-datepicker__year-select").selectOption(year); //year-field field
        $(".react-datepicker__day--0" + day +
                ":not(.react-datepicker__day--outside-month)").click();

        $("").setValue()
    }
}
