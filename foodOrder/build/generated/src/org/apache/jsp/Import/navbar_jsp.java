package org.apache.jsp.Import;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navbar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  \n");
      out.write("    i{\n");
      out.write("        font-size: 30px;\n");
      out.write("    }  \n");
      out.write("    .navbar-ct-blue{\n");
      out.write("        background-image: linear-gradient(to bottom, #00aaff 0%, #0088cc 100%);   \n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<div class=\"navbar-wrapper\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div  class=\"navbar navbar-inverse navbar\">\n");
      out.write("      \n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("\t    <a class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("\t      <span class=\"icon-bar\"></span>\n");
      out.write("\t      <span class=\"icon-bar\"></span>\n");
      out.write("\t      <span class=\"icon-bar\"></span>\n");
      out.write("\t    </a>\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">Bootstrap 3</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"navbar-collapse collapse\">\n");
      out.write("          <ul class=\"nav navbar-nav  navbar-right\">\n");
      out.write("            <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("         \n");
      out.write("            <li><a href=\"http://www.bootply.com\" target=\"ext\">About</a></li>\n");
      out.write("            <li><a href=\"#contact\">Contact</a></li>\n");
      out.write("              \n");
      out.write("               \n");
      out.write("              \n");
      out.write("               \n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Dropdown <b class=\"caret\"></b></a>\n");
      out.write("              <ul class=\"dropdown-menu\">\n");
      out.write("                <li><a href=\"#\">Action</a></li>\n");
      out.write("                <li><a href=\"#\">Another action</a></li>\n");
      out.write("                <li><a href=\"#\">Something else here</a></li>\n");
      out.write("                <li class=\"divider\"></li>\n");
      out.write("                <li><a href=\"#\">Separated link</a></li>\n");
      out.write("                <li><a href=\"#\">One more separated link</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("              \n");
      out.write("              <li ><a><b><?php echo $_SESSION['user']; ?></b></a></li>\n");
      out.write("                <li><a href=\"logout.php\">Logout</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </div><!-- /container -->\n");
      out.write("</div><!-- /navbar wrapper -->\n");
      out.write("\n");
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
