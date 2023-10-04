<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String a,b,c;
a=request.getParameter("t1");
b=request.getParameter("t2");
c=request.getParameter("t3");

Class.forName("com.mysql.jdbc.Driver");
Connection con;
con =DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","");
PreparedStatement s1 = con.prepareStatement("insert into college values('"+a+"','"+b+"','"+c+"')");
int i =s1.executeUpdate();

if(i>0)
{
	out.println("<script>");
	out.println("alert('Record Saved')");
	out.println("window.location.href='2.jsp'");
	out.println("</script>");
}
%>
</body>
</html>