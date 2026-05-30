package Day_28;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utilities.ExtentReportManager;

public class LoginUserTest {

    ExtentReports extent = ExtentReportManager.getReportInstance();

    @Test
    public void loginUser() {

        ExtentTest test = extent.createTest("Login User API Test");

        String body = "{\n" +
                "  \"username\": \"emilys\",\n" +
                "  \"password\": \"emilyspass\",\n" +
                "  \"expiresInMins\": 30\n" +
                "}";

        given()
            .header("Content-Type", "application/json")
            .body(body)
        .when()
            .post("https://dummyjson.com/user/login")
        .then()
            .statusCode(200)
            .body("accessToken", notNullValue())
            .body("username", equalTo("emilys"));

        test.pass("Login User API executed successfully");

        extent.flush();
    }
}