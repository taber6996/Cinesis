<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.*, java.io.*"%>
<%@page import="org.apache.log4j.Logger,java.text.DecimalFormat"%>
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
	                        <th>Imagen</th>
	                        <th>Ver</th>
	                        <th>Sinopsis</th>
	                        <th>Director</th>
	                        <th>Duración</th>
	                        <th>Calificación</th>
	                        <th>Pais</th>
	                        <th>Estreno</th>
	                        <th>Categoria</th>
	                        
	                    </tr>
	                </thead>
	                <tbody>
	                
	                <c:forEach items="${peliculas}" var="item">
	                
	                <tr>
	                    	<td>${item.getIdPelicula() }</td>
	                        <td>${item.getNomPelicula() }</td>
	                        <td><img class="featurette-image img-responsive center-block" data-src="" src="${item.getUrlImagenPrincipal() }" alt="Generic placeholder image"></td>
	                    	<td><a href="pelicula?pelicula_id=${item.getIdPelicula() }">Ver</a></td>
	                        <td>${item.getSinopsis() }</td>
	                        <td>${item.getDirectores() }</td>
	                        <td>${item.getDuracion() }</td>
	                        <td>${item.getCalificacion() }</td>
	                        <td>${item.getPais() }</td>
	                        <td>${item.getEstreno() }</td>
	                        <td>${item.getCategoria() }</td>
	                    </tr>
		       
					</c:forEach>
		
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
                <label for"exampleInputEmail1">Categoría</label>
                <select name="categoria" class="form-control">
	                <option value="HORROR">HORROR</option>
	                <option value="ROMANCE">ROMANCE</option>
	                <option value="FANTASIA">FANTASIA</option>
	                <option value="COMEDIA">COMEDIA</option>
                </select>
              </div>
              <div class="form-group">
                <label for"exampleInputEmail1">Director</label>
                <input name="director" type="text" class="form-control" id="actores" placeholder="Director">
              </div>
              <div class="form-group">
                <label for"exampleInputEmail1">Calificación</label>
                <input name="calificacion" type="number" class="form-control" id="calificacion" placeholder="Calificación">
              </div>
              <div class="form-group">
                <label for"exampleInputEmail1">Duración</label>
                <input name="duracion" type="number" class="form-control" id="duracion" placeholder="Duración">
              </div>
              <div class="form-group">
                <label for"exampleInputEmail1">Pais</label>
                <input name="pais" type="text" class="form-control" id="pais" placeholder="Pais">
              </div>
              <div class="form-group">
                <label for"exampleInputEmail1">Estreno</label>
                <input name="estreno" type="date" class="form-control" id="estreno" placeholder="Estreno">
              </div>
              <div class="form-group">
                <label for"exampleInputEmail1">Sinopsis</label>
                <textarea class="form-control" name="sinopsis" id="" cols="30" rows="10"></textarea>
              </div>
              <div class="form-group">
                <label for="exampleInputFile">Selecciona el tamaño de tu imagen</label>
                <select name="imagen_principal" class="form-control">
	                <option name="1200x600">1200x600</option>
	                <option name="1250x625">1250x625</option>
	                <option name="1300x650">1300x650</option>
	                <option name="1100x550">1100x550</option>
                </select>
              </div>
              <button type="submit" class="btn btn-primary">Guardar película</button>
            </form>
        </div>
      </div>
<jsp:include page="../includes/footer-privado.jsp" />