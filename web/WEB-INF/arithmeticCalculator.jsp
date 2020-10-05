

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <br>
        <form method="post" action="arithmetic">
            <label> First Number:</label><input type="text" name="first_number" value="${firstNumber}">
            <br>
            <label> Second Number:</label><input type="text" name="second_number" value="${secondNumber}">
            <br>
            <input type="submit" name="+" value="+">
            <input type="submit" name="-" value="-">
            <input type="submit" name="*" value="*">
            <input type="submit" name="%" value="%">
            <p>Result: ${result}</p>
            <p><a href ="age">Age Calculator</a></p>
        </form>
    </body>
</html>
