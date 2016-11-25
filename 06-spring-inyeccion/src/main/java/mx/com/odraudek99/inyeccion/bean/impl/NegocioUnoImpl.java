package mx.com.odraudek99.inyeccion.bean.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.com.odraudek99.inyeccion.bean.NegocioDos;
import mx.com.odraudek99.inyeccion.bean.NegocioUno;

@Component
public class NegocioUnoImpl implements NegocioUno {


	final static Logger logger = Logger.getLogger(NegocioUnoImpl.class);
	
	@Autowired
	public NegocioUnoImpl(NegocioDos negocioDos) {
		this.negocioDos = negocioDos;
	}
	
	private NegocioDos negocioDos;
	
	public String ejecutaNegocioUno(String parametroUno) {
		logger.info("parametroUno: "+parametroUno);
		return negocioDos.ejecutaNegocioDos(parametroUno);
	}
	
	

}
