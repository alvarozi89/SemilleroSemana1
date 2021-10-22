package com.hbt.semillero.entidad;

import com.hbt.semillero.enums.TipoVehiculoEmun;
import com.hbt.semillero.interfaces.AccionesVehiculoInterface;

/**
 * 
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author ALVNITRO
 * @version
 */


public class Bicicleta extends Vehiculo implements AccionesVehiculoInterface{
	
	private String tipoBicicleta;
	/**
	 * Metodo encargado de retornar el valor del atributo tipoBicicleta
	 * @return El tipoBicicleta asociado a la clase
	 */
	public String getTipoBicicleta() {
		return tipoBicicleta;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo tipoBicicleta
	 * @param tipoBicicleta El nuevo tipoBicicleta a modificar.
	 */
	public void setTipoBicicleta(String tipoBicicleta) {
		this.tipoBicicleta = tipoBicicleta;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo utilizaChalecoReflector
	 * @return El utilizaChalecoReflector asociado a la clase
	 */
	public boolean isUtilizaChalecoReflector() {
		return utilizaChalecoReflector;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo utilizaChalecoReflector
	 * @param utilizaChalecoReflector El nuevo utilizaChalecoReflector a modificar.
	 */
	public void setUtilizaChalecoReflector(boolean utilizaChalecoReflector) {
		this.utilizaChalecoReflector = utilizaChalecoReflector;
	}
	private boolean utilizaChalecoReflector;
	@Override
	public int obtenerVelocidadMaxima() {
		// TODO Auto-generated method stub
		return 10;
	}
	@Override
	public long obtenerPesoMaximoCarga() {
		// TODO Auto-generated method stub
		return 10L;
	}
	@Override
	public boolean determinarTipoVehiculo(TipoVehiculoEmun tipoVehiculoEmun) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
