<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Первый вопрос</title>
    <style>
        h1 {
            text-align: center;
            font-size: 44px;
        }
    </style>
</head>
<body>
<h1>Привет ${sessionScope.get("login")}</h1>
<h1>Ты хочешь учить джаву и писать код?</h1>

<form class="form-horizontal" method = "get" action="questProcess">
    <fieldset>
        <div class="form-group">
            <label class="col-md-4 control-label" for="button1id">Какой же твой ответ?</label>
            <div class="col-md-8">
                <button id="button1id" name="buttonClicked" value="lose" class="btn btn-danger">НЕТ</button>
                <button id="button2id" name="buttonClicked" value="secondQuestion" class="btn btn-success">ДА</button>
            </div>
        </div>
    </fieldset>
</form>
</body>
</html>
