<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<center>
<table border="1px">
<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
</tr>
<c:forEach items="${l1}" var="e">
<tr>
<td>${e.id}</td>
<td>${e.name}</td>
<td>${e.email}</td>

<td>
<a href="#">Delete</a>
<a href="#">Edit</a>
</td>
</tr>
</c:forEach>
</table>
<a href="abc">Login Page</a>
</center>