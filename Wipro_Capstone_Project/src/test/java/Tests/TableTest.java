package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import Base.BaseTest;
import Pages.TablePage;

public class TableTest extends BaseTest {

    @Test
    public void verifyRowCount() {

        TablePage tablePage =
                new TablePage(driver);

        int rows =
                tablePage.getRowCount();

        System.out.println(
                "Rows : " + rows);

        Assert.assertTrue(rows > 0);
    }

    @Test
    public void verifyColumnCount() {

        TablePage tablePage =
                new TablePage(driver);

        int columns =
                tablePage.getColumnCount();

        System.out.println(
                "Columns : " + columns);

        Assert.assertTrue(columns > 0);
    }

    @Test
    public void verifyCellData() {

        TablePage tablePage =
                new TablePage(driver);

        String data =
                tablePage.getCellData(
                        1,
                        1);

        System.out.println(data);

        Assert.assertFalse(
                data.isEmpty());
    }

    @Test
    public void verifySearchInTable() {

        TablePage tablePage =
                new TablePage(driver);

        Assert.assertTrue(
                tablePage.isTextPresent(
                        "Mukesh"));
    }
}