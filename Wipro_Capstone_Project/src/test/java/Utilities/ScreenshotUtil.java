package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

    public static String captureScreenshot(WebDriver driver,
                                           String testName) {

        String timestamp =
                new SimpleDateFormat("yyyyMMdd_HHmmss")
                        .format(new Date());

        String screenshotPath =
                System.getProperty("user.dir")
                + "/screenshots/"
                + testName + "_"
                + timestamp + ".png";

        try {

            File sourceFile =
                    ((TakesScreenshot) driver)
                            .getScreenshotAs(OutputType.FILE);

            File directory =
                    new File(
                            System.getProperty("user.dir")
                            + "/screenshots");

            if (!directory.exists()) {

                directory.mkdirs();
            }

            File destinationFile =
                    new File(screenshotPath);

            FileUtils.copyFile(
                    sourceFile,
                    destinationFile);

            System.out.println(
                    "Screenshot saved: "
                    + screenshotPath);

        } catch (IOException e) {

            e.printStackTrace();
        }

        return screenshotPath;
    }
}