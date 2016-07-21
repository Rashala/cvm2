<%-- 
    Document   : dashboard
    Created on : Jul 12, 2016, 12:26:42 PM
    Author     : preea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
        <ul class="nav nav-pills">
  <li class="active"><a data-toggle="pill" href="${pageContext.request.contextPath}/addCandidate">Add Candidate</a></li>
  <li><a data-toggle="pill" href="${pageContext.request.contextPath}/listCandidate">List Candidates</a></li>
  
  </ul>
  
  <%@include file="addCandidate.jsp" %>

       
    </body>
</html>
