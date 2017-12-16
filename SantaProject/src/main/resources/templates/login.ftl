<!DOCTYPE html>
<html>
<head>
    <title>Spring Security Example </title>
    <link rel="stylesheet" href="/css/bootstrap.min.css" type="text/css">
</head>
<body>
<div class="container">
<form class="loginForm" action="/login" method="post">

    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <div><label> User Name : <input class="form-control" type="text" name="username"/> </label></div>
    <div><label> Password: <input class="form-control" type="password" name="password"/> </label></div>
    <div><input  class="btn btn-primary" type="submit" value="Sign In"/></div>
</form>
<#if model.error.isPresent()>
        <div class="alert alert-danger" role="alert">Логин или пароль введены неверно</div>
</#if>
</div>
</body>
</html>