<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
function clickSubmit(){
	location.href='/NewFile.jsp';
}
</script>	
		
	 <form action="user/test" method = "get">
     <input type="text" name="userName" id="userName" />
     <input type="text" name="password" id="password" />
     <input type="text" name="age" id="age" />
     <input type="text" name="id" id="id" />
     <input type="submit" value="提交">
   </form>
</body>
</html>