<%@page import="java.util.List"%>
<%@page import="com.mphasis.bean.RailwayCrossing"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ page isELIgnored="false" %> 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Home Page</title>
<style>
        .crossing-container {
            margin-bottom: 20px;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            background-color: #f9f9f9;
        }
        .crossing-field {
            font-weight: bold;
        }
        .crossing-value {
            margin-left: 10px;
        }
    </style>
</head>
<body>
    <h1>User Home Page</h1>
    <a href="searchCrossing.jsp" class="adjust"> Search crossing</a>
    <br> 
    <c:forEach var="crossing" items="${crossingList}" varStatus="status">
        <div class="crossing-container">
            <p><span class="crossing-field">Serial:</span><span class="crossing-value">${status.index + 1}</span></p>
            <p><span class="crossing-field">Name:</span><span class="crossing-value">${crossing.name}</span></p>
            <p><span class="crossing-field">Status:</span><span class="crossing-value">${crossing.status}</span></p>
            <p><span class="crossing-field">Person In Charge:</span><span class="crossing-value">${crossing.personInCharge}</span></p>
            <p><span class="crossing-field">Schedule:</span><span class="crossing-value">${crossing.trainSchedule}</span></p>
            <p><span class="crossing-field">Landmark:</span><span class="crossing-value">${crossing.landMark}</span></p>
            <p><span class="crossing-field">Address:</span><span class="crossing-value">${crossing.address}</span></p>
        </div>
    </c:forEach>
      
</body>
</html>