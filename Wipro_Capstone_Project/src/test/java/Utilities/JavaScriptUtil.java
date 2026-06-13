package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {

    public static void scrollToBottom(WebDriver driver) {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollTo(0, document.body.scrollHeight)");
    }

    public static void scrollToTop(WebDriver driver) {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0,0)");
    }

    public static void scrollToElement(WebDriver driver,
                                       WebElement element) {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].scrollIntoView(true);",
                element);
    }

    public static void clickElement(WebDriver driver,
                                    WebElement element) {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].click();",
                element);
    }

    public static void setValue(WebDriver driver,
                                WebElement element,
                                String value) {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].value=arguments[1];",
                element,
                value);
    }

    public static String getPageTitle(WebDriver driver) {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        return (String) js.executeScript(
                "return document.title;");
    }

    public static void refreshPage(WebDriver driver) {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript("history.go(0)");
    }

    public static void zoomPage(WebDriver driver,
                                String percentage) {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "document.body.style.zoom='" +
                percentage + "'");
    }

    public static void highlightElement(WebDriver driver,
                                        WebElement element) {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].style.border='3px solid red'",
                element);
    }
}