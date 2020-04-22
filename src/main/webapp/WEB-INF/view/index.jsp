<%--
  Created by IntelliJ IDEA.
  User: Vinod
  Date: 4/21/2020
  Time: 5:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <link href="webjars/bootstrap/4.4.1-1/css/bootstrap.min.css" type="text/css" rel="stylesheet"/>
    <style>
        a{
            padding: 2px;
            margin: 4px;
            width: max-content;
        }
    </style>
</head>
<body>
    <h1 class="h1 text-center" >Farmer App</h1>
    <p class="display-4">
        This is Simple based on Curd Operation with database in Spring Web ,Jpa<br>
        This application is design bootstrap .<br>
    </p>
<p class="h1">
    Software Used:<br>
    IntelliJ Ultimate 2020.1<br>
    Xampp for mysql <br>
    Maven based project

</p>

    <a href="/register" class="btn btn-outline-primary">Register New Farmer</a><br>
    <a href="/list" class="btn btn-outline-primary">View All Farmers</a><br>

    <br>
  <h1 style="color: green;font-size: 20px" > ${msg}</h1>
</body>
</html>
