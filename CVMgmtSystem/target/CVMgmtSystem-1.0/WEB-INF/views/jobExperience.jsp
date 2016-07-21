<%-- 
    Document   : jobExperience
    Created on : Jul 12, 2016, 2:51:17 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
        <form class="form-inline" role="form">
            
            
            <div class="form-group">
                
                <label for="title">Job Title:</label>
                <input type="text" class="form-control" id="title">
                
            </div>
            
            <p>
            <div class="form-group">
                
                <label for="place">Place of Employment:</label>
                <input type="text" class="form-control" id="place">
                
            </div>
            
            <p>
            <div class="form-group">
                <label for="duration">Duration From:</label>
                <input type="date" class="form-control" id="duration">
            </div>
            
        
                <div class="form-group">
                <label for="duration">Duration To:</label>
                <input type="date" class="form-control" id="duration">
            </div>
            
            <p>
            <div class="form-group">
                <label for="duration">Roles and Responsibilities:</label>
              
            </div>
            
            <div>
              <textarea rows="4" cols="50"></textarea>
            </div>
            
             <p>
            <div>
                <button type="button" class="btn btn-success">Submit</button>
                <button type="button" class="btn btn-danger">Reset</button>

            </div>
        </p>
            
        </form>
    </body>
</html>
