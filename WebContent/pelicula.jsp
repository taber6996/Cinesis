<jsp:include page="includes/header.jsp" />

      <!-- START THE FEATURETTES -->
    <div class="container marketing">
      <hr class="featurette-divider">
      <div class="row">
        <div class="col-sm-offset-1 col-sm-10">
          <h2>${pelicula.getNomPelicula() } <a href="comprar-entrada?pelicula_id=${pelicula.getIdPelicula() }" type="button" class="btn btn-primary pull-right">Comprar entradas</a></h2>
          
          <img src="${pelicula.getUrlImagenPrincipal() }" width="100%"/>

          <ul style="margin-top: 10px;">
            <li>Director: <b>${pelicula.getDirectores() }</b></li>
            <li>Duración: <b>${pelicula.getDuracion() }</b></li>
            <li>Calificación: <b>${pelicula.getCalificacion() }</b></li>
            <li>Categoría: <b>${pelicula.getCategoria() }</b></li>
          </ul>
        </div>
        <div class="col-sm-12" style="margin-top:40px;">
          <p>${pelicula.getSinopsis() }</p>
          <a href="index.jsp" type="button" class="btn btn-primary pull-right">Volver</a>
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
