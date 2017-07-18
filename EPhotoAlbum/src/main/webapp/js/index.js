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
//    	
//  	    var jsonParams = {
//    			
//    	 }
//    	var datas = JSON.stringify(jsonParams);
    	$.ajax({
    		url:"/EPhotoAlbum/test/user.do",
    		type:'get',
    		async:false,
    		data:{'userName' : "www",
    			'age' : "11",
    			'id' : 1
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