package com.software.dao;

import java.util.*;
import java.sql.*;

import com.software.db.JdbcUtils;
import com.software.pojo.Department;
import com.software.pojo.Employee;
import com.software.pojo.Day;
public class EmployeeDB {
 

   
    /**
     * tbl_employee(employee_id,employee_name,employee_pwd,department_id,station_id,employee_sex,employee_birthday,employee_phone,employee_adress)
     * find whether there exists this admin then login
     * @param username the username from input
     * @param password the password from input
     * @return result whether we find the admin
     */
    public static boolean isExisted(int employeeID,String password) 
        throws SQLException {
    	Statement stat=null;
    	Connection conn=JdbcUtils.getConnection();
    	stat=conn.createStatement();
        String sql = "select * from tbl_employee where employee_id = '" 
            + employeeID + "' and employee_pwd='"+password+"'";
        ResultSet rs = stat.executeQuery(sql);
        boolean result = rs.next();
        rs.close();
        return result;
    }

    /**
     * find whether there exists this admin
     * @param username the username from input
     * @return result whether we find the admin
     * @throws SQLException 
     */
    public static Employee findEmployee(int EmployeeID) throws SQLException{
    	Statement stat=null;
    	Connection conn=JdbcUtils.getConnection();
    	stat=conn.createStatement();
    	String sql = "select * from tbl_employee where employee_id = '" 
            + EmployeeID + "'";
        ResultSet rs = stat.executeQuery(sql);
        boolean result = rs.next();
        if (result) {
            int employeeID = rs.getInt(1);
            String employeeName = rs.getString(2);
            String employeePW=rs.getString(3);
            int departmentID=rs.getInt(4);
            int stationID=rs.getInt(5);
            String employeeSex=rs.getString(6);
            String employeeBirthday=rs.getString(7);
            int employeePhone=rs.getInt(8);
            String employeeAddress=rs.getString(9);
            Employee employee=new Employee();
            employee.setEmployeeID(employeeID);
            employee.setEmployeeName(employeeName);
            employee.setEmployeePW(employeePW);
            employee.setDepartmentID(departmentID);
            employee.setStationID(stationID);
            employee.setEmployeeSex(employeeSex);
            employee.setEmployeeBirthday(employeeBirthday);
            employee.setEmployeePhone(employeePhone);
            employee.setEmployeeAddress(employeeAddress);
            rs.close();
            return employee;
        }
        else {
            System.out.println("不存在该员工！");
            return null;
        }
    }

    /**
     * add a new employee to table
     * @param newEmployee the employee to be added
     */
    public static boolean addEmployee(Employee newEmployee) throws SQLException {
        // get infomation about new employee
    	Statement stat=null;
    	Connection conn=JdbcUtils.getConnection();
    	stat=conn.createStatement();
        int employeeID = newEmployee.getEmployeeID();
        String employeeName = newEmployee.getEmployeeName();
        String employeePW = newEmployee.getEmployeePW();
        int departmentID=newEmployee.getDepartmentID();
        int stationID=newEmployee.getStationID();
        String employeeSex=newEmployee.getEmployeeSex();
        String employeeBirthday=newEmployee.getEmployeeBirthday();
        int employeePhone=newEmployee.getEmployeePhone();
        String employeeAddress=newEmployee.getEmployeeAddress();
        boolean bool=false;
        String sql = "insert into tbl_employee (employee_id, employee_name, " 
            + "employee_pwd, department_id, station_id, employee_sex,employee_birthday,employee_phone,employee_address) " 
            + "values ('" + employeeID + "','" + employeeName + "','" 
            + employeePW + "','" + departmentID + "','" + stationID + "','"
            + employeeSex + "','"+employeeBirthday+"','"+employeePhone+"','"+employeeAddress+"')";
        if (findEmployee(employeeID)==null) {
        	bool=true;
            stat.executeUpdate(sql);
        }
        else {
            System.out.println("This employee exists!!!");
        }
       
        conn.close();
        stat.close();
        return bool;
    }

    /**
     * delete an employee to table
     * @param oldEmployee the employee to be deleted
     */
    public static void delEmployee(Employee oldEmployee) throws SQLException {
    	Statement stat=null;
    	Connection conn=JdbcUtils.getConnection();
    	stat=conn.createStatement();
        int employeeID = oldEmployee.getEmployeeID();
        String employeePW=oldEmployee.getEmployeePW();
        String sql = "delete from tbl_employee where employee_id = '" 
            + employeeID + "'";
        if(findEmployee(employeeID)!=null){
            stat.executeUpdate(sql);
        }
        else {
            System.out.println("This employee doesn't exist!!!");
        }
        conn.close();stat.close();
    }

