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
    <title>Update form</title>
    <link href="webjars/bootstrap/4.4.1-1/css/bootstrap.min.css" type="text/css" rel="stylesheet"/>
</head>
<body>
Update Registartion Form
<form action="${pageContext.request.contextPath}/update" method="post">
    <div class="form-group">
        <input type="hidden" name="id" value="${farmer.id}"/>
        <label>Name</label>
        <input type="text" class="form-control" placeholder="enter name" name="name" value="${farmer.name}"/>
    </div>
    <div class="form-group">
        <label>Username</label>
        <input type="email" class="form-control" placeholder="enter username" name="username" value="${farmer.username}"/>
    </div>
    <div class="form-group">
        <label>Password</label>
        <input type="password" class="form-control" placeholder="enter password" name="password" value="${farmer.password}"/>
    </div>
    <div class="form-group">
        <label>Income</label>
        <input type="text" class="form-control" placeholder="enter income" name="income" value="${farmer.income}"/>
    </div>
    <div class="form-group">
        <label>Mobile Number</label>
        <input type="text" class="form-control" placeholder="enter mobile number" pattern="[\d]{10}"
               name="mobileno" value="${farmer.mobileno}"/>
    </div>
    <div class="form-group">
        <label> Address</label>
        <textarea name="address" class="form-control">${farmer.address}</textarea>
    </div>

    <input type="submit" class="btn btn-primary" value="submit">
</form>
<div>
    ${msg}
</div>
<script src="webjars/bootstrap/4.4.1-1/js/bootstrap.min.js"></script>
</body>
</html>
