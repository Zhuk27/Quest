<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Квест Джава</title>
    <style>
        h1{
            font-size: 44px;
        }
    </style>
</head>
<body>
<form class="form-horizontal" method="post" action="quest">
    <fieldset>
        <!-- Form Name -->
        <legend>Авторизация</legend>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="logininput">Login</label>
            <div class="col-md-4">
                <input id="logininput" name="login" type="text" placeholder= "login" class="form-control input-md">
                <span class="help-block">Логин должен быть уникален</span>
            </div>
        </div>
        <!-- Password input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="passwordinput">Password</label>
            <div class="col-md-4">
                <input id="passwordinput" name="password" type="password" class="form-control input-md">
                <span class="help-block">Минимум 5 символов</span>
            </div>
        </div>

        <!-- Button (Double) -->
        <div class="form-group">
            <label class="col-md-4 control-label" for="button1id"></label>
            <div class="col-md-8">
                <button id="button1id" name="buttonClicked" value="login" class="btn btn-default">Войти</button>
                <button id="button2id" name="buttonClicked" value="register" class="btn btn-primary">Регистрация</button>
            </div>
        </div>

    </fieldset>
</form>
<c:if test="${sessionScope.get('successAuthorization') == false}">
    <h1>ошибка</h1>
    <p>PS: Пароль и логин не должен содержать пробелов, также если этот логин уже зарегистрирован, либо неверный лог/пасс -- также появится этот текст</p>
</c:if>
</body>
</html>
