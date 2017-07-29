
package MyServlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Duke {
    private String name;
    private String mail;
    private String message;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param email the email to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
    public int store()throws ClassNotFoundException, SQLException{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url="jdbc:derby://localhost:1527/Shop_Square";
        Connection con = DriverManager.getConnection(url,"luke","luke");
        PreparedStatement ps = con.prepareStatement("insert into feedback(name,mail,message) values(?,?,?)");
        
        ps.setString(1, getName());
        ps.setString(2, getMail());
        ps.setString(3, getMessage());
        
        int a = ps.executeUpdate();
        
        if(a==1){
            return a;
        }else
        {
            return a;
        }
    }
}
