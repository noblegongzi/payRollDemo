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
		<center>
			<br /><br />
			<form action="../../../Servlet?method=departmentupdate" method="post" target="_top" class="border_radius" id="focus">
				<h2>创建部门</h2>
				<label><span>请输入原部门编号</span><input type="text" class="input_txt border_radius" name="departID" id="departID" /></label>
				<label><span>请输入需要修改的部门名称</span><input type="text" class="input_txt border_radius" name="departName" id="departName" /></label>
				<input type="submit" name="submit" id="submit" value="修改" class="buttons" />
			</form>
		</center>
	</body>
</html>
