<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="../../../css/input.css"/>
		<script type="text/javascript" src="../../../js/jquery.min.js" ></script>
		<script type="text/javascript" src="../../../js/input.js"></script>
	</head>
	<body style="background: url(../../../img/bgDemo.png); background-repeat: no-repeat;background-size: cover;">

			<br /><br />
		<form action="../../../Servlet?method=employeeupdate" method="post" target="_top" class="border_radius" id="focus">
			<h2 align=center>修改员工</h2>
				<label><span>请输入原员工编号</span><input type="text" class="input_txt border_radius" name="employeeID"></label>
				<label><span>请输入修改员工名称</span><input type="text" class="input_txt border_radius" name="employeeName"></label>
				<label><span>请输入修改员工密码</span><input type="text" class="input_txt border_radius" name="employeePW"></label>
				<label><span>请输入修改所属部门</span><input type="text" class="input_txt border_radius" name="departmentID"></label>
				<label><span>请输入修改所属岗位</span><input type="text" class="input_txt border_radius" name="stationID"></label>
				<label style="width: 294px; ">请输入修改员工性别
								<input type="radio" name="employeeSex" value="男" checked="checked"/>男
								<input type="radio" name="employeeSex" value="女" />女
				</label>
			
				<label><span>请输入修改员工生日</span><input type="text" class="input_txt border_radius" name="employeeBirthday"></label>
				<label><span>请输入修改员工电话</span><input type="text" class="input_txt border_radius" name="employeePhone"></label>
				<label><span>请输入修改员工住址</span><input type="text" class="input_txt border_radius" name="employeeAddress"></label>
				
				<input type="submit" name="submit" id="submit" value="修改" class="buttons" />
			
			
		</form>

	</body>
</html>