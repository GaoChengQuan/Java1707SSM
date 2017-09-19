<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.situ.ssm.pojo.*"%>
<%@page import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1 , user-scalable=no">
<title></title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/lib/bootstrap/css/bootstrap.css" />
</head>
<body>
	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th>id</th>
					<th>姓名</th>
					<th>年龄</th>
					<th>性别</th>
					<th>地址</th>
					<th>出生日期</th>
					<th>删除</th>
					<th>修改</th>
				</tr>
			</thead>
			<tbody>
				<%	
					List<Student> list = (List<Student>)request.getAttribute("list");
					for (Student stu : list) {
				%>
				<tr>
					<td><%=stu.getId()%></td>
					<td><%=stu.getName()%></td>
					<td><%=stu.getAge()%></td>
					<td><%=stu.getGender()%></td>
					<td><%=stu.getAddress()%></td>
					<td><%=stu.getBirthday()%></td>
					<td><a
						href="<%=request.getContextPath()%>/student/deletById.action?id=<%=stu.getId()%>">删除</a></td>
					<td><a
						href="<%=request.getContextPath()%>/student?toUpdateStudent&id=<%=stu.getId()%>">修改</a></td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table>
	</div>


	<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
	<script type="text/javascript" src="lib/bootstrap/js/bootstrap.js"></script>
</body>
</html>
