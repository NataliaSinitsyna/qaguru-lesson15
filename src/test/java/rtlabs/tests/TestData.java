package rtlabs.tests;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import rtlabs.config.AuthConfig;

@Tag("owner")
public class TestData {
    AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());
    public String login = config.username();
    public String password = config.password();
    public String fullName = "Синицына Наталья Александровна";
    public String birthday = "21.03.1995";
    public String serialAndNumberPassport = "5011 151515";
    public String dateExtraditionPassport = "17.11.2016";
    public String placeExtraditionPassport = "МВД г. Москва";
    public String code = "500500";
    public String placeBurn = "г. Москва";
    public String userPhone = config.phone();
    public String userEmail = config.username();
    public String address = "143986, обл. Московская, г. Балашиха, мкр. Железнодорожный, ул. Пионерская, д. 6, кв. 6";
    public String documentFile = "Linux_komandy.pdf";

}
