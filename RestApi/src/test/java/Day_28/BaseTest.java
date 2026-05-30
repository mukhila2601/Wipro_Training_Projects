package Day_28;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;

import utilities.ExtentReportManager;

public class BaseTest {

    public static ExtentReports extent;

    @BeforeSuite
    public void setupReport() {
        extent = ExtentReportManager.getReportInstance();
    }

    @AfterSuite
    public void tearDownReport() {
        extent.flush();
    }
}