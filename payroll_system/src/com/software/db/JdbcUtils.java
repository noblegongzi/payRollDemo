package com.software.db;

import java.sql.*;
public class JdbcUtils {

	private static String url = "jdbc:mysql://localhost:3306/payroll_system";
		private static String user = "root";
		private static String password = "627475";
	
		private JdbcUtils() {
		}
	
		static {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				throw new ExceptionInInitializerError(e);
			}
		}
	
		public static Connection getConnection() throws SQLException {
			return DriverManager.getConnection(url, user, password);
		}
    
}
