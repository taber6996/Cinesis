<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="es">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Cinesis</title>

    <!-- Bootstrap core CSS -->
    <link href="http://getbootstrap.com/docs/3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="http://getbootstrap.com/docs/3.3/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <link rel="stylesheet" href="//cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="http://getbootstrap.com/docs/3.3/assets/js/ie-emulation-modes-warning.js"></script>
    

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- Custom styles for this template -->
    <link href="http://getbootstrap.com/docs/3.3/examples/carousel/carousel.css" rel="stylesheet">
  </head>
<!-- NAVBAR
================================================== -->
  <body>
      <div class="navbar-wrapper">
          <div class="container">
    
            <nav class="navbar navbar-inverse navbar-static-top">
              <div class="container">
                <div class="navbar-header">
                  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                  </button>
                  <a class="navbar-brand" href="../index.jsp">Cinesis</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                  <ul class="nav navbar-nav">
                    <li><a href="../index.jsp">Home</a></li>
                    <li><a href="../peliculas.jsp">Películas</a></li>
                    <li><a href="listado-entradas.jsp">Listado Entradas</a></li>
                    <li><a href="crear-pelicula.jsp">Crear película</a></li>
                    <li><a href="crear-entrada.jsp">Crear entrada</a></li>
                    <li><a class="active" href="create-sala.jsp">Crear sala</a></li>
                    <li><a href="../index.jsp">Logout</a></li>
                  </ul>
                </div>
              </div>
            </nav>
    
          </div>
        </div>
    <!-- Carousel
    ================================================== -->


    <!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->

      <!-- START THE FEATURETTES -->
    <div class="container marketing">
      <hr class="featurette-divider">
      <div class="row">
        <div class="col-sm-6 col-sm-offset-3">
        	
        	<c:if test="${not empty error}">
                <div class="alert alert-danger">
                    <div class="alert alert-success" role="alert">${error }</div>
                </div>
            </c:if>

            <h3>Formulario creación sala</h3>
            <form role="form" method="post" action="ServletController">
            
            <input type="hidden" name="type_form" value="sala">
              <div class="form-group">
                <label for"exampleInputEmail1">num_filas</label>
                <input name="num_filas" type="text" class="form-control" id="num_filas" placeholder="num_filas">
              </div>
              <div class="form-group">
                <label for"exampleInputEmail1">num_columnas</label>
                <input name="num_columnas" type="text" class="form-control" id="num_columnas" placeholder="num_columnas">
              </div>
              <div class="form-group">
                <label for"exampleInputEmail1">num_asientos_vip</label>
                <input name="num_asientos_vip" type="text" class="form-control" id="num_asientos_vip" placeholder="num_asientos_vip">
              </div>
              <div class="form-group">
                <label for"exampleInputEmail1">num_asientos_minusvalidos</label>
                <input name="num_asientos_minusvalidos" type="text" class="form-control" id="num_asientos_minusvalidos" placeholder="num_asientos_minusvalidos">
              </div>
              <div class="form-group">
                <label for"exampleInputEmail1">calidad_sonido</label>
                <input name="calidad_sonido" type="text" class="form-control" id="calidad_sonido" placeholder="calidad_sonido">
              </div>
              <div class="form-group">
                <label for"exampleInputEmail1">3d</label>
                <input name="3d" type="text" class="form-control" id="3d" placeholder="3d">
              </div>
              <button type="submit" class="btn btn-primary">Guardar sala</button>
            </form>
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
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="http://getbootstrap.com/docs/3.3/dist/js/bootstrap.min.js"></script>
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
    <script src="http://getbootstrap.com/docs/3.3/assets/js/vendor/holder.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="http://getbootstrap.com/docs/3.3/assets/js/ie10-viewport-bug-workaround.js"></script>

    <style src="//cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></style>

    <script>
        $(document).ready( function () {
            $('#myTable').DataTable();
        } );
    </script>
  </body>
</html>
