/**
 * 
 */
var index ={
	init : function(){
		index.search();
		$("#testClick").click(function() {			
			index.clickPhoto();
		});
	},

    search : function(){
//    	location.href='../html/NewFile.html';
//    	
//  	    var jsonParams = {
//    			
//    	 }
//    	var datas = JSON.stringify(jsonParams);
    	var div1 = '<div class="stack">';
    	var div2 = '<div class="stack__deco"></div>';
    	var div3 = '<div class="stack__figure">';
    	var div4 = '</div>';
    	var div5 = '<div class="grid__item-caption">';
		var div6 = '<h3 class="grid__item-title">';
		var div7 = '</h3>';
		var div8 = '<div class="column column--left">';
    	var div9 = '<span class="column__text">';
    	var div10 = '</span>';
    	var div11 ='<div class="column column--right">';
    	var div12 = 'class="grid__item grid__item--c1"';
    	var div13 = 'class="grid__item grid__item--c2"';
    	var div14 ='class="grid__item grid__item--c3"';
    	
    	var photoHtml = '';
//    	debugger;
    	$.ajax({
    		url:"/EPhotoAlbum/test/mianScreen.do",
    		type:'post',
    		cache:false,
    		async:false,
    		dataType : "json",
    		success :function(data){
    		  if(data.model.albumList.length>0){
//    			for(var i=0;i<data.model.albumList.length;i++){
    				/*photoHtml+='<a href="javascript:void(0);" '+div13+'>'
    				+div1
    				+div2
    				+div2
    				+div2
    				+div2
    				+div3
    				+'<img class="stack__img" src="../imgs/1.png" alt="Image">'
    				+div4
    				+div4
    				+div5
    				+div6+data.model.albumList[i].albumName+div10+div7
    				+div8
    				+div9+'照片数量'+div10
    				+div9+'创建时间'+div10
    				+div9+'最后修改时间'+div10
    				+div4
    				+div11
    				+div9+data.model.albumList[i].albumNum+div10
    				+div9+data.model.albumList[i].albumDate+div10
    				+div9+data.model.albumList[i].albumDateNew+div10
    				+div4+div4
    				+'</a>';*/
    				
    				
    				/*photoHtml+='<a href="javascript:void(0);"  class="grid__item grid__item--c1"> <div class="stack"><div class="stack__deco"></div><div class="stack__deco"></div><div class="stack__deco"></div><div class="stack__deco"></div><div class="stack__figure">'
    				
    							+'<img class="stack__img" src="../imgs/1.png" alt="Image"></div></div><div class="grid__item-caption"><h3 class="grid__item-title">anaerobic</h3><div class="column column--left">'
    							
    							+'<span class="column__text">Period</span><span class="column__text">Subjects</span><span class="column__text">Result</span></div><div class="column column--right"><span class="column__text">2045</span>'
    							
    							+'<span class="column__text">133456</span><span class="column__text">Positive</span></div></div></a>';
    				 
    				*/
    			 
    				var html  = template($('#tpl').html(),{
      					list:data.model.albumList,
      				});
    				$('#divMain').html(html);
//    				}
    			
    				(function() {
    					[].slice.call(document.querySelectorAll('.grid--effect-vega > .grid__item')).forEach(function(stackEl) {
    						new VegaFx(stackEl);
    					});
    					[].slice.call(document.querySelectorAll('.grid--effect-castor > .grid__item')).forEach(function(stackEl) {
    						new CastorFx(stackEl);
    					});
    					[].slice.call(document.querySelectorAll('.grid--effect-hamal > .grid__item')).forEach(function(stackEl) {
    						new HamalFx(stackEl);
    					});
    					[].slice.call(document.querySelectorAll('.grid--effect-polaris > .grid__item')).forEach(function(stackEl) {
    						new PolarisFx(stackEl);
    					});
    					[].slice.call(document.querySelectorAll('.grid--effect-alphard > .grid__item')).forEach(function(stackEl) {
    						new AlphardFx(stackEl);
    					});
    					[].slice.call(document.querySelectorAll('.grid--effect-altair > .grid__item')).forEach(function(stackEl) {
    						new AltairFx(stackEl);
    					});
    					[].slice.call(document.querySelectorAll('.grid--effect-rigel > .grid__item')).forEach(function(stackEl) {
    						new RigelFx(stackEl);
    					});
    					[].slice.call(document.querySelectorAll('.grid--effect-canopus > .grid__item')).forEach(function(stackEl) {
    						new CanopusFx(stackEl);
    					});
    					[].slice.call(document.querySelectorAll('.grid--effect-pollux > .grid__item')).forEach(function(stackEl) {
    						new PolluxFx(stackEl);
    					});
    					[].slice.call(document.querySelectorAll('.grid--effect-deneb > .grid__item')).forEach(function(stackEl) {
    						new DenebFx(stackEl);
    					});
    				})();
//    				$.parser.parse();
    			}
    		}
    	});
    	
    },
	clickPhoto : function(){
		$.ajax({
    		url:"/EPhotoAlbum/test/mianScreen.do",
    		type:'post',
    		cache:false,
    		async:false,
    		data:{
    			},
    		success:function(data){
  			alert("qweqwe");
//    			console.log("asdasdhkj")
    		},
    		error: function(XMLHttpRequest, textStatus, errorThrown) {
    			 alert(XMLHttpRequest.status);
    			 alert(XMLHttpRequest.readyState);
    			 alert(textStatus);
    			   }
    			
    	});
	}
		
		
}; 
$(function (){
	index.init();
})