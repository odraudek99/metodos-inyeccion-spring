package mx.com.odraudek99.inyeccion.bean.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import mx.com.odraudek99.inyeccion.bean.NegocioDos;
import mx.com.odraudek99.inyeccion.bean.NegocioUno;

public class NegocioUnoImpl implements NegocioUno {


	final static Logger logger = Logger.getLogger(NegocioUnoImpl.class);
	
	@Autowired
	private NegocioDos negocioDos;
	
	public String ejecutaNegocioUno(String parametroUno) {
		logger.info("parametroUno: "+parametroUno);
		return negocioDos.ejecutaNegocioDos(parametroUno);
	}
	
	

}
