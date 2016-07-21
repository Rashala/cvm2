<%-- 
    Document   : academicQualification
    Created on : Jul 12, 2016, 12:53:15 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
        <form class="form-inline" role="form">
            <table class="table table-bordered">
                <tr>
                <div class="form-group">
                    <td>  <label for="institute">School/College</label></td>
                    <td><label for="board">Board</label></td>
                    <td> <label for="major">Major</label></td>
                    <td> <label for="degree">Degree</label></td>
                    <td> <label for="percentage">Percentage/CGPA</label></td>
                    <td> <label for="year">Graduation Year</label></td>
                    </tr>

                    <tr>
                        <td>  <input type="text" class="form-control" id="institute"></td>
                        <td>  <input type="text" class="form-control" id="board"></td>
                        <td>  <input type="text" class="form-control" id="major"></td>
                        <td>  <input type="text" class="form-control" id="degree"></td>
                        <td>  <input type="text" class="form-control" id="percentage"></td>
                        <td>  <input type="text" class="form-control" id="year"></td>

                        </table>

            
            <div class="pull-right">
                <button type="button" class="btn btn-primary">Add</button>
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
