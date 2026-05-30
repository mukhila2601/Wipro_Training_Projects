package Day_28;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class FilterUserTest extends BaseTest {

    @Test
    public void filterUser() {

        ExtentTest test = extent.createTest("Filter User API Test");

        given()
            .queryParam("key", "hair.color")
            .queryParam("value", "Brown")
        .when()
            .get("https://dummyjson.com/users/filter")
        .then()
            .statusCode(200)
            .body("users", notNullValue());

        test.pass("Filter User API executed successfully");
    }
}