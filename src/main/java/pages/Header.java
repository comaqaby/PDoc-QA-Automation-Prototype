package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static helpers.Locators.get;

public class Header {

    private static final By AVATAR_LINK = get("Header.AvatarLink");
    private static final By USER_INFORMATION_CONTAINER = get("Header.UserInformationContainer");
    private static final By LOGOUT_LINK = get("Header.LogoutLink");

    public static void clickOnAvatar() {
        $(AVATAR_LINK).click();
        $(USER_INFORMATION_CONTAINER).should(Condition.appear);
    }

    public static void logout() {
        $(LOGOUT_LINK).click();
    }
}
