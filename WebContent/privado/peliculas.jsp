<jsp:include page="../includes/header-privado.jsp" />

    <!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->

      <!-- START THE FEATURETTES -->
    <div class="container marketing">
      <hr class="featurette-divider">
      <div class="row">
      
      <div class="col-sm-8">
            <h3>Listado de peliculas</h3>
            <div class="table-responsive">
	            <table id="myTable" class="table table-striped table-bordered table-hover" style="margin-bottom:30px;">
	                <thead>
	                    <tr>
	                    	<th>Id</th>
	                        <th>Título</th>
	                        <th>Sinopsis</th>
	                        <th>Actores</th>
	                        <th>Duración</th>
	                        <th>Calificación</th>
	                        <th>Pais</th>
	                        <th>Estreno</th>
	                        <th>Extracto</th>
	                        <th>Imagen</th>
	                    </tr>
	                </thead>
	                <tbody>
	                    <tr>
	                    	<td>1</td>
	                        <td>10</td>
	                        <td>Vengadores</td>
	                        <td>Libre</td>
	                        <td>10</td>
	                        <td>10</td>
	                        <td>10</td>
	                        <td>10</td>
	                        <td>10</td>
	                        <td>10</td>
	                    </tr>
	                </tbody>
	            </table>
	        </div>
        </div>
        
        
        <div class="col-sm-4">
        	
        	<jsp:include page="../includes/showMessage.jsp" />
                
        	
            <h3>Formulario creación pelicula</h3>
            <form role="form" method="post" action="crear-pelicula">
            
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
<jsp:include page="../includes/footer-privado.jsp" />