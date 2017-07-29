    <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Electronics</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link href="Css/shop-homepage.css" rel="stylesheet">
    
    <script>
        $(document).ready(function(){

var quantitiy = 0;
   $('.quantity-right-plus').click(function(e){
        // Stop acting like a button
        e.preventDefault();
        // Get the field name
        var quantity = parseInt($('#quantity').val());
        // If is not undefined
            
            $('#quantity').val(quantity + 1);
            // Increment
        
    });

     $('.quantity-left-minus').click(function(e){
        // Stop acting like a button
        e.preventDefault();
        // Get the field name
        var quantity = parseInt($('#quantity').val());
        // If is not undefined
            // Increment
            if(quantity>0){
            $('#quantity').val(quantity - 1);
            }
    });
    
}); 
    </script>
    
</head>
<body background="http://cdn.pcwallart.com/images/light-blue-background-wallpaper-1.jpg">
    <div class="container">
        <h3 class="row btn btn-warning btn-lg" style="margin-top: -70px; ">
            <a href="ViewProducts.jsp" style="text-decoration: none; color: white">Back</a>
            </h3>
        </div>
    <form action="CartInsert" method="post">
     
    <div class="container">
        
        <div class="row">
            
                <div class="thumbnail col-sm-6">
                    <img class="thumbnail col-md-6" src="${product.getLink()}" style="height: 510px" alt="">
                </div>
                        
                <div class="col-sm-1"></div>
                        
                    <div class="col-sm-5">
                        <h2>${product.getProductname()}</h2>
                        <h3>&#8377; ${product.getPrice()}</h3>
                        <h3 class="btn btn-success btn-lg">${product.getDiscount()} off</h3>
                        <h3>${product.getDescription()}</h3>
                        <h3><b>Color :</b> ${product.getColor()}</h3>
                        <h3><b>Accessories :</b> ${product.getAccessories()}</h3>
                        <h3><b>Specification :</b> ${product.getSpecification()}</h3>
                    </div> 
            </div> 
                            
                            
            <div class="row">
                <div class="col-sm-7"></div>
                     <% if(session.getAttribute("aname")==null){%>           
                    <span style="font-size: 20px; float: left">
                        Qty. : &nbsp;&nbsp;
                    </span>
                                
                    <div class="input-group col-sm-2 pull-left">
                        
                        <span class="input-group-btn">
                            <button type="button" class="btn-md quantity-left-minus btn btn-danger btn-number"  data-type="minus" data-field="">
                                <span class="glyphicon glyphicon-minus"></span>
                            </button>
                        </span>
                        <%}%>
                        <input type="hidden" name="cart" value="${product.getId()}">
                        <% if(session.getAttribute("aname")==null){%>
                        <input style="text-align: center; font-size: 20px" type="number" id="quantity" name="cart" class="form-control input-number" value="1" min="1" max="100">
                        <span class="input-group-btn">
                            <button type="button" class="quantity-right-plus btn btn-success btn-number" data-type="plus" data-field="">
                                <span class="glyphicon glyphicon-plus"></span>
                            </button>
                        </span>
                                          
                    </div>
                               
                    <div class="btn-md col-md-2 pull-right" >
                        <a href="" class="btn btn-danger" >
                            <span class="glyphicon glyphicon-shopping-cart"></span>
                            <input style="background: none; border: none" type="submit" value="Add to Cart">
                        </a>  
                    </div>
                        <%}%>
          
                <br><br>
               
            </div>
                         
    </div>
                    <br><br>                    
    </form>
                        
</body>

</html>
