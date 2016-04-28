package base;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    private static final String URL = "https://www.pandadoc.com/";

    @BeforeTest(alwaysRun = true)
    protected void beforeTestRunSetup() {
        Configuration.baseUrl = URL;
        Configuration.timeout = 10000;
    }

    @BeforeMethod(alwaysRun = true)
    protected void setup() {
        open(Configuration.baseUrl);
        HomePage.titleShouldAppear();
    }

    @AfterMethod(alwaysRun = true)
    protected void tearDown() {
        close();
    }
}
