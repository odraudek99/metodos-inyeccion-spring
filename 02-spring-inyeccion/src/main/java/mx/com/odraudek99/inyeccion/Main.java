package mx.com.odraudek99.inyeccion;

import org.apache.log4j.Logger;

import mx.com.odraudek99.inyeccion.bean.NegocioUno;
import mx.com.odraudek99.inyeccion.bean.impl.NegocioUnoImpl;

public class Main {
	

	final static Logger logger = Logger.getLogger(Main.class);
	
	public static void main(String args[]){
		NegocioUno negocioUno = new NegocioUnoImpl();
		String respuesta = negocioUno.ejecutaNegocioUno("Hola mundo");
		
		logger.info("respuesta: "+respuesta);
		
	}

}
