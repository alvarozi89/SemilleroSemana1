package com.hbt.semillero.ejb;

import java.util.List;

import javax.ejb.Local;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.ConsultaNombrePrecioComicDTO;
import com.hbt.semillero.dto.ConsultarComicTamanioNombreDTO;
import com.hbt.semillero.dto.ResultadoDTO;

@Local

public interface IGestionarComicLocal {
	
	public ConsultaNombrePrecioComicDTO consultarNombrePrecioComic(Long idComic);
	public ConsultarComicTamanioNombreDTO consultarComicTamanioNombre(String nombre);
	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author ALVNITRO
	 * 
	 * @param comicDTO
	 * @throws Exception 
	 */
	public ComicDTO crearComic(ComicDTO comicDTO) throws Exception;
	
	public ResultadoDTO actualizarComic(Long idComic);
	
	public ResultadoDTO eliminarComic(Long idComic);
	
	public List<ComicDTO> consultarComics();
	
	

		 
		
	

}
