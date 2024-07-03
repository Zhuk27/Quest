<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Поражение</title>
    <style>
        body{
            text-align: center;
            font-size: 34px;
        }
    </style>
</head>
<body>
<h1>${sessionScope.get("login")}, к сожалению ты проиграл(</h1>
<form class="form-horizontal">
    <fieldset>

        <!-- Form Name -->
        <legend></legend>

        <!-- Button (Double) -->
        <div class="form-group">
            <label class="col-md-4 control-label" for="button1id"></label>
            <div class="col-md-8">
                <button id="button1id" name="buttonClicked" value="firstQuestion" class="btn btn-primary">Начать заново</button>
                <button id="startAgain" name="buttonClicked" value="authorization" class="btn btn-info">Войти в другой аккаунт</button>
            </div>
        </div>

    </fieldset>
</form>


</body>
</html>
