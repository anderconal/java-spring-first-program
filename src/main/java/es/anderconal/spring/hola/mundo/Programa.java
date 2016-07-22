package es.anderconal.spring.hola.mundo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Programa {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("es/anderconal/spring/hola/mundo/beans/beans.xml");
		
		Persona persona = (Persona) context.getBean("persona");
		persona.hablar();
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
