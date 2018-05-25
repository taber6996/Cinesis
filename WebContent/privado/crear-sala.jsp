<jsp:include page="../includes/header-privado.jsp" />

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

            <h3>Formulario creaci�n sala</h3>
            <form role="form" method="post" action="form">
            
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
