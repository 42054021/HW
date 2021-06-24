
  Created by IntelliJ IDEA.
  User: 田宇轩
  Date: 2021/4/2
  Time: 22:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="com.example.demo1.model.Beer" %>
<%@ page import="java.io.IOException" %>
<html>
<head>
    <title>Beer Recommended JSP</title>
</head>
<body>
<%
    List<Beer> styles = (List<Beer>) request.getAttribute("styles");
    out.println("<br/>this is a jsp page");
    for (Beer brand: styles) {
        out.println("<br/>try: " + brand);
    }
%>

</body>
</html>
