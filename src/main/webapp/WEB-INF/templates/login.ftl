<!DOCTYPE html>
<html lang="ru">
<head>

    <meta charset="utf-8">
    <title>Вход в Аккаунт</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous"/>

</head>
<body>
<div class="container">

    <form class="form-signin" method="post" action="/login">
        <h2 class="form-signin-heading">Вход для теста</h2>
        <p>
            <label for="username" class="sr-only">Имя пользователя</label>
            <input type="text" id="username" name="name" class="form-control" value="user" placeholder="Имя пользователя" required autofocus>
        </p>
        <p>
            <label for="password" class="sr-only">Пароль</label>
            <input type="password" id="password" name="password" class="form-control" value="1234" placeholder="Пароль" required>
        </p>

        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

        <button class="btn btn-lg btn-primary btn-block" type="submit">Войти</button>
    </form>

</div>
</body></html>