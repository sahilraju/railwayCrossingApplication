<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %> 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Home Page </title> 
<style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
        th {
            font-weight: bold;
        }
        tr + tr {
            border-top: 1px solid #000;
        }
        .adjust{
         margin-left: 30px;
        }
        .textSize{
        size: 50px;
 
        }
    </style>
</head>
<body>
      <h1> Admin Home Page </h1> 
      <a href="addCrossing.jsp" class="adjust"> add crossing</a>
      <a href="searchCrossing.jsp" class="adjust"> search crossing </a>
      
      <h3 class="textsize">Railway Crossings [${count}]</h3>
    <table>
        <tr>
            <th>Sr. No</th>
            <th>Name</th>
            <th>Address</th>
            <th>Landmark</th>
            <th> Train Schedule </th>
            <th> Person in charge </th>
            <th> Status </th>
            <th> Action </th>
            <!-- Add more headers as necessary -->
        </tr>
        <c:forEach var="crossing" items="${crossingList}" varStatus="status">
            <tr>
                <td>${status.index + 1}</td> 
                <td>${crossing.name}</td>
                <td>${crossing.address}</td>
                <td>${crossing.landMark}</td>
                <td>${crossing.trainSchedule}</td>
                <td>${crossing.personInCharge}</td>
                <td>${crossing.status}</td>
                <td><a href="updateCrossing.jsp">update</a> <a href="deleteCrossing.jsp">delete</a> </td> 
                <!-- Add more fields as necessary -->
            </tr>
        </c:forEach>
    </table>
      
</body>
</html>