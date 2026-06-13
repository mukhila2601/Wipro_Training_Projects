package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.DownloadFilesPage;

public class DownloadFilesTest extends BaseTest {

    @Test
    public void automateDownloadFiles() throws InterruptedException {

        driver.get(
        "https://testautomationpractice.blogspot.com/p/download-files_25.html");

        DownloadFilesPage page =
                new DownloadFilesPage(driver);

        page.enterText("Selenium Automation Testing");

        Thread.sleep(2000);

        page.generateTextFile();

        Thread.sleep(3000);

        page.generatePdfFile();

        Thread.sleep(3000);

        Assert.assertTrue(
                page.isPdfLinkDisplayed(),
                "PDF download link was not generated");

        System.out.println(
                "PDF Download Link Generated Successfully");

        page.clickPdfLink();

        Thread.sleep(5000);

        System.out.println(
                "Current URL : "
                + driver.getCurrentUrl());

        Assert.assertTrue(
                driver.getCurrentUrl().length() > 0);

        System.out.println(
                "Download Files Test Passed");
    }
}