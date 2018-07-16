package com.software.dao;

import java.util.*;
import java.sql.*;
import com.software.pojo.*;
import com.software.db.JdbcUtils;
public class AdminDB {
    static Connection conn;
    static Statement stat;

    /**
     * 
     * tbl_admin(admin_id,admin_name,admin_pwd)
     * get connection with database
     * @return the connection
     */
   

    /**
     * close the connection to database
     */
    private static void closeConnection() throws SQLException {
        stat.close();
        conn.close();
    }

    /**
     * find whether there exists this admin
     * @param username the username from input
     * @param password the password from input
     * @return result whether we find the admin
     */
    public static boolean findAdmin(int userID, String password) 
        throws SQLException {
    	conn=JdbcUtils.getConnection();
    	stat=conn.createStatement();
        String sql = "select * from tbl_admin where admin_id = '" 
            + userID + "' and admin_pwd= '" + password + "'";
        ResultSet rs = stat.executeQuery(sql);
        boolean result = rs.next();
        rs.close();
        return result;
    }

    /**
     * add a new admin to table
     * @param newAdmin the admin to be added
     */
    public static void addAdmin(Administrator newAdmin) throws SQLException {
        // get infomation about new admin
        int adminID = newAdmin.getAdminID();
        String adminName = newAdmin.getUsername();
        String adminPW = newAdmin.getPassword();

        String sql = "insert * into tbl_admin(admin_id, admin_name, admin_pwd) " 
            + "values ('" + adminID + "','" + adminName + "','" 
            + adminPW + "')";
        if (!findAdmin(adminID, adminPW)) {
            int result = stat.executeUpdate(sql);
        }
        else {
            System.out.println("This admin exists!!!");
        }
    }

    /**
     * delete an admin to table
     * @param oldAdmin the admin to be deleted
     */
    public static void delAdmin(Administrator oldAdmin) throws SQLException {
        int adminID = oldAdmin.getAdminID();
        String sql = "delete from tbl_admin where admin_id = '" 
            + adminID + "'";
        int result = stat.executeUpdate(sql);
    }

    /**
     * update an admin's information
     * @param admin the admin to be updated
     */
    public static void updateAdmin(Administrator admin) throws SQLException {
        // get infomation about new admin
        int adminID = admin.getAdminID();
        String adminName = admin.getUsername();
        String adminPW = admin.getPassword();

        String sql = "update tbl_admin set admin_id = '" + adminID 
            + "', admin_name = '" + adminName + "', admin_pwd= '" 
            + adminPW + "'";
        int result = stat.executeUpdate(sql);
    }
}
