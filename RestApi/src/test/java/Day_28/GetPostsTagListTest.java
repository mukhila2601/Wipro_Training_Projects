package Day_28;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class GetPostsTagListTest extends BaseTest {

    @Test
    public void getPostsTagList() {

        ExtentTest test =
                extent.createTest("Get Posts Tag List API Test");

        given()

        .when()
            .get("https://dummyjson.com/posts/tag-list")

        .then()
            .statusCode(200)
            .body("$", notNullValue());

        test.pass("Get Posts Tag List API executed successfully");
    }
}