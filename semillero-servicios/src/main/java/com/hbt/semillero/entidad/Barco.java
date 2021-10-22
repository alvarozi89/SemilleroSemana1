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

public class Barco extends Vehiculo implements AccionesVehiculoInterface{
	
	private String nombreCapitan;
	/**
	 * Metodo encargado de retornar el valor del atributo nombreCapitan
	 * @return El nombreCapitan asociado a la clase
	 */
	public String getNombreCapitan() {
		return nombreCapitan;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo nombreCapitan
	 * @param nombreCapitan El nuevo nombreCapitan a modificar.
	 */
	public void setNombreCapitan(String nombreCapitan) {
		this.nombreCapitan = nombreCapitan;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo PuertoLlegada
	 * @return El puertoLlegada asociado a la clase
	 */
	public String getPuertoLlegada() {
		return PuertoLlegada;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo PuertoLlegada
	 * @param puertoLlegada El nuevo puertoLlegada a modificar.
	 */
	public void setPuertoLlegada(String puertoLlegada) {
		PuertoLlegada = puertoLlegada;
	}
	private String PuertoLlegada;
	@Override
	public int obtenerVelocidadMaxima() {
		// TODO Auto-generated method stub
		return 100;
	}
	@Override
	public long obtenerPesoMaximoCarga() {
		// TODO Auto-generated method stub
		return 60L;
	}
	@Override
	public boolean determinarTipoVehiculo(TipoVehiculoEmun tipoVehiculoEmun) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
