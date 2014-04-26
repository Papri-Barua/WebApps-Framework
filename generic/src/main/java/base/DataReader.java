package base;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Prithul on 4/25/2014.
 */
public class DataReader extends Base {

    int numberOfRows,numberOfColumns;

    String world,politics,justice,tech;
    //file reader method which will read file from excel sheet
    public String[][] fileReader(String file) throws IOException {
        String [][] dataContainer;
        //declare data as a file type
        File data = new File(file);
        //create fis to read file stream byte
        FileInputStream fis = new FileInputStream(data);
        //create Workbook to have multiple sheet of pages
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        //create sheet under wb
        HSSFSheet sheet = wb.getSheetAt(0);
        //get number of rows under above sheet page
        numberOfRows = sheet.getLastRowNum();
        //get number of columns on above sheet page
        numberOfColumns = sheet.getRow(0).getLastCellNum();
        //allocate the datacOntainer array1
        dataContainer = new String[numberOfRows][numberOfColumns];
        //iterate through the Sheet page
        for( int i = 0; i<dataContainer.length; i++){
            //iterate through the Rows
            HSSFRow row = sheet.getRow(i);
            for(int j =0; j<numberOfColumns; j++){
                //iterate through the Cells
                HSSFCell cell = row.getCell(j);
                //extract data from the cell
                String cellData = convertFromCell(cell);
                //store data into the array as string
                dataContainer[i][j] = cellData;
            }
        }
        return dataContainer;
    }
    //helper method that will convert from cell to string value
    public String convertFromCell(HSSFCell cell){
        Object data = null;
        int dataType = cell.getCellType();
        switch(dataType){
            case HSSFCell.CELL_TYPE_NUMERIC:
                data = cell.getNumericCellValue();
                break;
            case HSSFCell.CELL_TYPE_STRING:
                data = cell.getStringCellValue();
                break;
            case HSSFCell.CELL_TYPE_BOOLEAN:
                data = cell.getBooleanCellValue();
                break;
        }

        return data.toString();
    }

}
