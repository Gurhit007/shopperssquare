package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Shop_005fCart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Shop Cart</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"row\">\n");
      out.write("       \n");
      out.write("        <div class=\"col-xs-3\"></div>\n");
      out.write("        \n");
      out.write("        <div class=\"col-xs-6 form-group\">\n");
      out.write("            \n");
      out.write("        <form method=\"post\" action=\"\">\n");
      out.write("            <br><br>\n");
      out.write("            <input class=\"form-control input-md\" type=\"hidden\" name=\"pdata\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productitem.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("            \n");
      out.write("            <label style=\"font-size: 17px\" class=\"control-label\" for=\"user_email\">Email</label>\n");
      out.write("            <input id=\"user_email\" class=\"form-control input-md\" type=\"text\" name=\"pdata\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productitem.getProductname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("           \n");
      out.write("             <label style=\"font-size: 17px\" for=\"user_mob\">Phone</label>\n");
      out.write("              <input id=\"user_mob\" class=\"form-control input-md\" type=\"text\" name=\"pdata\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productitem.getDescription()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("              \n");
      out.write("              <label style=\"font-size: 17px\" for=\"ship_add\">Shipping Address</label>\n");
      out.write("              <input id=\"ship_add\" class=\"form-control input-md\" type=\"text\" name=\"pdata\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productitem.getDiscount()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("           \n");
      out.write("              <label style=\"font-size: 17px\" for=\"bill_add\">Billing Address</label>\n");
      out.write("              <input id=\"bill_add\" class=\"form-control input-md\" type=\"text\" name=\"pdata\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productitem.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("            \n");
      out.write("                <!--<input type=\"hidden\" name=\"pdata\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productitem.getLink()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">-->\n");
      out.write("            \n");
      out.write("                <label style=\"font-size: 17px\" for=\"prod_qty\">Quantity</label>\n");
      out.write("                <input id=\"prod_qty\" class=\"form-control input-md\" type=\"text\" name=\"pdata\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productitem.getCategory()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("                \n");
      out.write("                <label style=\"font-size: 17px\" for=\"prod_total\">Total</label> \n");
      out.write("                    <input id=\"prod_total\" class=\"form-control input-md\" type=\"text\" name=\"pdata\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productitem.getAccessories()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("                \n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("           \n");
      out.write("           <div class=\"col-xs-3\"></div>\n");
      out.write("        </div>\n");
      out.write("        \n");
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
