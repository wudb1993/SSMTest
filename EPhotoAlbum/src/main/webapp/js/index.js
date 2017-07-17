/**
 * 
 */
var index ={
	init : function(){
		$("#testClick").click(function() {			
			index.search();
		});
	},

    search : function(){
//    	location.href='../html/NewFile.html';
    	
//    	var jsonParams = {
//    			
//    	}
//    	var datas = JSON.stringify(jsonParams);
    	$.ajax({
    		url:"/EPhotoAlbum/user/cs",
    		type:'get',
    		async:false,
    		data:{'userName' : "www",
    			'userAge' : "11",
    			'userId' : 1
    			},
    		dataType:'json',
    		success:function(data){
    			alert(data);
    		}
    	});
    }
		
		
} 
$(function (){
	index.init();
})