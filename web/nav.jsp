<%--
  Created by IntelliJ IDEA.
  User: alexa
  Date: 28.12.2021
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul class="nav">
    <li class="nav-item">
        <a class="nav-link" href="/main">All students</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="/students-by-city?cityName=Seoul">Seoul</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="/students-by-city?cityName=Almaty">Almaty</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="/students-by-city?cityName=Astana">Astana</a>
    </li>
    <li class="nav-item">
        <a class="nav-link btn btn-success" href="/addStudent">Add Student</a>
    </li>
</ul>
</body>
</html>
