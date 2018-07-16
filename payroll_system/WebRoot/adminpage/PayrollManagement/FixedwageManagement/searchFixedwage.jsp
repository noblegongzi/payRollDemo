<%@ page language="java" import="com.software.pojo.*" import="com.software.dao.*" import="java.util.*" pageEncoding="UTF-8"%>
<jsp:useBean id="StaticPayroll" scope="session" type="java.util.ArrayList"/>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="../../../css/table.css"/>
		<script type="text/javascript" src="../../../js/jquery.min.js"></script>
		<script type="text/javascript" src="../../../js/table.js" ></script>
	</head>
	<body style="background: url(../../../img/bgDemo.png); background-repeat: no-repeat;background-size: cover;">
		
		<center>
			<br /><br />
			<font size="5" color="cornflowerblue">固定工资信息如下：</font>
			<br /><br /><br />
			<table border="1" align="center">
				<tr>
					<th>员工编号</th>
					<th>员工名称</th>
					<th>部门名称</th>
					<th>岗位名称</th>
					<th>固定工资</th>
					<th>津贴</th>
					<th>修改</th>
				</tr>
				 <tbody id="taba">
  <%
  int length=StaticPayroll.size();
  for(int i=0;i<length;i++){
  	Employee aEmployee=(Employee)StaticPayroll.get(i);
   %>
   <tr>
   <td><%=aEmployee.getEmployeeID()%></td>
   <td><%=aEmployee.getEmployeeName()%></td>
   <td><%=aEmployee.getDepartmentName()%></td>
   <td><%=aEmployee.getStationName()%></td>
   <form action='../../../Servlet?method=updateStaticPayroll' method='post'>
   <td><input type='text' name='BasicSalary' value='<%=aEmployee.getBasicSalary()%>' /></td>
   <td><input type='text' name='HeatSubsidy' value='<%=aEmployee.getHeatSubsidy()%>' /></td>
   <td><input type='hidden' name='EmployeeID' value='<%=aEmployee.getEmployeeID()%>' /><input type='submit' value='修改' /></form></td>
   <%} %>
</tr>
<tr>
</tbody>	
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
