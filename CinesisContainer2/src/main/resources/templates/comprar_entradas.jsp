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

    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css" integrity="sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp" crossorigin="anonymous">
    
    <style>
    .fa-check
    {
      color: green;
    }
    .fa-times{
      color: brown;
    }
    .fa-wheelchair
    {
      color: deepskyblue;
    }
    th, td{
      text-align: center;
    }
    .pantalla{
      width: 100%;
      height: 30px;
      background-color: black;
      color: beige;
      text-align: center;
      padding: 5px;
      margin-bottom: 10px;
    }
    </style>
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
    <!-- Carousel
    ================================================== -->


    <!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->


      <!-- START THE FEATURETTES -->
	<div class="container marketing">
    <hr class="featurette-divider">
		<div class="row">
			<div class="col-sm-3" style="margin-top-40px;">
				<h4>Título de la película</h4>
				<img src="../static/assets/img/avenge.jpg" width="100%"/>
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