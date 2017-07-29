
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Admin Log Out Success</title>
        
    </head>
    <body background="http://cdn.pcwallart.com/images/light-blue-background-wallpaper-1.jpg">
            <% if(session.getAttribute("aname")!=null){
            session.invalidate();
            out.println("<h1 class='container alerts alert-success'>You Have Successfully Logged Out.<br><br>You Will Be Redirect In Few Seconds.</h1>");
    %>
    
    <script type="text/javascript">
    function Redirect()
    {
    window.location="index.jsp";
    }
    document.write("<!--<h1 class='alerts alert-success'>You will be redirect in few seconds.</h1>-->");
    setTimeout('Redirect()', 5000);
    </script>
    <% 
        }
        else {
    
    %>
    <br>
    <div class="container alerts alert-success">
    <h1>You're already Logged out.</h1>
    <h1>Click <a href="index.jsp"><strong>here</strong></a> to go to home page.</h1>
    </div>
    <%}%>
    </body>
</html>
