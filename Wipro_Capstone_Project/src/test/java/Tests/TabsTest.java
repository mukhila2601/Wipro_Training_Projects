package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.TabsPage;

public class TabsTest extends BaseTest {

    @Test
    public void verifyWikipediaSearch() {

        TabsPage tabsPage =
                new TabsPage(driver);

        tabsPage.enterSearchText("Selenium");

        tabsPage.clickSearchButton();

        int count =
                tabsPage.getResultCount();

        System.out.println(
                "Total Results Found: " + count);

        Assert.assertTrue(
                count > 0,
                "Wikipedia search returned no results");
    }
}