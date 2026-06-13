package Pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.WaitUtils;

public class DatePickerPage {

    private WebDriver driver;

    public DatePickerPage(WebDriver driver) {
        this.driver = driver;
    }
    private By datePicker1 = By.id("datepicker");

    private By datePicker2 = By.id("txtDate");

    private By startDate = By.id("start-date");

    private By endDate = By.id("end-date");

    private By submitButton =
            By.xpath("//button[contains(text(),'Submit')]");
    public void selectDatePicker1(int daysFromToday) {

        String date = LocalDate.now()
                .plusDays(daysFromToday)
                .format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));

        WebElement element =
                WaitUtils.waitForVisibility(driver, datePicker1);

        element.sendKeys(date);

        closeCalendar();
    }
    public void selectDatePicker2(int daysFromToday) {

        String date = LocalDate.now()
                .plusDays(daysFromToday)
                .format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));

        WebElement element =
                WaitUtils.waitForVisibility(driver, datePicker2);

        ((JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].value=arguments[1];",
                        element,
                        date);

        closeCalendar();
    }
    public void selectDateRange(int startOffset,
                                int endOffset) {

        String fromDate = LocalDate.now()
                .plusDays(startOffset)
                .format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));

        String toDate = LocalDate.now()
                .plusDays(endOffset)
                .format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));

        WebElement startField =
                WaitUtils.waitForVisibility(driver, startDate);

        ((JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].scrollIntoView({block:'center'});",
                        startField);

        startField.sendKeys(fromDate);

        WebElement endField =
                WaitUtils.waitForVisibility(driver, endDate);

        endField.sendKeys(toDate);

        closeCalendar();
    }
    public void clickSubmit() {

        try {

            WebElement button =
                    WaitUtils.waitForVisibility(driver, submitButton);

            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].click();",
                            button);

        } catch (Exception e) {

            System.out.println(
                    "Submit button not clicked: "
                            + e.getMessage());
        }
    }
    public String getDatePicker1Value() {

        return driver.findElement(datePicker1)
                .getAttribute("value");
    }

    public String getDatePicker2Value() {

        return driver.findElement(datePicker2)
                .getAttribute("value");
    }

    public String getStartDate() {

        return driver.findElement(startDate)
                .getAttribute("value");
    }

    public String getEndDate() {

        return driver.findElement(endDate)
                .getAttribute("value");
    }
    private void closeCalendar() {

        try {

            driver.findElement(By.tagName("body"))
                    .click();
        } catch (Exception e) {
            System.out.println(
                    "Calendar already closed");
        }
    }
}