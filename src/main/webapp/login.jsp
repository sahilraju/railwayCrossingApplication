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
      
       <form action="log" method="post"> 
     
        <h1> Railway Crossing </h1> 
        <h4> User Login </h4> 
         
        <p>Enter Email</p> 
        <input type="text" name="email"> 
         
        <p>Enter Password</p> 
        <input type="password" name="password"> <br> 
        <p> 
        <input type="submit" name="log" value="login"> <br> 
        <p> 
         
        <p> Don't have account? <a href="register.jsp">Create new account</a></p> 
         
        <p  class="error"> ${errorMessage} </p> 
         
      </form> 
    </div> 
</body> 
</html> 