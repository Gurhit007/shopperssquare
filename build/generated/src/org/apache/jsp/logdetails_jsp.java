package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.DriverManager.*;

public final class logdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>User Details</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         ");
 
       PreparedStatement ps;
        Connection conn;
        ResultSet rs= null;
       Class.forName("org.apache.derby.jdbc.ClientDriver");
        conn=DriverManager.getConnection("jdbc:derby://localhost:1527/Shop_Square;create=true;user=luke;password=luke;");
      
         Statement st=conn.createStatement();

      out.write(' ');
      out.write('\n');
 
boolean flag = false; 

String name = request.getParameter ("mail"); 
String password = request.getParameter("pass");

      out.write("\n");
      out.write("\n");
      out.write("        \n");
 String sql = "SELECT firstname from profiles where email=? And password =?"; 

try {  
ps = conn.prepareStatement (sql); 
ps.setString (1,name); 
ps.setString (2,password); 
rs = ps.executeQuery (); 
if (rs.next ()) { 
out.println (rs.getString ("firstname")); 
flag = true; 
session.setAttribute("uname", rs.getString ("firstname")); 
} else { 
request.setAttribute("err", "user name or password error!"); 
}

rs.close (); 
ps.close (); 
conn.close ();

} catch (Exception e) { 
out.println (e); 
} 

      out.write('\n');
      out.write('\n');
 

if (flag) { 


      out.write('\n');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward("logsuccess.jsp");
        return;
      }
      out.write('\n');
      out.write('\n');


} 
else { 

      out.write('\n');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward("logfail.jsp");
        return;
      }
      out.write(' ');
      out.write('\n');
 
} 

      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
