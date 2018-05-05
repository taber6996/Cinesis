package code;

import java.util.Date;

public class Entrada {




	private Integer idEntrada;
	
	private Sala idSala;

	private Peliculas idPelicula;

	private Usuario idUsuario;

	private Integer numeroAsiento;

	private Date horario;
	
	private Integer precio;

	
	
	
	public Entrada(Integer idEntrada, Sala idSala, Peliculas idPelicula, Usuario idUsuario, Integer numeroAsiento,
			Date horario, Integer precio) {
		this.idEntrada = idEntrada;
		this.idSala = idSala;
		this.idPelicula = idPelicula;
		this.idUsuario = idUsuario;
		this.numeroAsiento = numeroAsiento;
		this.horario = horario;
		this.precio = precio;
	}
	
	

	public void compraEntrada(Integer numAsientos, Peliculas pelicula,
			Date Horario, Integer numEntradas, String pago, Sala sala) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	
	public void eliminarEntrada(Entrada CodEntrada) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	
	public void modificarEntrada(Entrada CodEntrada, Integer numAsientos,
			Peliculas pelicula, Date Horario, Integer numEntradas, String pago,
			Object sala) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	
	public void mostrarEntrada(Entrada CodEntrada) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public void mostrarTotalEntradas() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public void mostrarFormulario() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}


	public Integer getIdEntrada() {
		return idEntrada;
	}


	public void setIdEntrada(Integer idEntrada) {
		this.idEntrada = idEntrada;
	}


	public Sala getIdSala() {
		return idSala;
	}



	public Peliculas getIdPelicula() {
		return idPelicula;
	}


	

	public Usuario getIdUsuario() {
		return idUsuario;
	}


	public Integer getNumeroAsiento() {
		return numeroAsiento;
	}


	public void setNumeroAsiento(Integer numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}


	public Date getHorario() {
		return horario;
	}


	public void setHorario(Date horario) {
		this.horario = horario;
	}


	public Integer getPrecio() {
		return precio;
	}


	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
}