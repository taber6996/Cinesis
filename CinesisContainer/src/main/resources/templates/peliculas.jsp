<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
                  <a class="navbar-brand" href="index.jsp">Cinesis</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                  <ul class="nav navbar-nav">
                    <li class="active"><a href="index.jsp">Home</a></li>
                    <li><a href="peliculas.jsp">Películas</a></li>
                    <li class="active"><a href="login.jsp">Login</a></li>
                  </ul>
                </div>
              </div>
            </nav>
    
          </div>
        </div>

    <!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->

    <div class="container marketing">

      <!-- START THE FEATURETTES -->

      <hr class="featurette-divider">

      <div class="row featurette">
        <div class="col-md-7">
          <h2 class="">Vengadores. <span class="text-muted">Segunda parte.</span></h2>
          <p class="lead">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas tincidunt ultrices tellus, nec rutrum dolor 
          maximus sit amet. Proin vel elementum mi, sed dictum lectus. Nulla molestie dolor leo, id.</p>
          <p><a class="btn btn-lg btn-primary" href="pelicula.jsp" role="button">Ver sinopsis</a></p>
        </div>
        <div class="col-md-5">
          <img class="featurette-image img-responsive center-block" src="../static/assets/img/avenge.jpg" data-src="../static/assets/img/avenge.jpg" alt="Generic placeholder image">
        </div>
      </div>
      
      <hr class="featurette-divider">

      <div class="row featurette">
        <div class="col-md-7 col-md-push-5">
          <h2 class="">Vengadores. <span class="text-muted">Peliculón.</span></h2>
          <p class="lead">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas tincidunt ultrices tellus, nec rutrum dolor 
          maximus sit amet. Proin vel elementum mi, sed dictum lectus. Nulla molestie dolor leo, id.</p>
          <p><a class="btn btn-lg btn-primary" href="pelicula.jsp" role="button">Ver sinopsis</a></p>
          
        </div>
        <div class="col-md-5 col-md-pull-7">
          <img class="featurette-image img-responsive center-block" data-src="../static/assets/img/infinity.jpg" src="../static/assets/img/infinity.jpg" alt="Generic placeholder image">
        </div>
      </div>

      <hr class="featurette-divider">

      <div class="row featurette">
        <div class="col-md-7">
          <h2 class="">Jurasick Park.<span class="text-muted">Otra más.....</span></h2>
          <p class="lead">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas tincidunt ultrices tellus, nec rutrum dolor 
          maximus sit amet. Proin vel elementum mi, sed dictum lectus. Nulla molestie dolor leo, id</p>
          <p><a class="btn btn-lg btn-primary" href="pelicula.jsp" role="button">Ver sinopsis</a></p>
        </div>
        <div class="col-md-5">
          <img class="featurette-image img-responsive center-block" data-src="../static/assets/img/jurassic-world.jpg" src="../static/assets/img/jurassic-world.jpg" alt="Generic placeholder image">
        </div>
      </div>

      <hr class="featurette-divider">

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
  </body>
</html>
