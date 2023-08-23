
package DTO;

import java.awt.Desktop;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.sql.*;

public class Excel {
    
    public Excel()
    {
        
    }
    
    public void ExportDatatoExcel(DefaultTableModel model)
    {
        FileOutputStream fos;
        BufferedOutputStream bos;
        
        try{
            //thiết lập chỗ lưu file
            JFileChooser excelFileChooser=new JFileChooser("C:\\Users\\ADMIN\\Downloads");
            excelFileChooser.setDialogTitle("Save as");//thiết lập tiêu đề
            
            FileNameExtensionFilter fnef=new FileNameExtensionFilter("Excel Files","xlsx","xlsm","xls");//thiết lập định dạng file để chọn
            excelFileChooser.setFileFilter(fnef);//set định dạng file
            
            int chooser=excelFileChooser.showSaveDialog(null);//mở chỗ lưu lên view
            
            if(chooser==JFileChooser.APPROVE_OPTION)//nếu nhấn lưu
            {
                XSSFWorkbook excelWorkBook=new XSSFWorkbook();
                XSSFSheet excelSheet=excelWorkBook.createSheet();
                XSSFRow excelRow;
                XSSFCell excelCell;
                
                excelRow=excelSheet.createRow(5);
                for(int i=0;i<model.getColumnCount();i++)
                {
                    excelCell=excelRow.createCell(i+1);//+1 là để cách vào 1 ô
                    excelCell.setCellValue(model.getColumnName(i));
                }
                
                //đưa dữ liệu từ tbl độc giả vào trong excel
                for(int i=0;i<model.getRowCount();i++)
                {
                    excelRow=excelSheet.createRow(i+6);//+6 là để khoảng trống để tiêu đề
                    for(int j=0;j<model.getColumnCount();j++)
                    {
                        excelCell=excelRow.createCell(j+1);//+1 là để cách vào 1 ô
                        excelCell.setCellValue(model.getValueAt(i,j).toString());
                    }
                }
                
                fos=new FileOutputStream(excelFileChooser.getSelectedFile());
                bos=new BufferedOutputStream(fos);
                excelWorkBook.write(bos);
                bos.flush();//ghi toàn bộ dữ liệu đến đích xong giải phóng dữ liệu để tránh tràn bộ nhớ đoán vậy
                
                fos.close();
                bos.close();
                excelWorkBook.close();
                
                JOptionPane.showMessageDialog(null, "Lưu thành công");
                Desktop.getDesktop().open(excelFileChooser.getSelectedFile());//mở file
                
            }
            
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
    }
    
    public void ImportExcel()
    {
        //thiết lập chỗ lưu file
        JFileChooser excelFileChooser = new JFileChooser("C:\\Users\\ADMIN\\Downloads");
        excelFileChooser.setDialogTitle("Save as");//thiết lập tiêu đề

        FileNameExtensionFilter fnef = new FileNameExtensionFilter("Excel Files", "xlsx", "xlsm", "xls");//thiết lập định dạng file để chọn
        excelFileChooser.setFileFilter(fnef);//set định dạng file

        int chooser = excelFileChooser.showSaveDialog(null);//mở chỗ lưu lên view
        if (chooser == JFileChooser.APPROVE_OPTION) 
        {
            try{
                Workbook wb = null;
                FileInputStream fins = new FileInputStream(excelFileChooser.getSelectedFile());

            wb = WorkbookFactory.create(fins);
            ArrayList<Integer> listso = new ArrayList();
            ArrayList<String> listchu = new ArrayList();
            Sheet sheet = wb.getSheetAt(0);
            int count = 0;//bỏ qua dòng đầu tiên
            FormulaEvaluator fmEval = wb.getCreationHelper().createFormulaEvaluator();
            String Query="Insert into Sach(MaSach,TenSach,MaTheLoai,MaNXB,MaTacGia,"
                       + "SoLuongCon,ThongTinSach,IsDeleted)\n"
                        +"Values(?,?,?,?,?,?,?,0)";
            PreparedStatement ps=DBConnection.GetConnection().prepareStatement(Query);
            for (Row row : sheet) 
            {
                if (count > 0) 
                {
                    int i=1;
                    for (Cell cell : row) 
                    {
                        switch (fmEval.evaluateInCell(cell).getCellType()) 
                        {
                            case NUMERIC:
                                ps.setInt(i,(int)cell.getNumericCellValue());
                                break;

                            case STRING:
                                ps.setString(i,cell.getStringCellValue());
                                break;    
                        }
                    }
                }
                count++;
            }
            //addDB(listchu, listso);
            }catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
                    
    }
    
    public static void main(String[] args) {
        Excel excel=new Excel();
        excel.ImportExcel();
    }
}
