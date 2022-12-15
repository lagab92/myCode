package java_intemidiate.excel_io;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {

    //IO stands for input and output

    public static void main(String[] args) throws IOException {
        //  I created a string for the path location
        String path = "C:\\Users\\musta\\Desktop\\confid_videos\\java\\EXCEL FILE\\exce.xlsx";
        // to accec any files in java we use fileinputstream
        FileInputStream fis = new FileInputStream(path);
// we are accessicis
        XSSFWorkbook workbook = new XSSFWorkbook(fis); // this book is comming from fis
        // we are accesing the sheet for the work book
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int column = sheet.getRow(0).getLastCellNum();
        int row = sheet.getLastRowNum()+1;


        for (int a = 0; a < row; a++) {

           XSSFRow myRow = sheet.getRow(a); // in this sheet put all the valaue in this variable

          for ( int b = 0 ; b< column;b++){

              String value = myRow.getCell(b).toString(); // is a generic we can you use for integer , string   etc

              System.out.print(value + "\t\t" ); // we used print instead println

        }

            System.out.println();
            System.out.println();

    }
}}