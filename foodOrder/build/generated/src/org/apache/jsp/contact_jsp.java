package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/Import/head.jsp");
    _jspx_dependants.add("/Import/navbar2.jsp");
    _jspx_dependants.add("/Import/login.jsp");
    _jspx_dependants.add("/Import/footer.jsp");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
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
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       <!-----------------JM slider links------------------->\n");
      out.write("       <link href=\"themes/4/js-image-slider.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    <script src=\"themes/4/js-image-slider.js\" type=\"text/javascript\"></script>\n");
      out.write("    <link href=\"generic.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    <!----------------- endslider links------------------->\n");
      out.write("    \n");
      out.write("    \n");
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
      out.write("        \n");
      out.write("        <script src=\"http://maps.googleapis.com/maps/api/js\"></script>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("             body{background-image: url(back5.jpg); \n");
      out.write("             background-size: 2500px}\n");
      out.write("             \n");
      out.write("             h4,p{color: #ffffff;}\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function initialize() {\n");
      out.write("                var mapProp = {\n");
      out.write("                    center: new google.maps.LatLng(51.508742, -0.120850),\n");
      out.write("                    zoom: 5,\n");
      out.write("                    mapTypeId: google.maps.MapTypeId.ROADMAP\n");
      out.write("                };\n");
      out.write("                var map = new google.maps.Map(document.getElementById(\"googleMap\"), mapProp);\n");
      out.write("            }\n");
      out.write("            google.maps.event.addDomListener(window, 'load', initialize);\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
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
      out.write("\n");
      out.write("        <div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
      out.write("         <div id=\"googleMap\" style=\"width:1180px;height:380px; margin-top: 120px\"></div>  \n");
      out.write("\n");
      out.write("            <div class=\"row\">\t\n");
      out.write("\n");
      out.write("                <div id=\"contactSection\">\n");
      out.write("                    <div class=\"span6\" style=\"margin-top: -100px;\">\n");
      out.write("\n");
      out.write("                        <form class=\"form\">\n");
      out.write("                            <fieldset>\n");
      out.write("                                <div class=\"control-group\">\n");
      out.write("                                    <h4><span>Mail us</span></h4> <hr>\n");
      out.write("                                    <div class=\"controls\">\n");
      out.write("                                        <input type=\"text\" class=\"input-xlarge\" id=\"input01\" placeholder=\"Your Name\" style=\" border-radius: 0px; width: 200px\">\n");
      out.write("                                        <input type=\"text\" class=\"input-xlarge\" id=\"input01\" placeholder=\"Your Email\" style=\"margin-left: 25px; border-radius: 0px; width: 200px\">\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"control-group\">\n");
      out.write("\n");
      out.write("                                    <div class=\"controls\">\n");
      out.write("                                        <input type=\"text\" class=\"input-xxlarge\" id=\"input11\" placeholder=\"Subject\"  style=\" border-radius: 0px; width: 443px\">\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"control-group\">\n");
      out.write("\n");
      out.write("                                    <div class=\"controls\">\n");
      out.write("                                        <textarea class=\"input-xlarge\" id=\"textarea\" rows=\"3\" placeholder=\"Message\" style=\"width: 443px;height:200px; border-radius: 0px; \"></textarea>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div style=\"margin-left: 255px\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-success \" class=\"\"  style=\"border-radius: 0px; \">send messages</button>\n");
      out.write("                                    <button class=\"btn\" style=\" border-radius: 0px; \">Cancel</button>\n");
      out.write("                                </div>\n");
      out.write("                            </fieldset>\n");
      out.write("                        </form>\n");
      out.write("                    </div> \n");
      out.write("                    <div class=\"span6\" style=\"margin-top: -100px;\">\t\n");
      out.write("                        <h4><span>Contact us</span></h4> <hr>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"span3\">\n");
      out.write("                        <h4>  <i class=\"icon-map-marker\"></i></h4>\n");
      out.write("                        <h4>Address</h4>\n");
      out.write("                        <p>xxxxxxxxxxxxxxxxxx\n");
      out.write("                            xxxxxxxxxxxxxxxxxxxxxx\n");
      out.write("                            xxxxxxxxxxxxxxxxxxx\n");
      out.write("                            xxxxxxxxxxxxxxxxxx\n");
      out.write("                            xxxxxxxxxxxxxx</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"span3\">\n");
      out.write("                        <h4> <i class=\"icon-phone\"></i></h4>\n");
      out.write("                        <h4>Phone</h4>\n");
      out.write("                        <p>xxxxxxxxxxxxxxxxxx\n");
      out.write("                            xxxxxxxxxxxxxxxxxxxxxx\n");
      out.write("                            xxxxxxxxxxxxxxxxxxx\n");
      out.write("                            xxxxxxxxxxxxxxxxxx\n");
      out.write("                            xxxxxxxxxxxxxx</p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"span3\">\n");
      out.write("                        <h4> <i class=\"icon-globe\"></i></h4>\n");
      out.write("                        <h4>Web</h4>\n");
      out.write("                        <p>xxxxxxxxxxxxxxxxxx\n");
      out.write("                            xxxxxxxxxxxxxxxxxxxxxx\n");
      out.write("                            xxxxxxxxxxxxxxxxxxx\n");
      out.write("                            xxxxxxxxxxxxxxxxxx\n");
      out.write("                            xxxxxxxxxxxxxx</p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"span3\">\n");
      out.write("                        <h4> <i class=\"icon-envelope\"></i></h4>\n");
      out.write("                        <h4>Email</h4>\n");
      out.write("                        <p>xxxxxxxxxxxxxxxxxx\n");
      out.write("                            xxxxxxxxxxxxxxxxxxxxxx\n");
      out.write("                            xxxxxxxxxxxxxxxxxxx\n");
      out.write("                            xxxxxxxxxxxxxxxxxx\n");
      out.write("                            xxxxxxxxxxxxxx</p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div> \n");
      out.write("            </div> \n");
      out.write("        </div> \n");
      out.write("        \n");
      out.write("        <!---------------------Start Thumnail------------------------------------>          \n");
      out.write("            <marquee direction=\"right\" >\n");
      out.write("        <div id=\"beforeFooter\" class=\"cntr\">\n");
      out.write("            <div class=\"container-fluid\" style=\"margin-left: 40px; margin-top: 100px;\">\n");
      out.write("\n");
      out.write("                <div class=\"span4\"><img src=\"themes/images/beforeFooter/bfr1.png\" style=\" width: 370px;height: 150px;\"></div>\n");
      out.write("                <div class=\"span4\"><img src=\"themes/images/beforeFooter/bfr2.png\" style=\" width: 370px;height: 150px;\"></div>\n");
      out.write("                <div class=\"span4\"><img src=\"themes/images/beforeFooter/bfr3.png\" style=\" width: 370px;height: 150px;\"></div>\n");
      out.write("            </div> \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </marquee>\n");
      out.write("            <!---------------------End Thumnail------------------------------------>       \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("</style>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
