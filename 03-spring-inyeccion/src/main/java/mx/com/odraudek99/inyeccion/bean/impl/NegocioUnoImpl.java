package mx.com.odraudek99.inyeccion.bean.impl;

import org.apache.log4j.Logger;

import mx.com.odraudek99.inyeccion.bean.NegocioDos;
import mx.com.odraudek99.inyeccion.bean.NegocioUno;

public class NegocioUnoImpl implements NegocioUno {


	final static Logger logger = Logger.getLogger(NegocioUnoImpl.class);
	
	private NegocioDos negocioDos;
	
	public String ejecutaNegocioUno(String parametroUno) {
		logger.info("parametroUno: "+parametroUno);
		return negocioDos.ejecutaNegocioDos(parametroUno);
	}

	public NegocioDos getNegocioDos() {
		return negocioDos;
	}

	public void setNegocioDos(NegocioDos negocioDos) {
		this.negocioDos = negocioDos;
	}
	
	

}
