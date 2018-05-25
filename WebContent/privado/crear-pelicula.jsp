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
                    <li><a class="active" href="crear-pelicula.jsp">Crear película</a></li>
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
            <h3>Formulario creación entrada</h3>
            <form>
              <div class="form-group">
                <label for"exampleInputEmail1">Título</label>
                <input name="titulo" type="text" class="form-control" id="titulo" placeholder="Título">
              </div>
              <div class="form-group">
                <label for"exampleInputEmail1">Sinopsis</label>
                <input name="sinopsis" type="text" class="form-control" id="sinopsis" placeholder="Sinopsis">
              </div>
              <div class="form-group">
                <label for"exampleInputEmail1">Categoría</label>
                <input name="categoria" type="text" class="form-control" id="categoria" placeholder="Categoría">
              </div>
              <div class="form-group">
                <label for"exampleInputEmail1">Actores</label>
                <input name="actores" type="text" class="form-control" id="actores" placeholder="Actores">
              </div>
              <div class="form-group">
                <label for"exampleInputEmail1">Duración</label>
                <input name="duracion" type="text" class="form-control" id="duracion" placeholder="Duración">
              </div>
              <div class="form-group">
                <label for"exampleInputEmail1">Valoración</label>
                <input name="valoracion" type="number" class="form-control" id="valoracion" placeholder="Valoración">
              </div>
              <div class="form-group">
                <label for"exampleInputEmail1">Extracto</label>
                <textarea class="form-control" name="extracto" id="" cols="30" rows="10"></textarea>
              </div>
              <div class="form-group">
                <label for="exampleInputFile">Imagen</label>
                <input type="file" id="imagen" name="imagen">
              </div>
              <button type="submit" class="btn btn-primary">Guardar película</button>
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
