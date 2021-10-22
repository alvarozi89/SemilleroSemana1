package com.hbt.semillero.interfaces;

import com.hbt.semillero.enums.TipoVehiculoEmun;

public interface AccionesVehiculoInterface {

		
	 public  int obtenerVelocidadMaxima();
	 
	 public  long obtenerPesoMaximoCarga();
	 
	 public  boolean determinarTipoVehiculo(TipoVehiculoEmun tipoVehiculoEmun) throws Exception;
	 
	 public default void acelerar() {
		 System.out.println("El vehiculo ha iniciado acelerar");
		 
	 }

	 
}

	
