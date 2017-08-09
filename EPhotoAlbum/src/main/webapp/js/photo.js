/**
 * 
 */

var photo = {
		init : function(){
			photo.search();
		},

	    search : function(){
	    	var query = location.search.substring(1);
	    	var albumValue = query.split("=");
	    	var albumId = albumValue[1];
	    	$.ajax({
	    		url:"/EPhotoAlbum/test/photoScreen.do",
	    		type:'get',
	    		cache:false,
	    		async:false,
	    		data:{
	    			"albumId":albumId
	    		},
	    		dataType : "json",
	    		success :function(data){
	    		  if(data.model.photoList.length>0){
	    				var html  = template($('#tpl').html(),{
	      					list:data.model.photoList,
	      				});
	    				$('#divMain').html(html);
	    				$('#divMain').viewer();
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
	    		  }
	    		}
	    });
	   }
}
$(function(){
	photo.init();
});