    /**
     * update an employee's information
     * @param employee the employee to be updated
     */
    public static void updateEmployee(Employee employee) throws SQLException {
        // get infomation about new employee
    	Statement stat=null;
    	Connection conn=JdbcUtils.getConnection();
    	stat=conn.createStatement();
    	 int employeeID = employee.getEmployeeID();
         String employeeName = employee.getEmployeeName();
         String employeePW = employee.getEmployeePW();
         int departmentID=employee.getDepartmentID();
         int stationID=employee.getStationID();
         String employeeSex=employee.getEmployeeSex();
         String employeeBirthday=employee.getEmployeeBirthday();
         int employeePhone=employee.getEmployeePhone();
         String employeeAddress=employee.getEmployeeAddress();
       
        String sql = "update tbl_employee set employee_name = '" + employeeName + "', employee_pwd = '" 
            + employeePW + "', department_id = '" + departmentID 
            + "', station_id = '" + stationID + "', employee_sex = '" 
            + employeeSex + "', employee_birthday='"+employeeBirthday+"',employee_phone='"+employeePhone+"', employee_address='"+employeeAddress+"' where employee_id = '" + employeeID 
            + "'";
        if (findEmployee(employeeID)!=null) {
            stat.executeUpdate(sql);
        }
        else {
            System.out.println("This employee doesn't exist!!!");
        }
        conn.close();stat.close();
    }
    
    public static ArrayList<Employee> getAll() throws SQLException{
	    Statement stat=null;
   		Connection conn=JdbcUtils.getConnection();
   		stat=conn.createStatement();
   		ArrayList<Employee> arr=new ArrayList<Employee>();
   		String url="select * from tbl_employee";
   		ResultSet rs = stat.executeQuery(url);
   		if(rs!=null){
   			while(rs.next()){
   				int employeeID = rs.getInt(1);
   	            String employeeName = rs.getString(2);
   	            String employeePW=rs.getString(3);
   	            int departmentID=rs.getInt(4);
   	            int stationID=rs.getInt(5);
   	            String employeeSex=rs.getString(6);
   	            String employeeBirthday=rs.getString(7);
   	            int employeePhone=rs.getInt(8);
   	            String employeeAddress=rs.getString(9);
   	            Employee employee=new Employee();
   	            employee.setEmployeeID(employeeID);
   	            employee.setEmployeeName(employeeName);
   	            employee.setEmployeePW(employeePW);
   	            employee.setDepartmentID(departmentID);
   	            employee.setStationID(stationID);
   	            employee.setEmployeeSex(employeeSex);
   	            employee.setEmployeeBirthday(employeeBirthday);
   	            employee.setEmployeePhone(employeePhone);
   	            employee.setEmployeeAddress(employeeAddress);
   				arr.add(employee);
   			}
   		}
   		rs.close();
   		return arr;
   }
    public static ArrayList<Employee> getStaticPayroll() throws SQLException{
	    Statement stat=null;
   		Connection conn=JdbcUtils.getConnection();
   		stat=conn.createStatement();
   		ArrayList<Employee> arr=new ArrayList<Employee>();
   		String url="select * from view_static_payroll";
   		ResultSet rs = stat.executeQuery(url);
   		Employee employee=new Employee();
   		if(rs!=null){
   				while(rs.next()){
   			
   				employee.setEmployeeID(rs.getInt(1));
   				employee.setEmployeeName(rs.getString(2));
   				employee.setDepartmentName(rs.getString(3));
   				employee.setStationName(rs.getString(4));
   				employee.setBasicSalary(rs.getInt(5));
   				employee.setHeatSubsidy(rs.getInt(6));
   				arr.add(employee);
   				}
   			}
   		return arr;
    }
    
    public static boolean  updateStaticPayroll(Employee aEmployee) throws SQLException
    {
    	Statement stat=null;
    	Connection conn=JdbcUtils.getConnection();
    	stat=conn.createStatement();
    	String sql="update tbl_payroll set basicSalary='"+aEmployee.getBasicSalary()+"',heatSubsidy='"+aEmployee.getHeatSubsidy()+ "' where employee_id='"+aEmployee.getEmployeeID()+"'";
    	
    	try{
    		stat.executeUpdate(sql);
    		return true;
    	}
    	
    	catch(SQLException e)
    	{
    		e.printStackTrace();
    		return false;
    	}
    	
    }
    
}