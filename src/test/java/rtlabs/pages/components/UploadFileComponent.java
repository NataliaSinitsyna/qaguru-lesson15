package rtlabs.pages.components;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class UploadFileComponent {
    public void addFile(String value) {
        File file = new File("src/test/resources/" + value);
        $$("[type=file]").last().uploadFile(file);
    }
}
