<%-- 
    Document   : login
    Created on : Apr 16, 2023, 4:47:47 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <%@include file="commonHeader.jsp" %>
        <<link rel="stylesheet" href="./css/login.css"/>
    </head>
    <body class="text-center">
       <main class="form-signin w-100 m-auto">
        <form action="login" method="POST">
            <img src="./img/logo.png" alt="" width="150" height="150">
            <h1 class="h3 mb-3 fw-normal">Login</h1>
            <div class="form-floating">
                <input type="text" class="form-control" id="username" name="username" placeholder="Enter Username">
                <label for="username">Username</label>
            </div>
            <div class="form-floating mb-2">
                <input id= "password" class="form-control" type="password" name="password" placeholder="Password">
                <label for="password">Password</label>
            </div>
            <button class="w-100 btn btn-lg btn-primary" type="submit">Sign in</button>
            <p class="mt-5 mb-3 text-body-secondary">© 2023</p>
        </form>
        <c:if test="${!messageLogin.equals(\"\")}">
            <h2 style="text-align: center; color: red; font-size: 20px;">${messageLogin}</h2>
        </c:if>
        </main> 
    </body>
</html>
