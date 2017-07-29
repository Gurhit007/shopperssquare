
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        
        <title>Update Form</title>
    </head>
    <body background="Img/BackgroundImg.jpg">
        <br><br>
       <div class="container">
           <div class="row">
               <% if(session.getAttribute("aname")==null){%>
                        <a href="AdminSignIn.jsp"></a>
                        <%}else {%><br>
                    <a href="AdminLogOutSuccess.jsp" class="btn btn-danger btn-md" style="float: right">
                        <span class="glyphicon glyphicon-log-out" > LogOut</span>
                    </a>
                    <%}%>
           </div>
       
       
            
        <form method="post" action="UpdateProductToDB" enctype="multipart/form-data">
            
            <br> <input type="file" name="abc"><br><br>
            
<div class="col-md-3"></div>

            <input class="form-control input-md" type="hidden" name="pdata" value="${productitem.getId()}">

<div class="form-group">          
    <label style="float: left; font-size: 20px" class="control-label" for="product_name">
        Product Name
    </label>
        <div class="col-md-6">
            <input id="product_name" class="form-control input-md" type="text" name="pdata"  value="${productitem.getProductname()}"><br>
        </div>
</div>
  
<div class="col-md-3"></div>

<div class="form-group">
    <label style="float: left; font-size: 20px" class="control-label" for="product_description">
        Description&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </label>
        <div class="col-md-6">
            <input id="product_description" class="form-control input-md" type="text" name="pdata"  value="${productitem.getDescription()}"><br>
        </div>
</div>
        
<div class="col-md-3"></div>
 
<div class="form-group">
    <label style="float: left; font-size: 20px" class="control-label" for="product_discount">
        Discount&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </label>
        <div class="col-md-6">
              <input id="product_discount" class="form-control input-md" type="text" name="pdata"  value="${productitem.getDiscount()}"><br>
        </div>   
</div>
        
<div class="col-md-3"></div>

<div class="form-group">
    <label style="float: left; font-size: 20px" class="control-label" for="product_price">
        Price&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </label>
        <div class="col-md-6">
              <input id="product_price" class="form-control input-md" type="text" name="pdata"  value="${productitem.getPrice()}"><br>
        </div>
</div>
        
<div class="col-md-3"></div>        
                <input type="hidden" name="pdata"  value="${productitem.getLink()}">
 
<div class="form-group"> 
    <label style="float: left; font-size: 20px" class="control-label" for="product_category">
        Category&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </label>
        <div class="col-md-6">
            <select id="product_category" class="form-control input-md" name="pdata">
                <option>Electronics</option>
                <option>Footwear</option>
                <option>Appliances</option>
            </select><br>
        </div>
</div>
        
<div class="col-md-3"></div>
<div class="form-group">
    <label style="float: left; font-size: 20px" class="control-label" for="product_specification">
        Specification&nbsp;&nbsp;
    </label>
        <div class="col-md-6">
                <input id="product_specification" class="form-control input-md" name="pdata" type="text"  value="${productitem.getSpecification()}"><br>
        </div>
</div>
        
<div class="col-md-3"></div>
<div class="form-group">
    <label style="float: left; font-size: 20px" class="control-label" for="product_color">
        Color&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </label> 
        <div class="col-md-6">
            <input id="product_color" class="form-control input-md" type="text" name="pdata"  value="${productitem.getColor()}"><br>
        </div> 
</div>
        
<div class="col-md-3"></div>
<div class="form-group">
    <label style="float:left; font-size: 20px" for="product_accessory">
        Accessory&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </label>
        <div class="col-md-6">
                    <input id="product_accessory" class="form-control input-md" type="text" name="pdata"  value="${productitem.getAccessories()}"><br>
        </div>
</div>
  
<div class="col-md-3"></div>
<div class="col-lg-6" style="text-align: center">
    <input type="submit" class="btn btn-primary"  value="Update"><br>
</div>
       
        </form>
        <!--Form Group</div>-->
           
           <div class="col-xs-3"></div>
        <!--Row</div>-->
       </div><!--Container-->
    </body>
</html>
