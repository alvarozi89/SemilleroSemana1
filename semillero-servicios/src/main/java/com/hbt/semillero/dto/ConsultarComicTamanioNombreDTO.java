package com.hbt.semillero.dto;

import java.math.BigDecimal;

public class ConsultarComicTamanioNombreDTO extends ResultadoDTO {
	
	private static final long serialVersionUID = 1L;
	private String nombre;
	
	 public ConsultarComicTamanioNombreDTO() {
	    	
			
		} 
	 
	  public ConsultarComicTamanioNombreDTO(String nombre) {
	    	this.nombre = nombre;
	    
			
		}
		
	/**
	 * Metodo encargado de retornar el valor del atributo nombre
	 * @return El nombre asociado a la clase
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo nombre
	 * @param nombre El nuevo nombre a modificar.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
