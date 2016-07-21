<%-- 
    Document   : trainings
    Created on : Jul 12, 2016, 3:30:22 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
         <form class="form-inline" role="form">
             
             
        
             
        <div class="form-group">
            <div class="panel panel-default">
                <div class="panel-body">
                <label for="topic">Topic:</label>
                <input type="text" class="form-control" id="topic">
            </div>
             
             <p>
             <div class="form-group">
                <label for="place">Place:</label>
                <input type="text" class="form-control" id="place">
            </div>
             
             <p>
            <div class="form-group">
                <label for="date">Duration From:</label>
                <input type="date" class="form-control" id="date">
            </div>
            
        
                <div class="form-group">
                <label for="date">Duration To:</label>
                <input type="date" class="form-control" id="date">
                
            </div>
             
              <button type="button" class="btn btn-primary">Add</button>
             
        </div>
            
        </div>       
              
             
         
             
             <p>
             <div class="form-group">
                <label for="skills">Skills:</label>
             </div>
             
             <div>
              <textarea rows="4" cols="50"></textarea>
              <button type="button" class="btn btn-primary">Add</button>
            </div>
             
             
             
             <div class="form-group">
                <label for="certification">Certification:</label>
             </div>
             <div>
              <textarea rows="4" cols="50"></textarea>
               <button type="button" class="btn btn-primary">Add</button>
            </div>
             
             
             
               <p>
            <div>
                <button type="button" class="btn btn-success">Submit</button>
                <button type="button" class="btn btn-danger">Reset</button>

            </div>
        </p>
            
    </body>
</html>
