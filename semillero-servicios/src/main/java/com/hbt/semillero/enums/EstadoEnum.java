package com.hbt.semillero.enums;

public enum EstadoEnum {
	ACTIVO ("Activo",1),
	INACTIVO ("Inactivo",2);
	
	private String estado;
	private int identificador;
	
	EstadoEnum(String estado, int identificador){
		
		this.estado= estado;
		this.identificador= identificador;
	}
	
	
	/**
	 * Metodo encargado de retornar el valor del atributo estado
	 * @return El estado asociado a la clase
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo estado
	 * @param estado El nuevo estado a modificar.
	 */
	
	/**
	 * Metodo encargado de retornar el valor del atributo identificador
	 * @return El identificador asociado a la clase
	 */
	public int getIdentificador() {
		return identificador;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo identificador
	 * @param identificador El nuevo identificador a modificar.
	 */


}
