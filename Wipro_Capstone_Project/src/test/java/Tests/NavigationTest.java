package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.NavigationPage;

public class NavigationTest extends BaseTest {

    @Test(priority = 1)
    public void verifyHomeNavigation() {

        NavigationPage navigationPage =
                new NavigationPage(driver);

        navigationPage.clickHome();

        navigationPage.scrollPage();

        String url =
                navigationPage.getCurrentUrl();

        Assert.assertTrue(
                url.contains("blogspot"),
                "Home navigation failed");
    }

    @Test(priority = 2)
    public void verifyUdemyCoursesNavigation() {

        NavigationPage navigationPage =
                new NavigationPage(driver);

        navigationPage.clickUdemyCourses();

        navigationPage.scrollPage();

        String title =
                navigationPage.getPageTitle();

        Assert.assertFalse(
                title.isEmpty(),
                "Page title is empty");
    }

    @Test(priority = 3)
    public void verifyOnlineTrainingsNavigation() {

        NavigationPage navigationPage =
                new NavigationPage(driver);

        navigationPage.clickOnlineTrainings();

        navigationPage.scrollPage();

        Assert.assertTrue(
                driver.getCurrentUrl().length() > 0);
    }

    @Test(priority = 4)
    public void verifyBlogNavigation() {

        NavigationPage navigationPage =
                new NavigationPage(driver);

        navigationPage.clickBlog();

        navigationPage.scrollPage();

        Assert.assertFalse(
                navigationPage.getPageTitle().isEmpty(),
                "Blog page not loaded");
    }

    @Test(priority = 5)
    public void verifyPlaywrightPracticeNavigation() {

        NavigationPage navigationPage =
                new NavigationPage(driver);

        navigationPage.clickPlaywrightPractice();

        navigationPage.scrollPage();

        Assert.assertTrue(
                driver.getCurrentUrl().length() > 0);
    }
}