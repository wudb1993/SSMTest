var login = {
		init : function(){
			$("#loginI").click(function() {
				login.search();
			});
		},
		search : function(){
			if(login.checkPassword()){
			var userName = $("#userName").val();
			var userPassword = $("#userPassword").val();
			$.ajax({
	    		url:"/EPhotoAlbum/test/login.do",
	    		type:'post',
	    		cache:false,
	    		async:false,
	    		data:{
	    			'userName' : userName,
	    			'userPassword' : userPassword
	    			},
	    			dataType:'json',
	    		success:function(data){
	    			console.log(data);
   			      if(data.model.result=='success'){
		    			location.href='../html/index.html';
	    			}else{
	    				console.log(data.model.result);
	    			
	    				$('[id="errorText"]').html(data.model.result);
	    			}
//	    			console.log("asdasdhkj")
	    		} 
	    	});
			}else{
				return ;
			}
		},
		checkPassword : function(){
			var userName = $.trim($('#userName').val());
			var userPassword = $.trim($('#userPassword').val());
			if(userName==null||userName==''){
				$('#errorText').html("请输入用户名");
				return false ;
			}else if(userPassword==null||userPassword==''){
				$('#errorText').html("请输入密码");
				return false ;
			}else{
				return true;
			}
		}
}
$(function(){
	login.init();
})
