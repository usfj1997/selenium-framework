package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.util.Scanner;

public class ExcelUtils {
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public static void main(String[] args) throws IOException {
        getRowCount();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row number: ");
        int rowNum = scanner.nextInt();
        System.out.print("Enter the col number: ");
        int colNum = scanner.nextInt();
        getCellDataString(rowNum,colNum);
        getCellDataNumber(rowNum,colNum);
    }

    public static void getRowCount() throws IOException {
        workbook = new XSSFWorkbook("excel/data.xlsx");
        sheet = workbook.getSheet("Sheet1");
        System.out.println("Number of rows: " + sheet.getPhysicalNumberOfRows());
    }

    public static void getCellDataString(int rowNum, int colNum) {
        try {
            workbook = new XSSFWorkbook("excel/data.xlsx");
            sheet = workbook.getSheet("Sheet1");
            String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
            System.out.println(cellData);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }
    public static void getCellDataNumber(int rowNum, int colNum) {
        try {
            workbook = new XSSFWorkbook("excel/data.xlsx");
            sheet = workbook.getSheet("Sheet1");
            double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
            System.out.println(cellData);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }

    }
}
