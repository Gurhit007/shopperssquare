package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignIn_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <!--Local CDN-->\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"Css/bootstrap.min.css\">\n");
      out.write("        <script src=\"Js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"Js/jquery-3.2.1.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!--Web CDN-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!--Stylize CheckBox Buttons-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Css/build.css\">\n");
      out.write("       <!-- <script src=\"bootstrap-checkbox.min.js\"></script>-->\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"Css/SignIn.css\">\n");
      out.write("        <title>Sign In</title>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\"#showHide\").click(function () {\n");
      out.write("                    if ($(\".password\").attr(\"type\") == \"password\") \n");
      out.write("                    {\n");
      out.write("                        $(\".password\").attr(\"type\", \"text\");\n");
      out.write("                    }\n");
      out.write("                    else \n");
      out.write("                    {\n");
      out.write("                        $(\".password\").attr(\"type\", \"password\");\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"Img/BackgroundImg.jpg\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
      out.write("            <div class=\"row\" style=\"margin-top: -1.2em\">\n");
      out.write("                    <!--<img src=\"Img/ShoppersLogo.png\" alt=\"Cannot Load\" height=\"107px\" width=\"310px\">-->\n");
      out.write("                    <img src=\"Img/ShoppersLogo.png\" alt=\"Logo\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li style=\"font-size: 20px\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                    <li style=\"font-size: 20px\"><a href=\"ViewProducts.jsp\">Products</a></li>\n");
      out.write("                    <li style=\"font-size: 20px\"><a href=\"ContactUs.jsp\">Contact Us</a></li>\n");
      out.write("                    <li style=\"font-size: 20px\"><a href=\"AboutUs.jsp\">About Us</a></li>\n");
      out.write("                    \n");
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
      out.write("                    ");
 if(session.getAttribute("uname")==null){
      out.write("\n");
      out.write("                        <a href=\"SignInAs.jsp\">Sign In</a>\n");
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
      out.write("            <br>\n");
      out.write("            <div class=\"row\" id=\"content\">\n");
      out.write("                \n");
      out.write("                <!--Empty Column-->\n");
      out.write("                <div class=\"col-xs-0 col-sm-3\"></div>\n");
      out.write("            \n");
      out.write("                <!--Second Column-->\n");
      out.write("            <div class=\"col-xs-12 col-sm-6\">\n");
      out.write("                <form action=\"logdetails.jsp\" method=\"post\">\n");
      out.write("            <fieldset>\n");
      out.write("                <h1 class=\"fieldsetheader\">Sign In</h1>\n");
      out.write("            \n");
      out.write("                    <!--<div class=\"imgcontainer\">\n");
      out.write("                        <img src=\"Img/avatar-1.png\" alt=\"Avatar\" class=\"avatar\">\n");
      out.write("                    </div>-->\n");
      out.write("\n");
      out.write("              <div class=\"container1\">\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                    <label style=\"font-size: 15.5px\"><b>Email</b></label>\n");
      out.write("                      \n");
      out.write("                   <input class=\"textfields\" style=\"font-size: 16px; outline: none;\" type=\"text\" placeholder=\"Enter Email\" name=\"mail\" required>\n");
      out.write("                   \n");
      out.write("                    <label style=\"font-size: 15.5px\"><b>Password</b></label>\n");
      out.write("                  \n");
      out.write("                    <input class=\"textfields password\" style=\"font-size: 16px; outline: none;\" type=\"password\" placeholder=\"Enter Password\" name=\"pass\" required>\n");
      out.write("                    \n");
      out.write("                  <div class=\"checkbox checkbox-primary\">\n");
      out.write("                        <input id=\"showHide\" type=\"checkbox\">\n");
      out.write("                        <label for=\"showHide\">Show Password?</label>\n");
      out.write("                    </div>\n");
      out.write("                 <!-- <input type=\"checkbox\" id=\"showHide\"> Show? <br>-->\n");
      out.write("                 </div>\n");
      out.write("                \n");
      out.write("                    <div class=\"clearfix\" style=\"text-align: center;\">\n");
      out.write("                        <button id=\"allbtn\" type=\"submit\" class=\"loginbtn\">Login</button>\n");
      out.write("                        &nbsp;&nbsp;\n");
      out.write("                       <!-- <button id=\"allbtn\" class=\"signupbtn\"><a href=\"SignUp.jsp\" style=\"text-decoration: none; color: #fff;\">New User</a></button>-->\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("               <!-- <div style=\"border: 1px solid black;\">\n");
      out.write("                    <input class=\"rememberme\" type=\"checkbox\" checked=\"checked\"> Remember me<br>\n");
      out.write("                        </div>-->\n");
      out.write("                <br>\n");
      out.write("                <!--\n");
      out.write("                <div class=\"lastbuttons\">\n");
      out.write("                    \n");
      out.write("                    <button class=\"cancelbtn\"><a href=\"index.jsp\" style=\"text-decoration: none; color: white\"> Cancel </a></button>\n");
      out.write("                    <span class=\"psw\" style=\"font-size: 15px\"><a href=\"#\">Forgot password?</a></span>\n");
      out.write("                        \n");
      out.write("                </div>\n");
      out.write("                -->\n");
      out.write("         </fieldset>\n");
      out.write("       </form>\n");
      out.write("            </div>    \n");
      out.write("            \n");
      out.write("                <!--Empty Column-->\n");
      out.write("                <div class=\"col-xs-0 col-sm-3\"></div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("            </div>\n");
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
