package Day_28;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class GetPostsByTagTest extends BaseTest {

    @Test
    public void getPostsByTag() {

        ExtentTest test =
                extent.createTest("Get Posts By Tag API Test");

        given()

        .when()
            .get("https://dummyjson.com/posts/tag/history")

        .then()
            .statusCode(200)
            .body("posts", notNullValue());

        test.pass("Get Posts By Tag API executed successfully");
    }
}