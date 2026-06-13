package Utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {

        if (extent == null) {

            String timestamp =
                    new SimpleDateFormat("yyyyMMdd_HHmmss")
                            .format(new Date());

            File reportFolder =
                    new File(System.getProperty("user.dir")
                            + "/reports");

            if (!reportFolder.exists()) {
                reportFolder.mkdirs();
            }

            String reportPath =
                    reportFolder.getAbsolutePath()
                    + "/ExtentReport_"
                    + timestamp
                    + ".html";

            ExtentSparkReporter sparkReporter =
                    new ExtentSparkReporter(reportPath);

            sparkReporter.config()
                    .setDocumentTitle(
                            "Automation Execution Report");

            sparkReporter.config()
                    .setReportName(
                            "Test Automation Hybrid Framework Report");

            extent = new ExtentReports();

            extent.attachReporter(sparkReporter);

            extent.setSystemInfo(
                    "Project",
                    "TestAutomationHybridFramework");

            extent.setSystemInfo(
                    "Tester",
                    "Shaurya Chattopadhyay");

            extent.setSystemInfo(
                    "Environment",
                    "QA");

            String browser =
                    ConfigReader.getProperty("browser");

            extent.setSystemInfo(
                    "Browser",
                    browser != null ? browser : "Not Specified");

            extent.setSystemInfo(
                    "OS",
                    System.getProperty("os.name"));

            extent.setSystemInfo(
                    "Java Version",
                    System.getProperty("java.version"));
        }

        return extent;
    }
}