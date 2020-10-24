<#--<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>-->
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



    <#--<form class="form-signin" method="post" action="/user/register">
        <h2 class="form-signin-heading">Регистрация пользователя</h2>
        <p>
            <label for="username" class="sr-only">Имя пользователя</label>
            <input type="text" id="username" name="username" class="form-control" value="user" placeholder="Имя пользователя" required autofocus>
        </p>
        <p>
            <label for="password" class="sr-only">Пароль</label>
            <input type="password" id="password" name="password" class="form-control" value="1234" placeholder="Пароль" required>
        </p>

        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

        <button class="btn btn-lg btn-primary btn-block" type="submit">Войти</button>
    </form>-->






    <form name="user" action="/user/register" method="post">
        <p>Имя</p>
        <input title="Name" type="text" name="username"><br>
        <input title="Name" type="text" name="password"><br>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="OK">
    </form>



<#--    <@sf.form class="form-signin" action="/user/register" method="post" modelAttribute="user">-->
<#--        <h2 class="form-signin-heading">Регистрация пользователя</h2>-->
<#--    <p>-->
<#--        <@sf.label for="username" class="sr-only" path="username">Имя</@sf.label>-->
<#--        <@sf.input id="username" name="username" class="form-control" path="username"/>-->
<#--        <@sf.errors path="username"/>-->
<#--    </p>-->
<#--    <p>-->
<#--        <@sf.label for="password" class="sr-only" path="password">Пароль</@sf.label>-->
<#--        <@sf.input type="password" id="password" name="password" class="form-control" path="password"/>-->
<#--        <@sf.errors path="password"/>-->
<#--    </p>-->
<#--        <button class="btn btn-lg btn-primary btn-block" type="submit" value="Register">Зарегистрироваться</button>-->
<#--    </@sf.form>-->












<#--    <form action="/user/register" method="post">-->

<#--        <input type="text" name="username">-->
<#--        <input type="password" name="password">-->


<#--        <input type="submit">-->

<#--    </form>-->



</div>

</body>
</html>