<%-- 
    Document   : listMembers
    Created on : Apr 15, 2023, 10:39:55 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Person Page</title>
        <%@include file="commonHeader.jsp" %>
    </head>
    <body class="text-center">
        <div class="header d-flex justify-content-between align-items-center">
        <h1 style="color:red;" class="h3 fw-bold">Welcome ${welcomeName}</h1>
         <a href="logout">Logout</a>
        </div>
         <hr>
        <h1 style="color:yellow;" >List Of Person In Party</h1>
        <form name="search" action="search" method="POST">
            <%@include file="menu.jsp" %>
            <h1 style="color:blue;" class="h3 mb-3 fw-bold">Member</h1>
            <div class="header_signing">
                <input class="input-control mb-3" placeholder="Enter Username" type="text" name="search" id="search">
                <button class="btn btn-md btn-primary" type="submit">Search</button>
            </div>
        </form>
        <table style="border-collapse: collapse;font-size: 18px; margin: 0 auto;">
            <thead>
                <tr>
                    <th  style="border: 2px solid #333; padding: 10px 20px;">ID</th>
                    <th  style="border: 2px solid #333; padding: 10px 20px;">Name</th>
                    <th  style="border: 2px solid #333; padding: 10px 20px;">Age</th>
                    <th  style="border: 2px solid #333; padding: 10px 20px;">Address</th>
                    <th  style="border: 2px solid #333; padding: 10px 20px; ">Phone</th>
                     <c:if test="${admin!= null}">
                    <th style="border: 2px solid #333; padding: 10px 20px; ">Update</th>
                    <th style="border: 2px solid #333; padding: 10px 20px; ">Delete</th>
                    </c:if>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="person" items="${list}">
                <tr>
                    <td  style="border: 2px solid #333; padding: 10px 20px;">${person.getStt()}</td>
                    <td  style="border: 2px solid #333; padding: 10px 20px;">${person.getName()}</td>
                    <td  style="border: 2px solid #333; padding: 10px 20px;">${person.getAge()}</td>
                    <td  style="border: 2px solid #333; padding: 10px 20px;">${person.getAddress().getAddressName()}</td>
                    <td  style="border: 2px solid #333; padding: 10px 20px">${person.getPhone()}</td>
                    <c:if test="${admin != null}">
                    <td style="border: 2px solid #333; padding: 10px 20px; text-align: center">
                        <form action="update" method="GET">
                            <input type="hidden" value="${person.getID()}" name="id">
                            <button class="btn btn-md btn-info" type="submit">🖊</button>
                        </form>
                        </c:if>
                    </td>
                    <c:if test="${admin != null}">
                    <td style="border: 2px solid #333; padding: 10px 20px; text-align: center">
                        <form action = "delete" method="POST">
                            <input type="hidden" value="${person.getID()}" name="idDelete">
                            <button class="btn btn-md btn-danger" type="submit">&Chi;</button>
                        </form>
                        </c:if>
                    </td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
         
        <h2 style="margin-top: 0.5rem;color: red; text-align: center">${message}</h2>
    </body>
</html>
