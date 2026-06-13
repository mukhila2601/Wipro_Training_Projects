package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShadowDomPage {

    private WebDriver driver;

    public ShadowDomPage(WebDriver driver) {
        this.driver = driver;
    }

    private SearchContext getShadowRoot() {

        WebElement shadowHost =
                driver.findElement(By.cssSelector("#shadow_host"));

        return shadowHost.getShadowRoot();
    }

    // Mobiles Text
    public String getMobilesText() {

        return getShadowRoot()
                .findElement(By.cssSelector("span.info"))
                .getText();
    }

    // Textbox
    public void enterText(String text) {

        WebElement textbox =
                getShadowRoot()
                        .findElement(By.cssSelector("input[type='text']"));

        textbox.clear();
        textbox.sendKeys(text);
    }

    // Blog Link (Inside Shadow DOM)
    public boolean isBlogDisplayed() {

        return getShadowRoot()
                .findElement(By.linkText("Blog"))
                .isDisplayed();
    }

    public void clickBlog() {

        getShadowRoot()
                .findElement(By.linkText("Blog"))
                .click();
    }

    // Checkbox
    public boolean isCheckboxDisplayed() {

        return getShadowRoot()
                .findElement(By.cssSelector("input[type='checkbox']"))
                .isDisplayed();
    }

    public void selectCheckbox() {

        WebElement checkbox =
                getShadowRoot()
                        .findElement(By.cssSelector("input[type='checkbox']"));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }

    // File Upload
    public boolean isFileUploadDisplayed() {

        return getShadowRoot()
                .findElement(By.cssSelector("input[type='file']"))
                .isDisplayed();
    }

    public void uploadFile(String filePath) {

        getShadowRoot()
                .findElement(By.cssSelector("input[type='file']"))
                .sendKeys(filePath);
    }

    // YouTube Link (Outside Shadow DOM)
    public boolean isYoutubeDisplayed() {

        return driver.findElement(
                By.linkText("Youtube"))
                .isDisplayed();
    }

    public void clickYoutube() {

        driver.findElement(
                By.linkText("Youtube"))
                .click();
    }
}