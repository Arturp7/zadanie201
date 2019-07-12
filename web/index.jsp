<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 11.07.2019
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator Miar</title>
</head>
<body>
<h1>Przelicznik metryczny</h1>
<form method="post" action="/calcmeter">
    <input type="number1" name="meters" placeholder="metry"><br>
    <input type="number2" name="centimeters" placeholder="centymetry"><br>
    <input type="number3" name="milimeters"  placeholder="milimetry"><br>
    <input type="submit" value="Przelicz"><br>
    <br>
    <br>
</form>

    <form method="post" action="/weightmeter">
        <input type="number1" name="kilograms" placeholder="kilogramy"><br>
        <input type="number2" name="grams" placeholder="gramy"><br>
        <input type="number3" name="miligrams" placeholder="miligramy"><br>
        <input type="submit" value="Przelicz">

    </form>

</body>
</html>
