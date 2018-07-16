package com.software.dao;

import java.util.*;
import java.sql.*;

import com.software.db.JdbcUtils;
import com.software.pojo.Department;
public class DepartmentDB {
    
    public static Department findDepart(int department_id) throws SQLException{
    	String url="select * from tbl_department where department_id=?";
    	Connection conn=JdbcUtils.getConnection();
    	PreparedStatement pstat = conn.prepareStatement(url);
    	pstat.setInt(1, department_id);
    	ResultSet result = pstat.executeQuery();
    	if(result.next()){
    		String department_name=result.getString(2);
    		Department department=new Department(department_id, department_name);
    		
    		return department;
    	}
    	else{
    		System.out.println("no");
    		return null;
    	}
    }
    
    public static boolean addDepart(Department department) throws SQLException{
    	Statement stat=null;
    	int department_id=department.getDepartment_id();
    	String department_name=department.getDepartment_name();
    	Connection conn=JdbcUtils.getConnection();
    	stat=conn.createStatement();
    	boolean bool=false;
    	String url="insert into tbl_department values('"+department_id+"','"+department_name+"')";
    	if(findDepart(department_id)==null){
    		stat.executeUpdate(url);
    		bool=true;
    	}
    	else{
    		System.out.println("This department exists!!!");
    	}
    	stat.close();
    	conn.close();
    	return bool;
    }
    public static boolean delDepart(Department department) throws SQLException{
    	Statement stat=null;
    	Connection conn=JdbcUtils.getConnection();
    	stat=conn.createStatement();
    	boolean bool=false;
    	int department_id=department.getDepartment_id();
    	String url="delete from tbl_department where department_id='"+department_id+"'";
    	String sql="select * from tbl_employee where department_id='"+department_id+"'";
    	ResultSet result =stat.executeQuery(sql);
    	if(findDepart(department_id)!=null){
    		if(!result.next()){
    			stat.executeUpdate(url);
    			bool=true;
    		}
    	}
    	stat.close();
    	conn.close();
    	return bool;
    }
    
    public static boolean updateDepart(Department department) throws SQLException{
    	Statement stat=null;
    	Connection conn=JdbcUtils.getConnection();
    	stat=conn.createStatement();
    	int department_id=department.getDepartment_id();
    	String department_name=department.getDepartment_name();
    	boolean bool=false;
    	String url="update tbl_department set department_name='"+department_name+"' where department_id='"+department_id+"'";
    	if(findDepart(department_id)!=null){
    		stat.executeUpdate(url);
    		bool= true;
    	}  	
    	stat.close();
    	conn.close();
    	return bool;
    }
    
   public static ArrayList<Department> getAll() throws SQLException{
	    Statement stat=null;
   		Connection conn=JdbcUtils.getConnection();
   		stat=conn.createStatement();
   		ArrayList<Department> arr=new ArrayList<Department>();
   		String url="select * from tbl_department";
   		ResultSet result = stat.executeQuery(url);
   		if(result!=null){
   			while(result.next()){
   				int department_id=result.getInt(1);
   				String department_name=result.getString(2);
   				Department department=new Department(department_id, department_name);
   				arr.add(department);
   			}
   		}
   		result.close();
   		return arr;
   }
  
}
