package es.anderconal.spring.hola.mundo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Programa {
	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		
		Persona persona = (Persona) context.getBean("persona");
		persona.hablar();
		
		((FileSystemXmlApplicationContext)context).close();
	}
}
