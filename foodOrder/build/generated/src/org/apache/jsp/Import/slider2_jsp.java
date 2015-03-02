package org.apache.jsp.Import;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class slider2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<div id=\"carouselSection\" class=\"cntr\"> \n");
      out.write("    <div id=\"myCarousel\" class=\"carousel slide\">\n");
      out.write("        <div class=\"carousel-inner\">\n");
      out.write("            <div class=\"item active\">\n");
      out.write("                <a class=\"cntr\" href=\"#\"><img src=\"themes/images/slider/s1.png\" alt=\"\" style=\"width:100%; height: 450px;\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <a class=\"cntr\" href=\"#\"><img src=\"themes/images/slider/s2.png\" alt=\"\" style=\"width:100%; height: 350px;\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <a class=\"cntr\" href=\"#\"><img src=\"themes/images/slider/s1.png\" alt=\"\" style=\"width:100%; height: 350px;\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div  class=\"item\">\n");
      out.write("                <a class=\"cntr\" href=\"#\"><img src=\"themes/images/slider/s2.png\" alt=\"\" style=\"width:100%; height: 350px;\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                 <a class=\"cntr\" href=\"#\"><img src=\"themes/images/slider/cc.png\" alt=\"\" style=\"width:100%; height: 350px;\"></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">&lsaquo;</a>\n");
      out.write("        <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">&rsaquo;</a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
