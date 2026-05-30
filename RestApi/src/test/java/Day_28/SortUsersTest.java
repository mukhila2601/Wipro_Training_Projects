package Day_28;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class SortUsersTest extends BaseTest {

    @Test
    public void sortUsers() {

        ExtentTest test =
                extent.createTest("Sort Users API Test");

        given()
            .queryParam("sortBy", "firstName")
            .queryParam("order", "asc")

        .when()
            .get("https://dummyjson.com/users")

        .then()
            .statusCode(200)
            .body("users", notNullValue())
            .body("users.size()", notNullValue())
            .body("users[0].firstName", notNullValue());

        test.pass("Sort Users API executed successfully");
    }
}