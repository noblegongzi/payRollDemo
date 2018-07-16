package com.software.dao;

import java.util.*;
import java.sql.*;

import com.software.db.JdbcUtils;
import com.software.pojo.Day;
import com.software.pojo.Station;
public class DayDB {
	
	public static Day findDay(int employeeID) throws SQLException{
		Day tmp = null;
		Connection conn = JdbcUtils.getConnection();
		String sql = "select employee_id,sickDays,busyDays,lateDays,overtimeDays from tbl_day";
		Statement pstat = conn.createStatement();
		ResultSet result = pstat.executeQuery(sql);
		if(result != null){
			while (result.next()) {
				int sickDays = result.getInt("sickDays");
				int busyDays = result.getInt("busyDays");
				int lateDays = result.getInt("lateDays");
				int overtimeDays = result.getInt("overtimeDays");
				
				tmp = new Day();
				tmp.setEmployeeID(employeeID);
				tmp.setSickDays(sickDays);
				tmp.setBusyDays(busyDays);
				tmp.setLateDays(lateDays);
				tmp.setOvertimeDays(overtimeDays);
			}
		}
		return tmp;
	}
	
	public static void addDay(Day day) throws SQLException{
		Statement stat=null;
    	Connection conn=JdbcUtils.getConnection();
    	stat=conn.createStatement();
    	 int employeeID = day.getEmployeeID();
    	 int sickDays=day.getSickDays();
    	 int busyDays=day.getBusyDays();
    	 int lateDays=day.getLateDays();
    	 int overtimeDays=day.getOvertimeDays();
    	 String sql="insert into tbl_day values('"+employeeID+"','"+sickDays+"','"+busyDays+"','"+lateDays+"','"+overtimeDays+"')";
    	 if (findDay(employeeID)==null) {
             stat.executeUpdate(sql);
         }
         else {
             System.out.println("This day exists!!!");
         }
    	 conn.close();stat.close();
	}
	
	public static void delDay(Day day) throws SQLException{
		Statement stat=null;
    	Connection conn=JdbcUtils.getConnection();
    	stat=conn.createStatement();
    	int employeeID=day.getEmployeeID();
    	String sql = "delete from tbl_day where employee_id = '" + employeeID + "'";
    	if(findDay(employeeID)!=null){
    		stat.executeUpdate(sql);
    	}
    	else{
    		System.out.println("This day doesn't exist!!!");

    	}
    	 conn.close();stat.close();
	}
	
	public static boolean updateDay(Day day) throws SQLException{
		Statement stat=null;
    	Connection conn=JdbcUtils.getConnection();
    	stat=conn.createStatement();
    	 int employeeID = day.getEmployeeID();
    	 int sickDays=day.getSickDays();
    	 int busyDays=day.getBusyDays();
    	 int lateDays=day.getLateDays();
    	 int overtimeDays=day.getOvertimeDays();
    	 String sql="update tbl_day set sickDays='"+sickDays+"',busyDays='"+busyDays+"',lateDays='"+lateDays+"',overtimeDays='"+overtimeDays+"' where employee_id='"+employeeID+"'";
    	 if (findDay(employeeID)!=null) {
             stat.executeUpdate(sql);
             
             conn.close();stat.close();
             return true;
         }
         else {
        	 conn.close();stat.close();
             System.out.println("This day doesn't exist!!!");
             return false;
         }
	}
    public static ArrayList<Day> getAll() throws SQLException{
	    Statement stat=null;
   		Connection conn=JdbcUtils.getConnection();
   		stat=conn.createStatement();
   		ArrayList<Day> arr=new ArrayList<Day>();
   		Day aDay=new Day();
   		String url="select * from view_day";
   		ResultSet rs = stat.executeQuery(url);
   		if(rs!=null){
   			while(rs.next()){
   				aDay.setEmployeeID(rs.getInt(1));
   				aDay.setEmployeeName(rs.getString(2));
   				aDay.setSickDays(rs.getInt(3));
   				aDay.setBusyDays(rs.getInt(4));
   				aDay.setLateDays(rs.getInt(5));
   				aDay.setOvertimeDays(rs.getInt(6));
   				
   				arr.add(aDay);
   			}
   		}
   		rs.close();
   		return arr;
   }
}
