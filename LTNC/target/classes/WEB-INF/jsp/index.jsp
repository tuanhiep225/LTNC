<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
  <%@include file= "/WEB-INF/layout/_header.jsp"%>

  <body class="nav-md">
    <div class="container body">
      <div class="main_container">
        <%@include file="/WEB-INF/layout/_leftbar.jsp" %>

        <!-- top navigation -->
        <%@include file="/WEB-INF/layout/_topnav.jsp" %>
        <!-- /top navigation -->

        <!-- page content -->
        <div class="right_col" role="main">
              <div class="col-md-10 col-sm-10 col-xs-10">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>Tuấn Hiệp</small></h2>
                    <ul class="nav navbar-right panel_toolbox">
                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                      </li>
                      <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                        <ul class="dropdown-menu" role="menu">
                          <li><a href="#">Settings 1</a>
                          </li>
                          <li><a href="#">Settings 2</a>
                          </li>
                        </ul>
                      </li>
                      <li><a class="close-link"><i class="fa fa-close"></i></a>
                      </li>
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <table id="datatable-checkbox" class="table table-striped table-bordered bulk_action">
                      <thead>
                        <tr>
                          <th>Tên Hãng</th>
                          <th></th>
                        </tr>
                      </thead>
                      <tbody>
                      <c:forEach items="${listBrand}" var="brand">
                      <tr>
                          <td>${brand.brandName }</td>
                             <td width="100px;">
                                <div class="btn-group">
                                    <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                                        <span class="caret"></span>
                                        <span style="width:20px;" class="sr-only">Toggle Dropdown</span>
                                    </button>
                                    <ul class="dropdown-menu" role="menu">
                                        <li><a href="${pageContext.request.contextPath}/brand/update/${brand.brandId}">Sửa</a></li>
                                        <li><a href="${pageContext.request.contextPath}/brand/delete/${brand.brandId}">Xóa</a></li>
                                    </ul>
                                </div>
                            </td>
                        </tr>
                      </c:forEach>
                        
                        
                      </tbody>
                    </table>
                  </div>
                </div>
            </div>
        </div>
        <!-- /page content -->
        <!-- footer content -->
        <%@include file= "/WEB-INF/layout/_footer.jsp"%>
        <!-- /footer content -->
      </div>
    </div>


        <%@include file= "/WEB-INF/layout/_scripts.jsp"%>
        
  </body>
</html>