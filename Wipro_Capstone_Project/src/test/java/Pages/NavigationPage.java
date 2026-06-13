package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utilities.JavaScriptUtil;
import Utilities.WaitUtils;

public class NavigationPage {

    private WebDriver driver;
    public NavigationPage(WebDriver driver) {
        this.driver = driver;
    }
    // Locators
    private By homeLink =
            By.linkText("Home");
    private By udemyCoursesLink =
            By.linkText("Udemy Courses");
    private By onlineTrainingsLink =
            By.linkText("Online Trainings");
    private By blogLink =
            By.linkText("Blog");
    private By playwrightPracticeLink =
            By.linkText("PlaywrightPractice");

    // Actions
    public void clickHome() {
        WaitUtils.waitForClickable(driver, homeLink)
                .click();
    }
    public void clickUdemyCourses() {
        WaitUtils.waitForClickable(driver,
                udemyCoursesLink).click();
    }
    public void clickOnlineTrainings() {
        WaitUtils.waitForClickable(driver,
                onlineTrainingsLink).click();
    }
    public void clickBlog() {
        WaitUtils.waitForClickable(driver,
                blogLink).click();
    }
    public void clickPlaywrightPractice() {
        WaitUtils.waitForClickable(driver,
                playwrightPracticeLink).click();
    }
    public String getCurrentUrl() {

        return driver.getCurrentUrl();
    }
    public String getPageTitle() {
        return driver.getTitle();
    }
    public void scrollToBottom() {
        JavaScriptUtil.scrollToBottom(driver);
    }
    public void scrollToTop() {
        JavaScriptUtil.scrollToTop(driver);
    }
    public void scrollPage() {
        scrollToBottom();
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        scrollToTop();
    }
}