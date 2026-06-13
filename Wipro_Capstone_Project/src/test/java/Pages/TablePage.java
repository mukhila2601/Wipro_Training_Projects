package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.WaitUtils;

public class TablePage {

    private WebDriver driver;

    public TablePage(WebDriver driver) {
        this.driver = driver;
    }

    // Static Table

    private By tableRows =
            By.xpath("//table/tbody/tr");

    private By tableColumns =
            By.xpath("//table/thead/tr/th");

    // Dynamic Table

    private By dynamicRows =
            By.xpath("//table/tbody/tr");

    // Pagination

    private By nextButton =
            By.xpath("//a[text()='Next']");

    // ==========================
    // ROW COUNT
    // ==========================

    public int getRowCount() {

        return driver.findElements(
                tableRows).size();
    }

    // ==========================
    // COLUMN COUNT
    // ==========================

    public int getColumnCount() {

        return driver.findElements(
                tableColumns).size();
    }

    // ==========================
    // GET CELL DATA
    // ==========================

    public String getCellData(
            int row,
            int column) {

        By cell =
                By.xpath(
                        "//table/tbody/tr[" +
                                row +
                                "]/td[" +
                                column +
                                "]");

        return driver.findElement(cell)
                .getText();
    }

    // ==========================
    // SEARCH TEXT
    // ==========================

    public boolean isTextPresent(
            String expectedText) {

        List<WebElement> rows =
                driver.findElements(
                        dynamicRows);

        for (WebElement row : rows) {

            if (row.getText()
                    .contains(expectedText)) {

                return true;
            }
        }

        return false;
    }

    // ==========================
    // PAGINATION
    // ==========================

    public void goToNextPage() {

        WaitUtils.waitForClickable(
                driver,
                nextButton)
                .click();
    }
}