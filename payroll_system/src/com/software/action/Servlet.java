package com.software.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;

import com.software.dao.*;
import com.software.pojo.*;


public class Servlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Constructor of the object.
	 */
	public Servlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		String method = request.getParameter("method");
		if("login".equals(method)){
			try {
				doLogin(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if("register".equals(method)){
			try {
				doRegister(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if("departmentadd".equals(method)){
			try {
				doAddDepartment(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if("departmentdel".equals(method)){
			try {
				doDelDepartment(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if("departmentupdate".equals(method)){
			try {
				doUpdateDepartment(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if("stationadd".equals(method)){
			try {
				doAddStation(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if("stationdel".equals(method)){
			try {
				doDelStation(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if("stationupdate".equals(method)){
			try {
				doUpdateStation(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if("employeeadd".equals(method)){
			try {
				doAddEmployee(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if("employeedel".equals(method)){
			try {
				doDelEmployee(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if("employeeupdate".equals(method)){
			try {
				doUpdateEmployee(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if("efficientupdate".equals(method)){
			try {
				doUpdateEfficient(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if("updateStaticPayroll".equals(method)){
			try {
				doUpdateStaticPayroll(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else if("updateDay".equals(method)){
			try {
				doUpdateDay(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
private void doUpdateEfficient(HttpServletRequest request,HttpServletResponse response) throws IOException, SQLException, ServletException{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		
		//Double.parseDouble((request.getParameter("efficient1")))
		Efficient aEfficient=new Efficient();
		aEfficient.setTaxRate(Double.parseDouble((request.getParameter("efficient0"))));
		aEfficient.setPensionRateByC(Double.parseDouble((request.getParameter("efficient1"))));
		aEfficient.setPensionRateByE(Double.parseDouble((request.getParameter("efficient2"))));
		aEfficient.setMedicRateByC(Double.parseDouble((request.getParameter("efficient3"))));
		aEfficient.setMedicRateByE(Double.parseDouble((request.getParameter("efficient4"))));
		aEfficient.setUnempRateByC(Double.parseDouble((request.getParameter("efficient5"))));
		aEfficient.setUnempRateByE(Double.parseDouble((request.getParameter("efficient6"))));
		aEfficient.setInjuryRateByC(Double.parseDouble((request.getParameter("efficient7"))));
		aEfficient.setFertiRateByC(Double.parseDouble((request.getParameter("efficient8"))));
		aEfficient.setProFundRateByC(Double.parseDouble((request.getParameter("efficient9"))));
		aEfficient.setProFundRateByE(Double.parseDouble((request.getParameter("efficient10"))));
		
		aEfficient.setMoneyofSick(Double.parseDouble((request.getParameter("efficient11"))));
		aEfficient.setMoneyofBusy(Double.parseDouble((request.getParameter("efficient12"))));
		aEfficient.setMoneyofLate(Double.parseDouble((request.getParameter("efficient13"))));
		aEfficient.setMoneyofOvertime(Double.parseDouble((request.getParameter("efficient14"))));
		
		
		
		EfficientDB.updateEfficient(aEfficient);
		out.print("<script language='javascript'>alert('更新系数成功');top.location.href='adminpage.jsp';</script>");
	
	
		

	}
	private void doAddEmployee(HttpServletRequest request,
			HttpServletResponse response) throws IOException, SQLException {
		// TODO Auto-generated method stub
		 int employeeID = Integer.parseInt(request.getParameter("employeeID"));
         String employeeName =request.getParameter("employeeName");
         String employeePW = request.getParameter("employeePW");                
         String employeeSex=request.getParameter("employeeSex");
         String employeeBirthday=request.getParameter("employeeBirthday");
         int employeePhone=Integer.parseInt(request.getParameter("employeePhone"));
         String employeeAddress=request.getParameter("employeeAddress");

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		 Employee employee=new Employee();
         employee.setEmployeeID(employeeID);
         employee.setEmployeeName(employeeName);
         employee.setEmployeePW(employeePW);
         if(request.getParameter("departmentID")!="")
         {
        	 int departmentID=Integer.parseInt(request.getParameter("departmentID"));
        	 employee.setDepartmentID(departmentID);
         }
         else{
        	 employee.setDepartmentID(0);
         }
         if(request.getParameter("stationID")!="")
         {
        	 int stationID=Integer.parseInt(request.getParameter("stationID"));
        	 employee.setStationID(stationID);
         }
         else{
        	 employee.setStationID(0);
         }             
         employee.setEmployeeSex(employeeSex);
         employee.setEmployeeBirthday(employeeBirthday);
         employee.setEmployeePhone(employeePhone);
         employee.setEmployeeAddress(employeeAddress);		
		boolean bool=EmployeeDB.addEmployee(employee);
		if(bool==true){
			out.print("<script language='javascript'>alert('新增员工成功');top.location.href='adminpage.jsp';</script>");
		}
		else{
			out.print("<script language='javascript'>alert('员工已存在');top.location.href='adminpage.jsp';</script>");
		}
	}
	
	private void doDelEmployee(HttpServletRequest request,HttpServletResponse response) throws IOException, SQLException{
		int employeeID=Integer.parseInt(request.getParameter("employeeID"));
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		Employee employee=EmployeeDB.findEmployee(employeeID);
		if(employee!=null){
			EmployeeDB.delEmployee(employee);
			out.print("<script language='javascript'>alert('删除成功');</script>");
		}
		else{
			out.print("<script language='javascript'>alert('该员工不存在');</script>");
		}
	}
	private void doUpdateEmployee(HttpServletRequest request,HttpServletResponse response) throws IOException, SQLException{
		int employeeID=Integer.parseInt(request.getParameter("employeeID"));
		String employeeName =request.getParameter("employeeName");
        String employeePW = request.getParameter("employeePW");                
        String employeeSex=request.getParameter("employeeSex");
        String employeeBirthday=request.getParameter("employeeBirthday");
        int employeePhone=Integer.parseInt(request.getParameter("employeePhone"));
        String employeeAddress=request.getParameter("employeeAddress");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		 Employee employee=new Employee();
		 employee.setEmployeeID(employeeID);
         employee.setEmployeeName(employeeName);
         employee.setEmployeePW(employeePW);
         if(request.getParameter("departmentID")!="")
         {
        	 int departmentID=Integer.parseInt(request.getParameter("departmentID"));
        	 employee.setDepartmentID(departmentID);
         }
         else{
        	 employee.setDepartmentID(0);
         }
         if(request.getParameter("stationID")!="")
         {
        	 int stationID=Integer.parseInt(request.getParameter("stationID"));
        	 employee.setStationID(stationID);
         }
         else{
        	 employee.setStationID(0);
         }             
         employee.setEmployeeSex(employeeSex);
         employee.setEmployeeBirthday(employeeBirthday);
         employee.setEmployeePhone(employeePhone);
         employee.setEmployeeAddress(employeeAddress);		
         Employee aEmployee=EmployeeDB.findEmployee(employeeID);
		if(aEmployee!=null){
			EmployeeDB.updateEmployee(employee);
			out.print("<script language='javascript'>alert('更新员工成功');top.location.href='adminpage.jsp';</script>");
		}
		else{
			out.print("<script language='javascript'>alert('更新员工失败');<top.location.href='adminpage.jsp';/script>");
		}
		
	}
	private void doAddStation(HttpServletRequest request,
			HttpServletResponse response) throws IOException, SQLException {
		// TODO Auto-generated method stub
		int stationID=Integer.parseInt(request.getParameter("stationID"));
		String stationName=request.getParameter("stationName");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		Station station=new Station();
		
		station.setStationID(stationID);
		station.setStationName(stationName);
		
		boolean bool=StationDB.addStation(station);
		if(bool==true){
			out.print("<script language='javascript'>alert('新建岗位成功');top.location.href='adminpage.jsp';</script>");
		}
		else{
			out.print("<script language='javascript'>alert('创建岗位失败');top.location.href='adminpage.jsp';</script>");
		}
	}
	private void doDelStation(HttpServletRequest request,HttpServletResponse response) throws IOException, SQLException{
		int stationID=Integer.parseInt(request.getParameter("stationID"));
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		Station station=StationDB.findStation(stationID);
		if(station!=null){
			StationDB.delStation(station);
			out.print("<script language='javascript'>alert('删除成功');top.location.href='adminpage.jsp';</script>");
		}
		else{
			out.print("<script language='javascript'>alert('该部门不存在');top.location.href='adminpage.jsp';</script>");
		}
	}
	private void doUpdateStation(HttpServletRequest request,HttpServletResponse response) throws IOException, SQLException{
		int stationID=Integer.parseInt(request.getParameter("stationID"));
		String stationName=request.getParameter("stationName");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		Station station=new Station();
		station.setStationID(stationID);
		station.setStationName(stationName);
		Station astation=StationDB.findStation(stationID);
		if(astation!=null){
			StationDB.updateStation(station);
			out.print("<script language='javascript'>alert('更新岗位成功');top.location.href='adminpage.jsp';</script>");
		}
		else{
			out.print("<script language='javascript'>alert('更新岗位失败');top.location.href='adminpage.jsp';</script>");
		}
		
	}
	private void doUpdateDepartment(HttpServletRequest request,HttpServletResponse response) throws IOException, SQLException{
		int departID=Integer.parseInt(request.getParameter("departID"));
		String departName=request.getParameter("departName");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		Department department=new Department(departID, departName);
		boolean bool=DepartmentDB.updateDepart(department);
		if(bool==true){
			out.print("<script language='javascript'>alert('更新部门成功');top.location.href='adminpage.jsp';</script>");
		}
		else{
			out.print("<script language='javascript'>alert('更新部门失败');top.location.href='adminpage.jsp';</script>");
		}
		
	}
	private void doDelDepartment(HttpServletRequest request,HttpServletResponse response) throws IOException, SQLException{
		int departID=Integer.parseInt(request.getParameter("departID"));
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		Department department=DepartmentDB.findDepart(departID);
		if(department!=null){
			boolean bool=DepartmentDB.delDepart(department);
			if(bool==true){
				out.print("<script language='javascript'>alert('删除成功');top.location.href='adminpage.jsp';</script>");
			}
			else{
				out.print("<script language='javascript'>alert('删除失败');top.location.href='adminpage.jsp';</script>");
			}
			
		}
		else{
			out.print("<script language='javascript'>alert('该部门不存在');top.location.href='adminpage.jsp';</script>");
		}
	}
	
	private void doAddDepartment(HttpServletRequest request,
			HttpServletResponse response) throws IOException, SQLException, ServletException {
		// TODO Auto-generated method stub
		int departID=Integer.parseInt(request.getParameter("departID"));
		String departName=request.getParameter("departName");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		Department department=new Department(departID, departName);
		boolean bool=DepartmentDB.addDepart(department);
		
		if(bool==true){
			out.print("<script language='javascript'>alert('新建部门成功');top.location.href='adminpage.jsp';</script>");
			
		}
		else{
			out.print("<script language='javascript'>alert('创建部门失败');top.location.href='adminpage.jsp';</script>");
		}
		
	}

	public void doLogin(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException, SQLException{
		int userID=Integer.parseInt(request.getParameter("userID"));
		String password=request.getParameter("password");
		String usertype=request.getParameter("usertype");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		if("administrator".equals(usertype)){
			
			
		boolean bool=false;
			try {
				bool=AdminDB.findAdmin(userID, password);
			} catch (SQLException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String url = "";
			if(bool==true){
				url="adminpage.jsp";
				
				ArrayList<Department> depart=new ArrayList<Department>();
				depart=DepartmentDB.getAll();
				request.getSession().setAttribute("depart", depart);
				
				ArrayList<Station> station=new ArrayList<Station>();
				station=StationDB.getAll();
				request.getSession().setAttribute("station", station);
				
				ArrayList<Employee> employee=new ArrayList<Employee>();
				employee=EmployeeDB.getAll();
				request.getSession().setAttribute("employee", employee);
				
				Efficient aEfficient=EfficientDB.getAll();
				request.getSession().setAttribute("efficient",aEfficient);
				
				ArrayList<Employee> staticPayroll=new ArrayList<Employee>();
				staticPayroll=EmployeeDB.getStaticPayroll();
				request.getSession().setAttribute("StaticPayroll", staticPayroll);
				
				ArrayList<Day> Days=new ArrayList<Day>();
				Days=DayDB.getAll();
				request.getSession().setAttribute("Days",Days);
				
				
				request.getRequestDispatcher(url).forward(request, response);
				
			}
			else{
				out.print("<script language='javascript'>alert('登录失败，用户名或密码错误！');top.location.href='login.jsp';</script>");
			}
			
			
		}
		else{
			Employee employee=new Employee();
			employee.setEmployeeID(userID);
			employee.setEmployeePW(password);
			
			boolean bool=false;
			try {
				bool=EmployeeDB.isExisted(employee.getEmployeeID(), employee.getEmployeePW());
			} catch (SQLException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String url = "";
			if(bool==true){
				url="employeepage.jsp";
				request.getSession().setAttribute("session_employee", EmployeeDB.findEmployee(userID));
				request.getRequestDispatcher(url).forward(request, response);
			}
			else{
				
				out.print("<script language='javascript'>alert('登录失败，用户名或密码错误！');top.location.href='login.jsp';</script>");
			}
			
		}
	}
	
	public void doRegister(HttpServletRequest request,HttpServletResponse response) throws SQLException, ServletException, IOException{
		int employeeID=Integer.parseInt(request.getParameter("username"));
		String employeePW=request.getParameter("password");
		String employeePWok=request.getParameter("passwordok");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		if(employeePW.equals(employeePWok)){
			Employee employee=new Employee();
			employee.setEmployeeID(employeeID);
			employee.setEmployeePW(employeePW);

			boolean bool=false;
			
			try{
				bool=EmployeeDB.addEmployee(employee);
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			String url="";
			if(bool==true){
				url="login.jsp";
				request.getRequestDispatcher(url).forward(request, response);
			}
			else{
				out.print("<script language='javascript'>alert('已注册');top.location.href='register.jsp';</script>");
			}
		}
		else{
			out.print("<script language='javascript'>alert('注册失败');top.location.href='register.jsp';</script>");
		}
	}
	private void doUpdateStaticPayroll(HttpServletRequest request,HttpServletResponse response) throws IOException, SQLException{
		
		Employee aEmployee=new Employee();
		aEmployee.setBasicSalary(Integer.parseInt(request.getParameter("BasicSalary")));
		aEmployee.setHeatSubsidy(Integer.parseInt(request.getParameter("HeatSubsidy")));
		aEmployee.setEmployeeID(Integer.parseInt(request.getParameter("EmployeeID")));
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		
		
		boolean bool=EmployeeDB.updateStaticPayroll(aEmployee);
		if(bool==true){
			out.print("<script language='javascript'>alert('更新固定工资成功');top.location.href='adminpage.jsp';</script>");
		}
		else{
			out.print("<script language='javascript'>alert('更新固定工资失败');top.location.href='adminpage.jsp';</script>");
		}
		
	}
	
	private void doUpdateDay(HttpServletRequest request,HttpServletResponse response) throws IOException, SQLException{
		
		Day aDay=new Day();
		aDay.setEmployeeID(Integer.parseInt(request.getParameter("EmployeeID")));
		aDay.setSickDays(Integer.parseInt(request.getParameter("SickDay")));
		aDay.setBusyDays(Integer.parseInt(request.getParameter("BusyDay")));
		aDay.setLateDays(Integer.parseInt(request.getParameter("LateDay")));
		aDay.setOvertimeDays(Integer.parseInt(request.getParameter("OvertimeDay")));
		
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		
		
		boolean bool=DayDB.updateDay(aDay);
		if(bool==true){
			out.print("<script language='javascript'>alert('更新固定工资成功');top.location.href='adminpage.jsp';</script>");
		}
		else{
			out.print("<script language='javascript'>alert('更新固定工资失败');top.location.href='adminpage.jsp';</script>");
		}
		
	}
	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
