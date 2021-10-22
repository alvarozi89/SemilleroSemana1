package semillero.pruebasUnitarias;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
//import org.junit.Assert;

/**
 * 
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author ALVNITRO
 * @version
 */


public class OperacionesAritmeticasTest {
/*
 * Constante que contendra el log de la clase aritmetica
 */
private final static Logger log = Logger.getLogger(OperacionesAritmeticasTest.class);

@BeforeTest
public void inicializar() {
	BasicConfigurator.configure();//Inicializa el logger con una configracion basica
	log.info("Inicia pruebas unitarias ");
}

/**
 * 
 * Metodo encargado de probar el resultado de la suma de dos numeros
 * <b>Caso de Uso</b>
 * @author ALVNITRO
 *
 */

//@Test(enabled= true) prueba inactiva
@Test
public void validarResultadoSumaExitosa() {
	log.info("Inicia ejecucion del metodo validarResultadoSumaExitosa()");
	
	int numero1 = 300;
	int numero2 = 150;
	int resultado = 450;
	
	//Assert.assertFalse(condition);
	//Assert.assertTrue(condition);
	//Assert.assertEquals(expected, actual);
	//Assert.assertNotNull(object);
	//Assert.assertNull(object);
	Assert.assertEquals(resultado, numero1+numero2);
	
	log.info("Finaliza ejecucion del metodo validarResultadoSumaExitosa()");
	

}
@Test
public void validarResultadoSumaFallido() {
	log.info("Inicia  ejecucion del metodo validarResultadoSumaFallido()");
	
	int numero1 = 300;
	int numero2 = 150;
	int resultado = 455;
	
	try {
		//Se espera un resultado true
		Assert.assertTrue(resultado != numero1+numero2);
		if(resultado !=(numero1+ numero2)) {
		 log.info("Se ha generado un error funcional probando el test");
		 throw new Exception("La suma ha fallado en el calculo");
			
		}
		
	} catch(Exception e) {
		Assert.assertEquals(e.getMessage(), "La suma ha fallado en el calculo");
		
	}
	
	log.info("Finaliza ejecucion del metodo validarResultadoSumaFallido()");
	
	
}



@AfterTest
public void FinalizaPruebasUnitarias() {
	
	log.info("Finalizan las pruebas ");
}


}
