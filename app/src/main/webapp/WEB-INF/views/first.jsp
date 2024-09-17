<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>First Page</title>
</head>
<body>
    <h1>
        ${message}
    </h1>
    <form action="/app/second" method="post">
        name: <input type="text" name="name" size="10"/><br>
        <input type="submit" value="送信">
    </form>
</body>
</html>