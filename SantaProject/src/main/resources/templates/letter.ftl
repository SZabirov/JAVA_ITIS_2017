<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Писмьо Деду Морозу</title>

    <!-- Bootstrap core CSS -->
    <link href="/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="cover.css" rel="stylesheet">

</head>

<body>
<nav class="navbar navbar-toggleable-md navbar-inverse bg-inverse">
    <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse"
            data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false"
            aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <a class="navbar-brand" href="#">Navbar</a>

    <div class="collapse navbar-collapse">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/login">Login</a>
            </li>
        </ul>

        <form action="/logout" class="form-inline my-2 my-md-0">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Logout</button>
        </form>

    </div>
</nav>
<div class="container">
    <h1>Письмо Деду Морозу:</h1>
    <form method="post">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

        <div class="form-group">
            <label for="email">Ваш email: </label>
            <input type="email" class="form-control" name="email" id="email" aria-describedby="emailHelp" placeholder="Введите email">
            <small id="emailHelp" class="form-text text-muted">Email требуется для обратной связи</small>
        </div>

        <div class="form-group">
            <label for="name">Ваше имя: </label>
            <input type="text" class="form-control" id="name" name="name" placeholder="Введите имя">
        </div>

        <div class="form-group">
            <label for="age">Сколько вам лет: </label>
            <input type="number" class="form-control" id="age" name="age" placeholder="Введите возраст">
        </div>

        <div class="form-group">
            <label for="letterText">Текст письма: </label>
            <textarea class="form-control" id="letterText" name="letterText" rows="3" placeholder="Напишите письмо"></textarea>
        </div>

        <input class="btn btn-primary" type="submit">

    </form>
</div>
</body>
</html>