<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>CSS3+JS滚动数字时钟代码-懒人图库</title>
<style>
body{text-align: center;background-color: #0e141b;color: rgba(224, 230, 235, 0.89);font-family: 'Roboto Condensed', sans-serif;font-weight: 300;overflow: hidden;}
.column,.colon{display: inline-block;vertical-align: top;font-size: 86px;line-height: 86px;}
.column{-webkit-transition: -webkit-transform 300ms;transition: -webkit-transform 300ms;transition: transform 300ms;transition: transform 300ms, -webkit-transform 300ms;}
.colon{-webkit-transition: -webkit-transform 300ms;transition: -webkit-transform 300ms;transition: transform 300ms;transition: transform 300ms, -webkit-transform 300ms;-webkit-transform: translateY(calc(50vh - 43px));transform: translateY(calc(50vh - 43px));}
.colon:after{content: ':';}
.num{-webkit-transition: opacity 500ms, text-shadow 100ms;transition: opacity 500ms, text-shadow 100ms;opacity: 0.025;}
.num.visible{opacity: 1.0;text-shadow: 1px 1px 0px #B00000;}
.num.close{opacity: 0.35;}
.num.far{opacity: 0.15;}
.num.distant{opacity: 0.1;}
</style>
</head>
	<body style="background: url(../../img/bgDemo.png); background-repeat: no-repeat;background-size: cover;">
		<div class="column">
			<div class="num">0</div>
			<div class="num">1</div>
			<div class="num">2</div>
		</div>
		<div class="column">
			<div class="num">0</div>
			<div class="num">1</div>
			<div class="num">2</div>
			<div class="num">3</div>
			<div class="num">4</div>
			<div class="num">5</div>
			<div class="num">6</div>
			<div class="num">7</div>
			<div class="num">8</div>
			<div class="num">9</div>
		</div>
		<div class="colon"></div>
		<div class="column">
			<div class="num">0</div>
			<div class="num">1</div>
			<div class="num">2</div>
			<div class="num">3</div>
			<div class="num">4</div>
			<div class="num">5</div>
		</div>
		<div class="column">
			<div class="num">0</div>
			<div class="num">1</div>
			<div class="num">2</div>
			<div class="num">3</div>
			<div class="num">4</div>
			<div class="num">5</div>
			<div class="num">6</div>
			<div class="num">7</div>
			<div class="num">8</div>
			<div class="num">9</div>
		</div>
		<div class="colon"></div>
		<div class="column">
			<div class="num">0</div>
			<div class="num">1</div>
			<div class="num">2</div>
			<div class="num">3</div>
			<div class="num">4</div>
			<div class="num">5</div>
		</div>
		<div class="column">
			<div class="num">0</div>
			<div class="num">1</div>
			<div class="num">2</div>
			<div class="num">3</div>
			<div class="num">4</div>
			<div class="num">5</div>
			<div class="num">6</div>
			<div class="num">7</div>
			<div class="num">8</div>
			<div class="num">9</div>
		</div>
		<script>
			'use strict';
			var size = 86;
			var columns = Array.from(document.getElementsByClassName('column'));
			var d = undefined,
				c = undefined;
			var classList = ['visible', 'close', 'far', 'far', 'distant', 'distant'];
			var use24HourClock = true;
		
			function padClock(p, n) {
				return p + ('0' + n).slice(-2);
			}
		
			function getClock() {
				d = new Date();
				return [use24HourClock ? d.getHours() : d.getHours() % 12 || 12, d.getMinutes(), d.getSeconds()].reduce(padClock, '');
			}
		
			function getClass(n, i2) {
				return classList.find(function(class_, classIndex) {
					return i2 - classIndex === n || i2 + classIndex === n;
				}) || '';
			}
		
			var loop = setInterval(function() {
				c = getClock();
		
				columns.forEach(function(ele, i) {
					var n = +c[i];
					var offset = -n * size;
					ele.style.transform = 'translateY(calc(50vh + ' + offset + 'px - ' + size / 2 + 'px))';
					Array.from(ele.children).forEach(function(ele2, i2) {
						ele2.className = 'num ' + getClass(n, i2);
					});
				});
			}, 200 + Math.E * 10);
		</script>
	</body>
</html>
