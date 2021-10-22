package com.hbt.semillero.rest;

import java.math.BigDecimal;

import com.hbt.semillero.entidad.Avion;
import com.hbt.semillero.entidad.Barco;
import com.hbt.semillero.entidad.Bicicleta;
import com.hbt.semillero.entidad.Vehiculo;
import com.hbt.semillero.enums.TipoVehiculoEmun;

public class CrearcionVehiculoRest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehiculo vehiculo1 = new Vehiculo("Amarillo",65000000);
		vehiculo1.setColor("Amarillo");
		vehiculo1.setNumeroAsientos(2);
		vehiculo1.setNumeroLlantas(4);
		vehiculo1.setPrecio(new BigDecimal (65000000));
		vehiculo1.setRequiereLicencia(true);
		vehiculo1.setTipoVehiculo(TipoVehiculoEmun.TERRESTRE);
		
		Barco barco1 = new Barco();
		barco1.setColor("Blanco");
		barco1.setNumeroAsientos(20);
		barco1.setNumeroLlantas(0);
		barco1.setPrecio(new BigDecimal (65000000));
		barco1.setRequiereLicencia(true);
		barco1.setTipoVehiculo(TipoVehiculoEmun.ACUATICO);
		
		Bicicleta bicicleta1 = new Bicicleta();
		Avion avion1 = new Avion();
		avion1.setTipoVehiculo(TipoVehiculoEmun.AEREO);
		try {
			avion1.determinarTipoVehiculo(TipoVehiculoEmun.AEREO);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
		
		
		System.out.println(vehiculo1.toString());
		System.out.println(barco1.toString());
		System.out.println("la velocidad del barco es: "+barco1.obtenerVelocidadMaxima());
		System.out.println("la velocidad de la bicicleta  es: "+bicicleta1.obtenerVelocidadMaxima());
		barco1.acelerar();
		bicicleta1.acelerar();
		

	}

}
