
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Admin Log In Success</title>
    </head>
    <body background="http://cdn.pcwallart.com/images/light-blue-background-wallpaper-1.jpg">
        <br>
        <div class="container alerts alert-success">
        <h1>Successfully Log in</h1>
        <h2>Welcome <%=session.getAttribute("aname")%></h2>
        <h2>Click <a href="Product.jsp"><strong>here</strong></a> to modify the Products</h2>
        </div>
    </body>
</html>
