package com.hbt.semillero.ejb;

import java.math.BigDecimal;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.ConsultaNombrePrecioComicDTO;
import com.hbt.semillero.dto.ConsultarComicTamanioNombreDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.entidad.Comic;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class GestionarComicBean implements IGestionarComicLocal{
	
	@PersistenceContext
	private EntityManager em;
	
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)	
@Override
	public ConsultaNombrePrecioComicDTO consultarNombrePrecioComic(Long idComic) {
		
		
		String consulta = "SELECT new com.hbt.semillero.dto.ConsultaNombrePrecioComicDTO (c.nombre,c.precio)FROM Comic c WHERE c.id=:idComic";
		ConsultaNombrePrecioComicDTO consultaNombrePRecioComicDTO = new ConsultaNombrePrecioComicDTO();
		try {
			Query consultaNativa = em.createQuery(consulta);
			consultaNativa.setParameter("idComic", idComic);
			consultaNombrePRecioComicDTO= (ConsultaNombrePrecioComicDTO)consultaNativa.getSingleResult();
			consultaNombrePRecioComicDTO.setExitoso(true);
			consultaNombrePRecioComicDTO.setMensajeEjecucion("Se ejecuto correctamente");
			/*Object[]data = (Object[]) consultaNativa.getSingleResult();
			String nombre =(String)data [0];
			BigDecimal precios = (BigDecimal) data[1];*/
			
			
		}
		
		catch(Exception e) {
			
			consultaNombrePRecioComicDTO.setExitoso(false);
			consultaNombrePRecioComicDTO.setMensajeEjecucion("Se presento un error en la consulta");
			
		}
		
	  return consultaNombrePRecioComicDTO;
		
		
	}



@Override
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)	

	public ConsultarComicTamanioNombreDTO consultarComicTamanioNombre(String nombre) {
		
		
		String consulta = "SELECT new com.hbt.semillero.dto.ConsultarComicTamanioNombreDTO (c.nombre)FROM Comic c WHERE c.nombre=:nombre";
		ConsultarComicTamanioNombreDTO consultarComicTamanioNombreDTO = new ConsultarComicTamanioNombreDTO();
		try {
			Query consultaNativa = em.createQuery(consulta);
			consultaNativa.setParameter("nombre", nombre);
			consultarComicTamanioNombreDTO= (ConsultarComicTamanioNombreDTO)consultaNativa.getSingleResult();
			consultarComicTamanioNombreDTO.setExitoso(true);
			consultarComicTamanioNombreDTO.setMensajeEjecucion("Se ejecuto correctamente");
			/*Object[]data = (Object[]) consultaNativa.getSingleResult();
			String nombre =(String)data [0];
			BigDecimal precios = (BigDecimal) data[1];*/
			
			
		}
		
		catch(Exception e) {
			
			consultarComicTamanioNombreDTO.setExitoso(false);
			consultarComicTamanioNombreDTO.setMensajeEjecucion("Se presento un error en la consulta");
			
		}
		
	  return consultarComicTamanioNombreDTO;
		
		
	}

@Override
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public ComicDTO crearComic(ComicDTO comicDTO) throws Exception {
	// TODO Auto-generated method stub
	if(comicDTO.getNombre()==null) {
		throw new Exception("El campo nombre es obligatorio");
		
	}
	ComicDTO comicDTOResult= null;
	Comic comic = this.convertirComicToComicDTOComic(comicDTO);
	em.persist(comic);
	comicDTOResult = this.convertirComicToComicDTO(comic);
	comicDTOResult.setExitoso(true);
	comicDTOResult.setMensajeEjecucion("Se creo correctamente el comic");
	return comicDTOResult;
}

@Override
public ResultadoDTO actualizarComic(Long idComic) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public ResultadoDTO eliminarComic(Long idComic) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<ComicDTO> consultarComics() {
	// TODO Auto-generated method stub
	return null;
}
	
@SuppressWarnings("unused")
private ComicDTO convertirComicToComicDTO(Comic comic) {
	ComicDTO comicDTO = new ComicDTO();
	/*if(comic.getId()!=null) {
	comicDTO.setId(comic.getId());
		
	}*/
	
	comicDTO.setNombre(comic.getNombre());
	comicDTO.setEditorial(comic.getEditorial());
	comicDTO.setTematicaEnum(comic.getTematicaEnum());
	comicDTO.setColeccion(comic.getColeccion());
	comicDTO.setNumeroPaginas(comic.getNumeroPaginas());
	comicDTO.setPrecio(comic.getPrecio());
	comicDTO.setAutores(comic.getAutores());
	comicDTO.setColor(comic.getColor());
	comicDTO.setFechaVenta(comic.getFechaVenta());
	comicDTO.setEstadoEnum(comic.getEstadoEnum());
	comicDTO.setCantidad(comic.getCantidad());
	return comicDTO;
	
}


@SuppressWarnings("unused")
private Comic convertirComicToComicDTOComic(ComicDTO comicDTO) {
	Comic comic = new Comic();
	if(comicDTO.getId()!=null) {
		comic.setId(comic.getId());
		
	}
	
	comic.setNombre(comicDTO.getNombre());
	comic.setEditorial(comicDTO.getEditorial());
	comic.setTematicaEnum(comicDTO.getTematicaEnum());
	comic.setColeccion(comicDTO.getColeccion());
	comic.setNumeroPaginas(comicDTO.getNumeroPaginas());
	comic.setPrecio(comicDTO.getPrecio());
	comic.setAutores(comicDTO.getAutores());
	comic.setColor(comicDTO.getColor());
	comic.setFechaVenta(comicDTO.getFechaVenta());
	comic.setEstadoEnum(comicDTO.getEstadoEnum());
	comic.setCantidad(comicDTO.getCantidad());
	return comic;
	
}
 


//@Override
/*public ConsultaNombrePrecioComicDTO consultarNombrePrecioComic(Long idComic) {
	// TODO Auto-generated method stub
	return null;
}*/









}
