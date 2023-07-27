<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Currency Converter</h1>
<form action="/convert" method="post">
    <p>Rate:</p>
    <input type="text" name="rate" placeholder="input rate">
    <p>USD:</p>
    <input type="text" name="usd" placeholder="USD"> <br><br>
    <button>Converter</button>
</form>
</body>
</html>