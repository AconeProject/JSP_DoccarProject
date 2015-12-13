$(function(){
	$("#overlap").on("click",function(){
		
		alert("사용가능한 아이디입니다.")
		$("#overlap").remove();
		$("#overlap_td").append("<span class='check_ok'> - 사용가능한 아이디입니다.</span>")
	})
	$("#pw_check2").on("focus",function(){
		$("#pw2").append("<span id='pw_txt'> - 동일한 비밀번호를 입력해주세요.</span>")
	});
	$("#pw_check2").on("blur",function(){
		$("#pw_txt").remove();
	});
	$("#pw_check2").on("keyup",function(){
		var value1 = $(this).val();
		var value2 = $("#pw_check1").val();
		if(value1 == value2){
			$("#pw_txt").remove();
			$("#pw_txt_ok").remove();
			$("#pw2").append("<span id='pw_txt_ok'> - 동일한 비밀번호 입니다.</span>")
		}
	});
	
	
	
})