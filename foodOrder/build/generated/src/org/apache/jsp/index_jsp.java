package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/Import/head.jsp");
    _jspx_dependants.add("/Import/navbar2.jsp");
    _jspx_dependants.add("/Import/login.jsp");
    _jspx_dependants.add("/Import/slider3.jsp");
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
      out.write("    <!--Start head--->     \n");
      out.write("    ");
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
      out.write("    <!--End head---> \n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("\n");
      out.write("        body{background-image: url(back5.jpg); \n");
      out.write("                background-size: 4000px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        h1{margin-top:-100px;} \n");
      out.write("        h1 {\n");
      out.write("            padding: 0px 0px 44px!important;\n");
      out.write("            font-weight: 500!important;\n");
      out.write("            font-size: 40px!important;\n");
      out.write("            font-family: cursive;\n");
      out.write("        }\n");
      out.write("        #ourServices {\n");
      out.write("            background: none;\n");
      out.write("            text-align: center;\n");
      out.write("            border-top: 0px solid #DDD;}\n");
      out.write("        img {\n");
      out.write("            border-radius: 0px!important;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <body data-spy=\"scroll\" data-target=\".navbar\">\n");
      out.write("\n");
      out.write("        <!--Start navbar-->\n");
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
      out.write("           \n");
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
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("    <div class=\"modal-footer\">\n");
      out.write("        <button class=\"btn btn-danger  cntr \" data-dismiss=\"modal\" aria-hidden=\"true\"><i class=\"icon-remove-sign\"></i> close</button>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        <!--End navbar--->\n");
      out.write("\n");
      out.write("        <!--start slider--->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<style>\n");
      out.write("    #slider div.sliderInner {\n");
      out.write("    width: 1200px!important;\n");
      out.write("    height: 400px;\n");
      out.write("}\n");
      out.write("    \n");
      out.write("#sliderFrame {\n");
      out.write("    position: relative;\n");
      out.write("    background-color: #E6E6E6;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("#slider {\n");
      out.write("    background: url(\"loading.gif\") no-repeat scroll 50% 50% transparent;\n");
      out.write("    position: relative;\n");
      out.write("    margin: 0px auto;\n");
      out.write("    transform: translate3d(0px, 0px, 0px);\n");
      out.write("    width: 1200px!important;\n");
      out.write("   \n");
      out.write("}\n");
      out.write("img{   border-radius: 500px;}\n");
      out.write("\n");
      out.write("#sliderFrame {\n");
      out.write("    position: relative;\n");
      out.write("    background-color:transparent;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("    \n");
      out.write("<div id=\"sliderFrame\" style=\"margin-top: 150px;\">\n");
      out.write("    <div id=\"slider\">\n");
      out.write("            <img src=\"themes/images/slider/fd1.png\"  />\n");
      out.write("            <img src=\"themes/images/slider/fd2.jpg\"  />\n");
      out.write("            <img src=\"themes/images/slider/f1.jpg\" />\n");
      out.write("            <img src=\"themes/images/slider/fd4.jpg\" />\n");
      out.write("        </div>\n");
      out.write("        <!--Custom navigation buttons on both sides-->\n");
      out.write("        <div class=\"group1-Wrapper\">\n");
      out.write("            <a onclick=\"imageSlider.previous()\" class=\"group1-Prev\"></a>\n");
      out.write("            <a onclick=\"imageSlider.next()\" class=\"group1-Next\"></a>\n");
      out.write("        </div>\n");
      out.write("        <!--nav bar-->\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        //The following script is for the group 2 navigation buttons.\n");
      out.write("        function switchAutoAdvance() {\n");
      out.write("            imageSlider.switchAuto();\n");
      out.write("            switchPlayPauseClass();\n");
      out.write("        }\n");
      out.write("        function switchPlayPauseClass() {\n");
      out.write("            var auto = document.getElementById('auto');\n");
      out.write("            var isAutoPlay = imageSlider.getAuto();\n");
      out.write("            auto.className = isAutoPlay ? \"group2-Pause\" : \"group2-Play\";\n");
      out.write("            auto.title = isAutoPlay ? \"Pause\" : \"Play\";\n");
      out.write("        }\n");
      out.write("        switchPlayPauseClass();\n");
      out.write("    </script>");
      out.write("\n");
      out.write("        <!--end slider--->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"welcomeSection\"> \n");
      out.write("            <div class=\"container cntr\" style=\"margin-top: -30px\">\n");
      out.write("\n");
      out.write("                <h2 style=\"color: #ffffff;\">Welcome to Seen Saal</h2>\n");
      out.write("                <p style=\"color: #ffffff; font-family: monospace; font-size: 16px\"><b>\n");
      out.write("                        Vivamus commodo placerat libero, eget pulvinar felis lobortis in. Curabitur ac enim nibh. Cras in odio nisi. Fusce et augue velit. Nulla convallis, ipsum vitae tristique pretium, sapien odio viverra quam, eget mollis diam risus ut mi. Nullam ultrices ornare nisl, sagittis ullamcorper dolor rutrum vitae. Sed accumsan mauris eget elit dictum vitae dapibus nisl [...]\n");
      out.write("                    </b></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Our Services======================================== -->\n");
      out.write("        <div id=\"ourServices\"style=\"margin-top: -50px\" > \t\n");
      out.write("            <div class=\"container\">\t\n");
      out.write("                <h1 class=\"cntr\" style=\"color: #ffffff;\">Our Services</h1>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"span4\">\n");
      out.write("\n");
      out.write("                        <div class=\"thumbnail\">\n");
      out.write("\n");
      out.write("                            <h4>Order foods</h4>\n");
      out.write("\n");
      out.write("                            <img src=\"themes/images/home/ins1.png\" style=\" width: 370px;height: 150px;\">\n");
      out.write("                            <a href=\"#\"> More detail</a><p></p>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("\n");
      out.write("                        <div class=\"thumbnail\">\n");
      out.write("\n");
      out.write("                            <h4>we are here</h4>\n");
      out.write("                         <img src=\"themes/images/home/ins5.png\" style=\" width: 370px;height: 150px;\">\n");
      out.write("                            <a href=\"#\"> More detail</a><p></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"span4\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"thumbnail\">\n");
      out.write("\n");
      out.write("                            <h4>Our Menu</h4>\n");
      out.write("\n");
      out.write("                            <img src=\"themes/images/home/ins2.png\" style=\" width: 370px;height: 150px;\">\n");
      out.write("                            <a href=\"#\"> More detail</a><p></p>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("\n");
      out.write("                        <div class=\"thumbnail\">\n");
      out.write("\n");
      out.write("                            <h4>User Account</h4>\n");
      out.write("                            <img src=\"themes/images/home/ins6.png\" style=\" width: 370px;height: 150px;\">\n");
      out.write("                            <a href=\"#\"> More detail</a><p></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"span4\">\n");
      out.write("\n");
      out.write("                        <div class=\"thumbnail\">\n");
      out.write("\n");
      out.write("                            <h4>My recipy</h4>\n");
      out.write("\n");
      out.write("                            <img src=\"themes/images/home/ins4.png\" style=\" width: 370px;height: 150px;\">\n");
      out.write("                            <a href=\"#\"> More detail</a><p></p>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"thumbnail\">\n");
      out.write("\n");
      out.write("                            <h4>Who we are?</h4>\n");
      out.write("                            <img src=\"themes/images/home/ins7.png\" style=\" width: 370px;height: 150px;\">\n");
      out.write("                            <a href=\"#\"> More detail</a><p></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"marquee\"style=\"margin-top:-350px;\">\n");
      out.write("   \n");
      out.write("            <marquee class=\"cntr\" behavior=\"scroll\" direction=\"up\" scrollamount=\"5\">\n");
      out.write("                <h1 style=\"color: #ffffff;\"><i style=\"font-size: 60px\"class=\"icon-double-angle-up\"></i></h1>\n");
      out.write("                <h4>please sign in to Order food</h4>\n");
      out.write("            </marquee>\n");
      out.write("        \n");
      out.write("          \n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("\n");
      out.write("    <marquee direction=\"right\" >\n");
      out.write("        <div id=\"beforeFooter\" class=\"cntr\">\n");
      out.write("            <div class=\"container-fluid\" style=\"margin-left: 40px; margin-top: -100px;\">\n");
      out.write("\n");
      out.write("                <div class=\"span4\"><img src=\"themes/images/beforeFooter/bf1.png\" style=\" width: 370px;height: 150px;\"></div>\n");
      out.write("                <div class=\"span4\"><img src=\"themes/images/beforeFooter/bf2.png\" style=\" width: 370px;height: 150px;\"></div>\n");
      out.write("                <div class=\"span4\"><img src=\"themes/images/beforeFooter/bf3.png\" style=\" width: 370px;height: 150px;\"></div>\n");
      out.write("            </div> \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </marquee>\n");
      out.write("    <!---------------------End Thumnail------------------------------------>       \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!--Start footer--->\n");
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
      out.write("<!--End footer--->\n");
      out.write("\n");
      out.write("</body>\n");
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
