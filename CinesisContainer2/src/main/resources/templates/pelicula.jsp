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
              <a class="navbar-brand" href="#">Cinesis</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#about">Películas</a></li>
                <li><a href="#contact">Contacto</a></li>
                
                <li class="active"><a href="login.jsp">Login</a></li>
              </ul>
            </div>
          </div>
        </nav>
        </div>
<jsp:include page="..." />
    <!-- Carousel
    ================================================== -->


    <!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->


      <!-- START THE FEATURETTES -->
	<div class="container">
		<div class="row">
			<div class="col-sm-offset-1 col-sm-10" style="margin-top-40px;">
				<h2>Título de la película <a href="comprar_entradas.jsp" type="button" class="btn btn-primary pull-right">Comprar entradas</ax></h2>
				
				<img src="../static/assets/img/avenge.jpg" width="100%"/>
				<ul>
					<li>Actores:</li>
					<li>Duración</li>
					<li>Valoración</li>
					<li>Categoría</li>
				</ul>
			</div>
			<div class="col-sm-12" style="margin-top-40px;">
				<p>
					Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ante odio, luctus quis tristique ac, aliquet vitae turpis. Donec orci ante, faucibus non tincidunt semper, faucibus in nisi. Quisque ut ultricies massa, at luctus nibh. Sed eu tellus sit amet augue scelerisque pulvinar. Nullam ex erat, gravida quis massa vel, accumsan porta sem. Etiam sit amet quam elit. Sed sit amet fermentum urna. In non laoreet ex, sed maximus enim. Duis convallis mi odio, et iaculis ipsum porta vitae. Sed eget lectus euismod, gravida nunc at, iaculis libero. Sed ullamcorper malesuada sem volutpat eleifend. Sed aliquam interdum risus, non venenatis libero sollicitudin nec. Donec quis elit eu arcu venenatis semper. Cras cursus pellentesque nisi, sit amet porta odio cursus at. Morbi congue magna eu magna placerat auctor.
					Phasellus vitae hendrerit nisl. Nam et justo enim. Maecenas maximus, velit sed vestibulum euismod, est augue vestibulum urna, non consectetur diam nisi at lacus. Curabitur luctus magna dapibus lectus varius tempor. Sed facilisis est eu imperdiet molestie. Phasellus maximus volutpat orci eu convallis. Integer nec lectus euismod, lobortis augue at, fermentum nulla. Aenean sit amet metus gravida tortor interdum malesuada. Aliquam id ligula vel leo faucibus mattis at a purus. Proin pellentesque fermentum volutpat. Phasellus a viverra turpis, eget maximus nisl. Phasellus finibus sapien eget justo commodo viverra. Vivamus eu ultrices elit. Nunc ultricies ipsum sed mauris feugiat porta. Vivamus facilisis lobortis lacus, non consequat mi tristique convallis. Cras tristique ligula eu ex dictum, auctor fringilla nunc elementum.
					Suspendisse potenti. Quisque molestie, nisl et hendrerit venenatis, massa nulla faucibus nulla, quis semper magna ipsum in leo. Nullam fringilla eget odio sit amet fermentum. Suspendisse dignissim interdum posuere. Nunc lobortis posuere lobortis. Suspendisse et lorem nulla. Aliquam maximus metus ac justo congue egestas. Nulla maximus sem id magna vestibulum suscipit. Quisque nec quam ac quam tempor convallis posuere eget dui. Nunc pharetra sem at dignissim aliquet. Sed sit amet massa lorem. Pellentesque sapien lorem, gravida non nisi venenatis, tristique tempor ligula. Etiam faucibus nisl a diam rhoncus, faucibus posuere quam semper. Sed convallis odio nec lacus volutpat suscipit. Pellentesque vel enim posuere, ornare enim id, lobortis dolor. Mauris ut lacus venenatis, ornare dolor id, consectetur sem.
				</p>
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
  </body>
</html>
