<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="ServletExample" method="post">
		<table border="0">
			<tr>
				<td>First name:</td> <td> <input type="text" name="firstName" />
			</tr>
			<tr>
				<td>Last name:</td> <td> <input type="text" name="lastName" />
			</tr>
			<tr>	
				<td></td> <td> <input type="submit" value="Submit" />
			</tr>
		</table>
	</form>
</body>
</html>