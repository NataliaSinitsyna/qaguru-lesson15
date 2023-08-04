package rtlabs.tests;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestData {

    //Faker faker = new Faker(new Locale("ru"));

    public String fullName = "Синицына Наталья Александровна";
    public String birthday = "21.03.1995";
    public String serialAndNumberPassport = "5011 151515";
    public String dateExtraditionPassport = "17.11.2016";
    public String placeExtraditionPassport = "МВД г. Москва";
    public String userPhone = "+7 915 260-89-06";
    public String userEmail = "natalya.sinitsyna@rtlabs.ru";
    public String address = "143986, обл. Московская, г. Балашиха, мкр. Железнодорожный, ул. Пионерская, д. 6, кв. 6";
    public String documentFile = "Linux_komandy.pdf";


   /* String lastName = faker.name().lastName();
    String userEmail = faker.internet().emailAddress();
    String address = faker.address().streetAddress();
    String userPhone = faker.phoneNumber().subscriberNumber(10);
    String userPhoto = "20.jpg";

    Date date = faker.date().birthday(18, 65);
    SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy", Locale.ENGLISH);
    String[] randomDate = formatter.format(date).split(" ");

    String[] gender = {"Male", "Female", "Other"};
    String userGender = faker.options().option(gender);
*/
}
