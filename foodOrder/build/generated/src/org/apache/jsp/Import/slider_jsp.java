package org.apache.jsp.Import;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class slider_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style>\n");
      out.write("   \n");
      out.write("   .mm{margin-top: 20px;} \n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"mm\">\n");
      out.write("<div id=\"myCarousel\" class=\"carousel slide\">\n");
      out.write("   \n");
      out.write("  <!-- Indicators -->\n");
      out.write("  <ol class=\"carousel-indicators\">\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("  </ol>\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"item active\">\n");
      out.write("      <img src=\"img/s1%20.jpg\" style=\"width:100%; height: 350px;\" class=\"img-responsive\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("          <!--<div class=\"carousel-caption\">\n");
      out.write("          <h1>Bootstrap 3 Carousel Layout</h1>\n");
      out.write("          <p></p>\n");
      out.write("          <p><a class=\"btn btn-lg btn-primary\" href=\"http://getbootstrap.com\">Learn More</a>\n");
      out.write("        </p>\n");
      out.write("        </div>-->\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"item\">\n");
      out.write("      <img src=\"img/s3.jpg\" style=\"width:100%; height:350px;\"  class=\"img-responsive\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("       <!-- <div class=\"carousel-caption\">\n");
      out.write("          <h1>Changes to the Grid</h1>\n");
      out.write("          <p>Bootstrap 3 still features a 12-column grid, but many of the CSS class names have completely changed.</p>\n");
      out.write("          <p><a class=\"btn btn-large btn-primary\" href=\"#\">Learn more</a></p>\n");
      out.write("        </div>-->\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"item\">\n");
      out.write("      <img src=\"img/s4.jpg\" style=\"width:100%; height:350px;\"  class=\"img-responsive\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("       <!-- <div class=\"carousel-caption\">\n");
      out.write("          <h1>Percentage-based sizing</h1>\n");
      out.write("          <p>With \"mobile-first\" there is now only one percentage-based grid.</p>\n");
      out.write("          <p><a class=\"btn btn-large btn-primary\" href=\"#\">Browse gallery</a></p>\n");
      out.write("        </div>-->\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <!-- Controls -->\n");
      out.write("  <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("    <span class=\"icon-prev\"></span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("    <span class=\"icon-next\"></span>\n");
      out.write("  </a>  \n");
      out.write("</div>\n");
      out.write("<!-- /.carousel -->\n");
      out.write("</div>");
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
