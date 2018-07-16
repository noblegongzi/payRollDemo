<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="../../css/input.css"/>
		<script type="text/javascript" src="../../js/jquery.min.js" ></script>
		<script type="text/javascript" src="../../js/input.js"></script>
	</head>
	<body bgcolor="beige">
		<br />
		<br />
		<br />
		<br />

		<form action="../../login.jsp" method="post" target="_top" class="border_radius" id="focus">
		<h2 align=center>注册工资管理系统</h2>
			<label><span>请输入你的员工编号</span><input type="text" class="input_txt border_radius" name="username" id="username" /></label>
			<label><span>密码</span><input type="password" class="input_txt border_radius" name="password" id="password" /></label>
			<label><span>确认密码</span><input type="password" class="input_txt border_radius" name="passwordok" id="passwordok" /></label>
			
			<input type="submit" name="submit" id="submit" value="注册" class="buttons" style="position: relative; left: 216px;" />
		</form>
		<br />
		<br />
		<br />
		<br />
	</body>
</html>
