package com.hbt.semillero.entidad;

import com.hbt.semillero.enums.TipoVehiculoEmun;
import com.hbt.semillero.interfaces.AccionesVehiculo;
import com.hbt.semillero.interfaces.AccionesVehiculoInterface;

/**
 * 
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author ALVNITRO
 * @version
 */

public class Avion extends Vehiculo implements AccionesVehiculoInterface {

	@Override
	public int obtenerVelocidadMaxima() {
		
		return 700;
	}

	@Override
	public long obtenerPesoMaximoCarga() {
		
		return 50L;
	}

	@Override
	public boolean determinarTipoVehiculo(TipoVehiculoEmun tipoVehiculoEmun) throws Exception {
		Integer valor1=90;
		Integer valor2=190;
		boolean resultado = valor1==valor2;
		if(getTipoVehiculo().AEREO.getIdentificador()==(tipoVehiculoEmun.getIdentificador())) {
			System.out.println("El vehiculo si es el mismo tipo");
			 
			 return true;
			 
		 }
		else {
			throw new Exception("Este vehiculo asignado es erroneo,debe ser areo");
		 }
		 
		
		
		
	}
	
	 

}
