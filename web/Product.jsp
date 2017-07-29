
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
        
        <title>Products</title>
        
    </head>
    <body background="Img/BackgroundImg.jpg">
        <div class="container">
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
            
            <form action="addProduct" method="post" enctype="multipart/form-data">
               
               <input type="file" name="abc" required="">
                <br>
                
<!-- Text input-->
<div class="col-md-3"></div>
<div class="form-group">
     <label style="float:left; font-size: 20px" class="control-label" for="product_name">Product Name</label> 
  <div class="col-md-6">
      <input id="product_name" name="products" class="form-control input-md" required="" type="text" style="outline: none">
    
  </div>
</div>
<div class="col-md-3"></div>

<br><br>

<div class="col-md-3"></div>
<div class="form-group">
    <label style="float:left; font-size: 20px" class="control-label" for="product_description">
        Description &nbsp;&nbsp;&nbsp;&nbsp;
    </label>
    
  <div class="col-md-6">                     
      <input class="form-control" id="product_description" type="text" name="products" style="outline: none">
  </div>
</div>

<div class="col-md-3"></div>
<br><br>


<div class="col-md-3"></div>
<div class="form-group">
    <label style="float:left; font-size: 20px" class="control-label" for="percentage_discount">
        Discount&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </label>  
  
    <div class="col-md-6">
  <input id="percentage_discount" name="products" class="form-control input-md" required="" type="text">
    
  </div>
</div>
<div class="col-md-3"></div>

<br><br>

<div class="col-md-3"></div>
<div class="form-group">
    <label style="float:left; font-size: 20px" class="control-label" for="product_price">
        Price&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </label>  
  <div class="col-md-6">
  <input id="product_price" name="products" class="form-control input-md" required="" type="text">
    
  </div>
</div>

<div class="col-md-3"></div>
<br><br>
<div class="col-md-3"></div>
<div class="form-group">
    <label style="float:left; font-size: 20px" class="control-label" for="product_category">
        Category&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </label>
                      
    <div class="col-md-6">
      <select id="product_category" name="products" class="form-control input-md" >
          
          <option>Electronics</option>
          <option>Footwear</option>
          <option>Appliances</option>
          
      </select>
    </div>
 
</div>
<div class="col-md-3"></div>

<br><br>
<div class="col-md-3"></div>

<div class="form-group">
    <label style="float:left; font-size: 20px" class="control-label" for="product_spec">
        Specification&nbsp;&nbsp;
    </label>  
  <div class="col-md-6">
  <input id="product_spec" name="products" class="form-control input-md" required="" type="text">
    
  </div>
</div>

<div class="col-md-3"></div>
<br><br>

<div class="col-md-3"></div>

<div class="form-group">
    <label style="float:left; font-size: 20px" class="control-label" for="product_color">
        Color&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </label>  
  <div class="col-md-6">
  <input id="product_color" name="products" class="form-control input-md" required="" type="text">
    
  </div>
</div>

<div class="col-md-3"></div>
<br><br>

<div class="col-md-3"></div>

<div class="form-group">
    <label style="float:left; font-size: 20px" class="control-label" for="product_accessories">
        Accessories&nbsp;&nbsp;&nbsp;
    </label>  
  <div class="col-md-6">
  <input id="product_accessories" name="products" class="form-control input-md" type="text">
    
  </div>
</div>

<div class="col-md-3"></div>
<br><br>

<!-- Button -->
<div class="col-md-3"></div>
<div class="form-group">
  
  <div class="col-md-6" style="text-align: center">
    <button type="submit" id="singlebutton" name="add_btn" class="btn btn-primary btn-md">
        Add Product
    </button>
    &nbsp;
    <button type="submit" id="singlebutton" name="view_btn" class="btn btn-warning btn-md">
        <a href="ViewProducts.jsp" style="text-decoration: none; color: white">
            View Products
        </a>
    </button>
    
  </div>
  </div>
<div class="col-md-3"></div>
                
<br><br>

            </form>

        </div>
    
    </body>
</html>
