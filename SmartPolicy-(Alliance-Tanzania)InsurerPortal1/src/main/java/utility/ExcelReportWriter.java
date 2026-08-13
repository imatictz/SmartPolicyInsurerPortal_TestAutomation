package utility;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import java.io.FileOutputStream;
import java.util.List;

public class ExcelReportWriter {

    public static void generateExcel(List<String> links) {

        try (Workbook workbook = new XSSFWorkbook()) {

            Sheet sheet = workbook.createSheet("Report Links");

            Row header = sheet.createRow(0);
            header.createCell(0).setCellValue("Sr No");
            header.createCell(1).setCellValue("Report URL");

            int rowNum = 1;

            for (String link : links) {
                Row row = sheet.createRow(rowNum);
                row.createCell(0).setCellValue(rowNum);
                row.createCell(1).setCellValue(link);
                rowNum++;
            }

            FileOutputStream fileOut = new FileOutputStream("All_Report_Links.xlsx");
            workbook.write(fileOut);
            fileOut.close();

            System.out.println("Excel Generated Successfully with All Report Links.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
