/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package DB;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author nguye
 */
public class DBConnection {

    public static Connection connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        Connection conn = DriverManager.getConnection("jdbc:sqlserver:DESKTOP-N2G9N3D;databaseName=db_Nghien_Nhua;user=sa;password=123;encrypt=true;trustServerCertificate=true");
          Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-N2G9N3D\\SQLEXPRESS:1433;databaseName=db_Nghien_Nhua;user=sa;password=27122003;encrypt=true;trustServerCertificate=true");
        return conn;
    }
}
