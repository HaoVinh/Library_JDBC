package DTO;


import java.sql.*;


public class DBConnection {
    public static Connection GetConnection()
    {
        Connection connection=null;
        try {
            var server = "localhost";
            var user = "sa";
            var password = "luongtuan";
            var db = "QuanLyThuVien";
            var url = "jdbc:sqlserver://" + server + ":1433;DatabaseName=" + db + ";encrypt=true;trustServerCertificate=true";

            connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
    
    public static void CloseConnection(Connection connection)
    {
        if(connection!=null)
        {
            try{
                connection.close();
            }catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }
}
