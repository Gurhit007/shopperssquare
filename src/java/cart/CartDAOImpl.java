
package cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import products.ProductsDAOImpl;

public class CartDAOImpl implements CartDAO {

    @Override
    public void insert(Cart p) {
        try
        {
            Connection conn = loader.Loader.getConnection();
            
            String query = "insert into cart(quantity, product_id) values(?,?)";
                    
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setInt(1, p.getQuantity());
            ps.setString(2, p.getProduct_id());
            
            ps.execute();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Cart p) {
        try
        {
            Connection conn = loader.Loader.getConnection();
            
            String query = "update cart set quantity=? where id=?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setInt(1, p.getQuantity());
            
            ps.setInt(2, p.getId());
            
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }

    @Override
    public void delete(int pid) {
        try
        {
            Connection conn = loader.Loader.getConnection();
            
            String query = "delete from cart where id=?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setInt(1, pid);
            
            ps.execute();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public Cart getCart(int pid) {
        
        Cart c = new Cart();
        
        try
        {
            String query = "select * from LUKE.CART where ID = ?";
            
            Connection conn = loader.Loader.getConnection();
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setInt(1, pid);
            
            ResultSet rs = ps.executeQuery();
            
            while( rs.next() )
            {
                /*Cart c = new Cart();*/
                
                c.setId(rs.getInt("ID"));
                c.setBilling_address(rs.getString("BILLING_ADDRESS"));
                c.setShipping_address(rs.getString("SHIPPING_ADDRESS"));
                c.setProduct_id(rs.getString("PRODUCT_ID"));
                
                
                products.ProductsDAOImpl pdao = new ProductsDAOImpl();
                products.Products p = pdao.getProducts(rs.getInt("PRODUCT_ID"));
                
                c.setP(p);
                
                c.setQuantity(rs.getInt("Quantity"));
                c.setEmail(rs.getString("Email"));
                
                System.out.println(c);
                
                
            }
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
        
        return c;
    }

    @Override
    public List<Cart> getCart() {
        
        List<Cart> cart = new ArrayList<>();
        
        try
        {
            String query = "select * from LUKE.CART";
            
            Connection conn = loader.Loader.getConnection();
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            
            while( rs.next() )
            {
                Cart c = new Cart();
                
                c.setId(rs.getInt("ID"));
                c.setBilling_address(rs.getString("BILLING_ADDRESS"));
                c.setShipping_address(rs.getString("SHIPPING_ADDRESS"));
                c.setProduct_id(rs.getString("PRODUCT_ID"));
                
                
                products.ProductsDAOImpl pdao = new ProductsDAOImpl();
                products.Products p = pdao.getProducts(rs.getInt("PRODUCT_ID"));
                
                c.setP(p);
                
                c.setQuantity(rs.getInt("Quantity"));
                c.setEmail(rs.getString("Email"));
                
                cart.add(c);
            }
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
        
        return cart;
        
    }
}

    
    

