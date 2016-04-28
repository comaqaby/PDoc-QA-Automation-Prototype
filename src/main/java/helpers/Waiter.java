package helpers;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiter {

    public static WebDriverWait getWaiter() {
        return new WebDriverWait(WebDriverRunner.getWebDriver(), 60000);
    }
}
