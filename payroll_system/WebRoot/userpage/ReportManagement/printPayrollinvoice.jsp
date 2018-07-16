<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="../../css/table.css"/>
		<script type="text/javascript" src="../../js/jquery.min.js"></script>
		<script type="text/javascript" src="../../js/table.js" ></script>
	</head>
	<body style="background: url(../../img/bgDemo.png); background-repeat: no-repeat;background-size: cover;">
		<script>
			salary = new Object();
			salary.id="10001";
			salary.name="å¼ ä¸";
			salary.realsalary=3110;
			salary.basicsalary=3000;
			salary.warmsub=100;
			salary.sickday=2;
			salary.busyday=4;
			salary.lateday=1;
			salary.overtimeday=0;
			salary.sickmoney=40;
			salary.busymoney=200;
			salary.latemoney=10;
			salary.overtimemoney=0;
			salary.tax=150;
			var json = JSON.stringify(salary);
		</script>
		<center>
			<br /><br />
			<font size="5" color="cornflowerblue">计算工资如下：</font>
			<br /><br /><br />
			<table border="1" align="center">
				<tr>
					<th>编号</th>
					<th>姓名</th>
					<th>实发工资</th>
					<th>基本工资</th>
					<th>采暖补贴</th>
					<th>病假天数</th>
					<th>事假天数</th>
					<th>迟到次数</th>
					<th>加班天数</th>
					<th>病假扣款</th>
					<th>事假扣款</th>
					<th>迟到扣款</th>
					<th>加班工资</th>
					<th>个人所得税</th>
				</tr>
				<tbody id="tab">
				<script>
						var x="<tr><td>"+salary.id+"</td><td>"+salary.name+"</td><td>"+salary.realsalary+"</td><td>"+salary.realsalary+"</td><td>"+salary.warmsub+"</td><td>"+salary.sickday+"</td><td>"+salary.busyday+"</td><td>"+salary.lateday+"</td><td>"+salary.overtimeday+"</td><td>"+salary.sickmoney+"</td><td>"+salary.busymoney+"</td><td>"+salary.latemoney+"</td><td>"+salary.overtimemoney+"</td><td>"+salary.tax+"</td></tr>"
						document.write(x)
				</script>
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
