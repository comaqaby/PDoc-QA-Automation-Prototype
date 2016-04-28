package base;

import com.codeborne.selenide.Condition;
import helpers.Waiter;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.codeborne.selenide.Selenide.$;

public class PageBase {

    protected static void titleShouldAppear(String title) {
        Waiter.getWaiter().until(ExpectedConditions.titleIs(title));
    }

    protected static void checkExpectedElements(By... locators) {
        for (By locator : locators) {
            $(locator).shouldBe(Condition.visible);
        }
    }
}
