package base;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DialogBase {

    protected static void windowShouldAppear(By window) {
        $(window).waitUntil(Condition.appears, 15000);
    }

    protected static void windowShouldDisappear(By window) {
        $(window).waitUntil(Condition.disappears, 15000);
    }
}
