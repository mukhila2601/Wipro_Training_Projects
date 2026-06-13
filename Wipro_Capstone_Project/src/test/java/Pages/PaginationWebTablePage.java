package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginationWebTablePage {

    private WebDriver driver;

    public PaginationWebTablePage(WebDriver driver) {
        this.driver = driver;
    }

    // Pagination links
    private By paginationLinks =
            By.xpath("//ul[@id='pagination']//li/a");

    // Table rows
    private By tableRows =
            By.xpath("//table[@id='productTable']/tbody/tr");

    // Get total pages
    public int getTotalPages() {

        return driver.findElements(paginationLinks)
                .size();
    }

    // Click page number
    public void clickPage(int pageNo) {

        driver.findElement(
                By.xpath("//ul[@id='pagination']//li/a[text()='"
                        + pageNo + "']"))
                .click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Select row based on page number
    public void selectRowCheckbox(int rowNumber) {

        List<WebElement> rows =
                driver.findElements(tableRows);

        if (rowNumber <= rows.size()) {

            WebElement row =
                    rows.get(rowNumber - 1);

            String id =
                    row.findElement(
                            By.xpath("./td[1]"))
                            .getText();

            String productName =
                    row.findElement(
                            By.xpath("./td[2]"))
                            .getText();

            String price =
                    row.findElement(
                            By.xpath("./td[3]"))
                            .getText();

            WebElement checkbox =
                    row.findElement(
                            By.xpath("./td[4]/input"));

            if (!checkbox.isSelected()) {
                checkbox.click();
            }

            System.out.println(
                    "Selected Row : "
                            + rowNumber
                            + " | ID : "
                            + id
                            + " | Product : "
                            + productName
                            + " | Price : "
                            + price);
        }
    }
}