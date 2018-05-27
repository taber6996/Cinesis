<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.*, java.io.*"%>
<%@page import="org.apache.log4j.Logger,java.text.DecimalFormat"%>
<jsp:include page="includes/header.jsp" />
      <!-- START THE FEATURETTES -->
	<div class="container marketing">
    <hr class="featurette-divider">
		<div class="row">
			<div class="col-sm-3" style="margin-top-40px;">
				<h4>Título de la película</h4>
				<img src="static/assets/img/avenge.jpg" width="100%"/>
			</div>
			<div class="col-sm-8 col-sm-offset-1" style="margin-top-40px;">
				<div class="row">
					<div class="col-sm-12">
            <div class="pantalla">PANTALLA</div>
            <div class="table-responsive"></div>
            <table class="table table-bordered">
                <thead> 
                    <th></th>
                    <th>1</th>
                    <th>2</th>
                    <th>3</th>
                    <th>4</th>
                    <th>5</th>
                    <th>6</th>
                </thead>
                <tbody>
                    <tr>
                        <th>1</th>
                        <td><i class="fas fa-wheelchair"></i></td>
                        <td><i class="fas fa-wheelchair"></i></td>
                        <td><i class="fas fa-wheelchair"></i></td>
                        <td><i class="fas fa-wheelchair"></i></td>
                        <td><i class="fas fa-wheelchair"></i></td>
                        <td><i class="fas fa-wheelchair"></i></td>
                    </tr>
                    <tr>
                        <th>2</th>
                        <td><a href="?comprada=false"><i class="fas fa-times"></i></a></td>
                        <td><a href="?comprada=false"><i class="fas fa-times"></i></a></td>
                        <td><a href="?comprada=false"><i class="fas fa-times"></i></a></td>
                        <td><a href="?comprada=false"><i class="fas fa-times"></i></a></td>
                        <td><a href="?comprada=false"><i class="fas fa-times"></i></a></td>
                        <td><a href="?comprada=false"><i class="fas fa-times"></i></a></td>
                    </tr>
                    <tr>
                        <th>2</th>
                        <td><a href="?comprada=true"><i class="fas fa-check"></i></a></td>
                        <td><a href="?comprada=true"><i class="fas fa-check"></i></a></td>
                        <td><a href="?comprada=true"><i class="fas fa-check"></i></a></td>
                        <td><a href="?comprada=true"><i class="fas fa-check"></i></a></td>
                        <td><a href="?comprada=true"><i class="fas fa-check"></i></a></td>
                        <td><a href="?comprada=true"><i class="fas fa-check"></i></a></td>
                    </tr>
                  
                </tbody>
            </table>
          </div>
			  </div>
		  </div>
	  </div>

      <!-- /END THE FEATURETTES -->


      <!-- FOOTER -->
      <footer>
        <p class="pull-right"><a href="#">Back to top</a></p>
        <p>&copy; 2016 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
      </footer>

    </div><!-- /.container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="http://getbootstrap.com/docs/3.3/dist/js/bootstrap.min.js"></script>
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
    <script src="http://getbootstrap.com/docs/3.3/assets/js/vendor/holder.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="http://getbootstrap.com/docs/3.3/assets/js/ie10-viewport-bug-workaround.js"></script>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

    <script>
      var URLactual = window.location.search;
  
      if(URLactual === '?comprada=true'){
        swal({
          title: "¡Entrada comprada!",
          text: "Ha comprado correctamente la entrada",
          icon: "success",
        });
      }
      else if(URLactual === '?comprada=false'){
        swal({
          title: "Wops!",
          text: "No hemos podido realizar la compra. Pruebe en unos minutos",
          icon: "error",
        });
      }
    </script>
  </body>
</html>