package mx.com.odraudek99.inyeccion;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import mx.com.odraudek99.inyeccion.bean.impl.NegocioDosImpl;
import mx.com.odraudek99.inyeccion.bean.impl.NegocioUnoImpl;

@Configuration
@ComponentScan
public class Main {
	

	final static Logger logger = Logger.getLogger(Main.class);
	
	@Bean
    public NegocioUnoImpl negocioUno() {
        return new NegocioUnoImpl();
    }
	
	@Bean
    public NegocioDosImpl negocioDos() {
        return new NegocioDosImpl();
    }
	
	public static void main(String args[]){
		ApplicationContext context =  new AnnotationConfigApplicationContext(Main.class);
		
		NegocioUnoImpl negocioUno = (NegocioUnoImpl) context.getBean(NegocioUnoImpl.class);
		
		String respuesta = negocioUno.ejecutaNegocioUno("Hola mundo");
		
		logger.info("respuesta: "+respuesta);
		
	}

}
