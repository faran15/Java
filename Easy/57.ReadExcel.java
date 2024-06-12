import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {
    public static void main(String[] args) {
        String excelFilePath = "path/to/your/excel/file.xlsx";
        
        try (FileInputStream fis = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);
            
            Row emailRow = sheet.getRow(0);
            Cell emailCell = emailRow.getCell(0);
            String email = emailCell.getStringCellValue();
            Cell passwordCell = emailRow.getCell(1);
            String password = passwordCell.getStringCellValue();
            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
