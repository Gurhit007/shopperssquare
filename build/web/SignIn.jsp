
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
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <!--Stylize CheckBox Buttons-->
        <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="Css/build.css">
       <!-- <script src="bootstrap-checkbox.min.js"></script>-->

        <link rel="stylesheet" href="Css/SignIn.css">
        <title>Sign In</title>
        
        <script>
            $(document).ready(function () {
                $("#showHide").click(function () {
                    if ($(".password").attr("type") == "password") 
                    {
                        $(".password").attr("type", "text");
                    }
                    else 
                    {
                        $(".password").attr("type", "password");
                    }

                });
            });
        </script>
    </head>
    <body background="Img/BackgroundImg.jpg">
        <div class="container">
            
            <div class="row" style="margin-top: -1.2em">
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
            <br>
            <div class="row" id="content">
                
                <!--Empty Column-->
                <div class="col-xs-0 col-sm-3"></div>
            
                <!--Second Column-->
            <div class="col-xs-12 col-sm-6">
                <form action="logdetails.jsp" method="post">
            <fieldset>
                <h1 class="fieldsetheader">Sign In</h1>

              <div class="container1">
         
                    <label style="font-size: 15.5px"><b>Email</b></label>
                      
                   <input class="textfields" style="font-size: 16px; outline: none;" type="text" placeholder="Enter Email" name="mail" required>
                   
                    <label style="font-size: 15.5px"><b>Password</b></label>
                  
                    <input class="textfields password" style="font-size: 16px; outline: none;" type="password" placeholder="Enter Password" name="pass" required>
                    
                  <div class="checkbox checkbox-primary">
                        <input id="showHide" type="checkbox">
                        <label for="showHide">Show Password?</label>
                    </div>
                 
                 </div>
                
                    <div class="clearfix" style="text-align: center;">
                        <button id="allbtn" type="submit" class="loginbtn">Login</button>
                        &nbsp;&nbsp;
                    </div>
                    <br><br>
                
         </fieldset>
       </form>
            </div>    
            
                <!--Empty Column-->
                <div class="col-xs-0 col-sm-3"></div>
            
        </div>
            </div>
    </body>
</html>
