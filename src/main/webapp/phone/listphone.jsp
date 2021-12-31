<%@ page import="com.example.baithi.entity.Phone" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Ben
  Date: 12/31/2021
  Time: 7:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    ArrayList<Phone> listPhone = (ArrayList<Phone>) request.getAttribute("list");
%>
<html>
<head>
    <title>ListPhone</title>
</head>
<body>
    <h1>ListPhone</h1>
    <ul>
        <li>
                <%
                for (int i = 0; i < listPhone.size(); i++) {
            %>
        <li><%=listPhone.get(i).getId()%> - <%=listPhone.get(i).getName()%></li>
        <%
            }
        %>
        </li>
    </ul>
</body>
</html>
