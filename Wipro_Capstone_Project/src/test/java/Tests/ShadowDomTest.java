package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.ShadowDomPage;

public class ShadowDomTest extends BaseTest {

    @Test
    public void verifyShadowDomElements() {

        ShadowDomPage page =
                new ShadowDomPage(driver);

        System.out.println(
                "Mobiles Text : "
                        + page.getMobilesText());

        Assert.assertEquals(
                page.getMobilesText(),
                "Mobiles");

        // Enter text
        page.enterText("Shadow DOM Test");

        // Verify Blog Link
        Assert.assertTrue(
                page.isBlogDisplayed());

        // Verify Checkbox
        Assert.assertTrue(
                page.isCheckboxDisplayed());

        page.selectCheckbox();

        // Verify File Upload
        Assert.assertTrue(
                page.isFileUploadDisplayed());

        page.uploadFile(
                System.getProperty("user.dir")
                        + "/src/test/resources/sample.txt");

        // Verify YouTube Link
        Assert.assertTrue(
                page.isYoutubeDisplayed());

        System.out.println(
                "Youtube Link Found");

        System.out.println(
                "Shadow DOM Test Passed");
    }
}