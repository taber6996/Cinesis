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
            <h3>Listado de trailers</h3>
            <div class="table-responsive">
	            <table id="myTable" class="table table-striped table-bordered table-hover" style="margin-bottom:30px;">
	                <thead>
	                    <tr>
	                    	<th>Id</th>
	                        <th>Película ID</th>
	                        <th>Título</th>
	                        <th>Descripción</th>
	                    </tr>
	                </thead>
	                <tbody>
	                    <c:forEach items="${trailers}" var="item">
	                
			                <tr>
			                	<td>${item.getIdTrailer() }</td>
			                	<td>${item.getIdPelicula() }</td>
		                    	<td>${item.getTitulo() }</td>
		                        <td>${item.getDescripcion() }</td>
		                    </tr>
		       
					</c:forEach>
	                </tbody>
	            </table>
            </div>
        </div>
        <div class="col-sm-4">
        	
        	<jsp:include page="../includes/showMessage.jsp" />
		
            <h3>Formulario creación sala</h3>
            <form role="form" method="post" action="trailers">
            
              <div class="form-group">
                <label for"exampleInputEmail1">Pelicula</label>
                <select name="pelicula_id" class="form-control">
	                <c:forEach items="${peliculas}" var="item">
	                	<option value="${item.getIdPelicula()}">${item.getNomPelicula() }</option>
	                </c:forEach>
                </select>
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