<%-- 
    Document   : addMemmber
    Created on : Apr 15, 2023, 10:39:39 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Person Page</title>
         <%@include file="commonHeader.jsp" %>
    </head>
    <body class="text-center">
       <div class="header d-flex justify-content-between align-items-center">
            <h1>Welcome ${welcomeName}</h1>
            <a href="logout">Logout</a>
        </div>
         <hr>
        <main class="add_signing" style="position: relative; top: 20%; left: 42%;">
            <h1 style="color: red; font-weight: 600!important" class="h3 mb-3 fw-normal">Add A Person To Party</h1>
            <form action="add" method="POST">
                <div class="form-floating mb-2">
                    <input id="name" class="form-control" type="text" name="name" placeholder="Name">
                    <label for="name">Name</label>
                </div>
                <div class="form-floating mb-2">
                    <input id= "age" class="form-control" type="number" name="age" placeholder="Age">
                    <label for="age">Age</label>
                </div>
                <div class="form-floating mb-2">
                    <select id="address" name="address" class="form-control">
                        <c:forEach var="address" items="${listAddress}">
                            <option value="${address.getID()}" >${address.getAddressName()}</option>
                        </c:forEach>
                    </select>
                    <label for="address">Address</label>
                </div>
                <div class="form-floating mb-2">
                    <input id="phone" class="form-control" type="number" name="phone" placeholder="Phone">
                    <label for="phone">Phone</label>
                </div>
                <button class="btn btn-primary" type="submit">Add</button>
                <button class="btn btn-warning" type="submit"><a style= "text-decoration: none; color: white;" href="listPerson.jsp">List</a></button>
            </form>
        </main>
    </body>
</html>
