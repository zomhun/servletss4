<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Display Student</h1>
	<table>
		<tr>
			<td>student Id:</td>
			<td>${stuId}</td>
		</tr>
		<tr>
			<td>student name:</td>
			<td>${stuName}</td>
		</tr>
		<tr>
			<td>Birthday:</td>
			<td>${birthday}</td>
		</tr>
		<tr>
			<td>Gender:</td>
			<td>${gender?"Male":"Female"}</td>
		</tr>
		<tr>
			<td>Home Town:</td>
			<td>${homeTown}</td>
		</tr>
		<tr>
			<td>Class:</td>
			<td>${classs}</td>
		</tr>
	</table>
	<a href="NewFile.jsp">Back</a>
</body>
</html>