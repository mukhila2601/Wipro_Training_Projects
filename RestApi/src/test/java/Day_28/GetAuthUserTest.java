package Day_28;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import io.restassured.response.Response;

public class GetAuthUserTest extends BaseTest {

    @Test
    public void getAuthUser() {

        ExtentTest test = extent.createTest("Get Auth User API Test");

        String loginBody = "{ \"username\": \"emilys\", \"password\": \"emilyspass\", \"expiresInMins\": 30 }";

        Response loginResponse =
                given()
                    .header("Content-Type", "application/json")
                    .body(loginBody)
                .when()
                    .post("https://dummyjson.com/user/login");

        String accessToken = loginResponse.jsonPath().getString("accessToken");

        given()
            .header("Authorization", "Bearer " + accessToken)
        .when()
            .get("https://dummyjson.com/user/me")
        .then()
            .statusCode(200)
            .body("id", notNullValue())
            .body("username", equalTo("emilys"));

        test.pass("Get Auth User API executed successfully");
    }
}