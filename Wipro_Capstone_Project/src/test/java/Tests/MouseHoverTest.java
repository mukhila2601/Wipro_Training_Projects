package Tests;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.MouseHoverPage;

public class MouseHoverTest extends BaseTest {

    @Test
    public void verifyMouseHover1() {

        MouseHoverPage page =
                new MouseHoverPage(driver);

        page.hoverOnPointMe();

        page.clickMobiles();

        System.out.println(
                "Mouse Hover and Mobiles Click Successful");
    }
    
    @Test
    public void verifyMouseHover2() {

        MouseHoverPage page =
                new MouseHoverPage(driver);

        page.hoverOnPointMe();

        page.clickLaptops();

        System.out.println(
                "Mouse Hover and Laptops Click Successful");
    }
}