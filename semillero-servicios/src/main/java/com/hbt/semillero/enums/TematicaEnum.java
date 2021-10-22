package com.hbt.semillero.enums;
/**
 * 
 * <b>Descripción:<b> Clase que determina la enumeracion para representar los tipos de tematicas aceptados por un comic
 * <b>Caso de Uso:<b> semillero 2021
 * @author ALVNITRO
 * @version
 */
public enum TematicaEnum {
	
AVENTURAS("enum.tematica.aventuras"),
BELICO("enum.tematica.belico"),
DEPORTIVO("enum.tematica.deportivo"),
FANTASTICO("enum.tematica.fantastico"),
CIENCIA_FICCION("enum.tematica.cienciaFiccion"),
HISTORICO("enum.tematica.historico"),
HORROR("enum.tematica.horror"),
HUMORISTICO("enum.tematica.humoristico"),
;
	
private String descripcion;

TematicaEnum(String descripcion){
	this.descripcion=descripcion;
	
}

/**
 * Metodo encargado de retornar el valor del atributo descripcion
 * @return El descripcion asociado a la clase
 */
public String getDescripcion() {
	return descripcion;
}




}
