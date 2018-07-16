$(document).ready(function() {
	$("#focus .input_txt").each(function() {
		var thisVal = $(this).val();
		//判断文本框的值是否为空，有值的情况就隐藏提示语，没有值就显示
		if(thisVal != "") {
			$(this).siblings("span").hide();
		} else {
			$(this).siblings("span").show();
		}
		//聚焦型输入框验证 
		$(this).focus(function() {
			$(this).siblings("span").hide();
		}).blur(function() {
			var val = $(this).val();
			if(val != "") {
				$(this).siblings("span").hide();
			} else {
				$(this).siblings("span").show();
			}
		});
	})
	$("#keydown .input_txt").each(function() {
		var thisVal = $(this).val();
		//判断文本框的值是否为空，有值的情况就隐藏提示语，没有值就显示
		if(thisVal != "") {
			$(this).siblings("span").hide();
		} else {
			$(this).siblings("span").show();
		}
		$(this).keyup(function() {
			var val = $(this).val();
			$(this).siblings("span").hide();
		}).blur(function() {
			var val = $(this).val();
			if(val != "") {
				$(this).siblings("span").hide();
			} else {
				$(this).siblings("span").show();
			}
		})
	})
})