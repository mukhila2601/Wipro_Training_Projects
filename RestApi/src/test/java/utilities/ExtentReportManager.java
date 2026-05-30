//package utilities;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//
//public class ExtentReportManager {
//
//    public static ExtentReports getReportInstance() {
//
//        ExtentSparkReporter spark =
//                new ExtentSparkReporter("test-output/ExtentReport.html");
//
//        spark.config().setReportName("REST API Automation Report");
//        spark.config().setDocumentTitle("API Test Report");
//
//        ExtentReports extent = new ExtentReports();
//        extent.attachReporter(spark);
//
//        return extent;
//    }
//}

package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

    private static ExtentReports extent;

    public static ExtentReports getReportInstance() {

        if (extent == null) {

            ExtentSparkReporter spark =
                    new ExtentSparkReporter("test-output/ExtentReport.html");

            spark.config().setReportName("REST API Automation Report");
            spark.config().setDocumentTitle("API Test Report");

            extent = new ExtentReports();
            extent.attachReporter(spark);
        }

        return extent;
    }
}