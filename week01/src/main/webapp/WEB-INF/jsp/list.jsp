<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link href="<%=request.getContextPath() %>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<table>
		<tr>
			<td>店铺编号</td>
			<td>店铺名称</td>
			<td>店铺创建日期</td>
			<td>销售商品</td>
		</tr>
		
		<c:forEach items="${list }" var="s">
		<tr>
			<td>${s.sid }</td>
			<td>${s.sname }</td>
			<td>${s.date }</td>
			<td>${s.gname }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>