<jsp:include page="includes/header.jsp" />

      <!-- START THE FEATURETTES -->
    <div class="container marketing">
      <hr class="featurette-divider">
      <div class="row">
        <div class="col-sm-offset-1 col-sm-10">
          <h2>${pelicula.getNomPelicula() } <a href="comprar_entradas.jsp" type="button" class="btn btn-primary pull-right">Comprar entradas</a></h2>
          
          <img src="static/assets/img/avenge.jpg" width="100%"/>

          <ul style="margin-top: 10px;">
            <li>${pelicula.getNomPelicula() }: <b>xxxx</b></li>
            <li>${pelicula.getNomPelicula() }: <b>xxxx</b></li>
            <li>${pelicula.getNomPelicula() }: <b>xxxx</b></li>
            <li>${pelicula.getNomPelicula() }: <b>xxxx</b></li>
          </ul>
        </div>
        <div class="col-sm-12" style="margin-top:40px;">
          <p>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ante odio, luctus quis tristique ac, aliquet vitae turpis. Donec orci ante, faucibus non tincidunt semper, faucibus in nisi. Quisque ut ultricies massa, at luctus nibh. Sed eu tellus sit amet augue scelerisque pulvinar. Nullam ex erat, gravida quis massa vel, accumsan porta sem. Etiam sit amet quam elit. Sed sit amet fermentum urna. In non laoreet ex, sed maximus enim. Duis convallis mi odio, et iaculis ipsum porta vitae. Sed eget lectus euismod, gravida nunc at, iaculis libero. Sed ullamcorper malesuada sem volutpat eleifend. Sed aliquam interdum risus, non venenatis libero sollicitudin nec. Donec quis elit eu arcu venenatis semper. Cras cursus pellentesque nisi, sit amet porta odio cursus at. Morbi congue magna eu magna placerat auctor.
            Phasellus vitae hendrerit nisl. Nam et justo enim. Maecenas maximus, velit sed vestibulum euismod, est augue vestibulum urna, non consectetur diam nisi at lacus. Curabitur luctus magna dapibus lectus varius tempor. Sed facilisis est eu imperdiet molestie. Phasellus maximus volutpat orci eu convallis. Integer nec lectus euismod, lobortis augue at, fermentum nulla. Aenean sit amet metus gravida tortor interdum malesuada. Aliquam id ligula vel leo faucibus mattis at a purus. Proin pellentesque fermentum volutpat. Phasellus a viverra turpis, eget maximus nisl. Phasellus finibus sapien eget justo commodo viverra. Vivamus eu ultrices elit. Nunc ultricies ipsum sed mauris feugiat porta. Vivamus facilisis lobortis lacus, non consequat mi tristique convallis. Cras tristique ligula eu ex dictum, auctor fringilla nunc elementum.
            Suspendisse potenti. Quisque molestie, nisl et hendrerit venenatis, massa nulla faucibus nulla, quis semper magna ipsum in leo. Nullam fringilla eget odio sit amet fermentum. Suspendisse dignissim interdum posuere. Nunc lobortis posuere lobortis. Suspendisse et lorem nulla. Aliquam maximus metus ac justo congue egestas. Nulla maximus sem id magna vestibulum suscipit. Quisque nec quam ac quam tempor convallis posuere eget dui. Nunc pharetra sem at dignissim aliquet. Sed sit amet massa lorem. Pellentesque sapien lorem, gravida non nisi venenatis, tristique tempor ligula. Etiam faucibus nisl a diam rhoncus, faucibus posuere quam semper. Sed convallis odio nec lacus volutpat suscipit. Pellentesque vel enim posuere, ornare enim id, lobortis dolor. Mauris ut lacus venenatis, ornare dolor id, consectetur sem.
          </p>
          <a href="index.jsp" type="button" class="btn btn-primary pull-right">Volver</a>
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
