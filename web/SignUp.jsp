
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="/Shoppers_Square/Css/SignUp.css">

        <!--Stylize Checkbox Buttons-->
        <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="Css/build.css">
       <!-- <script src="bootstrap-checkbox.min.js"></script>-->
       
        <title>Sign Up</title>
        
        <script>
            
            /*Password Show/Hide*/
            $(document).ready(function () 
            {
                $("#showHide").click(function () 
                {
                    if ($(".password").attr("type")=="password") 
                    {
                        $(".password").attr("type", "text");
                    }
                    else
                    {
                        $(".password").attr("type", "password");
                    }
 
                });

            /*Password Matcher*/
            var password = document.getElementById("pass");
            var confirm_password = document.getElementById("confirm_pass");

            function validatePassword()
            {
                if(password.value != confirm_password.value) 
                {
                    confirm_password.setCustomValidity("Passwords Don't Match. Please Re-Enter the Password.");
                } 
                else 
                {
                    confirm_password.setCustomValidity('');
                }
            }
            
            password.onchange = validatePassword;
            confirm_password.onkeyup = validatePassword;
});
            /*Enhancing ToolTip*/
            
            $(document).ready(function()
            {
                $('[data-toggle="tooltip"]').tooltip();   
            });

        </script>
        
    </head>
    <body background="Img/BackgroundImg.jpg">
        <div class="container">
        
            <!--First Row-->
            <div class="row">
                <img src="Img/ShoppersLogo.png" alt="Cannot Load">
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
            <!--Second Row-->
            <div class="row">

                <!--Empty Column-->
            <div class="col-xs-1 col-sm-3"></div>
        
               <div class="col-xs-10 col-sm-6">
                    
                   <form action="doSignup" method="post">
                  <fieldset>
                    <h1 class="fieldsetheader">Sign Up</h1>
                            
                     <div class="form1">
      
                     <label class="fontsizes"><b>First Name</b></label><br>
                               
                    <input class="textfields" style="font-size: 16px; outline: none;" type="text" placeholder="Enter First Name" name="signup" pattern="[A-Za-z]+" title="Use Only Alphabets" data-toggle="tooltip" data-placement="bottom" required>
                    <br><br>
      
                    <label class="fontsizes"><b>Last Name</b></label><br>
                                 
                    <input class="textfields" style="font-size: 16px; outline: none;" type="text" placeholder="Enter Last Name" name="signup" pattern="[A-Za-z]+" data-toggle="tooltip" data-placement="bottom" title="Use Only Alphabets" required>
                    <br><br>

                    <label class="fontsizes"><b>Mobile</b></label><br>
      
                    <input class="textfields" maxlength="10" name="signup" style="font-size: 16px; border: 1px solid #ccc; outline: none;" type="text" placeholder="Enter Mobile" pattern="[0-9]{10}" data-toggle="tooltip" data-placement="bottom" title="10 digit Mobile Number" required>
                    <br><br>
 
                    <label class="fontsizes"><b>Email</b></label><br>
                    <input class="textfields" style="font-size: 16px; outline: none;" type="text" placeholder="Enter Email" pattern="^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$" name="signup" data-toggle="tooltip" data-placement="top" title="username@hostname" required>
                    
                    <br><br>
                    
                    <label class="fontsizes"><b>Password</b></label><br>
                    <input class="textfields password" style="font-size: 16px; outline: none;" type="password" id="pass" placeholder="Enter Password" pattern="(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$" name="signup" data-toggle="tooltip" data-placement="right" title="Minimum 8 Characters long.&#013;Use atleast One UpperCase, One LowerCase & One Special Symbol/Digit.&#013;" required>
                    <br>
                            
                         <div class="checkbox checkbox-primary">
                             <input id="showHide" type="checkbox" style="outline: none;">
                                    <label for="showHide">
                                        Show Password?
                                    </label>
                        </div>

    <label class="fontsizes"><b>Confirm Password</b></label><br>
    <input class="textfields" style="font-size: 16px; outline: none;" type="password" id="confirm_pass" placeholder="Re-enter Password" name="psw-repeat" data-toggle="tooltip" data-placement="right" title="Match Entered Password" required><br>
                  
         <label class="fontsizes"><b>Address</b></label>          
         <div style="width: 100%">
             <textarea rows="4" name="signup" style="width: 80%; font-size: 17px; border-radius: 10px; resize: none; outline: none;" required></textarea>
         </div>
         <br>
    
                            </div>
    <div class="clearfix">
        <button type="submit" class="signupbtn" style="outline: none;">Sign Up</button>
        <button type="reset" class="cancelbtn" style="color: white; outline: none;">Reset</button> 
    
  </div>
      </fieldset>
</form>
                    </div>

                <!--Empty Columns-->
                <div class="col-xs-1 col-sm-3"></div>
                </div>
            </div>
    </body>
</html>
