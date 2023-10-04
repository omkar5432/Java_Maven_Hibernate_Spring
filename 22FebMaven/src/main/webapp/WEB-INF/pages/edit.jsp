<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<center>
<body>
<h2>Edit Form</h2>
<form:form action="/22FebMaven/update" method="post">
<form:hidden path="id"/><br>
<form:input path="name"/><br>
<form:input path="email"/><br><br>
<input type="submit" value="Update">
</form:form>
</body>
</center>
</html>