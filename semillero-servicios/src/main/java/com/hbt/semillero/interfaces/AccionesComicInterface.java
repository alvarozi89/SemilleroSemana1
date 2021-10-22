package com.hbt.semillero.interfaces;

import com.hbt.semillero.enums.EstadoEnum;

public interface AccionesComicInterface {

	 public abstract String obtenerActivo();
	 
	 public  boolean determinarValides(EstadoEnum estadoEnum) throws Exception;
	 
	 public default void validarActivo() {
		 System.out.println("El comic esta siendo validado");
		 
	 }
	 
}