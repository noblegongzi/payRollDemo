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
			<form action="../../../Servlet?method=stationadd" method="post" target="_top" class="border_radius" id="focus">
				<h2>添加职位</h2>
				<label><span>请输入需要创建的职位编号</span><input type="text" class="input_txt border_radius" name="stationID" id="stationID" /></label>
				<label><span>请输入需要创建的职位名称</span><input type="text" class="input_txt border_radius" name="stationName" id="stationName" /></label>
				<input type="submit" name="submit" id="submit" value="添加" class="buttons" />
			</form>
		</center>
	</body>
</html>