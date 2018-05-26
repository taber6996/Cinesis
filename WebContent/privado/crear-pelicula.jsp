<jsp:include page="../includes/header-privado.jsp" />

    <!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->

      <!-- START THE FEATURETTES -->
    <div class="container marketing">
      <hr class="featurette-divider">
      <div class="row">
        <div class="col-sm-6 col-sm-offset-3">
        	
        	<jsp:include page="../includes/showMessage.jsp" />
                
        	
            <h3>Formulario creación entrada</h3>
            <form role="form" method="post" action="ServletController">
            
            <input type="hidden" name="type_form" value="pelicula">
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
                <label for"exampleInputEmail1">Calificación</label>
                <input name="calificacion" type="number" class="form-control" id="calificacion" placeholder="Calificación">
              </div>
              <div class="form-group">
                <label for"exampleInputEmail1">Pais</label>
                <input name="pais" type="text" class="form-control" id="pais" placeholder="Pais">
              </div>
              <div class="form-group">
                <label for"exampleInputEmail1">Estreno</label>
                <input name="estreno" type="text" class="form-control" id="estreno" placeholder="Estreno">
              </div>
              <div class="form-group">
                <label for"exampleInputEmail1">Extracto</label>
                <textarea class="form-control" name="extracto" id="" cols="30" rows="10"></textarea>
              </div>
              <div class="form-group">
                <label for="exampleInputFile">Imagen</label>
                <input type="file" id="imagen_principal" name="imagen_principal">
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
