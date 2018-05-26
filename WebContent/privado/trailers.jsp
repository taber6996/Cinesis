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
            <div class="table-responsive">
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

<jsp:include page="../includes/footer-privado.jsp" />