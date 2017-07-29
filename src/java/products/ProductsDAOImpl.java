
package products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductsDAOImpl implements ProductsDAO {

    @Override
    public void insert(Products p) {
        try
        {
            Connection conn = loader.Loader.getConnection();
            
            String query = "insert into products(productname, description, discount, price, link, category, specification, color, accessories) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1, p.getProductname());
            ps.setString(2, p.getDescription());
            ps.setString(3, p.getDiscount());
            ps.setInt(4, p.getPrice());
            ps.setString(5, p.getLink());
            ps.setString(6, p.getCategory());
            ps.setString(7, p.getSpecification());
            ps.setString(8, p.getColor());
            ps.setString(9, p.getAccessories());
            
            ps.execute();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Products p) {
        try
        {
            Connection conn = loader.Loader.getConnection();
            
            String query = "update products set productname=?, description=?, discount=?, price=?, link=?, category=?, specification=?, color=?, accessories=? where id=?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1, p.getProductname());
            ps.setString(2, p.getDescription());
            ps.setString(3, p.getDiscount());
            ps.setInt(4, p.getPrice());
            ps.setString(5, p.getLink());
            ps.setString(6, p.getCategory());
            ps.setString(7, p.getSpecification());
            ps.setString(8, p.getColor());
            ps.setString(9, p.getAccessories());
            ps.setInt(10, p.getId());
            
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
            
            String query = "delete from products where id=?";
            
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
    public Products getProducts(int pid) {
        
        Products p = new Products();
        
        try
        {
            String query = "select * from LUKE.PRODUCTS where ID = ?";
            
            Connection conn = loader.Loader.getConnection();
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setInt(1, pid);
            
            ResultSet rs = ps.executeQuery();
            
            while( rs.next() )
            {
                
                p.setId(rs.getInt("ID"));
                p.setProductname(rs.getString("PRODUCTNAME"));
                p.setDescription(rs.getString("DESCRIPTION"));
                p.setDiscount(rs.getString("DISCOUNT"));
                
                String price = rs.getString("PRICE");
                price = price.replaceAll(",", "");
                System.out.println( price );
                int price1 = (int)Float.parseFloat(price);
                
                p.setPrice( price1 );
                
                p.setLink(rs.getString("LINK"));
                p.setCategory(rs.getString("CATEGORY"));
                p.setSpecification(rs.getString("SPECIFICATION"));
                p.setColor(rs.getString("COLOR"));
                p.setAccessories(rs.getString("ACCESSORIES")); 
                
            }
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
        
        return p;
    }

    @Override
    public List<Products> getProducts() {
        List<Products> list = new ArrayList();
        
        try
        {
            String query = "select * from LUKE.PRODUCTS";
            
            Connection conn = loader.Loader.getConnection();
            
            Statement stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery(query);
            
            while( rs.next() )
            {
                Products p = new Products();
                
                p.setId(rs.getInt("ID"));
                p.setProductname(rs.getString("PRODUCTNAME"));
                p.setDescription(rs.getString("DESCRIPTION"));
                p.setDiscount(rs.getString("DISCOUNT"));
                
                int price1 = 0;
                
                try
                {
                    String price = rs.getString("PRICE");
                    price = price.replaceAll(",", "");
                    System.out.println( price );
                    price1 = (int)Float.parseFloat(price);

                    p.setPrice( price1 );
                }
                catch( Exception e )
                {
                    e.printStackTrace();
                    p.setPrice( 0 );
                }
                
                p.setLink(rs.getString("LINK"));
                p.setCategory(rs.getString("CATEGORY"));
                p.setSpecification(rs.getString("SPECIFICATION"));
                p.setColor(rs.getString("COLOR"));
                p.setAccessories(rs.getString("ACCESSORIES"));
                
                list.add(p);
            }
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
        
        return list;
    }
    
}
