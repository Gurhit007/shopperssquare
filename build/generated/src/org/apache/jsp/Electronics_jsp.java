package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Electronics_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Electronics</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    <link href=\"Css/shop-homepage.css\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function(){\n");
      out.write("\n");
      out.write("var quantitiy = 0;\n");
      out.write("   $('.quantity-right-plus').click(function(e){\n");
      out.write("        \n");
      out.write("        // Stop acting like a button\n");
      out.write("        e.preventDefault();\n");
      out.write("        // Get the field name\n");
      out.write("        var quantity = parseInt($('#quantity').val());\n");
      out.write("        \n");
      out.write("        // If is not undefined\n");
      out.write("            \n");
      out.write("            $('#quantity').val(quantity + 1);\n");
      out.write("\n");
      out.write("          \n");
      out.write("            // Increment\n");
      out.write("        \n");
      out.write("    });\n");
      out.write("\n");
      out.write("     $('.quantity-left-minus').click(function(e){\n");
      out.write("        // Stop acting like a button\n");
      out.write("        e.preventDefault();\n");
      out.write("        // Get the field name\n");
      out.write("        var quantity = parseInt($('#quantity').val());\n");
      out.write("        \n");
      out.write("        // If is not undefined\n");
      out.write("      \n");
      out.write("            // Increment\n");
      out.write("            if(quantity>0){\n");
      out.write("            $('#quantity').val(quantity - 1);\n");
      out.write("            }\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("});\n");
      out.write("\n");
      out.write("    \n");
      out.write("        \n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <form action=\"CartInsert\" method=\"post\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("                <div class=\"thumbnail col-md-6\" >\n");
      out.write("                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getLink()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"height: 510px\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("                        \n");
      out.write("                <div class=\"col-md-1\"></div>\n");
      out.write("                        \n");
      out.write("                    <div class=\"col-md-5\">\n");
      out.write("                        <h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getProductname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("                        <h3>&#8377; ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("                        <h3 class=\"btn btn-success btn-lg\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getDiscount()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" off</h3>\n");
      out.write("                        <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getDescription()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("                        <h3><b>Color :</b> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getColor()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("                        <h3><b>Accessories :</b> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getAccessories()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("                        <h3><b>Specification :</b> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getSpecification()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("                    </div> \n");
      out.write("            </div> \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-7\"></div>\n");
      out.write("                                \n");
      out.write("                    <span style=\"font-size: 20px; float: left\">\n");
      out.write("                        Qty. : &nbsp;&nbsp;\n");
      out.write("                    </span>\n");
      out.write("                                \n");
      out.write("                    <div class=\"input-group col-md-2 pull-left\">\n");
      out.write("                        \n");
      out.write("                        <span class=\"input-group-btn\">\n");
      out.write("                            <button type=\"button\" class=\"btn-md quantity-left-minus btn btn-danger btn-number\"  data-type=\"minus\" data-field=\"\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-minus\"></span>\n");
      out.write("                            </button>\n");
      out.write("                        </span>\n");
      out.write("                        <input type=\"hidden\" name=\"cart\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><input style=\"text-align: center; font-size: 20px\" type=\"number\" id=\"quantity\" name=\"cart\" class=\"form-control input-number\" value=\"1\" min=\"1\" max=\"100\">\n");
      out.write("                        <span class=\"input-group-btn\">\n");
      out.write("                            <button type=\"button\" class=\"quantity-right-plus btn btn-success btn-number\" data-type=\"plus\" data-field=\"\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-plus\"></span>\n");
      out.write("                            </button>\n");
      out.write("                        </span>\n");
      out.write("                                          \n");
      out.write("                    </div>\n");
      out.write("                             \n");
      out.write("                    <div class=\"btn-md col-md-2 pull-right\" >\n");
      out.write("                        <a href=\"\" class=\"btn btn-info\" >\n");
      out.write("                            <span class=\"glyphicon glyphicon-shopping-cart\"></span>\n");
      out.write("                            <input style=\"background: none; border: none\" type=\"submit\" value=\"Add to Cart\">\n");
      out.write("                        </a>  \n");
      out.write("                    </div>\n");
      out.write("          \n");
      out.write("                <br><br>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("                         \n");
      out.write("    </div>\n");
      out.write("                    <br><br>                    \n");
      out.write("    </form>\n");
      out.write("                       \n");
      out.write("                        <!--<div class=\"btn-md col-md-2 pull-right\">\n");
      out.write("                        <a href=\"\" class=\"btn btn-info\" >\n");
      out.write("                            <span class=\"glyphicon glyphicon-shopping-cart\"></span> \n");
      out.write("                            <input style=\"background: none; border: none\" data-toggle=\"modal\" data-target=\"#myModal\" type=\"submit\" value=\"Add to Cart\">\n");
      out.write("                        </a>  \n");
      out.write("                    </div>\n");
      out.write("                       -->\n");
      out.write("                        \n");
      out.write("                       <!-- <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">-->\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("     <!-- <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                <h4 class=\"modal-title\">Modal Header</h4>\n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <a>To add this item user need to log in</a>\n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("            </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>-->\n");
      out.write("                        \n");
      out.write("</body>\n");
      out.write("\n");
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
