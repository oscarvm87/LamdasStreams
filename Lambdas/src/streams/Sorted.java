package streams;

import java.util.Arrays;
import java.util.List;

import metodosreferenciados.Persona;

public class Sorted {

	public static void main(String[] args) {
		List<Persona> personas = 
				Arrays.asList( new Persona("Oscar",23)
						,new Persona ("Pepe",24)
						,new Persona ("Eva",14)
						,new Persona ("Tamara",44)
						,new Persona ("David",10));
		
		System.out.println("\nPersonas");
		personas
			.stream()
			.forEach(p -> System.out.println(p.getNombre()));
		
		System.out.println("\nPersonas por nombre");
		personas
			.stream()
			.sorted((p1,p2)-> p1.getNombre().compareTo(p2.getNombre()))
			.forEach(p -> System.out.println(p.getNombre()));			
	}

}
