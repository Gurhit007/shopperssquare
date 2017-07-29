
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="cart.Cart"%>
<%@page import="java.util.List"%>
<%@page import="cart.CartDAOImpl"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
        <link href="Css/UserCartCss.css" rel="stylesheet">
        
        <title>User Cart</title>
    </head>
    <body>
        
        <%
        
            cart.CartDAOImpl cdao = new CartDAOImpl();
            
            List<Cart> list = cdao.getCart();
        
            request.setAttribute("cartList", list);
            
        %>
        
      <!--  <c:forEach items="${cartList}" var="item">
            
           ${item.getP().getProductname()}
            
        </c:forEach>-->
        
        
<div class="container">
	<table id="cart" class="table table-hover table-condensed">
            <thead>
		<tr>
                    <th style="width:50%">Product</th>
                    <th style="width:10%">Price</th>
                    <th style="width:8%">Quantity</th>
                    <th style="width:22%" class="text-center">Subtotal</th>
                    <th style="width:10%"></th>
		</tr>
            </thead>
            <tbody>
                <c:set var="sum" value="0"></c:set>
                
            <c:forEach items="${cartList}" var="item">
                
            <tr>
		<td data-th="Product">
                    <div class="row">
                        <div class="col-sm-2 hidden-xs">
                                    <img src="${item.getP().getLink()}" alt="..." class="img-responsive"/>        
                        </div>
                        <div class="col-sm-10">
                                        <h4 class="nomargin">${item.getP().getProductname()}</h4>
                            <p>${item.getP().getDescription()}</p>
                        
                        </div>
                    </div>
                </td>
        
            <td data-th="Price">${item.getP().getPrice()}</td>
                    
            <form action="CartUpdate" method="post">
                
		<td data-th="Quantity">
                    <input type="text" class="form-control text-center" name="qty" value="${item.getQuantity()}">
		</td>
                <td data-th="Subtotal" class="text-center">
                    <c:out value="${item.getP().getPrice() * item.getQuantity()}"></c:out>
                    <c:set var="sum" value="${sum + item.getP().getPrice() * item.getQuantity()}"></c:set>
                </td>
		<td class="actions" data-th="">
                    
                        <input type="hidden" value="${item.getId()}" name="id">
                        
                        <button type="submit" class="btn btn-info btn-sm">
                            <i class="fa fa-refresh"></i>
                        </button>
                        
                    </form>
                    
                    <a href="CartDelete?id=${item.getId()}" class="btn btn-danger btn-sm" ><i class="fa fa-trash-o"></i></a>
                </td>
        
            </tr>
            </c:forEach>
            		</tbody>
					<tfoot>
						
						<tr>
							<td><a href="ViewProducts.jsp" class="btn btn-warning"><i class="fa fa-angle-left"></i> Continue Shopping</a></td>
							<td colspan="2" class="hidden-xs"></td>
							<td class="hidden-xs text-center"><strong>Total ${sum}</strong></td>
							<td><a href="CartCheckout.jsp" class="btn btn-success btn-block">Checkout <i class="fa fa-angle-right"></i></a></td>
						</tr>
					</tfoot>
				</table>
</div>
             </body>
</html>
