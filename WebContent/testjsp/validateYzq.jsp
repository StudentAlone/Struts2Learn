<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:fielderror></s:fielderror>
      <form action="YzqAction.action" method="post">
		   姓名: <input type="text" name="name" vaule=""></input>
		   年级: <input type="text" name="age" value=""></input>
          <input  type="submit" value="summit" id="sub"></input>
      </form>

</body>
</html>