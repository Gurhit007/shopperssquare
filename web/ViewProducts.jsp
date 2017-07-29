
<%@page import="products.Products"%>
<%@page import="java.util.List"%>
<%@page import="products.ProductsDAOImpl"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%
    ProductsDAOImpl pdao = new ProductsDAOImpl();

    List<Products> list = pdao.getProducts();
        
        request.setAttribute("productData", list);
        
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>View Products</title>
        <style>
            th{
                padding: 20px;
                font-size: 22px;
                color: #D16587;
                text-align: center;
            }
            td{
                font-size: 20px;
                text-align: center;
            }
        </style>
    </head>
    <body background="Img/BackgroundImg.jpg">
        <div class="container">

            <!--First Row-->
            <div class="row">
                <img src="Img/ShoppersLogo.png" alt="Logo">
                <% if(session.getAttribute("aname")==null){%>
                        <a href="AdminSignIn.jsp"></a>
                        <%}else {%><br>
                    <a href="AdminLogOutSuccess.jsp" class="btn btn-danger btn-md" style="float: right">
                        <span class="glyphicon glyphicon-log-out" > LogOut</span>
                    </a>
                    <%}%>
            </div>

            <br>
            <!--Second Row-->
            <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <ul class="nav navbar-nav">
                    <li style="font-size: 20px"><a href="index.jsp">Home</a></li>
                    <li style="font-size: 20px"><a href="ViewProducts.jsp">Products</a></li>
                    <li style="font-size: 20px"><a href="ContactUs.jsp">Contact Us</a></li>
                    <li style="font-size: 20px"><a href="AboutUs.jsp">About Us</a></li>
                    
                    <li style="font-size: 20px">
                        <% if(session.getAttribute("uname")==null){%>
                        <a href="SignUp.jsp">Sign Up</a></li>
                    <%}else {%><%}%>
                    
                    <li style="font-size: 20px">
                        <% if(session.getAttribute("uname")==null){%>
                        <a href="SignInAs.jsp">Sign In</a>
                    <%}else {%>
                    <a href="logout.jsp">Log Out</a>
                    <%}%>
                    </li>
                </ul>
  </div>
</nav>   
        
        <table class="table" style="background-color: #FFEBCD;">
            <br>
            <thead style="background-color: lightpink">
            <th>Product Name</th>
            <th>Product Price</th>
            <th>View</th>
            <% if(session.getAttribute("aname")==null){%>
            <%} else {%>
            <th>Update</th>
            <th>Delete</th>
            <%}%>
        </thead>
        <c:forEach items="${productData}" var="x">
        <tr>
            <td class="text-info">${x.getProductname()}</td>
            <td class="text-info">${x.getPrice()}</td>
            <!--<td>${x.getCategory()} <img src="${x.getLink()}"> </td>-->
            <td>
                <a class="btn btn-info btn-md" href="ViewProduct?id=${x.getId()}">
                    <span class="glyphicon glyphicon-eye-open"></span>
                </a>
            </td>
            
            <% if(session.getAttribute("aname")==null){%>
            <%} else {%>
            <td>
                <a class="btn btn-warning btn-md" href="UpdateProducts?id=${x.getId()}">
                    <span class="glyphicon glyphicon-pencil"></span>
                </a>
            </td>
            <td>
                <a class="btn btn-danger btn-md" href="DeleteProduct?id=${x.getId()}">
                    <span class="glyphicon glyphicon-trash"></span>
                </a>
            </td>
            <%}%>
            
            </tr>
        </c:forEach>
        
        </table> 
    </body>
</html>
