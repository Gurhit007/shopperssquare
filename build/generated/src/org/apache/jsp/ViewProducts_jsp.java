package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import products.Products;
import java.util.List;
import products.ProductsDAOImpl;

public final class ViewProducts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    ProductsDAOImpl pdao = new ProductsDAOImpl();

    List<Products> list = pdao.getProducts();
        
        request.setAttribute("productData", list);
        

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>View Products</title>\n");
      out.write("        <style>\n");
      out.write("            th{\n");
      out.write("                padding: 20px;\n");
      out.write("                font-size: 22px;\n");
      out.write("                color: #D16587;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            td{\n");
      out.write("                font-size: 20px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"Img/BackgroundImg.jpg\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <!--First Row-->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <img src=\"Img/ShoppersLogo.png\" alt=\"Logo\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <!--Second Row-->\n");
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
      out.write("                    \n");
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
      out.write("  </div>\n");
      out.write("</nav>   \n");
      out.write("        <!--<h1 style=\"color: #E5E4E2; font-weight: 500\">Product List</h1>-->\n");
      out.write("        \n");
      out.write("        <table class=\"table\" style=\"background-color: #FFEBCD;\">\n");
      out.write("            <br>\n");
      out.write("            <thead style=\"background-color: lightpink\">\n");
      out.write("            <th>Product Name</th>\n");
      out.write("            <!--<th>Product Description</th>-->\n");
      out.write("            <th>Product Price</th>\n");
      out.write("            <th>View</th>\n");
      out.write("            ");
 if(session.getAttribute("aname")==null){
      out.write("\n");
      out.write("            ");
} else {
      out.write("\n");
      out.write("            <th>Update</th>\n");
      out.write("            <th>Delete</th>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </thead>\n");
      out.write("        ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productData}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_0.setVar("x");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("        <tr>\n");
            out.write("            <td class=\"text-info\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getProductname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("           <!-- <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getDescription()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>-->\n");
            out.write("            <td class=\"text-info\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("            <!--<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getCategory()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write(" <img src=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getLink()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"> </td>-->\n");
            out.write("            <td>\n");
            out.write("                <a class=\"btn btn-info btn-md\" href=\"ViewProduct?id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">\n");
            out.write("                    <span class=\"glyphicon glyphicon-eye-open\"></span>\n");
            out.write("                </a>\n");
            out.write("            </td>\n");
            out.write("            \n");
            out.write("            ");
 if(session.getAttribute("aname")==null){
            out.write("\n");
            out.write("            ");
} else {
            out.write("\n");
            out.write("            <td>\n");
            out.write("                <a class=\"btn btn-warning btn-md\" href=\"UpdateProducts?id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">\n");
            out.write("                    <span class=\"glyphicon glyphicon-pencil\"></span>\n");
            out.write("                </a>\n");
            out.write("            </td>\n");
            out.write("            <td>\n");
            out.write("                <a class=\"btn btn-danger btn-md\" href=\"DeleteProduct?id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">\n");
            out.write("                    <span class=\"glyphicon glyphicon-trash\"></span>\n");
            out.write("                </a>\n");
            out.write("            </td>\n");
            out.write("            ");
}
            out.write("\n");
            out.write("            \n");
            out.write("            </tr>\n");
            out.write("        ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\n");
      out.write("        \n");
      out.write("        </table> \n");
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
