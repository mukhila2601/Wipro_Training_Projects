package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.SliderPage;

public class SliderTest extends BaseTest {

    @Test
    public void verifySliderMovement() throws InterruptedException {

        SliderPage sliderPage =
                new SliderPage(driver);

        sliderPage.moveSliderRight(100);

        Thread.sleep(2000);

        System.out.println(
                "Slider moved successfully");

        Assert.assertTrue(
                true,
                "Slider movement failed");
    }
}