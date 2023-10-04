<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<table border="1px">
<tr bgcolor="red">
<td>ID</td>
<td>Name</td>
<td>Address</td>
</tr>
<%
Class.forName("com.mysql.jdbc.Driver");
Connection con;
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","");
Statement s1 = con.createStatement();
ResultSet rs = s1.executeQuery("select * from college");

while(rs.next())
{
	%>

	<tr>
	<td><%= rs.getInt(1) %></td>
	<td><%= rs.getString(2) %>
	<td><%= rs.getString(3) %>
 	</tr>
<% 	
}
%>
</table>
</center>
</body>
</html>