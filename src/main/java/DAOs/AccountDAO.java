/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Models.Account;
import Models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguye
 */
public class AccountDAO {

    Connection conn;

    public AccountDAO() {
        try {
            conn = DB.DBConnection.connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public User getAccount(String acc_gmail) {
        User user = null;
        try {
            PreparedStatement ps = conn.prepareStatement("select u.user_id, u.user_fullname, u.user_sdt, u.user_address, u.acc_id\n"
                    + "                   from [dbo].[User] u join Account a \n"
                    + "                   on u.acc_id =  a.acc_id \n"
                    + "                    where a.acc_gmail = ? ");
            ps.setString(1, acc_gmail);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
//                account = new Account(rs.getString("username"), rs.getString("password"), rs.getString("fullname"), rs.getString("address"), rs.getString("sdt"), rs.getInt("role"));
                user = new User(rs.getInt("user_id"), rs.getString("user_fullname"), rs.getString("user_sdt"), rs.getString("user_address"), rs.getInt("acc_id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    public User update(String acc_gmai, User userNew) {
        int count = 0;
        try {
            PreparedStatement ps = conn.prepareStatement("update [User]\n"
                    + "set user_fullname = ?,\n"
                    + "user_sdt = ? , user_address = ?\n"
                    + "from [User] u join [Account] a\n"
                    + "on u.acc_id = a.acc_id \n"
                    + "where a.acc_gmail = ? ");
            ps.setString(1, userNew.getUser_fullName());
            ps.setString(3, userNew.getUser_address());
            ps.setString(2, userNew.getUser_phoneNumber());
            ps.setString(4, acc_gmai);
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (count == 0) ? null : userNew;
    }

}
