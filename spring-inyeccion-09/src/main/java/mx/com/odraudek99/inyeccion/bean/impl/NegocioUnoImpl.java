package mx.com.odraudek99.inyeccion.bean.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class NegocioUnoImpl {


	final static Logger logger = Logger.getLogger(NegocioUnoImpl.class);
	
	@Autowired
	private NegocioDosImpl negocioDos;
	
	public String ejecutaNegocioUno(String parametroUno) {
		logger.info("parametroUno: "+parametroUno);
		return negocioDos.ejecutaNegocioDos(parametroUno);
	}
	
	

}
