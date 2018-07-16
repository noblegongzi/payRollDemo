<%@ page language="java" import="com.software.pojo.Efficient" pageEncoding="UTF-8"%>
<jsp:useBean id="efficient" scope="session" type="com.software.pojo.Efficient"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../../../css/input.css"/>
		<script type="text/javascript" src="../../../js/jquery.min.js" ></script>
		<script type="text/javascript" src="../../../js/input.js"></script>

<title>系数列表</title>
</head>
<body style="background: url(../../../img/bgDemo.png); background-repeat: no-repeat;background-size: cover;">

		<script>
			var CalcuItem = [];
			CalcuItem[0] = new Object();
			CalcuItem[0].name="所得税";
			CalcuItem[0].number=<%=efficient.getTaxRate()%>;
			CalcuItem[1] = new Object();
			CalcuItem[1].name="个人支付养老保险";
			CalcuItem[1].number=<%=efficient.getPensionRateByC()%>;
			CalcuItem[2] = new Object();
			CalcuItem[2].name="公司支付养老保险";
			CalcuItem[2].number=<%=efficient.getPensionRateByE()%>;
			CalcuItem[3] = new Object();
			CalcuItem[3].name="个人支付医保";
			CalcuItem[3].number=<%=efficient.getMedicRateByE()%>;
			CalcuItem[4] = new Object();
			CalcuItem[4].name="公司支付医保";
			CalcuItem[4].number=<%=efficient.getMedicRateByC()%>;
			CalcuItem[5] = new Object();
			CalcuItem[5].name="个人支付失业保险";
			CalcuItem[5].number=<%=efficient.getUnempRateByE()%>;
			CalcuItem[6] = new Object();
			CalcuItem[6].name="公司支付失业保险";
			CalcuItem[6].number=<%=efficient. getUnempRateByC()%>;
			CalcuItem[7] = new Object();
			CalcuItem[7].name="工伤保险";
			CalcuItem[7].number=<%=efficient.getInjuryRateByC()%>;
			CalcuItem[8] = new Object();
			CalcuItem[8].name="生育保险";
			CalcuItem[8].number=<%=efficient.getFertiRateByC()%>;
			CalcuItem[9] = new Object();
			CalcuItem[9].name="个人支付公积金";
			CalcuItem[9].number=<%=efficient.getProFundRateByE()%>;
			CalcuItem[10] = new Object();
			CalcuItem[10].name="公司支付公积金";
			CalcuItem[10].number=<%=efficient.getProFundRateByC()%>;
			CalcuItem[11] = new Object();
			CalcuItem[11].name="病假扣款";
			CalcuItem[11].number=<%=efficient. getMoneyofSick()%>;
			CalcuItem[12] = new Object();
			CalcuItem[12].name="事假扣款";
			CalcuItem[12].number=<%=efficient. getMoneyofBusy()%>;
			CalcuItem[13] = new Object();
			CalcuItem[13].name="迟到扣款";
			CalcuItem[13].number=<%=efficient.getMoneyofLate()%>;
			CalcuItem[14] = new Object();
			CalcuItem[14].name="加班补贴";
			CalcuItem[14].number=<%=efficient.getMoneyofOvertime()%>;
			
			var json = JSON.stringify(CalcuItem);
			document.write(CalcuItem.name[1]);
		</script>
		

			<form action="../../../Servlet?method=efficientupdate" method="post" target="_top" class="border_radius" id="focus">
				<h2>修改计算公式</h2>
				<script>
					for(var i=0;i<CalcuItem.length;i++)
					{
					
						var x=CalcuItem[i].name+":<label><input type='text' class='input_txt border_radius' value='"+CalcuItem[i].number+"' name='efficient"+i+"' id='efficient"+i+"' /></label>";
						
						document.write(x);
					}
				</script>
				<input type="submit" name="submit" id="submit" value="修改" class="buttons"  />
				<p>（不输入代表不修改）</p>
			</form>
	</body>


</body>
</html>