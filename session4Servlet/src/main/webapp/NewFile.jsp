<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Insert Student</h1>
	<form action="insertStudent" method="post">
		<table>
			<tr>
				<td>student Id:</td>
				<td><input type="text" name="stuId" value="${cookie.stuId.value}"/></td>
			</tr>
			<tr>
				<td>student Name:</td>
				<td><input type="text" name="stuName" value="${cookie.stuName.value}"/></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><input type="radio" name="gender" value="true" ${cookie.gender.value}/>Male</td>
				<td><input type="radio" name="gender" value="false"/>Female</td>
			</tr>
			<tr>
				<td>Birthday:</td>
				<td><input type="date" name="birthday" value="${cookie.birthday.value}"/></td>
			</tr>
			<tr>
				<td>Home Town:</td>
				<td><textarea name="homeTown">${cookie.homeTown.value}</textarea></td>
			</tr>
			<tr>
				<td>Class:</td>
				<td><input type="text" name="classs" value="${cookie.classs.value}"/></td>
			</tr>
			<tr>
				<td><input type="checkbox" name="save" value="save" ${cookie.save.value}/>Save</td>
				<td><input type="submit" value="Send" /> <input type="reset"
					value="Clear" /></td>
			</tr>
		</table>
	</form>
</body>
</html>