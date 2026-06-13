package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.DatePickerPage;

public class DatePickerTest extends BaseTest {

    @Test
    public void testAllDatePickers() {

        DatePickerPage datePage =
                new DatePickerPage(driver);

        datePage.selectDatePicker1(5);

        datePage.selectDatePicker2(10);

        datePage.selectDateRange(0, 7);

        System.out.println(
                "Date Picker 1 : "
                        + datePage.getDatePicker1Value());

        System.out.println(
                "Date Picker 2 : "
                        + datePage.getDatePicker2Value());

        System.out.println(
                "Start Date : "
                        + datePage.getStartDate());

        System.out.println(
                "End Date : "
                        + datePage.getEndDate());

        Assert.assertFalse(
                datePage.getDatePicker1Value().isEmpty());

        Assert.assertFalse(
                datePage.getDatePicker2Value().isEmpty());

        Assert.assertFalse(
                datePage.getStartDate().isEmpty());

        Assert.assertFalse(
                datePage.getEndDate().isEmpty());

        System.out.println(
                "All Date Pickers Tested Successfully");
    }
}