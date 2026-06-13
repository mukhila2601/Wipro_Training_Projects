package Tests;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.UploadPage;

public class UploadTest extends BaseTest {

    @Test(priority = 1)
    public void verifySingleFileUpload() {

        UploadPage uploadPage = new UploadPage(driver);

        String filePath =
                System.getProperty("user.dir")
                + "/src/test/resources/sample.txt";

        File file = new File(filePath);

        System.out.println("Single File Path: " + filePath);
        System.out.println("File Exists: " + file.exists());

        Assert.assertTrue(
                file.exists(),
                "sample.txt file not found");

        uploadPage.uploadSingleFile(filePath);

        uploadPage.clickUploadSingleFile();

        String actualMessage =
                uploadPage.getSingleUploadMessage();

        System.out.println(
                "Single Upload Message: "
                        + actualMessage);

        Assert.assertFalse(
                actualMessage.isEmpty(),
                "Single upload message is empty");
    }

    @Test(priority = 2)
    public void verifyMultipleFileUpload() {

        UploadPage uploadPage = new UploadPage(driver);

        String file1 =
                System.getProperty("user.dir")
                + "/src/test/resources/sample1.txt";

        String file2 =
                System.getProperty("user.dir")
                + "/src/test/resources/sample2.txt";

        File firstFile = new File(file1);
        File secondFile = new File(file2);

        System.out.println("File 1 Path: " + file1);
        System.out.println("File 2 Path: " + file2);

        System.out.println("File 1 Exists: "
                + firstFile.exists());

        System.out.println("File 2 Exists: "
                + secondFile.exists());

        Assert.assertTrue(
                firstFile.exists(),
                "sample1.txt file not found");

        Assert.assertTrue(
                secondFile.exists(),
                "sample2.txt file not found");

        uploadPage.uploadMultipleFiles(
                file1,
                file2);

        uploadPage.clickUploadMultipleFiles();

        String actualMessage =
                uploadPage.getMultipleUploadMessage();

        System.out.println(
                "Multiple Upload Message: "
                        + actualMessage);

        Assert.assertFalse(
                actualMessage.isEmpty(),
                "Multiple upload message is empty");
    }
}