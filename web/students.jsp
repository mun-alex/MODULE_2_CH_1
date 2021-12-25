<%@ page import="db.DBManager" %>
<%@ page import="model.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: alexa
  Date: 24.12.2021
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<Student> allStudents = DBManager.studentList;
    for(Student student : allStudents) {
        out.println("<h2>" + student.getName() + "</h2>");
    }
%>
</body>
</html>
