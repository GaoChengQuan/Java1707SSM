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
			<th>班级</th>
			<th>课程</th>
			<th>删除</th>
			<th>修改</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${list}" var="stu">
			<c:forEach items="${stu.banji.courseList}" var="course">
				<tr>
					<td>${stu.id}</td>
					<td>${stu.name}</td>
					<td>${stu.banji.name}</td>
					<td>${course.name}</td>
					<td><a
						href="${pageContext.request.contextPath}/student/deletById.action?id=${stu.id}">删除</a></td>
					<td><a
						href="${pageContext.request.contextPath}/student?toUpdateStudent&id=${stu.id}">修改</a></td>
				</tr>
			</c:forEach>
		</c:forEach>
	</tbody>
</table>
	</div>


	<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
	<script type="text/javascript" src="lib/bootstrap/js/bootstrap.js"></script>
</body>
</html>
