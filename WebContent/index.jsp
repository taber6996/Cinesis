<jsp:include page="includes/header.jsp" />

    <!-- Carousel
    ================================================== -->
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
      </ol>
      <div class="carousel-inner" role="listbox">
        <div class="item active">
          <img class="first-slide" src="static/assets/img/avenge.jpg" alt="First slide">
          <div class="container">
            <div class="carousel-caption">
              <h1>Vengadores.</h1>
              <p>Película Vengadores</p>
              <p><a class="btn btn-lg btn-primary" href="pelicula_id=1" role="button">Ver sinopsis</a></p>
            </div>
          </div>
        </div>
        <div class="item">
          <img class="second-slide" src="static/assets/img/infinity.jpg" alt="Second slide">
          <div class="container">
            <div class="carousel-caption">
              <h1>Vengadores 2.</h1>
              <p> Película Vengadores 2</p>
              <p><a class="btn btn-lg btn-primary" href="pelicula_id=2" role="button">Ver sinopsis</a></p>
            </div>
          </div>
        </div>
        <div class="item">
          <img class="third-slide" src="static/assets/img/jurassic-world.jpg" alt="Third slide">
          <div class="container">
            <div class="carousel-caption">
              <h1>Jurasick word.</h1>
              <p>Película JURASICK.</p>
              <p><a class="btn btn-lg btn-primary" href="pelicula_id=3" role="button">Ver sinopsis</a></p>
            </div>
          </div>
        </div>
      </div>
      <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
    </div><!-- /.carousel -->

    <!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->

    <div class="container marketing">

      <!-- START THE FEATURETTES -->

      <hr class="featurette-divider">

      <div class="row featurette">
        <div class="col-md-7">
          <h2 class=""><a href="pelicula.jsp">Vengadores. <span class="text-muted">Segunda parte.</span></a></h2>
          <p class="lead">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas tincidunt ultrices tellus, nec rutrum dolor 
          maximus sit amet. Proin vel elementum mi, sed dictum lectus. Nulla molestie dolor leo, id.</p>
          <p><a class="btn btn-lg btn-primary" href="pelicula_id=1" role="button">Ver sinopsis</a></p>
        </div>
        <div class="col-md-5">
          <img class="featurette-image img-responsive center-block" src="static/assets/img/avenge.jpg" data-src="static/assets/img/avenge.jpg" alt="Generic placeholder image">
        </div>
      </div>
      
      <hr class="featurette-divider">

      <div class="row featurette">
        <div class="col-md-7 col-md-push-5">
          <h2 class=""><a href="pelicula.jsp">Vengadores. <span class="text-muted">Peliculón.</span></a></h2>
          <p class="lead">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas tincidunt ultrices tellus, nec rutrum dolor 
          maximus sit amet. Proin vel elementum mi, sed dictum lectus. Nulla molestie dolor leo, id.</p>
          <p><a class="btn btn-lg btn-primary" href="pelicula_id=2" role="button">Ver sinopsis</a></p>
        </div>
        <div class="col-md-5 col-md-pull-7">
          <img class="featurette-image img-responsive center-block" data-src="static/assets/img/infinity.jpg" src="static/assets/img/infinity.jpg" alt="Generic placeholder image">
        </div>
      </div>

      <hr class="featurette-divider">

      <div class="row featurette">
        <div class="col-md-7">
          <h2 class=""><a href="pelicula.jsp">Jurasick Park.<span class="text-muted">Otra más.....</span></a></h2>
          <p class="lead">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas tincidunt ultrices tellus, nec rutrum dolor 
          maximus sit amet. Proin vel elementum mi, sed dictum lectus. Nulla molestie dolor leo, id</p>
          <p><a class="btn btn-lg btn-primary" href="pelicula_id=3" role="button">Ver sinopsis</a></p>
        </div>
        <div class="col-md-5">
          <img class="featurette-image img-responsive center-block" data-src="static/assets/img/jurassic-world.jpg" src="static/assets/img/jurassic-world.jpg" alt="Generic placeholder image">
        </div>
      </div>
<div>

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
