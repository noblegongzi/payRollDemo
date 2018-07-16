<%@ page language="java" import="com.software.pojo.*" import="com.software.dao.*" import="java.util.*" pageEncoding="UTF-8"%>
<jsp:useBean id="Days" scope="session" type="java.util.ArrayList"/>
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
			<font size="5" color="cornflowerblue">导入信息如下：</font>
			<br /><br /><br />
			<table border="1" align="center">
				<tr>
					<th>编号</th>
					<th>姓名</th>
					<th>病假天数</th>
					<th>事假天数</th>
					<th>迟到次数</th>
					<th>加班天数</th>
					<th>修改</th>
				</tr>
				 <tbody id="taba">
  <%
  int length=Days.size();
  for(int i=0;i<length;i++){
  	Day aDay=(Day)Days.get(i);
   %>
   <tr>
   <td><%=aDay.getEmployeeID()%></td>
   <td><%=aDay.getEmployeeName()%></td>
   <form action='../../../Servlet?method=updateDay' method='post'>
   <td><input type='text' name='SickDay' value='<%=aDay.getSickDays()%>' /></td>
   <td><input type='text' name='BusyDay' value='<%=aDay.getBusyDays()%>' /></td>
   <td><input type='text' name='LateDay' value='<%=aDay.getLateDays()%>' /></td>
   <td><input type='text' name='OvertimeDay' value='<%=aDay.getOvertimeDays()%>' /></td>
 
  
   <td><input type='hidden' name='EmployeeID' value='<%=aDay.getEmployeeID()%>' /><input type='submit' value='修改' /></form></td>
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
