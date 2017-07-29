
package MyServlets;

import cart.Cart;
import cart.CartDAOImpl;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import products.Products;

public class CartUpdateToDB extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        Cart c = new Cart();
        
        CartDAOImpl cdao = new CartDAOImpl();
            
            cdao.update(c);
            
            RequestDispatcher rd = request.getRequestDispatcher("/UserCart.jsp");
            rd.forward(request, response);

            //List<Cart> list = cdao.getCart();

            //request.setAttribute("cartData", list);
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
