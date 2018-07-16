<%@ page language="java" import="com.software.pojo.*" import="com.software.dao.*" import="java.util.*" pageEncoding="UTF-8"%>
<jsp:useBean id="station" scope="session" type="java.util.ArrayList"/>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="../../../css/table.css" />
		<script src="../../../js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="../../../js/table.js" type="text/javascript" charset="utf-8"></script>
		
		<title></title>
	</head>
	
	<body style="background: url(../../../img/bgDemo.png); background-repeat: no-repeat;background-size: cover;">

		<center>
<h2><front size="5">查找结果</front></h2>
 <table width="590"border = "1" align=center>
  <thead align=left>
  <tr>
  <td width="200">岗位编号</td>
  <td width="200">岗位名称</td>
  <td width="100">删除岗位</td>
  <td width="100">修改岗位</td>
  </tr>
  </thead>
  <tbody id="tab">
  
  <%
  int length=station.size();
  for(int i=0;i<length;i++){
  	Station aStation=(Station)station.get(i);
   %>
   <tr>
   <td><%=aStation.getStationID()%></td>
   <td><%=aStation.getStationName()%></td>
   <td><form action='../../../Servlet?method=stationdel' method='post'><input type='hidden' name='stationID' value='<%=aStation.getStationID()%>'/><input type='submit' value='删除' onclick='delcfm()' /></form></td>
   <td><form action='changePost.jsp' method='post'><input type='hidden' name='Dchangeorder' value='"+(i+1)+"' /><input type='submit' value='修改' /></form></td>
   <%} %>
   
</tr>
</tbody>

<tr>

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
