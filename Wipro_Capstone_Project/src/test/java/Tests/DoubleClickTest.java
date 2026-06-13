package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.DoubleClickPage;

public class DoubleClickTest extends BaseTest {

    @Test
    public void testDoubleClickCopyText() {

        DoubleClickPage mousePage =
                new DoubleClickPage(driver);

        String originalText =
                mousePage.getField1Text();

        mousePage.doubleClickCopyButton();

        Assert.assertTrue(
                mousePage.verifyCopiedText(),
                "Text was not copied correctly!"
        );

        System.out.println("Original Text : " + originalText);
        System.out.println("Copied Text   : "
                + mousePage.getField2Text());

        System.out.println("Double Click Test Passed");
    }
}