

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            <label>Enter your Age: </label>
            <input type="text" name="age" value="${age}">
            <p>${age}${message}</p>
            <input type="submit" value="Age next Birthday">
            <br>
            <a href="arithmetic">Arithmetic Calculator</a>
            
        </form>
    </body>
</html>
