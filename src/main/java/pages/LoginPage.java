package pages;

import base.PageBase;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static helpers.Locators.get;

public class LoginPage extends PageBase {

    private static final String TITLE = "PandaDoc - fast and easy way to send and sign documents online.";

    private static final By USERNAME_INPUT = get("LoginPage.UsernameInput");
    private static final By PASSWORD_INPUT = get("LoginPage.PasswordInput");
    private static final By LOGIN_BUTTON = get("LoginPage.LoginButton");

    public static void login(String username, String password) {
        $(USERNAME_INPUT).val(username);
        $(PASSWORD_INPUT).val(password);
        $(LOGIN_BUTTON).click();
    }

    public static boolean loginButtonIsVisible() {
        return $(LOGIN_BUTTON).isDisplayed();
    }

    public static void checkExpectedElements() {
        checkExpectedElements(USERNAME_INPUT, PASSWORD_INPUT, LOGIN_BUTTON);
    }

    public static void titleShouldAppear() {
        titleShouldAppear(TITLE);
    }
}
