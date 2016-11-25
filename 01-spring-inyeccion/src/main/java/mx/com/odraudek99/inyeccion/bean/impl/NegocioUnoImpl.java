package mx.com.odraudek99.inyeccion.bean.impl;

import org.apache.log4j.Logger;

public class NegocioUnoImpl {


	final static Logger logger = Logger.getLogger(NegocioUnoImpl.class);
	
	private NegocioDosImpl negocioDosImpl = new NegocioDosImpl();
	
	public String ejecutaNegocioUno(String parametroUno) {
		logger.info("parametroUno: "+parametroUno);
		return negocioDosImpl.ejecutaNegocioDos(parametroUno);
	}
	
	

}
