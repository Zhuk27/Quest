<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Третий вопрос</title>
    <style>
        h1 {
            text-align: center;
            font-size: 44px;
        }
    </style>
</head>
<body>
<h1>${sessionScope.get("login")}, ты готов выделять много времени джаве?</h1>
<form class="form-horizontal" method = "get" action="questProcess">
    <fieldset>
        <div class="form-group">
            <label class="col-md-4 control-label" for="button1id">Какие твои действия???</label>
            <div class="col-md-8">
                <button id="button1id" name="buttonClicked" value="lose" class="btn btn-danger">Нет, я слабый</button>
                <button id="button2id" name="buttonClicked" value="win" class="btn btn-success">Да, я её изучу</button>
            </div>
        </div>
    </fieldset>
</form>
</body>
</html>

