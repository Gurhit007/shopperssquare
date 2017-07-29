<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Sign In As</title>
    </head>
    <body background="http://cdn.pcwallart.com/images/light-blue-background-wallpaper-1.jpg">
        <div class="container">
        <br><br><br><br>
        <div class="alert alert-danger">
            
        <% if(session.getAttribute("aname")==null){%>
        <h1 align="center">Sign In As <a href=SignIn.jsp>
                    <br><br> <strong>User</strong></a>
            </h1>
        <h1 align="center"><a href="AdminSignIn.jsp"><strong>Admin</strong></a></h1>
        <%}else {%>
        <h1 align="center"><a href="AdminLogOutSuccess.jsp"><strong>Log Out</strong></a></h1>
                    <%}%>
        </div>
        </div>
    </body>
</html>
