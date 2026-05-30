package Day_28;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class GetPostTagsTest extends BaseTest {

    @Test
    public void getPostTags() {

        ExtentTest test =
                extent.createTest("Get All Post Tags API Test");

        given()

        .when()
            .get("https://dummyjson.com/posts/tags")

        .then()
            .statusCode(200)
            .body("$", notNullValue());

        test.pass("Get All Post Tags API executed successfully");
    }
}