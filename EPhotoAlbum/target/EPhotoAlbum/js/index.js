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
    		url:"/EPhotoAlbum/test/mianScreen.do",
    		type:'post',
    		cache:false,
    		async:false,
    		data:{
    			},
    		dataType:'json',
    		success:function(data){
//    			location.href='../html/photo.html';
//    			console.log("asdasdhkj")
    		}
    	});
    }
		
		
}; 
$(function (){
	index.init();
})