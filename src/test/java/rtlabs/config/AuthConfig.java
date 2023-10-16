package rtlabs.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:src/test/resources/config/secret.properties"
        //"classpath:auth.properties"
})

public interface AuthConfig extends Config {

        @Key("username")
        String username();

        @Key("password")
        String password();

        @Key("phone")
        String phone();

    }
