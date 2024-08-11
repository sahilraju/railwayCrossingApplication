<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Crossing Page</title>
<style> 
 
      .center { 
        margin-top: 50px; 
        text-align: center; 
      } 
      .message{
        color: green;
      }
    
</style> 
</head>
<body>

   <div class="center"> 
       <h1>Railway Crossing</h1>
       <h3> Add Railway Crossing Information </h3> 
       
       <form action="addCrossing" method="post">
       
           <p> Enter Name </p>
           <input type="text" name="name">
           
           <p> Address </p> 
           <input type="text" name="address"> 
           
           <p> Landmark </p>
           <input type="text" name="landmark">
           
           <p> Train Schedule </p>
           <input type="text" name="schedule">
           
           <p> Person In Charge </p> 
           <input type="text" name="pCharge">
           
           <p> Crossing Status </p> 
           <input type="radio" name="status" value="open"> Open <br>
           <input type="radio" name="status" value="close"> Close <br>
           
           <br>
           
           <input type="submit" name="submit" value="submit">  
           
       </form> 
           <h3 class="message"> ${message} </h3> 
   </div>
</body>
</html>