<%-- 
    Document   : menu
    Created on : Apr 16, 2023, 11:56:24 AM
    Author     : ASUS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="commonHeader.jsp" %>
    </head>
    <body>
        <div style="text-align: center; position: relative; top: 80px; left: 226px">
            <c:if test="${admin != null}">
                <button type="button" class="btn btn-add btn-warning">
                    <a style="text-decoration: none; color: white" href="add">Add</a>
                </button>
            </c:if>
        </div>
    </body>
</html>
