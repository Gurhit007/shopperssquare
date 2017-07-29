
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="Css/build.css">
        <link rel="stylesheet" href="Css/SignIn.css">
        
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
        
        <title>Admin Sign In</title>
    </head>
    <body background="Img/BackgroundImg.jpg">
        <div class="container">
            
            <div class="row" style="margin-top: -1.2em">
                    <img src="Img/ShoppersLogo.png" alt="Logo">
            </div>
        <div class="row" id="content">
                
                <!--Empty Column-->
                <div class="col-xs-0 col-sm-3"></div>
            
                <!--Second Column-->
            <div class="col-xs-12 col-sm-6">
                <form action="AdminLogDetails.jsp" method="post">
            <fieldset>
                <h1 class="fieldsetheader">Sign In</h1>

              <div class="container1">
                  
                  
                  <label style="font-size: 15.5px"><b>ID</b></label><br>
                      
         <input class="textfields" style="font-size: 16px; outline: none;" type="text" placeholder="Enter ID" name="adid" required>
                   
         <label style="font-size: 15.5px"><b>Password</b></label>
                  
         <input class="textfields password" style="font-size: 16px; outline: none;" type="password" placeholder="Enter Password" name="adpass" required>
                    
                  <div class="checkbox checkbox-primary">
                        <input id="showHide" type="checkbox">
                        <label for="showHide">Show Password?</label>
                    </div>
                 
                 </div>
                
                    <div class="clearfix" style="text-align: center;">
                        <button id="allbtn" type="submit" class="loginbtn" style="outline: none;">Login</button>
                        
                    </div>
                    <br>
               
         </fieldset>
       </form>
            </div>    
            
                <!--Empty Column-->
                <div class="col-xs-0 col-sm-3"></div>
            
        </div>
        </div>
    </body>
</html>
