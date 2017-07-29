<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Feedback</title>
    </head>
    <body background="http://cdn.pcwallart.com/images/light-blue-background-wallpaper-1.jpg">
    
        <jsp:useBean id="myBean" scope="session" class="MyServlets.Duke"/>
        <jsp:setProperty name="myBean" property="name"/>
        <jsp:setProperty name="myBean" property="mail"/>
        <jsp:setProperty name="myBean" property="message"/>
        
        <%
            int a = myBean.store();
            if(a==1){
                out.print("<h1 class='container alerts alert-success'>Feedback Submitted Successfully<br><br>Click <a href='index.jsp'><strong>here</strong></a> to go to homepage.</h1> ");
                out.print("<!--<p style='color:#E5E4E2; font-size: 30px'>Click <a href='index.jsp' style='color: yellow'>here</a> to go to homepage.</p>-->");
            }
            else{
                out.print("Element Not Stored");
            }
        %>  
    </body>
</html>