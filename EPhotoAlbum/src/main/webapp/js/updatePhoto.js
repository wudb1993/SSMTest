var updatePhoto = {
		init : function(){
			$("#photoSubmit").click(function() {
				updatePhoto.search();
			});
		},
    /*    getPath : function(){
        	
        	var St =  $('#photoFile').val();
        	return St;
        	
        },
        getPhotoName : function(){
        	var photoName='';
        	var photoFormat ='';
        	var photoPath = updatePhoto.getPath();
        	if(photoPath==null||photoPath==''){
        		$('#photoError').html("所选文件不能为空");
        		return ;
        	}
        	var photoNumAndFormat = updatePhoto.getCharNumAndFormat(photoPath);
        	if(photoNumAndFormat[0]>=0){
        		photoName  = photoPath.substring(photoNumAndFormat[0]+1,photoPath.length);
        	}
        	if(photoNumAndFormat[1]>=0){
        		photoFormat  = photoPath.substring(photoNumAndFormat[1]+1,photoPath.length);
         	}
        	if(!(photoFormat=='jpg'||photoFormat=='png'||photoFormat=='gif'||photoFormat=='jpeg')){
        		$('#photoError').html("请选择图片");
        		return ;
        	}
        	updatePhoto.search(photoPath,photoName);
        },*/
        search : function(){
//        	if(photoPath==''||photoName==''){
//        		return ;
//            }
//        	var data = JSON.stringify($('#formPhoto').serializeJSON());//这有一个问题就是后台如何接收这个已经json化的数据
        	
        	/*$.ajax({
        		url : '/EPhotoAlbum/test/updatePhoto.do',
        		type : 'get',
        		cache:false,
        		async:false,
        		data:
        			data,
        			
        		success:function(data){
        			
        		}
        	});*/

        	$.ajaxFileUpload({
        		url : '/EPhotoAlbum/test/updatePhoto.do',
        		type : 'POST',
        		secureuri: true,
        		fileElementId : 'file',
        		cache:false,
//        		async:false,
//        		data:
//        			data,
//        			
        		success:function(data){
        			alert("yes");
        		}
        	});
        }
		/*getCharNumAndFormat : function(o){
			var x=o.indexOf('\\');
			if(x>=0){
			   var num=-1;
			   while(x>=0){
			    num=x;	
				x=o.indexOf('\\',x+1);
			   }
			}
			//找个文件格式
			var q = o.indexOf('.');
			if(q>=0){
			  var format = -1;
			  while(q>=0){
				 format = q;
				 q=o.indexOf('.',q+1);
			   }
			}
			var numFormat=[num,format];
			return numFormat;
		}*/
};
$(function(){
	updatePhoto.init();
});