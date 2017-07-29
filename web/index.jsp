
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Homepage</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--Local CDN-->
        <link rel="stylesheet" href="Css/bootstrap.min.css">
        <script src="Js/bootstrap.min.js"></script>
        <script type="text/javascript" src="Js/jquery-3.2.1.min.js"></script>
        
        <!--Web CDN-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="Css/itemthumb.css">
        <!--Footer CDN-->
        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
        <link rel="stylesheet" href="Css/footerCss.css">
        
    </head>
    <body background="Img/BackgroundImg.jpg">
        <div class="container">

            <!--First Row-->
            <div class="row">
                <img src="Img/ShoppersLogo.png" alt="Logo">
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
            <!--Carousel-->
            <div id="myCarousel" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
                <ol class="carousel-indicators">
                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                    <li data-target="#myCarousel" data-slide-to="1"></li>
                    <li data-target="#myCarousel" data-slide-to="2"></li>
                    <!--<li data-target="#myCarousel" data-slide-to="3"></li>-->
                </ol>

                <!-- Wrapper for slides -->
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <img src="Img/DSLR.jpg" alt="DSLR">
                </div>

                <!--<div class="item">
                    <img src="Img/Mixer.jpg" alt="Mixer">
                </div>-->
    
                <div class="item">
                    <img src="Img/SmartPhone.jpg" alt="SmartPhone">
                </div>

                <div class="item">
                    <img src="Img/Watches.jpg" alt="Watches">
                </div>
            </div>
          </div>
                <br>
        </div>
                
    <!--Thumbnail List-->
    <div class="container-fluid">
    <div class="col-xs-12">
        
        <h2 class="container" style="color: white; font-weight: 600; text-align: center">Electronics</h2>
    <div class="carousel slide" id="firstCarousel">
        <div class="carousel-inner">
            
            <div class="item active">
                <ul class="thumbnails">
                    <li class="col-sm-3 col-md-3 col-lg-3">
    			<div class="fff">
                            <div class="thumbnail">
                                <a href="#">
                                    <img class="pic" src="Img/PNG Image/Micromax Canvas Spark 3.jpg" alt="">
                                </a>
                            </div>
                            <div class="caption">
                                <h4 style="text-align: center">Micromax Canvas Spark 3</h4>
                                <h4 style="text-align: center">&#8377 3,999 &nbsp; <span style="color: green">4% off</span></h4>
                                
                            </div>
                        </div>
                    </li>
                        
                    <li class="col-sm-3">
			<div class="fff">
                            <div class="thumbnail">
                                <a href="#"><img class="pic" src="Img/PNG Image/Samsung Galaxy s6 JPG.jpg" alt=""></a>
                            </div>
                            <div class="caption">
				<h4 style="text-align: center">Samsung Galaxy s6</h4>
				<h4 style="text-align: center">&#8377 55,999 &nbsp;<span style="color: green">12% off</span></h4>
				
                            </div>
                        </div>
                    </li>
                        
                    <li class="col-sm-3">
			<div class="fff">
                            <div class="thumbnail">
                                <a href="#"><img class="pic" src="Img/PNG Image/iPhone 6s PNG.png" style="height: 316px" alt=""></a>
                            </div>
                            <div class="caption">
				<h4 style="text-align: center">iPhone 6s</h4>
				<h4 style="text-align: center">&#8377 42,499 &nbsp; <span style="color: green">5% off</span></h4>
				
                            </div>
                        </div>
                    </li>
                        
                    <li class="col-sm-3">
                        <div class="fff">
                            <div class="thumbnail">
				<a href="#"><img class="pic" src="Img/PNG Image/Honor 8 Flipkart.jpeg" style="height: 316px"  alt=""></a>
                            </div>
                            <div class="caption">
				<h4 style="text-align: center">Huawei Honor 8</h4>
				<h4 style="text-align: center">&#8377 20,890 &nbsp; <span style="color: green">6% off</span></h4>
                            </div>
                        </div>
                    </li>
                </ul>
            </div><!-- /Slide1 --> 
            
            <div class="item">
                <ul class="thumbnails">
                    <li class="col-sm-3">
			<div class="fff">
                            <div class="thumbnail">
				<a href="#"><img class="pic" src="Img/PNG Image/HP Laptop.jpg" alt=""></a>
                            </div>
                            <div class="caption">
				<h4 style="text-align: center">HP Laptop</h4>
				<h4 style="text-align: center">&#8377 32,700 &nbsp; <span style="color: green">4% off</span></h4>
                            </div>
                        </div>
                    </li>
                        
                    <li class="col-sm-3">
			<div class="fff">
                            <div class="thumbnail">
				<a href="#"><img class="pic" src="Img/PNG Image/Dell Laptop.jpg" alt=""></a>
                            </div>
                            <div class="caption">
                                <h4 style="text-align: center">Dell Laptop</h4>
				<h4 style="text-align: center">&#8377 27,990 &nbsp; <span style="color: green">5% off</span></h4>
                            </div>
                        </div>
                    </li>
                    
                    <li class="col-sm-3">
			<div class="fff">
                            <div class="thumbnail"> 
				<a href="#"><img class="pic" src="Img/PNG Image/Sony Headphone.jpg" alt=""></a>
                            </div>
                            <div class="caption">
                                <h4 style="text-align: center">Sony Headphones</h4>
				<h4 style="text-align: center">&#8377 1,899 &nbsp; <span style="color: green">8% off</span></h4>
                            </div>
                        </div>
                    </li>
                    
                    <li class="col-sm-3">
                        <div class="fff">
                            <div class="thumbnail">
                                <a href="#"><img class="pic" src="Img/PNG Image/Canon Camera.jpg" alt=""></a>
                            </div>
                            <div class="caption">
                                <h4 style="text-align: center">Canon Camera</h4>
                                <h4 style="text-align: center">&#8377 34,500 &nbsp; <span style="color: green">11% off</span></h4>
                            </div>
                        </div>
                    </li>
                </ul>
              </div><!-- /Slide2 --> 
           </div>
            
        </div><!-- /#firstCarousel -->
        <!-- /.control-box -->
	   <nav>
                <ul class="control-box pager">
                    <li>
                        <a data-slide="prev" href="#firstCarousel" class="">
                            <i class="glyphicon glyphicon-chevron-left"></i>
                        </a>
                    </li>
                    <li>
                        <a data-slide="next" href="#firstCarousel" class="">
                            <i class="glyphicon glyphicon-chevron-right"></i>
                        </a>
                    </li>
                    
		</ul>
            </nav>
        <br>
        
        <!--SecondCarousel-->
        
        <h2 class="container" style="color: white; font-weight: 600; text-align: center">Footwear</h2>
       <div class="carousel slide" id="secondCarousel">
        <div class="carousel-inner">
            
            <div class="item active">
                <ul class="thumbnails">
                    <li class="col-sm-3">
    			<div class="fff">
                            <div class="thumbnail">
                                <a href="#"><img class="pic" src="Img/PNG Image/Puma Flipkart.jpg" alt=""></a>
                            </div>
                            <div class="caption">
                                <h4 style="text-align: center">Puma Sports Shoes</h4>
                                <h4 style="text-align: center">&#8377 1,464 &nbsp; <span style="color: green">7% off</span></h4>
                            </div>
                        </div>
                    </li>
                    
                    <li class="col-sm-3">
                        <div class="fff">
                            <div class="thumbnail">
				<a href="#"><img class="pic" src="Img/PNG Image/Adidas Flipkart.jpg" alt=""></a>
                            </div>
                            <div class="caption">
                                <h4 style="text-align: center">Adidas Sports Shoes</h4>
                                <h4 style="text-align: center">&#8377 4,999 &nbsp; <span style="color: green">40% off</span></h4>
                            </div>
                        </div>
                    </li>
                    
                    <li class="col-sm-3">
                        <div class="fff">
                            <div class="thumbnail">
				<a href="#"><img class="pic" src="Img/PNG Image/Sparx Flipkart.jpg" alt=""></a>
                            </div>
                            <div class="caption">
                                <h4 style="text-align: center">Sparx Sandals</h4>
                                <h4 style="text-align: center">&#8377 929 &nbsp; <span style="color: green">15% off</span></h4>
                            </div>
                        </div>
                    </li>
                    
                    <li class="col-sm-3">
                        <div class="fff">
                            <div class="thumbnail">
				<a href="#"><img class="pic" src="Img/PNG Image/Lancer Sandals.jpg" alt=""></a>
                            </div>
                            <div class="caption">
                                <h4 style="text-align: center">Lancer Sandals</h4>
                                <h4 style="text-align: center">&#8377 499 &nbsp; <span style="color: green">12% off</span></h4>
                            </div>
                        </div>
                    </li>
                </ul>
            </div>
                    
            <div class="item">
                <ul class="thumbnails">
                    <li class="col-sm-3">
                        <div class="fff">
                            <div class="thumbnail">
				<a href="#"><img class="pic" src="Img/PNG Image/Bata Formals.jpg" alt=""></a>
                            </div>
                            <div class="caption">
                                <h4 style="text-align: center">Bata Formal Shoes</h4>
                                <h4 style="text-align: center">&#8377 2,799 &nbsp; <span style="color: green">29% off</span></h4>
                            </div>
                        </div>
                    </li>
                    
                    <li class="col-sm-3">
                        <div class="fff">
                            <div class="thumbnail">
				<a href="#"><img class="pic" src="Img/PNG Image/Lee Loafers.jpg" alt=""></a>
                            </div>
                            <div class="caption">
                                <h4 style="text-align: center">Lee Loafers Shoes</h4>
                                <h4 style="text-align: center">&#8377 749 &nbsp; <span style="color: green">12% off</span></h4>
                            </div>
                        </div>
                    </li>
                    
                    <li class="col-sm-3">
                        <div class="fff">
                            <div class="thumbnail">
				<a href="#"><img class="pic" src="Img/PNG Image/Nike Flip Flops.jpg" alt=""></a>
                            </div>
                            <div class="caption">
                                <h4 style="text-align: center">Nike Flip Flops</h4>
                                <h4 style="text-align: center">&#8377 1,739 &nbsp; <span style="color: green">27% off</span></h4>
                            </div>
                        </div>
                    </li>
                    
                    <li class="col-sm-3">
                        <div class="fff">
                            <div class="thumbnail">
				<a href="#"><img class="pic" src="Img/PNG Image/Polo Casual.jpg" alt=""></a>
                            </div>
                            <div class="caption">
                                <h4 style="text-align: center">Polo Casual Shoes </h4>
                                <h4 style="text-align: center">&#8377 2,944 &nbsp; <span style="color: green">33% off</span></h4>
                            </div>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
       </div><!--second Carousel-->   
        
        <nav>
            <ul class="control-box pager">
                <li>
                    <a data-slide="prev" href="#secondCarousel" class="">
                        <i class="glyphicon glyphicon-chevron-left"></i>
                    </a>
                </li>
                <li>
                    <a data-slide="next" href="#secondCarousel" class="">
                        <i class="glyphicon glyphicon-chevron-right"></i>
                    </a>
                </li>    
            </ul>
        </nav>
        <br>
        
        <h2 class="container" style="color: white; font-weight: 600; text-align: center">Appliances</h2>
        <div class="carousel slide" id="thirdCarousel">
        <div class="carousel-inner">
            
            <div class="item active">
                <ul class="thumbnails">
                    <li class="col-sm-3">
    			<div class="fff">
                            <div class="thumbnail">
                                <a href="#"><img class="pic" src="Img/PNG Image/Samsung Tv.jpg" alt=""></a>
                            </div>
                            <div class="caption">
                                <h4 style="text-align: center">Samsung TV</h4>
                                <h4 style="text-align: center">&#8377 26,499 &nbsp; <span style="color: green">18% off</span></h4>
                            </div>
                        </div>
                    </li>
                        
                    <li class="col-sm-3">
			<div class="fff">
                            <div class="thumbnail">
				<a href="#"><img class="pic" src="Img/PNG Image/Panasonic Tv.jpg" alt=""></a>
                            </div>
                            <div class="caption">
				<h4 style="text-align: center">Panasonic TV</h4>
				<h4 style="text-align: center">&#8377 24,999 &nbsp; <span style="color: green">20% off</span></h4>
                            </div>
                        </div>
                    </li>
                        
                    <li class="col-sm-3">
			<div class="fff">
                            <div class="thumbnail">
				<a href="#"><img class="pic" src="Img/PNG Image/Whirlpool Washing Machine.jpg" alt=""></a>
                            </div>
                            <div class="caption">
				<h4 style="text-align: center">Whirlpool Washing Machine</h4>
				<h4 style="text-align: center">&#8377 20,999 &nbsp; <span style="color: green">16% off</span></h4>
                            </div>
                        </div>
                    </li>
                        
                    <li class="col-sm-3">
                        <div class="fff">
                            <div class="thumbnail">
				<a href="#"><img class="pic" src="Img/PNG Image/LG Washing Machine.JPG" alt=""></a>
                            </div>
                            <div class="caption">
				<h4 style="text-align: center">LG Washing Machine</h4>
				<h4 style="text-align: center">&#8377 25,999 &nbsp; <span style="color: green">12% off</span></h4>
                            </div>
                        </div>
                    </li>
                </ul>
            </div><!-- /Slide1 --> 
            
            <div class="item">
                <ul class="thumbnails">
                    <li class="col-sm-3">
			<div class="fff">
                            <div class="thumbnail">
				<a href="#"><img class="pic" src="Img/PNG Image/Samsung AC.jpg" alt=""></a>
                            </div>
                            <div class="caption">
				<h4 style="text-align: center">Samsung AC</h4>
				<h4 style="text-align: center">&#8377 35,999 &nbsp; <span style="color: green">20% off</span></h4>
                            </div>
                        </div>
                    </li>
                        
                    <li class="col-sm-3">
			<div class="fff">
                            <div class="thumbnail">
				<a href="#"><img class="pic" src="Img/PNG Image/Voltas AC.jpg" alt=""></a>
                            </div>
                            <div class="caption">
                                <h4 style="text-align: center">Voltas AC</h4>
				<h4 style="text-align: center">&#8377 31,999 &nbsp; <span style="color: green">18% off</span></h4>
                            </div>
                        </div>
                    </li>
                    
                    <li class="col-sm-3">
			<div class="fff">
                            <div class="thumbnail"> 
				<a href="#"><img class="pic" src="Img/PNG Image/LG Fridge.jpg" alt=""></a>
                            </div>
                            <div class="caption">
                                <h4 style="text-align: center">LG Fridge</h4>
				<h4 style="text-align: center">&#8377 22,999 &nbsp; <span style="color: green">18% off</span></h4>
                            </div>
                        </div>
                    </li>
                    
                    <li class="col-sm-3">
                        <div class="fff">
                            <div class="thumbnail">
				<a href="#"><img class="pic" src="Img/PNG Image/IFB Oven.jpg" alt=""></a>
                            </div>
                            <div class="caption">
                                <h4 style="text-align: center">IFB Oven</h4>
                                <h4 style="text-align: center">&#8377 9,499 &nbsp; <span style="color: green">15% off</span></h4>
                            </div>
                        </div>
                    </li>
                </ul>
              </div><!-- /Slide2 --> 
           </div>
        </div><!-- /#thirdCarousel -->
        <!-- /.control-box -->
	   <nav>
                <ul class="control-box pager">
                    <li>
                        <a data-slide="prev" href="#thirdCarousel" class="">
                            <i class="glyphicon glyphicon-chevron-left"></i>
                        </a>
                    </li>
                    <li>
                        <a data-slide="next" href="#thirdCarousel" class="">
                            <i class="glyphicon glyphicon-chevron-right"></i>
                        </a>
                    </li>
                    
		</ul>
            </nav>
        <br><br>
        
        <!--footer-->
