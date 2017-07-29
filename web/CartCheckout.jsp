
<%@page import="cart.CartDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Checkout</title>
    </head>
    
    <%
    
        CartDAOImpl cdao = new CartDAOImpl();
    %>
    
    <body background="http://cdn.pcwallart.com/images/light-blue-background-wallpaper-1.jpg">
        <br><br>
        <div style="text-align: center" class="container alerts alert-success" >
            <h1><strong>Thank You</strong></h1>
            <h3><a href="ViewProducts.jsp">Back to Products</a><br></h3>
            <h3><a href="index.jsp">Home</a></h3>
        </div>
        
    </body>
</html>
