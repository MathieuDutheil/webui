<%--
  Created by IntelliJ IDEA.
  User: mathieudutheil
  Date: 19/12/2021
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Authentification de l'administrateur</title>
</head>
<body>
<form action="login" method="post">
    <label>Login: </label><br>
    <input type="text" name="login"><br>
    <label>Mot de passe: </label><br>
    <input type="password" name="password">
    <input type="submit" value="Login">
</form>
</body>
</html>