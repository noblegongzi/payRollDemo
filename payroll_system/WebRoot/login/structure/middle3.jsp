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
		<br />
		<br />
		<br />
		<form action="../../Servlet?method=login" method="post" target="_top" class="border_radius" id="focus">
						<h2>登录工资管理系统</h2>
			<label><span>请输入你的员工编号</span><input type="text" class="input_txt border_radius" name="userID" id="userID" /></label>
			<label><span>密码</span><input type="password" class="input_txt border_radius" name="password" id="password" /></label>
			<input type="radio" id="usertype" name="usertype" value="administrator" checked="checked"/>管理员
			<input type="radio" id="usertype" name="usertype" value="employee" />员工<br /><br />
			<a href="../../register.jsp" target="_top">注册</a>
			<input type="submit" name="submit" id="submit" value="登录" class="buttons" style="position: relative;left: 124px;" />
			
						
					</form>
					
					<br />
					<br />
					<br />
					<br />
					
	</body>
</html>

