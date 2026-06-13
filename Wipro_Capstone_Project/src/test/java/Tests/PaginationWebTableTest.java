package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.PaginationWebTablePage;

public class PaginationWebTableTest extends BaseTest {

    @Test
    public void verifyPaginationWebTable()
            throws InterruptedException {

        PaginationWebTablePage tablePage =
                new PaginationWebTablePage(driver);

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        // Scroll to Pagination Table
        js.executeScript("window.scrollBy(0,2500)");

        Thread.sleep(2000);

        int totalPages =
                tablePage.getTotalPages();

        System.out.println(
                "Total Pages : "
                        + totalPages);

        for (int page = 1;
             page <= totalPages;
             page++) {

            tablePage.clickPage(page);

            System.out.println(
                    "\n========== PAGE "
                            + page
                            + " ==========");

            // Page 1 -> Row 1
            // Page 2 -> Row 2
            // Page 3 -> Row 3
            // Page 4 -> Row 4

            tablePage.selectRowCheckbox(page);

            Thread.sleep(1000);
        }

        System.out.println(
                "\nPagination Table Execution Completed Successfully.");
    }
}