
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--Local CDN-->
        <link rel="stylesheet" href="Css/bootstrap.min.css">
        <script src="Js/bootstrap.min.js"></script>       
        <script type="text/javascript" src="Js/jquery-3.2.1.min.js"></script>

        <!--Web CDN-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>About Us</title>
        
        <style>
            @font-face{
                font-family: font1;
                src: url('DigitalStrip2BB_bold.ttf');
            }
            @font-face{
                font-family: font2;
                src: url('SFCartoonistHand.ttf');
            }
            @font-face{
                font-family: font3;
                src: url('DigitalStrip2BB_reg.ttf');
            }
</style>
    </head>
    <body background="Img/BackgroundImg.jpg">
        <div class="container">
            
            <div class="row">
                <img src="Img/ShoppersLogo.png" alt="Logo">
            </div>
            <br>
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

            <div class="row">
                <h1 style=" font-family: font1; font-size: 70px; color: #DEB887">Shoppers Square</h1>
                <h4 style="font-family: font3; font-size: 35px; color: #DEB887">India’s Ultimate Online Shopping Site</h4><br>
                <p style="font-size: 25.5px; color: #FFF8DC">
                    Shoppers Square is a retail company established in Mumbai, India in 2009. It has stores located across most of the
                    metro cities in India. Shoppers Square has followed an innovative business model by tying up with major brands 
                    to sell their products through its stores. Shoppers Square is run by the Retail Management Group led by David Bansal,
                    the CEO of the company. Shoppers Square has more than 1500 employees who handle the daily operations of the company
                    across its stores. Filtering the latest trends, prospects never seem to end when you are shopping with Shoppers Square. 
                    Best ever combos, reasonable price, wide product range & durable quality; a promise that Shoppers Square as a brand has made to 
                    its customers. We also endeavour on providing back to back irresistible offers and reasonably priced products on
                    ShopersSquare.com to make online shopping rich & prolific. Our shopaholic mantra for customers is accompanied by
                    our ethics of never compromising on the quality and delivering value based expectations. With a customer-friendly approach, 
                    Shoppers Square endeavors to deliver your products within the shortest possible time, and with a surety that you
                    will love what you choose.
                 </p>

            </div>
        </div>
    </body>
</html>
