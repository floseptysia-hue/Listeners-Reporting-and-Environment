package utils;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;

public class ExcelUtils {

    public static Object[][] getExcelData(String sheetName) {
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/TestData.xlsx");
            Workbook workbook = WorkbookFactory.create(fis);
            Sheet sheet = workbook.getSheet(sheetName);

            int rows = sheet.getLastRowNum();
            int cols = sheet.getRow(0).getLastCellNum();

            Object[][] data = new Object[rows][cols];

            for (int i = 1; i <= rows; i++) {
                Row row = sheet.getRow(i);
                for (int j = 0; j < cols; j++) {
                    Cell cell = row.getCell(j);
                    data[i - 1][j] = cell == null ? "" : cell.toString();
                }
            }

            return data;

        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }

    @DataProvider(name = "Login")
    public static Object[][] loginData() {
        return getExcelData("LoginData");
    }

    @DataProvider(name = "Search")
    public static Object[][] searchData() {
        return getExcelData("SearchData");
    }

    @DataProvider(name = "Sorting")
    public static Object[][] sortingData() {
        return getExcelData("SortingData");
    }
}
