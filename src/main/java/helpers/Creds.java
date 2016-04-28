package helpers;

import java.io.InputStream;
import java.util.Properties;

public class Creds {

    private static final Properties creds;

    public static String username;
    public static String password;

    static {
        creds = new Properties();
        InputStream is = Locators.class.getResourceAsStream("/creds.properties");
        try {
            creds.load(is);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        username = creds.getProperty("username");
        password = creds.getProperty("password");
    }
}
