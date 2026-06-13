package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    public ExcelReader(String filePath, String sheetName) {
        try {
            FileInputStream fis =
                    new FileInputStream(filePath);
            workbook = new XSSFWorkbook(fis);
            sheet = workbook.getSheet(sheetName);
        } catch (IOException e) {
            throw new RuntimeException(
                    "Unable to read Excel file", e);
        }
    }
    public int getRowCount() {
        return sheet.getLastRowNum();
    }
    public int getColumnCount() {
        Row row = sheet.getRow(0);
        return row.getLastCellNum();
    }
    public String getCellData(int rowNum,
                              int colNum) {
        DataFormatter formatter =
                new DataFormatter();

        Cell cell =
                sheet.getRow(rowNum)
                     .getCell(colNum);
        return formatter.formatCellValue(cell);
    }
    public void closeWorkbook() {
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}