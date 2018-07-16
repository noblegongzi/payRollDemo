package com.software.pojo;

import java.sql.SQLException;
import java.util.*;

import com.software.dao.DayDB;

public class Employee {
    private int employeeID;
    private String employeeName;
    private String employeePW;
    private int departmentID;
    private int stationID; 
    private String employeeSex;
    private String employeeBirthday;
    private int employeePhone;
    private String employeeAddress;
    
    private String departmentName;
	private String stationName;
    public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	private int basicSalary;
    private int heatSubsidy;
    
    
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeePW() {
		return employeePW;
	}
	public void setEmployeePW(String employeePW) {
		this.employeePW = employeePW;
	}
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	public int getStationID() {
		return stationID;
	}
	public void setStationID(int stationID) {
		this.stationID = stationID;
	}
	public String getEmployeeSex() {
		return employeeSex;
	}
	public void setEmployeeSex(String employeeSex) {
		this.employeeSex = employeeSex;
	}
	public String getEmployeeBirthday() {
		return employeeBirthday;
	}
	public void setEmployeeBirthday(String employeeBirthday) {
		this.employeeBirthday = employeeBirthday;
	}
	public int getEmployeePhone() {
		return employeePhone;
	}
	public void setEmployeePhone(int employeePhone) {
		this.employeePhone = employeePhone;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	public int getHeatSubsidy() {
		return heatSubsidy;
	}
	public void setHeatSubsidy(int heatSubsidy) {
		this.heatSubsidy = heatSubsidy;
	}

 
   
    
   

//	
//    public int getSalary() {   	
//        int income = this.basicSalary + this.extraSalary + this.heatSubsidy
//            + day.getOvertimeMoney();
//        int outcome_1 = day.getSickMoney() + day.getBusyMoney() 
//            + day.getLateMoney();
//        int outcome_2 = fee.getPensionByE(this.basicSalary) + fee.getMedicByE(this.basicSalary) 
//            + fee.getUnemployByE(this.basicSalary) + fee.getProFundByE(this.basicSalary);
//        return income - outcome_1 - outcome_2 - fee.getTaxMoney(this.basicSalary);
//    }

	
}