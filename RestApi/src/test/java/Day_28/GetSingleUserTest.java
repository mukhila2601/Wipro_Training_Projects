package Day_28;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class GetSingleUserTest extends BaseTest {

    @Test
    public void getSingleUser() {

        ExtentTest test =
                extent.createTest("Get Single User API Test");

        given()

        .when()
            .get("https://dummyjson.com/users/1")

        .then()
            .statusCode(200)
            .body("id", equalTo(1))
            .body("firstName", notNullValue());

        test.pass("Get Single User API executed successfully");
    }
}