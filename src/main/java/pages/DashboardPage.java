package pages;

import base.PageBase;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static helpers.Locators.get;

public class DashboardPage extends PageBase {

    private static final String TITLE = "Dashboard / PandaDoc";

    private static final By AVATAR_LINK = get("DashBoardPage.AvatarLink");

    public static boolean avatarIsVisible() {
        return $(AVATAR_LINK).isDisplayed();
    }

    public static void titleShouldAppear() {
        titleShouldAppear(TITLE);
    }
}
