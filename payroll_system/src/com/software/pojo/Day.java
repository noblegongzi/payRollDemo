package com.software.pojo;

public class Day {
	
    private int employeeID;
	private String employeeName;

	private int sickDays;
    private int busyDays;
    private int lateDays;
    private int overtimeDays;
    
   
    
    public Day(int employeeID){
    	this.employeeID=employeeID;
    	this.setSickDays(0);
    	this.setBusyDays(0);
    	this.setLateDays(0);
    	this.setOvertimeDays(0);
    	
    	
    }
    
    public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Day() {
		// TODO Auto-generated constructor stub
	}

	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
    

	public int getSickDays() {
		return sickDays;
	}
	public void setSickDays(int sickDays) {
		this.sickDays = sickDays;
	}
	public int getBusyDays() {
		return busyDays;
	}
	public void setBusyDays(int busyDays) {
		this.busyDays = busyDays;
	}
	public int getLateDays() {
		return lateDays;
	}
	public void setLateDays(int lateDays) {
		this.lateDays = lateDays;
	}
	public int getOvertimeDays() {
		return overtimeDays;
	}
	public void setOvertimeDays(int overtimeDays) {
		this.overtimeDays = overtimeDays;
	}
}