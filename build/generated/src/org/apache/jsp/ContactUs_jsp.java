package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ContactUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"Css/bootstrap.min.css\">\n");
      out.write("        <script src=\"Js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"Js/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <title>Contact Us</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"Img/BackgroundImg.jpg\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <!--<img src=\"Img/ShoppersLogo.png\" alt=\"Logo\" height=\"107px\" width=\"310px\">-->\n");
      out.write("                <img src=\"Img/ShoppersLogo.png\" alt=\"Logo\">\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li style=\"font-size: 20px\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                    <li style=\"font-size: 20px\"><a href=\"ViewProducts.jsp\">Products</a></li>\n");
      out.write("                    <li style=\"font-size: 20px\"><a href=\"ContactUs.jsp\">Contact Us</a></li>\n");
      out.write("                    <li style=\"font-size: 20px\"><a href=\"AboutUs.jsp\">About Us</a></li>\n");
      out.write("                    <li style=\"font-size: 20px\">\n");
      out.write("                        ");
 if(session.getAttribute("uname")==null){
      out.write("\n");
      out.write("                        <a href=\"SignUp.jsp\">Sign Up</a></li>\n");
      out.write("                    ");
}else {
}
      out.write("\n");
      out.write("                    <li style=\"font-size: 20px\">\n");
      out.write("                        ");
 if(session.getAttribute("uname")==null){
      out.write("\n");
      out.write("                        <a href=\"SignIn.jsp\">Sign In</a>\n");
      out.write("                    ");
}else {
      out.write("\n");
      out.write("                    <a href=\"logout.jsp\">Log Out</a>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("           <!-- <form class=\"navbar-form navbar-right\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("        <input type=\"text\" class=\"form-control\" placeholder=\"What are you looking for?\" style=\"font-size: 18px\">\n");
      out.write("        <div class=\"input-group-btn\">\n");
      out.write("          <button class=\"btn btn-default\" type=\"submit\" style=\"background-color: #b6ff00\">\n");
      out.write("            <i class=\"glyphicon glyphicon-search\"></i>\n");
      out.write("          </button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </form>-->\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("            \n");
      out.write("            <fieldset>\n");
      out.write("            <div class=\"row\" style=\"padding: 5px; border: 1px solid #333; box-shadow: 10px 10px 5px #333;\">\n");
      out.write("                <div class=\"col-xs-4\" style=\"border-right: 1px solid #333\" >\n");
      out.write("                   <b style=\"font-size: 20px; color: white\"> Call Us : </b><br><br>\n");
      out.write("                    <span style=\"font-size: 16.5px; color: white\">(0124) 6150000 or 1800 208 9898</span><br>\n");
      out.write("                    <span style=\"font-size: 16.5px; color: white\">10:00 AM - 7:00 PM(7 days a week)</span><br>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("               <div class=\"col-xs-4\" style=\"border-right: 1px solid #333\">\n");
      out.write("                   <b style=\"font-size: 20px; color: white\"> Write Us : </b><br><br>\n");
      out.write("                    <span style=\"font-size: 16.5px; color: white\">Knowledge House,</span><br>\n");
      out.write("                    <span style=\"font-size: 16.5px; color: white\">Shyam Nagar, Off Jogeshwari Vikhroli Link Road,</span><br>\n");
      out.write("                    <span style=\"font-size: 16.5px; color: white\">Jogeshwari (East),</span><br>\n");
      out.write("                    <span style=\"font-size: 16.5px; color: white\">Mumbai - 400 060,</span><br>\n");
      out.write("                    <span style=\"font-size: 16.5px; color: white\">Maharashtra, India</span><br>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-xs-4\">\n");
      out.write("                    <b style=\"font-size: 20px; color: white\"> Corporate Address :</b><br><br>\n");
      out.write("                    <span style=\"font-size: 16.5px; color: white\">Tower C, 24/7 Park,</span><br>\n");
      out.write("                    <span style=\"font-size: 16.5px; color: white\">L.B.S. Marg, Vikhroli (West),</span><br>\n");
      out.write("                    <span style=\"font-size: 16.5px; color: white\">Mumbai - 400 083,</span><br>\n");
      out.write("                    <span style=\"font-size: 16.5px; color: white\">Maharashtra, India</span><br>\n");
      out.write("                    <span style=\"font-size: 16.5px; color: white\">Telephone: 1800 208 9898</span><br>\n");
      out.write("                    <span style=\"font-size: 16.5px; color: white\">Ph: (0124) 6150000</span><br>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                </fieldset>\n");
      out.write("                    <br><br>\n");
      out.write("                    \n");
      out.write("                    <div class=\"container\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("      <div class=\"col-md-6\">\n");
      out.write("        <div >\n");
      out.write("          <form action=\"Feedback.jsp\" class=\"form-horizontal\" method=\"post\">\n");
      out.write("          <fieldset>\n");
      out.write("              <legend class=\"text-center\" style=\"font-size: 20px; color: white\"><b>Send Your Message</b></legend>\n");
      out.write("    \n");
      out.write("            <!-- Name input-->\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label class=\"col-md-3 control-label\" for=\"name\" style=\"font-size: 16.5px; color: white\">Name</label>\n");
      out.write("              <div class=\"col-md-9\">\n");
      out.write("                <input id=\"name\" name=\"name\" type=\"text\" placeholder=\"Your name\" class=\"form-control\">\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("            <!-- Email input-->\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label class=\"col-md-3 control-label\" for=\"email\" style=\"font-size: 16.5px; color: white\">E-mail</label>\n");
      out.write("              <div class=\"col-md-9\">\n");
      out.write("                <input id=\"email\" name=\"mail\" type=\"text\" placeholder=\"Your email\" class=\"form-control\">\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("            <!-- Message body -->\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label class=\"col-md-3 control-label\" for=\"message\" style=\"font-size: 16.5px; color: white\">Message</label>\n");
      out.write("              <div class=\"col-md-9\">\n");
      out.write("                <textarea class=\"form-control\" id=\"message\" name=\"message\" placeholder=\"Please enter your message here...\" rows=\"5\"></textarea>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("            <!-- Form actions -->\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <div class=\"col-md-12 text-right\">\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary btn-lg\">Submit</button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </fieldset>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("                    \n");
      out.write("          </div>\n");
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
