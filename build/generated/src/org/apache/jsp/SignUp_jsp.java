package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"/Shoppers_Square/Css/SignUp.css\">\n");
      out.write("\n");
      out.write("        Stylize Checkbox Buttons\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Css/build.css\">\n");
      out.write("       <!-- <script src=\"bootstrap-checkbox.min.js\"></script>-->\n");
      out.write("       \n");
      out.write("        <title>Sign Up</title>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("            /*Password Show/Hide*/\n");
      out.write("            $(document).ready(function () \n");
      out.write("            {\n");
      out.write("                $(\"#showHide\").click(function () \n");
      out.write("                {\n");
      out.write("                    if ($(\".password\").attr(\"type\")==\"password\") \n");
      out.write("                    {\n");
      out.write("                        $(\".password\").attr(\"type\", \"text\");\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                    {\n");
      out.write("                        $(\".password\").attr(\"type\", \"password\");\n");
      out.write("                    }\n");
      out.write(" \n");
      out.write("                });\n");
      out.write("\n");
      out.write("            /*Password Matcher*/\n");
      out.write("            var password = document.getElementById(\"pass\");\n");
      out.write("            var confirm_password = document.getElementById(\"confirm_pass\");\n");
      out.write("\n");
      out.write("            function validatePassword()\n");
      out.write("            {\n");
      out.write("                if(password.value != confirm_password.value) \n");
      out.write("                {\n");
      out.write("                    confirm_password.setCustomValidity(\"Passwords Don't Match. Please Re-Enter the Password.\");\n");
      out.write("                } \n");
      out.write("                else \n");
      out.write("                {\n");
      out.write("                    confirm_password.setCustomValidity('');\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            password.onchange = validatePassword;\n");
      out.write("            confirm_password.onkeyup = validatePassword;\n");
      out.write("});\n");
      out.write("            /*Enhancing ToolTip*/\n");
      out.write("            \n");
      out.write("            $(document).ready(function()\n");
      out.write("            {\n");
      out.write("                $('[data-toggle=\"tooltip\"]').tooltip();   \n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body background=\"Img/BackgroundImg.jpg\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("        \n");
      out.write("            <!--First Row-->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <!--<img src=\"Img/ShoppersLogo.png\" alt=\"Cannot Load\" height=\"107px\" width=\"310px\">-->\n");
      out.write("                <img src=\"Img/ShoppersLogo.png\" alt=\"Cannot Load\">\n");
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
      out.write("                        ");
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
      out.write("            \n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("            <br>\n");
      out.write("            <!--Second Row-->\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <!--Empty Column-->\n");
      out.write("            <div class=\"col-xs-1 col-sm-3\"></div>\n");
      out.write("        \n");
      out.write("               <div class=\"col-xs-10 col-sm-6\">\n");
      out.write("                    \n");
      out.write("                   <form action=\"doSignup\" method=\"post\">\n");
      out.write("                  <fieldset>\n");
      out.write("                    <h1 class=\"fieldsetheader\">Sign Up</h1>\n");
      out.write("                            \n");
      out.write("                     <div class=\"form1\">\n");
      out.write("      \n");
      out.write("                     <label class=\"fontsizes\"><b>First Name</b></label><br>\n");
      out.write("                                \n");
      out.write("                    <input class=\"textfields\" style=\"font-size: 16px; outline: none;\" type=\"text\" placeholder=\"Enter First Name\" name=\"signup\" pattern=\"[A-Za-z]+\" title=\"Use Only Alphabets\" data-toggle=\"tooltip\" data-placement=\"bottom\" required>\n");
      out.write("                    <br><br>\n");
      out.write("      \n");
      out.write("                    <label class=\"fontsizes\"><b>Last Name</b></label><br>\n");
      out.write("                                 \n");
      out.write("                    <input class=\"textfields\" style=\"font-size: 16px; outline: none;\" type=\"text\" placeholder=\"Enter Last Name\" name=\"signup\" pattern=\"[A-Za-z]+\" data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"Use Only Alphabets\" required>\n");
      out.write("                    <br><br>\n");
      out.write("\n");
      out.write("                    <label class=\"fontsizes\"><b>Mobile</b></label><br>\n");
      out.write("      \n");
      out.write("                    <input class=\"textfields\" maxlength=\"10\" name=\"signup\" style=\"font-size: 16px; border: 1px solid #ccc; outline: none;\" type=\"text\" placeholder=\"Enter Mobile\" pattern=\"[0-9]{10}\" data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"10 digit Mobile Number\" required>\n");
      out.write("                    <br><br>\n");
      out.write(" \n");
      out.write("                    <label class=\"fontsizes\"><b>Email</b></label><br>\n");
      out.write("                    <input class=\"textfields\" style=\"font-size: 16px; outline: none;\" type=\"text\" placeholder=\"Enter Email\" pattern=\"[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[a-z]{2,3}$\" name=\"signup\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"username@hostname\" required>\n");
      out.write("                    <br>\n");
      out.write("                    <i>for example: abc123@yahoo.com</i>\n");
      out.write("\n");
      out.write("                    <br><br>\n");
      out.write("                    \n");
      out.write("                    <label class=\"fontsizes\"><b>Password</b></label><br>\n");
      out.write("                    <input class=\"textfields password\" style=\"font-size: 16px; outline: none;\" type=\"password\" id=\"pass\" placeholder=\"Enter Password\" pattern=\"(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$\" name=\"signup\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Minimum 8 Characters long.&#013;Use atleast One UpperCase, One LowerCase & One Special Symbol/Digit.&#013;\" required>\n");
      out.write("                    <br>\n");
      out.write("                            \n");
      out.write("                         <div class=\"checkbox checkbox-primary\">\n");
      out.write("                             <input id=\"showHide\" type=\"checkbox\" style=\"outline: none;\">\n");
      out.write("                                    <label for=\"showHide\">\n");
      out.write("                                        Show Password?\n");
      out.write("                                    </label>\n");
      out.write("                        </div>\n");
      out.write("                         \n");
      out.write("                       <!--<input type=\"checkbox\" id=\"showHide\"> Show Password? <br><br>-->\n");
      out.write("\n");
      out.write("    <label class=\"fontsizes\"><b>Confirm Password</b></label><br>\n");
      out.write("    <input class=\"textfields\" style=\"font-size: 16px; outline: none;\" type=\"password\" id=\"confirm_pass\" placeholder=\"Re-enter Password\" name=\"psw-repeat\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Match Entered Password\" required><br>\n");
      out.write("    \n");
      out.write("                        <!-- <div class=\"checkbox checkbox-primary\">\n");
      out.write("                            <input id=\"Remember\" type=\"checkbox\" checked>\n");
      out.write("                                <label for=\"Remember\">\n");
      out.write("                                    Remember Me\n");
      out.write("                                </label>\n");
      out.write("                        </div>-->\n");
      out.write("                         \n");
      out.write("                       <!--<input type=\"checkbox\" checked=\"checked\"> Remember me <br><br>-->\n");
      out.write("                  \n");
      out.write("         <label class=\"fontsizes\"><b>Address</b></label>          \n");
      out.write("         <div style=\"width: 100%\">\n");
      out.write("             <textarea rows=\"4\" name=\"signup\" style=\"width: 80%; font-size: 17px; border-radius: 10px; resize: none; outline: none;\" required></textarea>\n");
      out.write("         </div>\n");
      out.write("         \n");
      out.write("         <br>\n");
      out.write("    \n");
      out.write("                            </div>\n");
      out.write("    <div class=\"clearfix\">\n");
      out.write("        <button type=\"submit\" class=\"signupbtn\" style=\"outline: none;\">Sign Up</button>\n");
      out.write("        <!--<button type=\"button\" class=\"cancelbtn\"><a href=\"index.html\" style=\"text-decoration: none; color: white\"> Cancel</a></button>-->\n");
      out.write("        <button type=\"reset\" class=\"cancelbtn\" style=\"color: white; outline: none;\">Reset</button> \n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("      </fieldset>\n");
      out.write("</form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                <!--Empty Columns-->\n");
      out.write("                <div class=\"col-xs-1 col-sm-3\"></div>\n");
      out.write("                </div>\n");
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
