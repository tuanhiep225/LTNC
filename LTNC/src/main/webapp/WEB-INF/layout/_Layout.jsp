<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <%@ include file="/WEB-INF/layout/_header.jsp"%>
  <body class="nav-md">
    <div class="container body">
      <div class="main_container">
		<%@ include file="/WEB-INF/layout/_leftbar.jsp"%>
        <!-- top navigation -->
        <%@include file="/WEB-INF/layout/_topnav.jsp" %>
        <!-- /top navigation -->

        <!-- page content -->
        <div class="right_col" role="main">
        
        </div>
        <!-- /page content -->
        <!-- footer content -->
        <%@include file= "/WEB-INF/layout/_footer.jsp"%>
        <!-- /footer content -->
      </div>
    </div>
    <!-- Khai báo scripts -->
   <%@include file= "/WEB-INF/layout/_scripts.jsp"%>
   	<!-- /Khai báo scripts -->
  </body>
</html>