<%-- 
    Document   : updatePerson
    Created on : Apr 16, 2023, 10:58:50 AM
    Author     : ASUS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Person Page</title>
        <%@include file="commonHeader.jsp" %>
    </head>
    <body class="text-center">
        <div class="header d-flex justify-content-between align-items-center">
            <h1>Welcome ${welcomeName}</h1>
             <a href="logout">Logout</a>
        </div>
         <hr>
        <main class="add_signing" style="position: relative; top: 17%; left: 42%;">
            <h1 class="h3 mb-3 fw-normal" style="color:red; font-size: 40px">Update A Person In Party</h1>
            <form action="update" method="POST">
                <input style="padding:5px; font-size: 20px; margin: 0 0 20px 4px" type="hidden" name="id" value="${person.getID()}">
                <br>
                <div class="form-floating mb-2">
                    <input id="name" class="form-control" type="text" name="name" value="${person.getName()}">
                    <label for="name">Name</label>
                </div>
                <div class="form-floating mb-2">
                    <input id="age" class="form-control" type="number" name="age" value="${person.getAge()}">
                    <label for="age">Age</label>
                </div>
                <div class="form-floating mb-2">
                    <select id="address" class="form-control" name="address">
                        <c:forEach var="address" items="${listAddress}">
                            <option class="dropdown-item" value="${address.getID()}" ${person.getAddress().getAddressName().equals(address.getAddressName()) ? "selected":""}>${address.getAddressName()}</option>
                        </c:forEach>
                    </select>
                    <label for="address">Address</label>
                </div>
                <div class="form-floating mb-2">
                    <input id="phone" class="form-control" type="number" name="phone" value="${person.getPhone()}">
                    <label for="phone">Phone</label>
                </div>
                <button class="btn btn-primary" type="submit">Update</button>
                <button class="btn btn-danger" type="submit"><a style="text-decoration: none; color: white;" href="listPerson.jsp">Back</a></button>
            </form>
        </main>
    </body>
</html>
