//package Day_28;
//
//import static io.restassured.RestAssured.given;
//import org.testng.annotations.Test;
//
//public class GetUsersTest {
//
//    @Test
//    public void getUsers() {
//
//        given()
//        .when()
//            .get("https://dummyjson.com/users")
//        .then()
//            .statusCode(200);
//    }
//}

package Day_28;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utilities.ExtentReportManager;

public class GetUsersTest {

    ExtentReports extent = ExtentReportManager.getReportInstance();

    @Test
    public void getUsers() {

        ExtentTest test = extent.createTest("Get Users API Test");

        given()
        .when()
            .get("https://dummyjson.com/users")
        .then()
            .statusCode(200);

        test.pass("Get Users API executed successfully");

        extent.flush();
    }
}