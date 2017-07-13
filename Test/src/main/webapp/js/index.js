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
    	location.href='../html/NewFile.html';
    }
		
		
} 
$(function (){
	index.init();
})