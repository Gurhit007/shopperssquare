package CartConfig;

import cart.Cart;
import cart.CartDAOImpl;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CartInsert extends HttpServlet {
    private Object pdao;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String params [] = request.getParameterValues("cart");
        
        cart.Cart c = new Cart();
        
        for(int i=0; i<params.length; i++){
            
            switch(i)
            {
                case 0: c.setProduct_id(params[i]); break;
                case 1: c.setQuantity(Integer.parseInt(params[i])); break;
            }
        }
           
            CartDAOImpl cdao = new CartDAOImpl();
            cdao.insert(c);
        
            RequestDispatcher rd = request.getRequestDispatcher("/UserCart.jsp");
            rd.forward(request, response);
            
    }

}
