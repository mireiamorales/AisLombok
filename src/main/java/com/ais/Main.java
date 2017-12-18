package com.ais;

import java.util.List;

import lombok.extern.log4j.Log4j;

@Log4j
public class Main {

	public static void main(String[] args) {
		
		GettersAndSetters gettersAndSetters = new GettersAndSetters(1, "hola");
		
		gettersAndSetters.setFlag(true);
		List<String> lista = gettersAndSetters.getStrList();
		System.out.println(gettersAndSetters.toString());
		
		GettersAndSetters gettersAndSetters2 = new GettersAndSetters(1, "hola2");
		gettersAndSetters2.setFlag(gettersAndSetters2.equals(gettersAndSetters));
		System.out.println(gettersAndSetters2.toString());
		
		
		WithoutLombokAnnotations withoutLombok = new WithoutLombokAnnotations(1, "hola");		
		withoutLombok.setFlag(withoutLombok.equals(gettersAndSetters));		
		System.out.println(withoutLombok.toString());
			
		
		//Pruebas Log4j (log4j.properties en src/main/resources)
	    log.info("This is information");
		
		log.debug("This is debug");
		
		log.error("This is error: " + "parametro");

		log.fatal("This is fatal: "+ "excepcion");
	}

}
