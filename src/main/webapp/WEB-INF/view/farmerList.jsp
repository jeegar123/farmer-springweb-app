<%--
  Created by IntelliJ IDEA.
  User: Vinod
  Date: 4/21/2020
  Time: 5:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="webjars/bootstrap/4.4.1-1/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<table class="table table-striped text-center">
    <thead>
    <tr>
        <th scope="col">Sr no</th>
        <th scope="col">Name</th>
        <th scope="col">Username</th>
        <th scope="col">Income</th>
        <th scope="col">Address</th>
        <th scope="col"   colspan="2">Actions</th>
    </tr>
    </thead>

    <%int i = 1;%>
    <c:forEach items="${farmerList}" var="farmer">
        <tbody>
        <tr>
            <td><%=i++%>
            </td>
            <td>${farmer.name}</td>
            <td>${farmer.username}</td>
            <td>${farmer.income}</td>
            <td>${farmer.address}</td>
            <td><a class="btn btn-primary w-100" href="<c:url value="/updatePage?id=${farmer.id}"/>">Edit</a> </td>
            <td><a class="btn btn-danger w-100" href="<c:url value="/delete?id=${farmer.id}"/>">Delete</a> </td>

        </tr>
        </tbody>
    </c:forEach>
</table>
</body>
</html>
