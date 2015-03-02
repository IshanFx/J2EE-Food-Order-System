package org.apache.jsp.Import;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navbar2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Import/login.jsp");
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
      out.write("<style>\n");
      out.write("    .span3-my {\n");
      out.write("   \n");
      out.write("    margin-left: -75px!important;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar .nav {\n");
      out.write("    \n");
      out.write("    margin: 0px 160px 0px 0px !important;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#headerSection:hover {\n");
      out.write("    background:none!important;\n");
      out.write("    border-bottom: 0px solid #DEDEDE;\n");
      out.write("    padding:8px 50px 0px;\n");
      out.write("    font-size:  30px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("li a:hover{\n");
      out.write("    font-size: 20px;\n");
      out.write(" color: #000;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<div id=\"headerSection\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("            \n");
      out.write("            <div class=\"span3-my\">\n");
      out.write("                \n");
      out.write("                <h2 class=\"cntr\"><i class=\"icon-phone-sign\"></i> 450-635-5236</h2>\n");
      out.write("                <h5 class=\"cntr\">Order now !!!! </h5> \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"span3\" style=\" margin-right: -150px; float: right\">\n");
      out.write("                \n");
      out.write("                <h1><i class=\"icon icon-bitbucket\"></i></h1>\n");
      out.write("                \n");
      out.write("             \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("          \n");
      out.write("            <div class=\"navbar\" style=\"margin-top: 20px;\">\n");
      out.write("\t\t\t<div class=\"nav-collapse\">\n");
      out.write("\t\t\t\t<ul class=\"nav\">\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"index.jsp\">Home\t</a></li>\n");
      out.write("                                        <li><a href=\"menu.jsp\">Menu</a></li>\n");
      out.write("                                        <li><a href=\"myres.jsp\">My recipe</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"order.jsp\">Order</a></li>\t\t\t\t\t\n");
      out.write("                                        <li><a href=\"about.jsp\">about us</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"contact.jsp\">contact us</a></li>\n");
      out.write("                                        <li><a class=\"btn\" data-toggle=\"modal\" href=\"#myModal\" >User</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#logout\">Logout</a></li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                       \n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    .modal {\n");
      out.write("        position: fixed;\n");
      out.write("        top: 50%!important;\n");
      out.write("        left: 35%!important;\n");
      out.write("        z-index: 1050;\n");
      out.write("        width: 1000px!important;\n");
      out.write("        margin: -250px 0px 0px -280px;\n");
      out.write("        background-color: #FFF;\n");
      out.write("        border: 1px solid rgba(0, 0, 0, 0.3);\n");
      out.write("        border-radius: 0px!important;\n");
      out.write("        outline: 0px none;\n");
      out.write("        box-shadow: 0px 3px 7px rgba(0, 0, 0, 0.3);\n");
      out.write("        background-clip: padding-box;\n");
      out.write("    }\n");
      out.write("    .modal-footer {\n");
      out.write("        padding: 14px 15px 15px;\n");
      out.write("        margin-bottom: 0px;\n");
      out.write("        text-align:right!important;\n");
      out.write("        background-color: #F5F5F5;\n");
      out.write("        border-top: 1px solid #DDD;\n");
      out.write("        border-radius: 0px 0px 0px 0px!important;\n");
      out.write("        box-shadow: 0px 1px 0px #FFF inset;\n");
      out.write("    }\n");
      out.write("    .element{border-radius: 0px!important;}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("\n");
      out.write("<div id=\"myModal\" class=\"modal hide fade\" tabindex=\"-1\" role=\"dialog\"\n");
      out.write("     aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-header\">\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
      out.write("                aria-hidden=\"true\">×</button>\n");
      out.write("        <h3 id=\"myModalLabel\" class=\"cntr\">Enter the Seen Saal</h3>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("            <!--register model-->           \n");
      out.write("            <div class=\"col-lg-6 col-sm-6\" style=\"float: left\">\n");
      out.write("                <h4 class=\"cntr\">Register here</h4><hr>\n");
      out.write("                <form class=\"form-horizontal\">\n");
      out.write("                    <div class=\"control-group\">\n");
      out.write("                        <label class=\"control-label\" for=\"fistName\">First name</label>\n");
      out.write("                        <div class=\"controls\">\n");
      out.write("                            <input class=\"element input-xlarge\" type=\"text\" id=\"fistName\" placeholder=\"First name\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"control-group\">\n");
      out.write("                        <label class=\"control-label\" for=\"fistName\">Last name</label>\n");
      out.write("                        <div class=\"controls\">\n");
      out.write("                            <input class=\"element input-xlarge\" type=\"text\" id=\"lastName\" placeholder=\"Last name\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"control-group\">\n");
      out.write("                        <label class=\"control-label\" for=\"fistName\">Address</label>\n");
      out.write("                        <div class=\"controls\">\n");
      out.write("                            <textarea class=\"element input-xlarge\" type=\"text\" id=\"address\" placeholder=\"Address\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"control-group\">\n");
      out.write("                        <label class=\"control-label\" for=\"LastName\">Telephone</label>\n");
      out.write("                        <div class=\"controls\">\n");
      out.write("                            <input class=\"element input-xlarge\" type=\"text\" id=\"LastName\" placeholder=\"Telophone\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"control-group\">\n");
      out.write("                        <label class=\"control-label\" for=\"email\">Email</label>\n");
      out.write("                        <div class=\"controls\">\n");
      out.write("                            <input class=\"element input-xlarge\" type=\"text\" id=\"Email\" placeholder=\"Email\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"control-group\">\n");
      out.write("                        <label class=\"control-label\" for=\"inputPassword\">Password</label>\n");
      out.write("                        <div class=\"controls\">\n");
      out.write("                            <input class=\"element input-xlarge\" type=\"password\" id=\"inputPassword\" placeholder=\"Password\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"control-group\">\n");
      out.write("                        <label class=\"control-label\" for=\"inputPassword\">Renter password</label>\n");
      out.write("                        <div class=\"controls\">\n");
      out.write("                            <input class=\"element input-xlarge\" type=\"password\" id=\"inputPassword\" placeholder=\"RenterPassword\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"control-group\">\n");
      out.write("                        <div class=\"controls\">\n");
      out.write("                            <label class=\"checkbox\">\n");
      out.write("                                <input type=\"checkbox\"> Agree teem's condition\n");
      out.write("                            </label>\n");
      out.write("                            <button  type=\"submit\" class=\"btn btn-info input-large\">Sign in </button>\n");
      out.write("                            <button  type=\"reset\" class=\"btn btn-inverse\">Cansel </button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <!--login moodel-->\n");
      out.write("            <div class=\"col-lg-6 col-sm-6\" style=\"float: left\">\n");
      out.write("                <h4 class=\"cntr\">Login here</h4><hr>\n");
      out.write("                <form class=\"form-horizontal\">\n");
      out.write("                    <div class=\"control-group\">\n");
      out.write("                        <label class=\"control-label\" for=\"inputEmail\">Email</label>\n");
      out.write("                        <div class=\"controls\">\n");
      out.write("                            <input class=\"element input-xlarge\" type=\"text\" id=\"inputEmail\" placeholder=\"Email\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"control-group\">\n");
      out.write("                        <label class=\"control-label\" for=\"inputPassword\">Password</label>\n");
      out.write("                        <div class=\"controls\">\n");
      out.write("                            <input class=\"element input-xlarge\" type=\"password\" id=\"inputPassword\" placeholder=\"Password\">\n");
      out.write("                            <p>forgot password</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"control-group \">\n");
      out.write("                        <div class=\"controls\">\n");
      out.write("                            <label class=\"checkbox\">\n");
      out.write("                                <input type=\"checkbox\"><p>Remember me</p>\n");
      out.write("                            </label>\n");
      out.write("                            <button  type=\"submit\" class=\"btn btn-info input-large\">Sign in </button>\n");
      out.write("                            <button  type=\"reset\" class=\"btn btn-inverse\">Cansel </button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- <div class=\"span4 cntr\"><img src=\"themes/images/beforeFooter/bf3.png\" style=\" width: 370px;height: 150px;\"></div>-->\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"modal-footer\">\n");
      out.write("        <button class=\"btn btn-danger  cntr \" data-dismiss=\"modal\" aria-hidden=\"true\"><i class=\"icon-remove-sign\"></i> close</button>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
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
