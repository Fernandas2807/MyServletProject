<%@page import="dto.StudentDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<StudentDto> l=(List<StudentDto>)request.getAttribute("Object");%>
<table>
<tr>
<th>id</th>
<th>name</th>
<th>delete</th>
</tr>
<%for(StudentDto a:l){ %>
<tr>
<td><%=a.getId()%></td>
<td><%=a.getName()%></td>
<td><a href="delid?pk=<%=a.getId()%>">remove</a>
</tr>
<%} %>
</table>

</body>
</html>