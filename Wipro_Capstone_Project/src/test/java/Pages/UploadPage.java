package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.WaitUtils;

public class UploadPage {

    private WebDriver driver;

    public UploadPage(WebDriver driver) {

        this.driver = driver;
    }

    // ==========================
    // LOCATORS
    // ==========================

    // Single File Upload

    private By singleFileUpload =
            By.id("singleFileInput");

    private By uploadSingleButton =
            By.xpath("//button[text()='Upload Single File']");

    private By singleUploadMessage =
            By.id("singleFileStatus");

    // Multiple File Upload

    private By multipleFileUpload =
            By.id("multipleFilesInput");

    private By uploadMultipleButton =
            By.xpath("//button[text()='Upload Multiple Files']");

    private By multipleUploadMessage =
            By.id("multipleFilesStatus");

    // ==========================
    // SINGLE FILE UPLOAD
    // ==========================

    public void uploadSingleFile(String filePath) {

        WaitUtils.waitForVisibility(
                driver,
                singleFileUpload)
                .sendKeys(filePath);
    }

    public void clickUploadSingleFile() {

        WaitUtils.waitForClickable(
                driver,
                uploadSingleButton)
                .click();
    }

    public String getSingleUploadMessage() {

        return driver.findElement(
                singleUploadMessage)
                .getText();
    }

    // ==========================
    // MULTIPLE FILE UPLOAD
    // ==========================

    public void uploadMultipleFiles(
            String file1,
            String file2) {

        String files =
                file1 + "\n" + file2;

        WaitUtils.waitForVisibility(
                driver,
                multipleFileUpload)
                .sendKeys(files);
    }

    public void clickUploadMultipleFiles() {

        WaitUtils.waitForClickable(
                driver,
                uploadMultipleButton)
                .click();
    }

    public String getMultipleUploadMessage() {

        return driver.findElement(
                multipleUploadMessage)
                .getText();
    }

    // ==========================
    // VALIDATIONS
    // ==========================

    public boolean verifySingleUploadSuccess(
            String expectedText) {

        return getSingleUploadMessage()
                .contains(expectedText);
    }

    public boolean verifyMultipleUploadSuccess(
            String expectedText) {

        return getMultipleUploadMessage()
                .contains(expectedText);
    }
}