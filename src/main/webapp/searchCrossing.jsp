<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %> 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Crossing Page</title>
</head>
<body>
      
      <form action="searchCross" method="post">
           <p> Enter Crossing Name: </p>
           <input type="text" name="name">
           <input type="submit" name="search" value="search">
       </form>
       <br>
       <h3> ${message}</h3> 
        
       <p> <strong> Name: </strong> ${crossing.name} </p>
       <p> <strong> Status: </strong> ${crossing.status} </p>
       <p> <strong> Person In Charge: </strong> ${crossing.personInCharge} </p>
       <p> <strong>  Train Schedule:  </strong> ${crossing.trainSchedule} </p>
       <p> <strong> Landmark: </strong> ${crossing.landMark} </p>
       <p> <strong> Address:  </strong> ${crossing.address} </p> 
      
</body>
</html>