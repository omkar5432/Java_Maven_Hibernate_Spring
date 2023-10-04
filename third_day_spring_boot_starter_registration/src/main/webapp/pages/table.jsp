<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
<style>
.p
{
 	padding-top: 5%;
}
body
{
	background-color: #92a8d1;
}
input
{
	height: 1.2cm;
	width: 6cm;
	border: 5px;
	border-radius: 5px;
	background-color: #4169e1;
	color: white;
	font-size: 20px;
	font-family: Serif;
	
	
}



</style>
<body>
<center>
<div class="p">
<h2>Table</h2>
<table border="1px">
<tr>
<th>ID</th>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Roll Number</th>
<th>College name</th>
<th>Branch</th>
<th>Address</th>
<th>Action</th>
</tr>

<c:forEach var="e" items="${l1}">
<tr>
<td>${e.id}</td>
<td>${e.fname}</td>
<td>${e.lname}</td>
<td>${e.email}</td>
<td>${e.rollnum}</td>
<td>${e.college}</td>
<td>${e.branch}</td>
<td>${e.address}</td>
<td>
<a href="edit/${e.id}">EDIT</a>
<a href="del/${e.id}">DELETE</a>
</td>
</tr>
</c:forEach>
</table><br>
<form action="back" method="post">
<input type="submit" value="Back to Registration">
</form>
</div>
</center>
</body>
