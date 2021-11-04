package com.hbt.semillero.rest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.hbt.semillero.entidad.Comic;
import com.hbt.semillero.enums.EstadoEnum;
/**
 * 
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author ALVNITRO
 * @version
 */

@Path("/SemilleroJPQLRest")
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class SemilleroJPQLRest {
	
	private final static Logger Log = Logger.getLogger(SemilleroJPQLRest.class);
	@PersistenceContext
	private EntityManager em;
	
	@GET
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	@SuppressWarnings("unchecked")
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public String obtenerUnComic() {
		//BasicConfigurator.configure();
		Comic comic= null;
		try {
			
			//Obtener un registro de la tabla comic haciendo uso del metodo find
			//Comic comic = em.find(Comic.class, 24L);
			// Select * from comic where id = 24
			comic= em.find(Comic.class, 4L);
			//consulta en JPQL para obtener un comic con el id 24 queemado hacinedo uso del metodo getSingle
			String consultaComic= "SELECT c FROM Comic c WHERE c.id=4";
			Query queryUnComic=em.createQuery(consultaComic);
			comic= (Comic)queryUnComic.getSingleResult();
			
			//Consulta en JPQL para obtener un comic con el id 24 haciendo uso del metodo getSingleResult y set
			String consultaComicConParametro= "SELECT c FROM Comic c WHERE c.id= : idComic";
			Query queryUnComicConParametro=em.createQuery(consultaComicConParametro);
			queryUnComicConParametro.setParameter("idComic" ,4L);
			Comic comic2 = (Comic) queryUnComicConParametro.getSingleResult();
			
			
			String findAllComic = "SELECT  cm FROM Comic cm";
			Query queryFinallComic= em.createQuery(findAllComic);
			List<Comic> listaComics = queryFinallComic.getResultList();
			//bloque para generar excepciones
			/*String consultaComicConExcepcion= "SELECT c FROM Comic c WHERE c.id=:idComic"
			+"AND  c.estadoEnum =: estadoComic"
			+"ORDER BY c.nombre DESC";
			
			Query queryUnComicConExcepcion=em.createQuery(consultaComicConExcepcion);
			queryUnComicConExcepcion.setParameter("idComic", 99L);
			queryUnComicConExcepcion.setParameter("estadoComic", EstadoEnum.ACTIVO);
			comic= (Comic)queryUnComicConExcepcion.getSingleResult();
			
			
			Query queryUnComicConExcepcion2=em.createQuery(consultaComicConExcepcion);
			queryUnComicConExcepcion.setParameter("idComic", 99L);
			queryUnComicConExcepcion.setParameter("estadoComic", EstadoEnum.ACTIVO);
			comic= (Comic)queryUnComicConExcepcion2.getSingleResult();
			*/
			
			//Creacion del comic superman
			Comic comicSuperman = new Comic();
			comicSuperman.setNombre("Superman");
			comicSuperman.setEditorial("dc");
			comicSuperman.setColeccion("Marvel");
			comicSuperman.setNumeroPaginas(100);
			comicSuperman.setPrecio(new BigDecimal(30000));
			comicSuperman.setCantidad((short) 3L);
			em.persist(comicSuperman);
			
			
			comicSuperman= this.consultarComicPorNombre("Superman");
			
			comicSuperman.setPrecio(new BigDecimal(600));
			comicSuperman.setCantidad((short) 9L);
			em.merge(comicSuperman);
			//Actualizar y eliminar mediante un identificador
			String actualizarComic = "UPDATE Comic c SET c.estadoEnum =:estado WHERE c.id =:idComic ";
			Query queryActualizar = em.createQuery(actualizarComic);
			queryActualizar.setParameter("estado", EstadoEnum.ACTIVO);
			queryActualizar.setParameter("idComic", 32L);
			queryActualizar.executeUpdate();
			
			
			String eliminarComic = "DELETE FROM Comic  WHERE id =:idComic ";
			Query queryEliminar = em.createQuery(eliminarComic);
			queryEliminar.setParameter("idComic", 32L);
			queryEliminar.executeUpdate();
			
			
			
			//Actualizar y eliminar varop
			List <Long> idsComics = new ArrayList<>();
			idsComics.add(32L);
			idsComics.add(26L);
			idsComics.add(25L);
			idsComics.add(99L);
			String actualizarVarios = "UPDATE Comic c SET c.estadoEnum =:estado WHERE c.id IN (:listIdComics) ";
			Query queryActualizarVarios = em.createQuery(actualizarVarios);
			queryActualizarVarios.setParameter("estado", EstadoEnum.ACTIVO);
			queryActualizarVarios.setParameter("listIdComics", idsComics);
			queryActualizarVarios.executeUpdate();
			
			
			String eliminarVarios = "DELETE FROM Comic  WHERE id =:idComic ";
			Query queryEliminarVArios = em.createQuery(eliminarComic);
			queryEliminar.setParameter("idComic", 32L);
			queryEliminar.executeUpdate();
			
			String consulta = "SELECT SCNOMBRE FROM COMIC WHERE SCID=:idComic";
			Query consultaNativa = em.createNativeQuery(consulta);
			consultaNativa.setParameter("idComic", 32L);
			String nombreComic =(String) consultaNativa.getSingleResult();
			
			/*comicSuperman= this.consultarComicPorNombre(comicSuperman);
			
			em.remove(comicSuperman);
			comicSuperman= this.consultarComicPorNombre(comicSuperman);*/
			
		}
		catch(NonUniqueResultException nur) {
			Log.info("Existe mas de un registro" +nur.getMessage());
			
		}
		
		catch(NoResultException   nre) {
			Log.info("No se encontraron registro del id"+nre.getMessage());
					
				}
		
		catch (Exception e){
			Log.info("Se ha presentado un error tecnico"+e.getMessage());
			return e.getMessage();
			
		}
		
		
		
		return comic.toString();
		
	}
	
	private Comic consultarComicPorNombre(String nombreComic) {
		
		String consultaComicCSuperman= "SELECT c FROM Comic c WHERE c.nombre= : nombreComic";
		Query querySuperman=em.createQuery(consultaComicCSuperman);
		querySuperman.setParameter("nombreComic" ,nombreComic);
		Comic  comicSuperman = (Comic) querySuperman.getSingleResult();
		
		return comicSuperman;
		
		
	}

}
