<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <div class="clearfix"></div>

            <div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
              <div>
                <div class="demo-section k-content">
                    <input name="files" id="files" type="file" />
                </div>
            	</div>
            	      <script>
                $(document).ready(function() {
                    $("#files").kendoUpload({
                        async: {
                            saveUrl: "/LTNC/demo/upload",
                            autoUpload: true
                        }
                    });
                });
            </script>
            </div>
</div>