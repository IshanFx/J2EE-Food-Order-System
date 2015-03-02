
<%@page import="com.food.order.SpecialOrder"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.food.order.NormalOrder,java.sql.ResultSet"%>
<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin - Bootstrap Admin Template</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/sb-admin.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="css/plugins/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
     <%@include file="menu.jsp" %>

        <div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                
            </div>
                  <div class="row">
                       <div class="col-md-12 col-sm-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Basic Tabs
                        </div>
                        <div class="panel-body">
                            <ul class="nav nav-tabs ">
                                <li class="active"><a href="#normal" data-toggle="tab">Normal Order</a>
                                </li>
                                <li class=""><a href="#special" data-toggle="tab">Special Order</a>
                                </li>
                                 <li class=""><a href="#delivernormal" data-toggle="tab">Delivered Normal Order</a>
                                </li>
                                 <li class=""><a href="#deliverspecial" data-toggle="tab">Delivered Special Order</a>
                                </li>
                            </ul>

                            <div class="tab-content">
                                <div class="tab-pane fade active in" id="normal">
                                    <h4>Normal Order</h4>
                                                  <div class="col-md-12">
                  <!--   Kitchen Sink -->
                    <div class="panel panel-default">
                        
                                            <div class="panel-body">
                                                <div class="table-responsive">
                                                    <table class="table table-striped table-bordered table-hover">
                                                        <thead>
                                                            <tr>
                                                               
                                                                <th>OrderId</th>
                                                                <th>Category</th>
                                                                <th>food</th>
                                                                <th>Quantity</th>
                                                                <th>Extra</th>
                                                                <th>Deliver Date</th>
                                                                <th>Address</th>
                                                                <th>Order date</th>
                                                                <th>Order time</th>
                                                                <th>State</th>
                                                               
                                                            </tr>
                                                        </thead>
                                                        <tbody>
                                                            <% NormalOrder no =new NormalOrder();
                                                               ResultSet rst = no.getOrderDetails();
                                                            %>
                                                            
                                                            <% while(rst.next()) {%>
                                                            <tr>
                                                                <td><%=rst.getString(1) %></td>
                                                                <td><%=rst.getString(2) %></td>
                                                                <td><%=rst.getString(3) %></td>
                                                                <td><%=rst.getString(4) %></td>
                                                                <td><%=rst.getString(5) %></td>
                                                                <td><%=rst.getString(6) %></td>
                                                                <td><%=rst.getString(7) %></td>  
                                                                <td><%=rst.getString(8) %><%=rst.getString(9) %><%=rst.getString(10) %></td>  
                                                                <td><%=rst.getString(11) %></td>  
                                                                <td><%=rst.getString(12) %></td>  
                                                                <td><a data-toggle="modal" class="btn btn-success col-md-12 changestatbtn" onclick="normalOrderChange(<%=rst.getString(1) %>,<%=rst.getString(13) %>)">Deliver</a></td>
                                                            </tr>
                                                            <% } %>
                                                        </tbody>
                                                    </table>
                                                </div>
                                            </div>
                                        </div>
                                         <!-- End  Kitchen Sink -->
                                    </div>
                                                    </div>
                                <div class="tab-pane fade" id="special">
                                    <h4>Special Order</h4>
                                        <div class="col-md-12">
                  <!--   Kitchen Sink -->
                    <div class="panel panel-default">
                        
                                            <div class="panel-body">
                                                <div class="table-responsive">
                                                    <table class="table table-striped table-bordered table-hover">
                                                        <thead>
                                                            <tr>
                                                               
                                                                <th>OrderId</th>
                                                                <th>Category</th>
                                                                <th>food</th>
                                                                <th>Quantity</th>
                                                                <th>Extra</th>
                                                                <th>Deliver Date</th>
                                                                <th>Address</th>
                                                                <th>Order date</th>
                                                                <th>Order time</th>
                                                                <th>State</th>
                                                               
                                                            </tr>
                                                        </thead>
                                                        
                                                        <tbody>
                                                            <% SpecialOrder specialo = new SpecialOrder(); %>
                                                        <% ResultSet rstso = specialo.getOrderDetails(); %>
                                                           <% while(rstso.next()){ %>
                                                            <tr>
                                                                <td><%=rstso.getString(1)%></td>
                                                                <td><%=rstso.getString(2)%></td>
                                                                <td><%=rstso.getString(3)%></td>
                                                                <td><%=rstso.getString(4)%></td>
                                                                <td><%=rstso.getString(5)%></td>
                                                                <td><%=rstso.getString(6)%></td>
                                                                <td><%=rstso.getString(7)%></td>
                                                                <td><%=rstso.getString(8)%><%=rstso.getString(9)%><%=rstso.getString(10)%></td>
                                                                <td><%=rstso.getString(11)%></td>
                                                                <td><%=rstso.getString(12)%></td>
                                                                <td><a data-toggle="modal" class="btn btn-success col-md-12 changestatbtn" onclick="specialOrderChange(<%=rstso.getString(1) %>)">Deliver</a></td>
                                                            </tr>
                                                            <% } %>
                                                        </tbody>
                                                            
                                                     
                                                    </table>
                                                </div>
                                            </div>
                                        </div>
                                         <!-- End  Kitchen Sink -->
                                    </div>
                                </div>
                                
                                                        <!-- tab3-->
                                                        
                                                        
                                                          <div class="tab-pane fade " id="delivernormal">
                                    <h4>deliver Special Order</h4>
                                                  <div class="col-md-12">
                  <!--   Kitchen Sink -->
                    <div class="panel panel-default">
                        
                                            <div class="panel-body">
                                                <div class="table-responsive">
                                                    <table class="table table-striped table-bordered table-hover">
                                                        <thead>
                                                            <tr>
                                                               
                                                                <th>OrderId</th>
                                                                <th>Category</th>
                                                                <th>food</th>
                                                                <th>Quantity</th>
                                                                <th>Extra</th>
                                                                <th>Deliver Date</th>
                                                                <th>Address</th>
                                                                <th>Order date</th>
                                                                <th>Order time</th>
                                                                <th>State</th>
                                                               
                                                            </tr>
                                                        </thead>
                                                        
                                                        <tbody>
                                                            
                                                          
                                                            <tr>
                                                            </tr>
                                                            
                                                        </tbody>
                                                            
                                                     
                                                    </table>
                                                </div>
                                            </div>
                                        </div>
                                         <!-- End  Kitchen Sink -->
                                    </div>
                                                    </div>
                                                        <!--tab3-->
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        
                                <!-- tab4-->
                                                        
                                                        
                                                          <div class="tab-pane fade" id="deliverspecial">
                                    <h4>Deliver Special Order</h4>
                                                  <div class="col-md-12">
                  <!--   Kitchen Sink -->
                    <div class="panel panel-default">
                        
                                            <div class="panel-body">
                                                <div class="table-responsive">
                                                    <table class="table table-striped table-bordered table-hover">
                                                        <thead>
                                                            <tr>
                                                               
                                                                <th>OrderId</th>
                                                                <th>Category</th>
                                                                <th>food</th>
                                                                <th>Quantity</th>
                                                                <th>Extra</th>
                                                                <th>Deliver Date</th>
                                                                <th>Address</th>
                                                                <th>Order date</th>
                                                                <th>Order time</th>
                                                                <th>State</th>
                                                               
                                                            </tr>
                                                        </thead>
                                                        
                                                        <tbody>
                                                            
                                                          
                                                            <tr>
                                                            </tr>
                                                            
                                                        </tbody>
                                                            
                                                     
                                                    </table>
                                                </div>
                                            </div>
                                        </div>
                                         <!-- End  Kitchen Sink -->
                                    </div>
                                                    </div>
                                                        <!--tab4-->                        
                                                        
                                                        
                                                        
                                
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            

            
       <script src="js/jquery.js"></script>
       <script>
           function normalOrderChange(orderid,orderfood){
               
               $("#normalFoodOrderid").val(orderid);
               $("#normalFoodFoodid").val(orderfood);
               $(".changestatbtn").attr("href","#normalOrderChange"); 
           }
           
           function specialOrderChange(orderid){
               $(".changestatbtn").attr("href","#specialOrderChange"); 
               $("#specialFoodid").val(orderid);
           }
       </script>
            
    <!-- orderChangeModel -->        
        <div class="modal fade " id="normalOrderChange" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <form action="OrderServlet" method="get">
      <div class="modal-content col-md-6 col-md-offset-4 alert alert-danger">
        
          
        <div class="modal-body">
            <div class="form-group">
                    <div class=" fa fa-2x fa-check">
                        <strong>Are You sure</strong> 
                    </div>
            </div>
        </div>
          <input type="hidden" id="normalFoodOrderid" name="normalFoodOrder">
          <input type="hidden" id="normalFoodFoodid" name="normalfood">
          <div class="modal-footer">
              <input type="submit" value="Yes" class="btn btn-success" >
          <button type="button" class="btn btn-danger" data-dismiss="modal">No</button>
          </div>         
      </div>
        </form>
    </div>
  </div>    
       <!-- orderChangeModel --> 
       
       
       <!-- specialChangeModel -->        
        <div class="modal fade " id="specialOrderChange" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <form action="OrderServlet" method="get">
      <div class="modal-content col-md-6 col-md-offset-4 alert alert-danger">
        
          
        <div class="modal-body">
            <div class="form-group">
                    <div class=" fa fa-2x fa-check">
                        <strong>Are You sure</strong> 
                    </div>
            </div>
        </div>
          <input type="hidden" id="specialFoodid" name="specialFood">
          <div class="modal-footer">
          <input type="submit" value="Yes" class="btn btn-success">
          <button type="button" class="btn btn-danger" data-dismiss="modal">No</button>
          </div>         
      </div>
        </form>
    </div>
  </div>    
       <!-- specialChangeModel --> 
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            <!-- roooooooow -->
             <%--
                        <div class="row">
                       <div class="col-md-12 col-sm-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Basic Tabs
                        </div>
                        <div class="panel-body">
                            <ul class="nav nav-tabs">
                                <li class="active"><a href="#home" data-toggle="tab">Normal Order</a>
                                </li>
                                <li class=""><a href="#sp" data-toggle="tab">Special Order</a>
                                </li>
                                <li class=""><a href="#send" data-toggle="tab">Send Order</a>
                                </li>
                            </ul>

                            <div class="tab-content">
                                <div class="tab-pane fade active in" id="home">
                                    <h4>Normal Order</h4>
                                                  <div class="col-md-12">
                                     <!--   Kitchen Sink -->
                                        <div class="panel panel-default">
                        
                                            <div class="panel-body">
                                                <div class="col-md-6">
                                                <div class="table-responsive">
                                                    <table class="table table-striped table-bordered table-hover">
                                                        <thead>
                                                            <tr>
                                                                <th>OrderId</th>
                                                                <th>Category</th>
                                                                <th>food</th>
                                                                <th>Quantity</th>
                                                                <th>Extra</th>
                                                                <th>Deliver Date</th>
                                                                <th>Address</th>
                                                                <th>Order date</th>
                                                                <th>Order time</th>
                                                                <th>State</th>
                                                            </tr>
                                                        </thead>
                                                        <tbody>
                                                               <% NormalOrder no =new NormalOrder();
                                                               ResultSet rst = no.getOrderDetails();
                                                            %>
                                                            
                                                            <% while(rst.next()) {%>
                                                            <tr>
                                                                <td><%=rst.getString(1) %></td>
                                                                <td><%=rst.getString(2) %></td>
                                                                <td><%=rst.getString(3) %></td>
                                                                <td><%=rst.getString(4) %></td>
                                                                <td><%=rst.getString(5) %></td>
                                                                <td><%=rst.getString(6) %></td>
                                                                <td><%=rst.getString(7) %></td>  
                                                                <td><%=rst.getString(8) %><%=rst.getString(9) %><%=rst.getString(10) %></td>  
                                                                <td><%=rst.getString(11) %></td>  
                                                                <td><%=rst.getString(12) %></td>  
                                                                <td><button name="status" class="btn btn-success col-md-12">Status</button></td>
                                                            </tr>
                                                            <% } %>
                                                        </tbody>
                                                    </table>
                                                </div>
                                                </div>
                                            </div>
                                        </div>
                                         <!-- End  Kitchen Sink -->
                                    </div>
                                                    </div>
                                <div class="tab-pane fade" id="sp">
                                    <h4>Special Order</h4>
                                         <div class="col-md-12">
                  <!--   Kitchen Sink -->
                                        <div class="panel panel-default">
                        
                                            <div class="panel-body">
                                                <div class="col-md-6">
                                                <div class="table-responsive">
                                                    <table class="table table-striped table-bordered table-hover">
                                                        <thead>
                                                            <tr>
                                                                <th>Order Id</th>
                                                                <th>Category</th>
                                                                <th>Description</th>
                                                                <th>Deliver Date</th>
                                                                <th>Customer</th>
                                                                <th>Address</th>
                                                                <th>Order Date</th>
                                                                <th>Order Time</th>
                                                                <th>Status</th>
                                                            </tr>
                                                        </thead>
                                                        <% SpecialOrder specialo = new SpecialOrder(); %>
                                                        <% ResultSet rstso = specialo.getOrderDetails(); %>
                                                        <tbody>
                                                            
                                                            <tr>
                                                                <td><%=rst.getString(1)%></td>
                                                                <td><%=rst.getString(2)%></td>
                                                                <td><%=rst.getString(3)%></td>
                                                                <td><%=rst.getString(4)%></td>
                                                                <td><%=rst.getString(5)%></td>
                                                                <td><%=rst.getString(6)%></td>
                                                                <td><%=rst.getString(7)%><td><%=rst.getString(8)%><td><%=rst.getString(9)%></td></td></td>
                                                                <td><%=rst.getString(10)%></td>
                                                                <td><%=rst.getString(11)%></td>
                                                            </tr>
                                                            
                                                        </tbody>
                                                    </table>
                                                </div>
                                                </div>
                                            </div>
                                        </div>
                                         <!-- End  Kitchen Sink -->
                                    </div>
                                </div>
                                
                                <!-- 3rd tab-->
                           
                                <!-- 3rd tab-->
                            </div>
                        </div>
                    </div>
                </div>
            </div>
             --%>
                <!-- /.row -->
                
                <!-- Flot Charts -->
                
                <!-- /.row -->

                
                <!-- /.row -->
            <!-- /.container-fluid -->

        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="js/plugins/morris/raphael.min.js"></script>
    <script src="js/plugins/morris/morris.min.js"></script>
    <script src="js/plugins/morris/morris-data.js"></script>

    <!-- Flot Charts JavaScript -->
    <!--[if lte IE 8]><script src="js/excanvas.min.js"></script><![endif]-->
    <script src="js/plugins/flot/jquery.flot.js"></script>
    <script src="js/plugins/flot/jquery.flot.tooltip.min.js"></script>
    <script src="js/plugins/flot/jquery.flot.resize.js"></script>
    <script src="js/plugins/flot/jquery.flot.pie.js"></script>
    <script src="js/plugins/flot/flot-data.js"></script>

</body>

</html>
