import base.TestBase;
import helpers.Creds;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.Header;
import pages.HomePage;
import pages.LoginPage;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;

public class SignInTest extends TestBase {

    @Test(groups = {"smoke"})
    @Features("Sign in")
    @Stories("Verify ability to make a simple login to PandaDoc application")
    @TestCaseId("1.1")
    public void simpleSignInTest() {
        HomePage.clickLoginButton();
        LoginPage.titleShouldAppear();
        LoginPage.login(Creds.username, Creds.password);
        DashboardPage.titleShouldAppear();

        boolean dashboardPageAppeared = DashboardPage.avatarIsVisible();
        Assert.assertTrue(dashboardPageAppeared, "Dashboard page didn't appear after login");
    }

    @Test(groups = {"smoke"})
    @Features("Sign in")
    @Stories("Verify ability to logout from PandaDoc application")
    @TestCaseId("1.5")
    public void signOutTest() {
        HomePage.login();
        DashboardPage.titleShouldAppear();
        Header.clickOnAvatar();
        Header.logout();
        LoginPage.titleShouldAppear();

        boolean loginPageAppeared = LoginPage.loginButtonIsVisible();
        Assert.assertTrue(loginPageAppeared, "Login page didn't appear after logout");
    }
}
