<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page isELIgnored="false" %> 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
     .warn{
       background-color: red;
     }
     .msg{
     color: red;
     }
</style>
</head>
<body>
       <form action="deleteCross" method="post">
           <p> Enter Crossing Name: </p>
           <input type="text" name="name">
           <input class="warn" type="submit" name="delete" value="delete">
       </form>
       
       <h3> ${message}</h3> 
</body>
</html>