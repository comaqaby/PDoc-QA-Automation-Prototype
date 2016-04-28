package pages;

import base.PageBase;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static helpers.Locators.get;

public class HomePage extends PageBase {

    private static final String TITLE = "Sign Documents Online - Build, Deliver & Track Sales Collateral";
    private static final String USERNAME = "";
    private static final String PASSWORD = "";

    private static final By LOGIN_BUTTON = get("HomePage.LoginButton");

    public static void clickLoginButton() {
        $(LOGIN_BUTTON).click();
    }

    public static void login() {
        login(USERNAME, PASSWORD);
    }

    public static void login(String username, String password) {
        clickLoginButton();
        LoginPage.titleShouldAppear();
        LoginPage.login(username, password);
    }

    public static void titleShouldAppear() {
        titleShouldAppear(TITLE);
    }
}
