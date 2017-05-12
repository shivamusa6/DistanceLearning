<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ForgotServlet" method="post">
<label>Userid:</label><input type="text" name="userid"><br><br>
<label>Answer Any One Question</label>
<select name="s1">
<option >Your First School Name</option>
<option >Your First Pet Name</option>
<option >Your First Teacher Name</option>
<option >Your First Friend Name</option>
<option >Your First Car Name</option>
</select>
<br><br>
<label>Answer</label><input type="text" name="answer"><br><br>
<input type="submit" value="Forgot">

</form>
${msg}
</body>
</html>