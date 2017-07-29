
package MyServlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import profiles.Profiles;
import profiles.ProfilesDAOImpl;

public class doSignup extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String params [] = req.getParameterValues("signup");
        
        Profiles p = new Profiles();
        
        for(int i=0; i<params.length; i++){
            
            switch(i)
            {
                case 0: p.setFirstname(params[i]); break;
                case 1: p.setLastname(params[i]); break;
                case 2: p.setPhone(params[i]); break;
                case 3: p.setEmail(params[i]); break;
                case 4: p.setPassword(params[i]); break;
                case 5: p.setAddress(params[i]); break;
            }
        }
           
            ProfilesDAOImpl pdao = new ProfilesDAOImpl();
            pdao.insert(p);
            
            //My Code
           RequestDispatcher rd = req.getRequestDispatcher("/SignUpSuccess.jsp");
           rd.forward(req, resp);
            
            
            
    }   
    
}
