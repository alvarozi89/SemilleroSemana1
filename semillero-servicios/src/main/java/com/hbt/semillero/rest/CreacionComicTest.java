package com.hbt.semillero.rest;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import com.hbt.semillero.entidad.Comic;
import com.hbt.semillero.enums.EstadoEnum;
import com.hbt.semillero.enums.TematicaEnum;

public class CreacionComicTest {
	
	public static void main(String[] args) throws Exception {
		String date = "2016-08-16";
		
		Comic comic1 = new Comic();
		comic1.setAutores("STAN LEE");
		comic1.setCantidad(new Short ((short) 12));
		comic1.setColeccion("MARVEL COMICS");
		comic1.setColor(true);
		comic1.setEditorial("panini comics");
		comic1.setEstado(EstadoEnum.INACTIVO);
		comic1.setFechaVenta(LocalDate.parse(date));
		comic1.setId(new Long(1));
		comic1.setNombre("VENOM");
		comic1.setNumeroPaginas(20);
		comic1.setPrecio(new BigDecimal (25000));
		comic1.setTematicaEnum(TematicaEnum.AVENTURAS);
		
		
		
		Comic comic2 = new Comic();
		comic2.setAutores("STAN LEE");
		comic2.setCantidad(new Short ((short) 12));
		comic2.setColeccion("MARVEL COMICS");
		comic2.setColor(true);
		comic2.setEditorial("panini comics");
		comic2.setEstado(EstadoEnum.ACTIVO);
		comic2.setFechaVenta(LocalDate.parse(date));
		comic2.setId(new Long(2));
		comic2.setNombre("CAPITAN AMERICA");
		comic2.setNumeroPaginas(20);
		comic2.setPrecio(new BigDecimal (25000));
		comic2.setTematicaEnum(TematicaEnum.CIENCIA_FICCION);
		
		
		
		
		Comic comic3 = new Comic();
		comic3.setAutores("STAN LEE");
		comic3.setCantidad(new Short ((short) 12));
		comic3.setColeccion("MARVEL COMICS");
		comic3.setColor(true);
		comic3.setEditorial("panini comics");
		comic3.setEstado(EstadoEnum.ACTIVO);
		comic3.setFechaVenta(LocalDate.parse(date));
		comic3.setId(new Long(3));
		comic3.setNombre("IRON MAN");
		comic3.setNumeroPaginas(20);
		comic3.setPrecio(new BigDecimal (25000));
		comic3.setTematicaEnum(TematicaEnum.HUMORISTICO);
		
		
		
		Comic comic4 = new Comic();
		comic4.setAutores("STAN LEE");
		comic4.setCantidad(new Short ((short) 12));
		comic4.setColeccion("MARVEL COMICS");
		comic4.setColor(true);
		comic4.setEditorial("panini comics");
		comic4.setEstado(EstadoEnum.ACTIVO);
		comic4.setFechaVenta(LocalDate.parse(date));
		comic4.setId(new Long(4));
		comic4.setNombre("DOCTOR EXTRAÑO");
		comic4.setNumeroPaginas(20);
		comic4.setPrecio(new BigDecimal (25000));
		comic4.setTematicaEnum(TematicaEnum.HORROR);
		
		
		
		Comic comic5 = new Comic();
		comic5.setAutores("STAN LEE");
		comic5.setCantidad(new Short ((short) 12));
		comic5.setColeccion("MARVEL COMICS");
		comic5.setColor(true);
		comic5.setEditorial("panini comics");
		comic5.setEstado(EstadoEnum.ACTIVO);
		comic5.setFechaVenta(LocalDate.parse(date));
		comic5.setId(new Long(5));
		comic5.setNombre("LA BRUJA ESCARLATA");
		comic5.setNumeroPaginas(20);
		comic5.setPrecio(new BigDecimal (25000));
		comic5.setTematicaEnum(TematicaEnum.FANTASTICO);
		
		
		
		Comic comic6 = new Comic();
		comic6.setAutores("STAN LEE");
		comic6.setCantidad(new Short ((short) 12));
		comic6.setColeccion("MARVEL COMICS");
		comic6.setColor(true);
		comic6.setEditorial("panini comics");
		comic6.setEstado(EstadoEnum.INACTIVO);
		comic6.setFechaVenta(LocalDate.parse(date));
		comic6.setId(new Long(6));
		comic6.setNombre("LOS 4 FANTASTICOS");
		comic6.setNumeroPaginas(20);
		comic6.setPrecio(new BigDecimal (25000));
		comic6.setTematicaEnum(TematicaEnum.AVENTURAS);
		
		
		Comic comic7 = new Comic();
		comic7.setAutores("STAN LEE");
		comic7.setCantidad(new Short ((short) 12));
		comic7.setColeccion("MARVEL COMICS");
		comic7.setColor(true);
		comic7.setEditorial("panini comics");
		comic7.setEstado(EstadoEnum.INACTIVO);
		comic7.setFechaVenta(LocalDate.parse(date));
		comic7.setId(new Long(7));
		comic7.setNombre("WOLVERINE");
		comic7.setNumeroPaginas(20);
		comic7.setPrecio(new BigDecimal (25000));
		comic7.setTematicaEnum(TematicaEnum.AVENTURAS);
		
		
		Comic comic8 = new Comic();
		comic8.setAutores("STAN LEE");
		comic8.setCantidad(new Short ((short) 12));
		comic8.setColeccion("MARVEL COMICS");
		comic8.setColor(true);
		comic8.setEditorial("panini comics");
		comic8.setEstado(EstadoEnum.INACTIVO);
		comic8.setFechaVenta(LocalDate.parse(date));
		comic8.setId(new Long(8));
		comic8.setNombre("X MEN");
		comic8.setNumeroPaginas(20);
		comic8.setPrecio(new BigDecimal (25000));
		comic8.setTematicaEnum(TematicaEnum.AVENTURAS);
		
		
		Comic comic9 = new Comic();
		comic9.setAutores("STAN LEE");
		comic9.setCantidad(new Short ((short) 12));
		comic9.setColeccion("MARVEL COMICS");
		comic9.setColor(true);
		comic9.setEditorial("panini comics");
		comic9.setEstado(EstadoEnum.INACTIVO);
		comic9.setFechaVenta(LocalDate.parse(date));
		comic9.setId(new Long(9));
		comic9.setNombre("EL ALCON");
		comic9.setNumeroPaginas(20);
		comic9.setPrecio(new BigDecimal (25000));
		comic9.setTematicaEnum(TematicaEnum.AVENTURAS);
		
		
		Comic comic10 = new Comic();
		comic10.setAutores("STAN LEE");
		comic10.setCantidad(new Short ((short) 12));
		comic10.setColeccion("MARVEL COMICS");
		comic10.setColor(true);
		comic10.setEditorial("panini comics");
		comic10.setEstado(EstadoEnum.INACTIVO);
		comic10.setFechaVenta(LocalDate.parse(date));
		comic10.setId(new Long(10));
		comic10.setNombre("MULTIVERSO");
		comic10.setNumeroPaginas(20);
		comic10.setPrecio(new BigDecimal (25000));
		comic10.setTematicaEnum(TematicaEnum.AVENTURAS);
		
		
		
		
		
		
		System.out.println(comic1.toString());
		System.out.println(comic2.toString());
		System.out.println(comic3.toString());
		System.out.println(comic4.toString());
		System.out.println(comic5.toString());
		System.out.println(comic6.toString());
		System.out.println(comic7.toString());
		System.out.println(comic8.toString());
		System.out.println(comic9.toString());
		System.out.println(comic10.toString());
		
		System.out.println("Exixten comics que estan: "+comic1.obtenerValido());
		System.out.println("Comic inactivo: "+comic1.determinarEstado(EstadoEnum.INACTIVO));
	
		
		
		
		
	}
	
	
	

}
