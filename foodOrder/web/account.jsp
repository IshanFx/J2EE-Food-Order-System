<%-- 
    Document   : account
    Created on : Feb 14, 2015, 5:41:03 PM
    Author     : Suresh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <%@include file="Import/head.jsp" %>
    <title>My account</title>
    <style>

        body{background-image: url(back5.jpg);
             background-size: 2500px;
        } 
        
  .alert-info {
    color: #0589CB;
    background-color: transparent!important;
    background-image: url(acbc.jpg)!important;
 border:none!important;
}
    </style>

    <body>
        <%@include file="Import/navbar2.jsp" %>

        <div class="container" style="margin-top: 150px;">
            <div class="row"></div>
            <div class="span12">
                <ul class="nav nav-tabs tabs-up" id="friends">
                    <li><a href="/gh/gist/response.html/3843293/" data-target="#myAccount" class="media_node active span" id="contacts_tab" data-toggle="tabajax" rel="tooltip"> My Account </a></li>
                    <li><a href="/gh/gist/response.html/3843301/" data-target="#friends_list" class="media_node span"     id="friends_list_tab" data-toggle="tabajax" rel="tooltip"> Friends list</a></li>
                    <li><a href="/gh/gist/response.html/3843306/" data-target="#awaiting_request" class="media_node span" id="awaiting_request_tab" data-toggle="tabajax" rel="tooltip">Awaiting request</a></li>
                </ul>

                <div class="tab-content">
                    <div class="tab-pane active" id="myAccount">
                    
                            <div class="alert alert-info element span6">
                                 <h4 class="">First Name&emsp;:&nbsp;xxxxxxxxxxxxx</h4><br>
                                 <h4 class="">Last Name&emsp;:&nbsp;xxxxxxxxxxxxx</h4><br>
                                 <h4 class="">Address&emsp;:&nbsp;xxxxxxxxxxxxx</h4><br>
                            <h4 class="">Telephone&emsp;:xxxxxxxxxxxxx</h4><br>
                            <h4 class="">Email&emsp;&emsp;&emsp;&nbsp;:xxxxxxxxxxxxx</h4><br>
                            <h4 class="">Password&emsp;:xxxxxxxxxxxxxxxxxx</h4><br>
               <div class="accordion" id="accordion2">
  <div class="accordion-group">
    <div class="accordion-heading">
      <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseOne">
          <h4 class="cntr">Edit my profile <i style="color: #ffffff" class="icon-user-md icon-white"></i></h4>
      </a>
    </div>
    <div id="collapseOne" class="accordion-body collapse out">
      <div class="accordion-inner">
        <div class="col-lg-6 col-sm-6" style="float: left">
                
                <form class="form-horizontal">
                    <div class="control-group">
                        <label class="control-label" for="fistName">First name</label>
                        <div class="controls">
                            <input class="element input-xlarge" type="text" id="fistName" placeholder="First name">
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="control-label" for="fistName">Last name</label>
                        <div class="controls">
                            <input class="element input-xlarge" type="text" id="lastName" placeholder="Last name">
                        </div>
                    </div>
                    
                    
                     <div class="control-group">
                        <label class="control-label" for="fistName">Address</label>
                        <div class="controls">
                            <textarea class="element input-xlarge" type="text" id="address" placeholder="Address"></textarea>
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="LastName">Telephone</label>
                        <div class="controls">
                            <input class="element input-xlarge" type="text" id="LastName" placeholder="Telophone">
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="control-label" for="email">Email</label>
                        <div class="controls">
                            <input class="element input-xlarge" type="text" id="Email" placeholder="Email">
                        </div>
                    </div>


                    <div class="control-group">
                        <label class="control-label" for="inputPassword">Password</label>
                        <div class="controls">
                            <input class="element input-xlarge" type="password" id="inputPassword" placeholder="Password">
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="control-label" for="inputPassword">Renter password</label>
                        <div class="controls">
                            <input class="element input-xlarge" type="password" id="inputPassword" placeholder="RenterPassword">
                        </div>
                    </div>
                    <div class="control-group">
                        <div class="controls">
                            
                            <button  type="submit" class="btn btn-info input-large">Update </button>
                            <button  type="reset" class="btn btn-inverse">Cansel </button>
                        </div>
                    </div>
                </form>
            </div>
      </div>
    </div>
  </div>
  
</div>

                            
                            </div>
                      
                    </div>
                    
                    <div class="tab-pane" id="friends_list">
                        <div class="span12">

                        </div>
                    </div>
                    
                    <div class="tab-pane  urlbox span8" id="awaiting_request">
                        <div class="span12">

                        </div>

                    </div>
                </div>



            </div>
        </div>
        <script>$('[data-toggle="tabajax"]').click(function(e) {
                var $this = $(this),
                        loadurl = $this.attr('href'),
                        targ = $this.attr('data-target');

                $.get(loadurl, function(data) {
                    $(targ).html(data);
                });

                $this.tab('show');
                return false;
            });</script>
            <div style="margin-top: 200px">
            <%@include file="Import/footer.jsp"%>
            </div>
    </body>
</html>
