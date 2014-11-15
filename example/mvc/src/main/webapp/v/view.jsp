<%-- Present data to the user ins any supported format and layout --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black-translucent">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no, minimal-ui">
    <link rel="shortcut icon" type="image/png" href="/favicon.png">
    <meta name="author" content="Steven Wang">
    <meta name="description" content="JCConf TW 2014 :: Modern Design Pattern | MVC Example">

    <title>JCConf TW 2014 :: Modern Design Pattern | MVC Example</title>
</head>
<body>
    <%-- receive data --%>
    <h1>Hello, ${model.name}</h1>

    <form action="controller" method="post">
        <label for="name">My name is </label>
        <input type="text" id="name" name="name" value="${model.name}" />
        <button>Submit</button>
    </form>
</body>
</html>
