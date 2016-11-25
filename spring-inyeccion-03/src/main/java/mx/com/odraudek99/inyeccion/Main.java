package mx.com.odraudek99.inyeccion;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mx.com.odraudek99.inyeccion.bean.NegocioUno;

public class Main {
	

	final static Logger logger = Logger.getLogger(Main.class);
	
	public static void main(String args[]){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/spring.xml");
		
		NegocioUno negocioUno = (NegocioUno) context.getBean(NegocioUno.class);
		String respuesta = negocioUno.ejecutaNegocioUno("Hola mundo");
		
		logger.info("respuesta: "+respuesta);
	}

}
