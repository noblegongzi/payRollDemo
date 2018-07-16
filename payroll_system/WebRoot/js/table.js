function $() {
	for(i = 1; i < Ptr.length + 1; i++) {
		Ptr[i - 1].className = (i % 2 > 0) ? "t1" : "t2";
	}
}

function delcfm() {
	if(!confirm("确认要删除？")) {
		window.event.returnValue = false;
	}
}
function $() {
	for(i = 1; i < Ptr.length + 1; i++) {
		Ptr[i - 1].className = (i % 2 > 0) ? "t1" : "t2";
	}
}