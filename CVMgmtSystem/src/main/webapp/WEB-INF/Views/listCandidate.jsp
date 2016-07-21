<%-- 
    Document   : listCandidate
    Created on : Jul 12, 2016, 2:23:33 PM
    Author     : preea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
        <table class="table table-bordered table-striped ">
            <tr >
                <td colspan="9">Employee Information</td>
                <td colspan="3" rowspan="2">Action</td>
            </tr>
            
            <tr>
                
                <td>Employee Id</td>
                <td>Suffix</td>
                <td>Employee Name</td>
                <td>Marital Status</td>
                <td>Date of Birth</td>
                <td>Address</td>
                <td>Mobile No.</td>
                <td>Alternate Contact No.</td>
                <td>Email</td>
                
            </tr>
            
            <tr>
               
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                
                <td><button type="button" class="btn btn-warning"><span class="glyphicon glyphicon-pencil"></span>Edit</button></td>
                <td><button type="button" class="btn btn-info"><span class="glyphicon glyphicon-circle-arrow-up"></span>Update</button></td>
                <td><button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-trash"></span>Delete</button></td>
               
            </tr>
        
        </table>
    </body>
</html>
