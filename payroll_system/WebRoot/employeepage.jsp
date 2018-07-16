<%@page import="com.software.pojo.Employee"%>
<%@page import="com.software.dao.EmployeeDB"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
//Object employee=request.getAttribute("session_employee");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>My JSP 'employeepage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    ${session_employee.employeeID }
    ${session_employee.employeeName } 
    ${session_employee.employeePW } <br>
    
  </body>
</html>
