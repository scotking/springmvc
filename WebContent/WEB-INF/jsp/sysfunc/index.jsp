<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<thead>
<tr>
<td>功能id</td><td>功能名称</td><td>URL</td><td>功能代码</td>
</tr>
</thead>
<c:forEach var="list" items="${funclist }" begin="0" step="1">
<tr>
<td>${list.funcId }</td><td>${list.funcName }</td><td>${list.url }</td><td>${list.funcCode }</td>
</tr>
</c:forEach>
</table>
</body>
</html>