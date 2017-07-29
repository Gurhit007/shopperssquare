package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminSignIn_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Css/build.css\">\n");
      out.write("       <!-- <script src=\"bootstrap-checkbox.min.js\"></script>-->\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"Css/SignIn.css\">\n");
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
      out.write("        \n");
      out.write("        <title>Admin Sign In</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
      out.write("            <div class=\"row\" style=\"margin-top: -1.2em\">\n");
      out.write("                    <!--<img src=\"Img/ShoppersLogo.png\" alt=\"Cannot Load\" height=\"107px\" width=\"310px\">-->\n");
      out.write("                    <img src=\"Img/ShoppersLogo.png\" alt=\"Logo\">\n");
      out.write("            </div>\n");
      out.write("        <div class=\"row\" id=\"content\">\n");
      out.write("                \n");
      out.write("                <!--Empty Column-->\n");
      out.write("                <div class=\"col-xs-0 col-sm-3\"></div>\n");
      out.write("            \n");
      out.write("                <!--Second Column-->\n");
      out.write("            <div class=\"col-xs-12 col-sm-6\">\n");
      out.write("                <form action=\"AdminLogDetails.jsp\" method=\"post\">\n");
      out.write("            <fieldset>\n");
      out.write("                <h1 class=\"fieldsetheader\">Sign In</h1>\n");
      out.write("\n");
      out.write("              <div class=\"container1\">\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("          <label style=\"font-size: 15.5px\"><b>Admin</b></label>\n");
      out.write("                      \n");
      out.write("         <input class=\"textfields\" style=\"font-size: 16px\" type=\"text\" placeholder=\"Admin\" name=\"adname\" required>\n");
      out.write("                   \n");
      out.write("         <label style=\"font-size: 15.5px\"><b>Password</b></label>\n");
      out.write("                  \n");
      out.write("         <input class=\"textfields password\" style=\"font-size: 16px\" type=\"password\" placeholder=\"Enter Password\" name=\"adpass\" required>\n");
      out.write("                    \n");
      out.write("                  <div class=\"checkbox checkbox-primary\">\n");
      out.write("                        <input id=\"showHide\" type=\"checkbox\">\n");
      out.write("                        <label for=\"showHide\">Show Password?</label>\n");
      out.write("                    </div>\n");
      out.write("                 \n");
      out.write("                 </div>\n");
      out.write("                \n");
      out.write("                    <div class=\"clearfix\" style=\"text-align: center;\">\n");
      out.write("                        <button id=\"allbtn\" type=\"submit\" class=\"loginbtn\">Login</button>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("               \n");
      out.write("         </fieldset>\n");
      out.write("       </form>\n");
      out.write("            </div>    \n");
      out.write("            \n");
      out.write("                <!--Empty Column-->\n");
      out.write("                <div class=\"col-xs-0 col-sm-3\"></div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
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
