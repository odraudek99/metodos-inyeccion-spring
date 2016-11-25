package mx.com.odraudek99.inyeccion.bean.impl;

import org.apache.log4j.Logger;

public class NegocioDosImpl {

	final static Logger logger = Logger.getLogger(NegocioUnoImpl.class);
	
	public String ejecutaNegocioDos(String parametroDos) {
		logger.info("parametroDos: "+parametroDos);
		return "Regresa un parametro: "+parametroDos;
	}

}
