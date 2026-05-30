package Day_28;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class LimitSkipUsersTest extends BaseTest {

    @Test
    public void limitAndSkipUsers() {

        ExtentTest test = extent.createTest("Limit and Skip Users API Test");

        given()
            .queryParam("limit", 5)
            .queryParam("skip", 10)
            .queryParam("select", "firstName,age")
        .when()
            .get("https://dummyjson.com/users")
        .then()
            .statusCode(200)
            .body("users", notNullValue())
            .body("users.size()", equalTo(5))
            .body("limit", equalTo(5))
            .body("skip", equalTo(10));

        test.pass("Limit and Skip Users API executed successfully");
    }
}