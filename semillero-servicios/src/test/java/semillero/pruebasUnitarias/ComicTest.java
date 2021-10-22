package semillero.pruebasUnitarias;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ComicTest {
	
	private final static Logger log = Logger.getLogger(OperacionesAritmeticasTest.class);
	@BeforeTest
	public void inicializar() {
		BasicConfigurator.configure();//Inicializa el logger con una configracion basica
		log.info("Inicia pruebas unitarias comic ");
	}
	
	
	@Test
	public void validarActivo() {
		log.info("Inicia ejecucion del metodo validarActivo()");
		
		int activo = 1;
		int inactivo = 2;
		int validador = 1;
		
		//Assert.assertFalse(condition);
		//Assert.assertTrue(condition);
		//Assert.assertEquals(expected, actual);
		//Assert.assertNotNull(object);
		//Assert.assertNull(object);
		Assert.assertEquals(validador,activo );
		
		log.info("Finaliza ejecucion del metodo validarActivo()");
		

	}
	
	
	@Test
	public void validarInactivo() {
		log.info("Inicia ejecucion del metodo validarInactivo()");
		
		int activo = 1;
		int inactivo = 2;
		int validador = 2;
		
		//Assert.assertFalse(condition);
		//Assert.assertTrue(condition);
		//Assert.assertEquals(expected, actual);
		//Assert.assertNotNull(object);
		//Assert.assertNull(object);
		Assert.assertEquals(validador,inactivo );
		
		log.info("Finaliza ejecucion del metodo validarInactivo()");
		

	}
	
	
	
	
	
	
	@Test
	public void validarComic() {
		log.info("Inicia  ejecucion del metodo validarComic()");
		
		int activo = 1;
		int inactivo = 2;
		int validador = 1;
		
		try {
			//Se espera un resultado true
			Assert.assertTrue(activo==validador);
			if(activo==validador) {
			 log.info("Se ha generado un error funcional probando el test");
			 throw new Exception("La validacion ha fallado");
				
			}
			
		} catch(Exception e) {
			Assert.assertEquals(e.getMessage(), "La validacion ha fallado");
			
		}
		
		log.info("Finaliza ejecucion del metodo validarComic()");
		
		
	}

}
