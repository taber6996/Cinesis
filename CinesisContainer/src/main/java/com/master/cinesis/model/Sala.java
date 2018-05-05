package com.master.cinesis.model;

import java.sql.Array;
import java.sql.Date;
import javax.persistence.*;


@Entity
@Table(name = "sala")
public class Sala {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@Id
    @GeneratedValue
	private Integer id;
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer num_filas;
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer num_columnas;
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer num_asientos_vip;
	
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer num_asientos_minusvalidos;
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String calidad_sonido;
	
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Boolean _3d;
	
	private Date created_at;
	
	private Date updated_at;
	

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param num_filas
	 * @param num_columnas
	 * @param num_asientos_vip
	 * @param num_asientos_minusvalidos
	 * @param calidad_sonido
	 * @param _3D
	 * @param created_at
	 * @param updated_at
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void crearSala(Integer num_filas, Integer num_columnas, Integer num_asientos_vip, Integer num_asientos_minusvalidos, String calidad_sonido,
		Boolean _3d, Date created_at, Date updated_at) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param idSala
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void mostrarSala(Integer id) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param id
	 * @param num_filas
	 * @param num_columnas
	 * @param num_asientos_vip
	 * @param num_asientos_minusvalidos
	 * @param calidad_sonido
	 * @param _3D
	 * @param created_at
	 * @param updated_at
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void modificarSala(Integer id, Integer num_filas, Integer num_columnas, Integer num_asientos_vip, Integer num_asientos_minusvalidos, String calidad_sonido,
		Boolean _3d, Date created_at, Date updated_at) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param idSala
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void eliminarSala(Integer id) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

}
