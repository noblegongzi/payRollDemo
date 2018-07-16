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
		<form action="../../../Servlet?method=employeedel" method="post" target="_top" class="border_radius" id="focus">
			<h2>删除员工</h2>
				<label><span>请输入需要删除的员工编号</span><input type="text" class="input_txt border_radius" name="employeeID" id="employeeID" /></label>
				
				<input type="submit" name="submit" id="submit" value="删除" class="buttons" />
		</form>
	</body>
</html>