<footer class="footer1">
<div class="container">

<div class="row"><!-- row -->
            
                <div class="col-lg-3 col-md-3"><!-- widgets column left -->
                <ul class="list-unstyled clear-margins"><!-- widgets -->
                        
                        	<li class="widget-container widget_nav_menu"><!-- widgets list -->
                    
                                <h1 class="title-widget">Useful links</h1>
                                
                                <ul>
                                    <li><a  href="AboutUs.jsp"><i class="fa fa-angle-double-right"></i> About Us</a></li>
                                    <li><a  href="ContactUs.jsp"><i class="fa fa-angle-double-right"></i> Contact Us</a></li>
                                </ul>
                    
				</li>
                            
                        </ul>
                         
                      
                </div><!-- widgets column left end -->
                
                <div class="col-lg-3 col-md-3"><!-- widgets column left -->
            
                <ul class="list-unstyled clear-margins"><!-- widgets -->
                        
                        	<li class="widget-container widget_nav_menu"><!-- widgets list -->
                    
                                <h1 class="title-widget">Rate Our Products</h1>
                                
                                <ul>
                                    <li><a  href="ContactUs.jsp"><i class="fa fa-angle-double-right"></i> Feed back</a></li>
                                </ul>
							</li>
                            
                        </ul>
                         
                      
                </div><!-- widgets column left end -->
                
                <div class="col-lg-3 col-md-3"><!-- widgets column left -->
            
                <ul class="list-unstyled clear-margins"><!-- widgets -->
                        
                        	<li class="widget-container widget_nav_menu"><!-- widgets list -->
                    
                                <h1 class="title-widget">Join Us</h1>
                                
                                <ul>


                <li><a href="SignIn.jsp"><i class="fa fa-angle-double-right"></i> Existing User</a></li>
 		<li><a href="SignUp.jsp"><i class="fa fa-angle-double-right"></i> New User</a></li>

                                </ul>
                    
							</li>
                            
                        </ul>
                         
                </div><!-- widgets column left end -->
                
                
                <div class="col-lg-3 col-md-3"><!-- widgets column center -->
                
                        <ul class="list-unstyled clear-margins"><!-- widgets -->
                        
                        	<li class="widget-container widget_recent_news"><!-- widgets list -->
                    
                                <h1 class="title-widget">Contact Detail </h1>
                                
                                <div class="footerp"> 
                                
                                <h2 class="title-median">Shoppers Square Pvt. Ltd.</h2>
                                <p><b>Email id:</b> <a href="#">info@shopperssquare.com</a></p>
                                <p><b>Helpline Numbers </b>

    <b style="color:#ffc106;">(8AM to 10PM):</b>  +91-8130890090, +91-8130190010  </p>
    
    <p><b>Corp Office / Postal Address</b></p>
    <p><b>Phone Numbers : </b>7042827160, </p>
    <p> 011-27568832, 9868387223</p>
                                </div>
                                
         <div class="social-icons">
            <ul class="nomargin">
                                    
                <a href="https://www.facebook.com/bootsnipp"><i class="fa fa-facebook-square fa-3x social-fb" id="social"></i></a>
	        <a href="https://twitter.com/bootsnipp"><i class="fa fa-twitter-square fa-3x social-tw" id="social"></i></a>
	        <a href="https://plus.google.com/+Bootsnipp-page"><i class="fa fa-google-plus-square fa-3x social-gp" id="social"></i></a>
	        <a href="#"><i class="fa fa-envelope-square fa-3x social-em" id="social"></i></a>
                                    
            </ul>
                                </div>
                    		</li>
                          </ul>
                       </div>
                </div>
</div>
</footer>
<!--header-->

<div class="footer-bottom">

	<div class="container">

		<div class="row">

			<div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">

				<div class="copyright">

					© 2017, Shoppers Square, All rights reserved

				</div>

			</div>

			<div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">

				<div class="design">

					 <a href="#">Franchisee </a> |  <a target="_blank" href="#">Web Design & Development by Shoppers Square</a>

				</div>

			</div>

		</div>

	</div>

</div>
        
    
</div><!-- /.col-xs-12 -->          
</div><!-- /.container -->
                <!--Thumbnail List-->
                    <br>
    </body>
</html>
