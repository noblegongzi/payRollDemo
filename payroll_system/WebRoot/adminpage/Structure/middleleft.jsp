<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<script src="../../js/jquery.min.js" tppabs=""></script>
		<link rel=stylesheet type=text/css href="../../css/lrtk.css">
		
		
		
	</head>
	<body bgcolor="beige">
	<div id="firstpane" class="menu_list">
	<center><h4>基础信息管理</h4></center>
    <p class="menu_head">部门信息管理</p>
    <div style="display:none" class=menu_body >
      <a target="adminpagemiddlerightFrame" href="../BasicinformationManagement/Departmentalinformationmanagement/creatDepartment.jsp">创建</a>
      <a target="adminpagemiddlerightFrame" href="../BasicinformationManagement/Departmentalinformationmanagement/changeDepartment.jsp">修改</a>
      <a target="adminpagemiddlerightFrame" href="../BasicinformationManagement/Departmentalinformationmanagement/deleteDepartment.jsp">删除</a>
      <a target="adminpagemiddlerightFrame" href="../BasicinformationManagement/Departmentalinformationmanagement/searchDepartment.jsp">查询</a>
    </div>
    <p class="menu_head">岗位信息管理</p>
    <div style="display:none" class=menu_body >
      <a target="adminpagemiddlerightFrame" href="../BasicinformationManagement/PostInformationmanagement/creatPost.jsp">创建</a>
      <a target="adminpagemiddlerightFrame" href="../BasicinformationManagement/PostInformationmanagement/changePost.jsp">修改</a>
      <a target="adminpagemiddlerightFrame" href="../BasicinformationManagement/PostInformationmanagement/deletePost.jsp">删除</a>
      <a target="adminpagemiddlerightFrame" href="../BasicinformationManagement/PostInformationmanagement/searchPost.jsp">查询</a>
    </div>
    <p class="menu_head">员工信息管理</p>
    <div style="display:none" class=menu_body >
      <a target="adminpagemiddlerightFrame" href="../BasicinformationManagement/Employeeinformationmanagement/creatEmployee.jsp">创建</a>
      <a target="adminpagemiddlerightFrame" href="../BasicinformationManagement/Employeeinformationmanagement/changeEmployee.jsp">修改</a>
	  <a target="adminpagemiddlerightFrame" href="../BasicinformationManagement/Employeeinformationmanagement/deleteEmployee.jsp">删除</a>
 	  <a target="adminpagemiddlerightFrame" href="../BasicinformationManagement/Employeeinformationmanagement/searchEmployee.jsp">查询</a>				
    </div>
    <center><h4>工资管理</h4></center>
    <p class="menu_head">工资项目管理</p>
    <div style="display:none" class=menu_body >
		
		<a target="adminpagemiddlerightFrame" href="../PayrollManagement/SalaryItemsmanagement/SetEfficient.jsp">设定公式</a>			
    </div>
    <p class="menu_head">固定工资管理</p>
    <div style="display:none" class=menu_body >
     
	  <a target="adminpagemiddlerightFrame" href="../PayrollManagement/FixedwageManagement/searchFixedwage.jsp">查询</a>		
    </div>
    <p class="menu_head">导入信息管理</p>
    <div style="display:none" class=menu_body >
     
	  <a target="adminpagemiddlerightFrame" href="../PayrollManagement/ImportInformationmanagement/searchImportInformation.jsp">查询  </a>		
    </div>
    <p class="menu_head">工资结算</p>
    <div style="display:none" class=menu_body >
      <a target="adminpagemiddlerightFrame" href="../PayrollManagement/Payrollsettlement/calculatePayroll.jsp">计算工资</a>
	 
    </div>
    <center><h4>报表管理</h4></center>
    <p class="menu_head">工资报表</p>
    <div style="display:none" class=menu_body >
    
	<a href="../ReportManagement/printPayrollinvoice.jsp" target="adminpagemiddlerightFrame" class="actionlink">打印工资条</a>
	<a href="../ReportManagement/Payrollcoutreport.jsp" target="adminpagemiddlerightFrame" class="actionlink">工资统计报表</a>
	</div>
</div>
<script type=text/javascript>
$(document).ready(function(){
	$("#firstpane p.menu_head").click(function(){
		$(this).addClass("current").next("div.menu_body").slideToggle(300).siblings("div.menu_body").slideUp("slow");
		$(this).siblings().removeClass("current");
	});
	$("#secondpane .menu_body:eq(0)").show();
	$("#secondpane p.menu_head").mouseover(function(){
		$(this).addClass("current").next("div.menu_body").slideDown(500).siblings("div.menu_body").slideUp("slow");
		$(this).siblings().removeClass("current");
	});
	
});
</script>
	</body>

</html>
