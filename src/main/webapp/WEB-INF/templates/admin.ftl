<!DOCTYPE html>
<html lang="ru">

<head>
    <meta charset="UTF-8">
    <title>Привет мир!!!</title>

    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous"/>

</head>

<body>

Это админ
<br>
<br>

<form class="form-signin" method="post" action="/logout">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <button class="btn btn-lg btn-primary btn-block" type="submit">Выход</button>
</form>

<br>
<br>

<a href="/"><button class="form-signin btn btn-lg btn-primary btn-block" type="submit" >Главная</button></a>

</body>
</html>