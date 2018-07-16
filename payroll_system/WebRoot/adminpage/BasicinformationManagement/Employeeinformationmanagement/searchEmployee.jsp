<%@ page language="java" import="com.software.pojo.*" import="com.software.dao.*" import="java.util.*" pageEncoding="UTF-8"%>
<jsp:useBean id="employee" scope="session" type="java.util.ArrayList"/>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" href="../../../css/table.css" />
		<script src="../../../js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="../../../js/table.js" type="text/javascript" charset="utf-8"></script>
		
	</head>
	<body style="background: url(../../../img/bgDemo.png); background-repeat: no-repeat;background-size: cover;">
		<center>
<h2><front size="5">查找结果</front></h2>
 <table border = "1">
  <thead>
  <tr>
  <th>员工编号</th>
  <th>员工名称</th>
  <th>员工密码</th>
  <th>部门编号</th>
  <th>岗位编号</th>
  <th>员工性别</th>
  <th>员工生日</th>
  <th>员工电话</th>
  <th>员工住址</th>
  <th>员工删除</th>
  <th>员工修改</th>
  </tr>
  </thead>
  <tbody id="tab">
  <%
  int length=employee.size();
  for(int i=0;i<length;i++){
  	Employee aEmployee=(Employee)employee.get(i);
   %>
   <tr>
   <td><%=aEmployee.getEmployeeID()%></td>
   <td><%=aEmployee.getEmployeeName()%></td>
   <td><%=aEmployee.getEmployeePW()%></td>
   <td><%=aEmployee.getDepartmentID()%></td>
   <td><%=aEmployee.getStationID()%></td>
   <td><%=aEmployee.getEmployeeSex()%></td>
   <td><%=aEmployee.getEmployeeBirthday()%></td>
   <td><%=aEmployee.getEmployeePhone()%></td>
   <td><%=aEmployee.getEmployeeAddress()%></td>
   <td><form action='../../../Servlet?method=employeedel' method='post'><input type='hidden' name='employeeID' value='<%=aEmployee.getEmployeeID()%>'/><input type='submit' value='删除' onclick='delcfm()' /></form></td>
   <td><form action='changeDepartment.jsp' method='post'><input type='hidden' name='Dchangeorder' value='"+(i+1)+"' /><input type='submit' value='修改' /></form></td>
   <%} %>
</tr>
<tr>
</tbody>
</tr>
</table>
<script type="text/javascript">
			var Ptr=document.getElementById("tab").getElementsByTagName("tr");
			window.onload=$;
			for(var i=0;i<Ptr.length;i++) {
			    Ptr[i].onmouseover=function(){
			    this.tmpClass=this.className;
			    this.className = "t3";
			    
			    };
			    Ptr[i].onmouseout=function(){
			    this.className=this.tmpClass;
			    };
			}
			</script>
</center>
	</body>
</html>