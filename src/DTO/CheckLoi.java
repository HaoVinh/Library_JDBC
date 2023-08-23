
package DTO;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;

public class CheckLoi {
    private final Pattern So= Pattern.compile("^[0-9]+$");
    
    
    public boolean CheckSo(String SoCanCheck)//hàm dùng để kiểm tra xem String truyền vào có phải là số hay không
    {
        return So.matcher(SoCanCheck).find();
    }
    
    public Date ChuyenDate(Date dateCanChuyen)
    {
        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String NgaySinh=dateFormat.format(dateCanChuyen);
            DateTimeFormatter format= DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localdate=LocalDate.parse(NgaySinh, format);
            return java.sql.Date.valueOf( localdate );
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return null;
    }
    
    public String ChuyenDateSangThang(Date dateCanChuyen)
    {
        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String NgaySinh=dateFormat.format(dateCanChuyen);
            String[] ChuoiNgay=NgaySinh.split("-");
            return ChuoiNgay[1];
            }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return null;
    }
    
    public String ChuyenDoiMaTuDong(String SoCanChuyen)
    {
        int DoDaiMacDinh=2;
        String ChuoiCuoiCung="";
        try{
            int SoTemp=Integer.parseInt(SoCanChuyen)+1;//đây là con số mình convert sang từ string
            int DoDaiCuaSo=DoDaiCuaSo(SoTemp);//đếm độ dài của số ví dụ 1 là 1 10 là 2
            ChuoiCuoiCung+=String.valueOf(SoTemp);//gán giá trị của số cho string
            //nếu độ dài của số vượt quá độ dài mặc định thì gán hẳn luôn ko cần phải + 0 đằng trước
            if(DoDaiCuaSo>DoDaiMacDinh)
            {
                return ChuoiCuoiCung;
            }
            //kiểm tra xem độ dài của string đã đủ chưa nếu chưa đủ ta tiến hành cộng thêm số 0 đằng trước
            while (DoDaiCuaSo < DoDaiMacDinh)//ví dụ số là 5 độ dài số là 1 vậy thì độ dài của string thiếu 1 thì ta tiến hành cộng thành 05
            {
                ChuoiCuoiCung = "0" + ChuoiCuoiCung;
                DoDaiCuaSo += 1;
            }
            
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return ChuoiCuoiCung;
    }
    
    private int DoDaiCuaSo(int so)//hàm đếm độ dài của số
    {
        int dem=0;
        while(so!=0)
        {
            so=so/10;
            dem++;
        }
        return dem;
    }
    
    public static void main(String[] args) {
        
        CheckLoi check=new CheckLoi();
        System.out.println(check.ChuyenDoiMaTuDong("1000"));
        
    }
    
}
