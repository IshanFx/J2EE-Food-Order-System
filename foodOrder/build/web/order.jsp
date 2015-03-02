<%-- 
    Document   : myCart
    Created on : Feb 20, 2015, 10:31:52 AM
    Author     : Suresh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>my cart</title>
    <%@include file="Import/head.jsp" %>
    <style>

        body{background-image: url(back5.jpg);
             background-size: 2500px;
        }  
    </style>
    <body>
        <%@include file="Import/navbar2.jsp" %>

        <div class="container" style="margin-top: 200px;">
            <div class="row">

                <!--register model-->           
                <div class="span3" >

                    <form class="form-horizontal">

                        <div class="thumbnail">
                            <div class="blockDtl">
                                <a href="#"><img src="themes/images/portfolio/2.png" alt=""></a>
                                <h4>Easy Interface</h4>
                                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, </p>
                            </div>
                        </div>  


                </div>
                <!--login moodel-->
                <div class=span3>

                    <div class="control-group">
                        <label class="control-label" for="inputEmail">Qutity</label>
                        <div class="controls">
                            <input class="element input-xlarge" type="number" id="inputEmail" placeholder="selectqty">
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="inputPassword">Total</label>
                        <div class="controls">
                            <input class="element input-xlarge" type="number" id="inputPassword" placeholder="Total">

                        </div>

                    </div>

                    <div class="control-group left ">
                        <div class="controls">
                        <button class="btn btn-danger cntr "><i class="icon-remove-sign"></i> Remove</button>
                            <button  type="reset" class="btn btn-inverse">Cancel </button>
                        </div>
                    </div>
                  
                    </form>

                </div>



            </div>

<div class="alert alert-error span6">
    <h3>add Paypal here</h3>
</div>
        </div>





























        <div style="margin-top: 800px">
            <%@include file="Import/footer.jsp" %>
            <div>

                </body>
                </html>
