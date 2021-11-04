package com.hbt.semillero.dto;

import java.math.BigDecimal;

public class ConsultaNombrePrecioComicDTO extends ResultadoDTO{
	

	/**
	 * Atributo que determina  
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private BigDecimal precios;
	/**
	 * Metodo encargado de retornar el valor del atributo nombre
	 * @return El nombre asociado a la clase
	 */
	
	
	 public ConsultaNombrePrecioComicDTO() {
	    	
			
		} 
		
	
    public ConsultaNombrePrecioComicDTO(String nombre,BigDecimal precios) {
    	this.nombre = nombre;
    	this.precios = precios;
		
	}
	
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
	/**
	 * Metodo encargado de retornar el valor del atributo precios
	 * @return El precios asociado a la clase
	 */
	public BigDecimal getPrecios() {
		return precios;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo precios
	 * @param precios El nuevo precios a modificar.
	 */
	public void setPrecios(BigDecimal precios) {
		this.precios = precios;
	}
	

}
