<%@ page import="com.example.demo4.Counter" %><%--
  Created by IntelliJ IDEA.
  User: 田宇轩
  Date: 2021/5/6
  Time: 13:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>


<br/>
<%= Counter.getCount() %>
</body>
</html>
