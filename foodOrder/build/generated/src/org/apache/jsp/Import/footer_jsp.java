package org.apache.jsp.Import;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Import/head.jsp");
  }

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title>Seen Saal</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("        \n");
      out.write("       <!-- <script src=\"jquery/jquery-1.10.2.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("        <script src=\"js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("        <link href=\"css/font-awesome.css\" rel=\"stylesheet\"/>\n");
      out.write("        <link href=\"css/pe-icon-7-stroke.css\" rel=\"stylesheet\" />\n");
      out.write("        \n");
      out.write("        <script src=\"https://maps.googleapis.com/maps/api/js?v=3.exp\"></script>\n");
      out.write("        <link href=\"http://netdna.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Grand+Hotel' rel='stylesheet' type='text/css'>-->\n");
      out.write("        \n");
      out.write("     <!-------------------------test link-------------- -->  \n");
      out.write("     \n");
      out.write("     \n");
      out.write("\t<link id=\"callCss\" rel=\"stylesheet\" href=\"themes/css/bootstrap.min.css\" type=\"text/css\" media=\"screen\" charset=\"utf-8\" />\n");
      out.write("\t<link id=\"callCss\" rel=\"stylesheet\" href=\"themes/css/style.css\" type=\"text/css\" media=\"screen\" charset=\"utf-8\" />\n");
      out.write("\t<link href=\"themes/css/bootstrap-responsive.min.css\" rel=\"stylesheet\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"themes/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        \n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,700,900,100italic,300italic,400italic,700italic,900italic' rel='stylesheet' type='text/css'>\n");
      out.write("        \n");
      out.write("        <script src=\"themes/js/jquery-1.9.1.min.js\"></script>\n");
      out.write("<script src=\"themes/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"themes/js/jquery.scrollTo-1.4.3.1-min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"themes/js/jquery.easing-1.3.min.js\"></script>\n");
      out.write("<script src=\"themes/js/jquery.scrollTo-1.4.3.1-min.js\"></script>\n");
      out.write("<script src=\"themes/js/default.js\"></script> \n");
      out.write("     <!-------------------------test link-------------- -->        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("<div id=\"footerSection\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"socialMedia\" style=\"margin-right: 60px;\">\n");
      out.write("            <a class=\"facebook\" href=\"#\"></a>\n");
      out.write("            <a class=\"twitter\" href=\"#\"></a>\n");
      out.write("        </div>\n");
      out.write("  \n");
      out.write("        <div id=\"footerMenu\">\n");
      out.write("                <a href=\"#home\">Home</a>\n");
      out.write("                <a href=\"#order\">Order</a>\n");
      out.write("                <a href=\"#recipy\">My recipy</a>\n");
      out.write("                <a href=\"#menu\">Menu</a>\n");
      out.write("                <a href=\"#account\">user</a>\n");
      out.write("                <a href=\"#logout\">Logout</a>\n");
      out.write("                \n");
      out.write("        </div>\n");
      out.write("        <p><small>www.seen Saal.com &copy; 2015 All rights reserved.</small></p>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<a href=\"#\" class=\"go-top\" style=\"display: none;\"><i class=\"icon-double-angle-up\"></i></a>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("   \n");
      out.write("\t$('#testimonial').carousel({\n");
      out.write("\t  interval: 10000;\n");
      out.write("\t})\n");
      out.write("\t$('#myCarousel').carousel({\n");
      out.write("\t  interval: 7000;\n");
      out.write("\t});\n");
      out.write("</script>");
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
