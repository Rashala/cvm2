<%-- 
    Document   : appliedInformation
    Created on : Jul 12, 2016, 3:52:13 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
        <form class="form-inline" role="form">
            <div class="form-group">
                <label for="date">Applied Date:</label>
                <input type="date" class="form-control" id="date">
            </div>
            
            
            <p>
            <div class="form-group">
                <label for="area">Applied Area:</label>
                <select class="form-control" id="area">


                    <option>Java</option>
                    <option>PHP</option>
                    <option>Dot Net</option>
                    <option>Designer</option>
                    <option>HR/Admin</option>
                    <option>Finance</option>

                </select>
            </div>
            
            
            <p>
            <div class="form-group">
                <label for="area">Applied Position:</label>
                <select class="form-control" id="area">


                    <option>Senior Level</option>
                    <option>Middle Level</option>
                    <option>Associate Level</option>
                    <option>trainee</option>
                    <option>Intern</option>
                    

                </select>
            </div>
            
            
            
            <p>
            <div class="form-group">
                <label for="area">Action:</label>
                <select class="form-control" id="area">


                    <option>Hired</option>
                    <option>Decision Pending</option>
                    <option>Rejected</option>
                    <option>Future Reference</option>
                   
                </select>
            </div>
            
            
            <p>
            
             <div class="form-group">
                <label for="date">Joint Date Date:</label>
                <input type="date" class="form-control" id="date">
            </div>
            
            
                    </form>
        
        
         <p>
            <div>
                <button type="button" class="btn btn-success">Submit</button>
                <button type="button" class="btn btn-danger">Reset</button>

            </div>
        </p>
        
    </body>
</html>
