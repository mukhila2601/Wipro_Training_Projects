package SeleniumDDTDay25;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleUserLogin {

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) {

        System.out.println("Username is: " + username);
        System.out.println("Password is: " + password);

        System.out.println("Login functionality tested");
        System.out.println("----------------------------");
    }

    @DataProvider(name = "loginData")
    public Object[][] getData() {

        Object[][] data = {
                {"admin", "admin123"},
                {"user", "user123"},
                {"test", "test123"}
        };

        return data;
    }
}