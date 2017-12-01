<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <form action="register.action" method="post">
		      用户名:<input type="text" id="name" name="user.name" /><br/>
		      密码 :<input type="password" id="pwd" name="user.pwd" /><br/>
		      年龄:<input type="text" name="user.age"><br/>
		      邮箱:<input type="text" name="user.email" />   <br/>
		      
          <input  type="submit" value="summit" id="sub"></input>
      </form>

</body>
</html>