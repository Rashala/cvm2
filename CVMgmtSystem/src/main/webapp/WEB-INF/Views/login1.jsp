<%-- 
    Document   : login
    Created on : Jul 7, 2016, 4:02:09 PM
    Author     : preea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class="center-block">
       <div class="well well-sm">
            <form>
                <div class="row"> 
                    <div class="form-group ">

                        <div class="col-xs-3">
                            <label for="username">User Name</label>
                            <input type="text" class="form-control" id="username" placeholder="User Name">
                        </div>
                    </div>
                </div>

                <div class="row"> 
                    <div class="form-group">
                        <div class="col-xs-3">
                            <label for="password">Password</label>
                            <input type="password" class="form-control" id="password" placeholder="Password">
                        </div>
                    </div>
                </div>
<br>
                
                        <button type="submit" class="btn btn-success">Login</button>
                        <button type="submit" class="btn btn-danger">Reset</button>
                 
            </form>


        </div>

</div>

    </body>
</html>
