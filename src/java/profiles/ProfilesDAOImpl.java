
package profiles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class ProfilesDAOImpl implements ProfilesDAO {

    @Override
    public void insert(Profiles p) {
        try
        {
            Connection conn = loader.Loader.getConnection();
            
            String query = "insert into profiles(firstname, lastname, phone, email, password, address) values(?,?,?,?,?,?)";
                    
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, p.getFirstname());
            ps.setString(2, p.getLastname());
            ps.setString(3, p.getPhone());
            ps.setString(4, p.getEmail());
            ps.setString(5, p.getPassword());
            ps.setString(6, p.getAddress());
            
            ps.execute();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Profiles p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int pid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Profiles getProfiles(int pid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Profiles> getProfiles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
