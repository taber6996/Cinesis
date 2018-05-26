<jsp:include page="../includes/header-privado.jsp" />

    <!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->

      <!-- START THE FEATURETTES -->
    <div class="container marketing">
      <hr class="featurette-divider">
      <div class="row">

      	<div class="col-sm-8">
            <h3>Listado de trailers</h3>
            <table id="myTable" class="table table-striped table-bordered table-hover" style="margin-bottom:30px;">
                <thead>
                    <tr>
                        <th>Horario</th>
                        <th>Película</th>
                        <th>Estado</th>
                        <th>Precio</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>10</td>
                        <td>Vengadores</td>
                        <td>Libre</td>
                        <td>10</td>
                    </tr>
                </tbody>
            </table>
        </div>
        <div class="col-sm-4">
        	
        	<jsp:include page="../includes/showMessage.jsp" />
		
            <h3>Formulario creación sala</h3>
            <form role="form" method="post" action="trailers">
            
              <div class="form-group">
                <label for"exampleInputEmail1">pelicula_id</label>
                <input name="pelicula_id" type="text" class="form-control" id="pelicula_id" placeholder="pelicula_id">
              </div>
              <div class="form-group">
                <label for"exampleInputEmail1">titulo</label>
                <input name="titulo" type="text" class="form-control" id="titulo" placeholder="titulo">
              </div>
              <div class="form-group">
                <label for"exampleInputEmail1">descripcion</label>
                <input name="descripcion" type="text" class="form-control" id="descripcion" placeholder="descripcion">
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
