<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
		String path = request.getContextPath();
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=basePath%>user/userLogin.do" method="post">
<table>
<tr>
<th>用户名：</th>
<td><input type="text" name="userName"></td>
</tr>
<tr>
<th>密码</th>
<td><input type="password" name=password></td>
</tr>
</table>
<input type="submit" value="提交">
</form>
</body>
</html>