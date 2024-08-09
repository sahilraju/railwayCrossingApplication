<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%> 
<%@ page isELIgnored="false" %> 
<!DOCTYPE html> 
<html> 
<head> 
<meta charset="ISO-8859-1"> 
<title>Register Page</title> 
<style> 
 
      .regCenter { 
        margin-top: 160px; 
        text-align: center; 
      } 
      .error { 
            color: red; 
        } 
 
</style> 
<body> 
 
    <div class="regCenter"> 
     
       <form action="reg" method="post"> 
        
        <h1> Railway Crossing </h1>  
        <h4> User Register </h4> 
          
        <p>Enter Name</p> 
        <input type="text" name="name"> 
         
        <p>Enter Email</p> 
        <input type="text" name="email"> 
         
        <p>Enter Password</p> 
        <input type="password" name="password"> <br> 
        <p> 
        <input type="submit" name="reg" value="register"> <br> 
        <p> 
         
        <p> Already have account? <a href="login.jsp">Sign in instead</a></p> 
     
       </form>  
        
       <p  class="error"> ${errorMessage} </p> 
     
    </div> 
      
</body> 
</html> 