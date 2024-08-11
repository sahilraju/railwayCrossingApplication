<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%> 
<%@ page isELIgnored="false" %> 
<!DOCTYPE html> 
<html> 
<head> 
<meta charset="ISO-8859-1"> 
<title>Login Page</title> 
<style> 
 
      .logCenter { 
        margin-top: 160px; 
        text-align: center; 
      } 
      .error { 
            color: red; 
      } 
 
</style> 
</head> 
<body> 
 
     <div class="logCenter"> 
      
       <form action="adminlog" method="post"> 
     
        <h1> Railway Crossing </h1> 
        <h4> Admin Login </h4> 
         
        <p>Enter Email</p> 
        <input type="text" name="adminEmail"> 
         
        <p>Enter Password</p> 
        <input type="password" name="adminPassword"> <br> 
        <p> 
        <input type="submit" name="log" value="login"> <br> 
        <p>  
         
        <p  class="error"> ${errorMessage} </p> 
         
      </form> 
    </div> 
</body> 
</html> 