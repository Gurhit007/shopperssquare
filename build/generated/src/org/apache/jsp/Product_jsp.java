package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <title>Products</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body background=\"Img/BackgroundImg.jpg\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <!--<img src=\"Img/ShoppersLogo.png\" height=\"107px\" width=\"310px\">-->\n");
      out.write("                <img src=\"Img/ShoppersLogo.png\" alt=\"Logo\">\n");
      out.write("                \n");
      out.write("                ");
 if(session.getAttribute("aname")==null){
      out.write("\n");
      out.write("                        <a href=\"AdminSignIn.jsp\"></a>\n");
      out.write("                        ");
}else {
      out.write("<br>\n");
      out.write("                    <a href=\"AdminLogOutSuccess.jsp\" class=\"btn btn-danger btn-md\" style=\"float: right\">\n");
      out.write("                        <span class=\"glyphicon glyphicon-log-out\" > LogOut</span>\n");
      out.write("                    </a>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                         \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <form action=\"addProduct\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("            \n");
      out.write("               <!-- <input type=\"file\" class=\"form-control input-md\"  name=\"abc\">-->\n");
      out.write("               \n");
      out.write("               <input type=\"file\" name=\"abc\" required=\"\">\n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("<!-- Text input-->\n");
      out.write("<div class=\"col-md-3\"></div>\n");
      out.write("<div class=\"form-group\">\n");
      out.write("     <label style=\"float:left; font-size: 20px\" class=\"control-label\" for=\"product_name\">Product Name</label> \n");
      out.write("  <div class=\"col-md-6\">\n");
      out.write("      <input id=\"product_name\" name=\"products\" class=\"form-control input-md\" required=\"\" type=\"text\" style=\"outline: none\">\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"col-md-3\"></div>\n");
      out.write("\n");
      out.write("<br><br>\n");
      out.write("\n");
      out.write("<div class=\"col-md-3\"></div>\n");
      out.write("<div class=\"form-group\">\n");
      out.write("    <label style=\"float:left; font-size: 20px\" class=\"control-label\" for=\"product_description\">\n");
      out.write("        Description &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    </label>\n");
      out.write("    \n");
      out.write("  <div class=\"col-md-6\">                     \n");
      out.write("      <input class=\"form-control\" id=\"product_description\" type=\"text\" name=\"products\" style=\"outline: none\">\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"col-md-3\"></div>\n");
      out.write("<br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"col-md-3\"></div>\n");
      out.write("<div class=\"form-group\">\n");
      out.write("    <label style=\"float:left; font-size: 20px\" class=\"control-label\" for=\"percentage_discount\">\n");
      out.write("        Discount&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    </label>  \n");
      out.write("  \n");
      out.write("    <div class=\"col-md-6\">\n");
      out.write("  <input id=\"percentage_discount\" name=\"products\" class=\"form-control input-md\" required=\"\" type=\"text\">\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"col-md-3\"></div>\n");
      out.write("\n");
      out.write("<br><br>\n");
      out.write("\n");
      out.write("<div class=\"col-md-3\"></div>\n");
      out.write("<div class=\"form-group\">\n");
      out.write("    <label style=\"float:left; font-size: 20px\" class=\"control-label\" for=\"product_price\">\n");
      out.write("        Price&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    </label>  \n");
      out.write("  <div class=\"col-md-6\">\n");
      out.write("  <input id=\"product_price\" name=\"products\" class=\"form-control input-md\" required=\"\" type=\"text\">\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"col-md-3\"></div>\n");
      out.write("<br><br>\n");
      out.write("<div class=\"col-md-3\"></div>\n");
      out.write("<div class=\"form-group\">\n");
      out.write("    <label style=\"float:left; font-size: 20px\" class=\"control-label\" for=\"product_category\">\n");
      out.write("        Category&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    </label>\n");
      out.write("                      \n");
      out.write("    <div class=\"col-md-6\">\n");
      out.write("      <select id=\"product_category\" name=\"products\" class=\"form-control input-md\" >\n");
      out.write("          \n");
      out.write("          <option>Electronics</option>\n");
      out.write("          <option>Footwear</option>\n");
      out.write("          <option>Appliances</option>\n");
      out.write("          \n");
      out.write("      </select>\n");
      out.write("    </div>\n");
      out.write(" \n");
      out.write("</div>\n");
      out.write("<div class=\"col-md-3\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<br><br>\n");
      out.write("<div class=\"col-md-3\"></div>\n");
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("    <label style=\"float:left; font-size: 20px\" class=\"control-label\" for=\"product_spec\">\n");
      out.write("        Specification&nbsp;&nbsp;\n");
      out.write("    </label>  \n");
      out.write("  <div class=\"col-md-6\">\n");
      out.write("  <input id=\"product_spec\" name=\"products\" class=\"form-control input-md\" required=\"\" type=\"text\">\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"col-md-3\"></div>\n");
      out.write("<br><br>\n");
      out.write("\n");
      out.write("<div class=\"col-md-3\"></div>\n");
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("    <label style=\"float:left; font-size: 20px\" class=\"control-label\" for=\"product_color\">\n");
      out.write("        Color&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    </label>  \n");
      out.write("  <div class=\"col-md-6\">\n");
      out.write("  <input id=\"product_color\" name=\"products\" class=\"form-control input-md\" required=\"\" type=\"text\">\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"col-md-3\"></div>\n");
      out.write("<br><br>\n");
      out.write("\n");
      out.write("<div class=\"col-md-3\"></div>\n");
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("    <label style=\"float:left; font-size: 20px\" class=\"control-label\" for=\"product_accessories\">\n");
      out.write("        Accessories&nbsp;&nbsp;&nbsp;\n");
      out.write("    </label>  \n");
      out.write("  <div class=\"col-md-6\">\n");
      out.write("  <input id=\"product_accessories\" name=\"products\" class=\"form-control input-md\" type=\"text\">\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"col-md-3\"></div>\n");
      out.write("<br><br>\n");
      out.write("\n");
      out.write("<!-- Button -->\n");
      out.write("<div class=\"col-md-3\"></div>\n");
      out.write("<div class=\"form-group\">\n");
      out.write("  \n");
      out.write("  <div class=\"col-md-6\" style=\"text-align: center\">\n");
      out.write("    <button type=\"submit\" id=\"singlebutton\" name=\"add_btn\" class=\"btn btn-primary btn-md\">\n");
      out.write("        Add Product\n");
      out.write("    </button>\n");
      out.write("    &nbsp;\n");
      out.write("    <button type=\"submit\" id=\"singlebutton\" name=\"view_btn\" class=\"btn btn-warning btn-md\">\n");
      out.write("        <a href=\"ViewProducts.jsp\" style=\"text-decoration: none; color: white\">\n");
      out.write("            View Products\n");
      out.write("        </a>\n");
      out.write("    </button>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("<div class=\"col-md-3\"></div>\n");
      out.write("                \n");
      out.write("<br><br>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("    \n");
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
