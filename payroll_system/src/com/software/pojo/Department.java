package com.software.pojo;

import java.util.*;
public class Department {
    private int department_id;
    private String department_name;
    private ArrayList<Employee> employeeList;

    /** 
	 * constructor 
	 * @param departID department's id
	 * @param departName department's name
	 */
    public Department(int department_id, String department_name) {
        this.department_id = department_id;
        this.setDepartment_name(department_name);
        this.employeeList = new ArrayList<Employee>();
    }

    /**
	 * @return the department's ID
	 */
	

	/**
	 * @return the departName
	 */
	

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	/**
	 * @param departName the departName to set
	 */
	

	/**
	 * @return the employee list
	 */
	public ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	/**
	 * add the employee to the list
	 * @param e the employee to add
	 */
 
}