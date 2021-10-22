package com.hbt.semillero.interfaces;

import com.hbt.semillero.enums.TipoVehiculoEmun;

public abstract class AccionesVehiculo {
	
 public abstract int obtenerVelocidadMaxima();
 
 public abstract long obtenerPesoMaximoCarga();
 
 public abstract boolean determinarTipoVehiculo(TipoVehiculoEmun tipoVehiculoEmun) throws Exception;
 
 
 public void acelerar() {
	 System.out.println("El vehiculo ha iniciado acelerar");
	 
	 
 }
 
 

}
