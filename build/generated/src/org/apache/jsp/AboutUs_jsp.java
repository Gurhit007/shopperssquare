package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AboutUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"Css/bootstrap.min.css\">\n");
      out.write("        <script src=\"Js/bootstrap.min.js\"></script>       \n");
      out.write("        <script type=\"text/javascript\" src=\"Js/jquery-3.2.1.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!--Web CDN-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>About Us</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            @font-face{\n");
      out.write("                font-family: font1;\n");
      out.write("                src: url('DigitalStrip2BB_bold.ttf');\n");
      out.write("            }\n");
      out.write("            @font-face{\n");
      out.write("                font-family: font2;\n");
      out.write("                src: url('SFCartoonistHand.ttf');\n");
      out.write("            }\n");
      out.write("            @font-face{\n");
      out.write("                font-family: font3;\n");
      out.write("                src: url('DigitalStrip2BB_reg.ttf');\n");
      out.write("            }\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"Img/BackgroundImg.jpg\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
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
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <h1 style=\" font-family: font1; font-size: 70px\">Shoppers Square</h1>\n");
      out.write("                <h4 style=\"font-family: font3; font-size: 35px\">India’s Ultimate Online Shopping Site</h4><br>\n");
      out.write("                <p style=\"font-size: 28.5px; font-family: font2; font-weight: 600\">\n");
      out.write("                    Shoppers Square is a retail company established in Mumbai, India in 2009. It has stores located across most of the\n");
      out.write("                    metro cities in India. Shoppers Square has followed an innovative business model by tying up with major brands \n");
      out.write("                    to sell their products through its stores. Shoppers Square is run by the Retail Management Group led by David Bansal,\n");
      out.write("                    the CEO of the company. Shoppers Square has more than 1500 employees who handle the daily operations of the company\n");
      out.write("                    across its stores. Filtering the latest trends, prospects never seem to end when you are shopping with Shoppers Square. \n");
      out.write("                    Best ever combos, reasonable price, wide product range & durable quality; a promise that Shoppers Square as a brand has made to \n");
      out.write("                    its customers. We also endeavour on providing back to back irresistible offers and reasonably priced products on\n");
      out.write("                    ShopersSquare.com to make online shopping rich & prolific. Our shopaholic mantra for customers is accompanied by\n");
      out.write("                    our ethics of never compromising on the quality and delivering value based expectations. With a customer-friendly approach, \n");
      out.write("                    Shoppers Square endeavors to deliver your products within the shortest possible time, and with a surety that you\n");
      out.write("                    will love what you choose.\n");
      out.write("                 </p>\n");
      out.write("\n");
      out.write("            </div>\n");
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
