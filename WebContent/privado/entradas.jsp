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
            <h3>Listado de mis entradas</h3>
            <div class="table-responsive">
	            <table id="myTable" class="table table-striped table-bordered table-hover" style="margin-bottom:30px;">
	                <thead>
	                	<tr>
	                    	<th>ID</th>
	                    	<th>Usuario</th>
	                    	<th>Sala</th>
	                    	<th>Película</th>
	                    	<th>Precio</th>
	                    	<th>Número de asiento</th>
	                        <th>Horario</th>
	                    </tr>
	                </thead>
	                <tbody>
	                    
	                        <c:forEach items="${entradas}" var="item">
	                        	<tr>
			                       <td>${item.getIdEntrada() }</td>
			                       <td>${item.getIdUsuario() }</td>
			                       <td>${item.getIdSala() }</td>
			                       <td>${item.getIdPelicula() }</td>
			                       <td>${item.getPrecio() }</td>
			                       <td>${item.getNumeroAsiento() }</td>
			                       <td>${item.getHorario() }</td>
			                    </tr>
			                </c:forEach>
	                    
	                </tbody>
	            </table>
	           </div>
        </div>
        <div class="col-sm-4">
        	<jsp:include page="../includes/showMessage.jsp" />
 
            <h3>Formulario creación entrada</h3>
            <form role="form" method="post" action="entradas">
            	<input type="hidden" name="user" value="NULL">
              <div class="form-group">
                <label for"exampleInputEmail1">Sala id</label>
                <select name="sala_id" class="form-control">
	                <c:forEach items="${salas}" var="item">
	                	<option value="${item.getIdSala()}">${item.getIdSala() }</option>
	                </c:forEach>
                </select>
              </div>
              <div class="form-group">
                <label for"exampleInputEmail1">Película id</label>
                <select name="pelicula_id" class="form-control">
	                <c:forEach items="${peliculas}" var="item">
	                	<option value="${item.getIdPelicula()}">${item.getNomPelicula() }</option>
	                </c:forEach>
                </select>
              </div>
              <div class="form-group">
                <label for"exampleInputEmail1">Precio</label>
                <input name="precio" type="text" class="form-control" id="precio" placeholder=Precio">
              </div>
              <div class="form-group">
                <label for"exampleInputEmail1">Número Asiento</label>
                <input name="numeroAsiento" type="text" class="form-control" id="numeroAsiento" placeholder="NÃºmero Asiento">
              </div>
              <div class="form-group">
                <label for"exampleInputEmail1">Horario</label>
                <input name="horario" type="number" class="form-control" id="horario" placeholder="Horario">
              </div>
              <button type="submit" class="btn btn-primary">Guardar entrada</button>
            </form>
        </div>
      </div>
<jsp:include page="../includes/footer-privado.jsp" />