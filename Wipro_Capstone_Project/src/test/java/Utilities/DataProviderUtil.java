package Utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtil {

    @DataProvider(name = "formData")
    public Object[][] getFormData() {

        return new Object[][] {

            {
                "Shaurya",
                "shaurya@gmail.com",
                "9876543210",
                "Kolkata"
            },

            {
                "Rahul",
                "rahul@gmail.com",
                "9876543211",
                "Delhi"
            },

            {
                "Priya",
                "priya@gmail.com",
                "9876543212",
                "Mumbai"
            }
        };
    }
}