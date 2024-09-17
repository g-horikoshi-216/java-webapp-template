<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Second Page</title>
    </head>
    <body>
        <h1>Second Page</h1>
        <p>あなたの名前は、<% request.getAttribute("name") %>です。</p>
    </body>
</html>