 import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


 
public class SimpleExcelReadExample {
  
	public static void main(String[] args) throws IOException {

		try{
			InputStream ExcelFileToRead = new FileInputStream("C:/New/LD_Functional_To_Technical_Template.xls");
			HSSFWorkbook wb = new HSSFWorkbook(ExcelFileToRead);
	 
			HSSFSheet sheet=wb.getSheetAt(1);
			HSSFRow row; 
			
			HSSFCell cell;
	 
			Iterator rows = sheet.rowIterator();
			row=(HSSFRow) rows.next();
	
			row=(HSSFRow) rows.next();


		 //Class.forName("com.mysql.jdbc.Driver");
        // Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
        
        // PreparedStatement pstm = null ;
         int startRow = 0;
         int currentRow = 0;
         for(int i=1; i<=sheet.getLastRowNum(); i++){
        	 
        	 System.out.println("Started");
        	 Iterator cells = row.cellIterator();
 			
        	 cell=(HSSFCell) cells.next();
        	 System.out.println(cell.getStringCellValue());
        	
             row = sheet.getRow ;
            
             String SRC_COL_NAME =sheet.getRow.getCell((short) 1).toString();
           System.out.println("SRC_COL_NAME" +SRC_COL_NAME);
          
           if(SRC_COL_NAME.equalsIgnoreCase("SourceColumnName"))
			{
        	  startRow = sheet.getRow.getRowNum();
       	   System.out.println(" in source colname");

			
			}
           if(startRow > 0 && sheet.getRow.getRowNum() > startRow){
        	   System.out.println(" the value is getting ");
        	    SRC_COL_NAME = row.getCell((short) 1).getStringCellValue();
        	   System.out.println(" the value is getting " + SRC_COL_NAME);
        	   if (null!= row.getCell((short) 3) && null!=row.getCell((short) 3).getStringCellValue())
        	   {
	        	   String SRC_COL_DATATYPE = row.getCell((short) 3).getStringCellValue();
	        	   System.out.println(" the column value is cell type " + row.getCell((short) 3).getStringCellValue());
	               String SRC_COL_LENGTH = (String.valueOf(row.getCell((short) 2).getNumericCellValue()));
	               System.out.println(" the column value is length " + SRC_COL_LENGTH);
	               String sql = "INSERT INTO  D_LD_SOURCE_FILE_DETAIL_TEST(SRC_COL_NAME,SRC_COL_LENGTH,SRC_COL_DATATYPE)VALUES('"+SRC_COL_NAME+"','"+SRC_COL_LENGTH+"','"+SRC_COL_DATATYPE+"');";
	               
	               System.out.println(sql);
	       //      pstm = (PreparedStatement) con.prepareStatement(sql);
	       //       pstm.execute();
	      //        pstm.close();
	        	}
               
           }
           
             System.out.println("Import rows "+i);

               
		   }
         }
		
		
		catch(Exception e)
		{
			e.printStackTrace();
		
		  }
		
		}
	}
 
