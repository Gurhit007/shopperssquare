
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <link rel="stylesheet" href="Css/bootstrap.min.css">
        <script src="Js/bootstrap.min.js"></script>
        <script type="text/javascript" src="Js/jquery-3.2.1.min.js"></script>
        <title>Contact Us</title>
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
            <fieldset>
            <div class="row" style="padding: 5px; border: 1px solid #333; box-shadow: 10px 10px 5px #333;">
                <div class="col-xs-4" style="border-right: 1px solid #333" >
                   <b style="font-size: 20px; color: white"> Call Us : </b><br><br>
                    <span style="font-size: 16.5px; color: white">(0124) 6150000 or 1800 208 9898</span><br>
                    <span style="font-size: 16.5px; color: white">10:00 AM - 7:00 PM(7 days a week)</span><br>
                    
                </div>
                
               <div class="col-xs-4" style="border-right: 1px solid #333">
                   <b style="font-size: 20px; color: white"> Write Us : </b><br><br>
                    <span style="font-size: 16.5px; color: white">Knowledge House,</span><br>
                    <span style="font-size: 16.5px; color: white">Shyam Nagar, Off Jogeshwari Vikhroli Link Road,</span><br>
                    <span style="font-size: 16.5px; color: white">Jogeshwari (East),</span><br>
                    <span style="font-size: 16.5px; color: white">Mumbai - 400 060,</span><br>
                    <span style="font-size: 16.5px; color: white">Maharashtra, India</span><br>
                    
                </div>

                <div class="col-xs-4">
                    <b style="font-size: 20px; color: white"> Corporate Address :</b><br><br>
                    <span style="font-size: 16.5px; color: white">Tower C, 24/7 Park,</span><br>
                    <span style="font-size: 16.5px; color: white">L.B.S. Marg, Vikhroli (West),</span><br>
                    <span style="font-size: 16.5px; color: white">Mumbai - 400 083,</span><br>
                    <span style="font-size: 16.5px; color: white">Maharashtra, India</span><br>
                    <span style="font-size: 16.5px; color: white">Telephone: 1800 208 9898</span><br>
                    <span style="font-size: 16.5px; color: white">Ph: (0124) 6150000</span><br>
                </div>
            </div>
                </fieldset>
                    <br><br>
                    
                    <div class="container">
	<div class="row">
      <div class="col-md-6">
        <div >
          <form action="Feedback.jsp" class="form-horizontal" method="post">
          <fieldset>
              <legend class="text-center" style="font-size: 20px; color: white"><b>Send Your Message</b></legend>
    
            <!-- Name input-->
            <div class="form-group">
              <label class="col-md-3 control-label" for="name" style="font-size: 16.5px; color: white">Name</label>
              <div class="col-md-9">
                <input id="name" name="name" type="text" placeholder="Your name" class="form-control">
              </div>
            </div>
    
            <!-- Email input-->
            <div class="form-group">
              <label class="col-md-3 control-label" for="email" style="font-size: 16.5px; color: white">E-mail</label>
              <div class="col-md-9">
                <input id="email" name="mail" type="text" placeholder="Your email" class="form-control">
              </div>
            </div>
    
            <!-- Message body -->
            <div class="form-group">
              <label class="col-md-3 control-label" for="message" style="font-size: 16.5px; color: white">Message</label>
              <div class="col-md-9">
                <textarea class="form-control" id="message" name="message" placeholder="Please enter your message here..." rows="5"></textarea>
              </div>
            </div>
    
            <!-- Form actions -->
            <div class="form-group">
              <div class="col-md-12 text-right">
                <button type="submit" class="btn btn-primary btn-lg">Submit</button>
              </div>
            </div>
          </fieldset>
          </form>
        </div>
      </div>
	</div>
</div>
                    
          </div>
    </body>
</html>
