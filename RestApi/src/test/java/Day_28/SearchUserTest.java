package Day_28;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class SearchUserTest extends BaseTest {

    @Test
    public void searchUser() {

        ExtentTest test =
                extent.createTest("Search User API Test");

        given()

        .when()
            .get("https://dummyjson.com/users/search?q=John")

        .then()
            .statusCode(200)
            .body("users.size()", notNullValue());

        test.pass("Search User API executed successfully");
    }
}