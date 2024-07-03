<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Второй вопрос</title>
    <style>
        h1 {
            text-align: center;
            font-size: 44px;
        }
    </style>
</head>
<body>
<h1>Дорогой, ${sessionScope.get("login")}, вот и второй вопрос</h1>
<h1>Ты готов бороться с ленью и побеждать её?</h1>
<form class="form-horizontal" method = "get" action="questProcess">
    <fieldset>
        <div class="form-group">
            <label class="col-md-4 control-label" for="button1id">Этот вопрос посложней</label>
            <div class="col-md-8">
                <button id="button1id" name="buttonClicked" value="lose" class="btn btn-danger">НЕТ</button>
                <button id="button2id" name="buttonClicked" value="thirdQuestion" class="btn btn-success">ДА</button>
            </div>
        </div>
    </fieldset>
</form>
</body>
</html>

