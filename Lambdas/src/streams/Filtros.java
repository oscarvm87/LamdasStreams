package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import metodosreferenciados.Persona;

public class Filtros {

	public static void main(String[] args) {
		List<Persona> personas = 
				Arrays.asList( new Persona("Oscar",23)
						,new Persona ("Pepe",24)
						,new Persona ("Eva",14)
						,new Persona ("Tamara",44)
						,new Persona ("David",10));
		
		
		System.out.println("Personas sin ordenar: ");
		personas.forEach(p -> System.out.println(p));
		
		System.out.println("\nPersonas ordenadas por edad: ");
		Collections.sort(personas, (p1,p2) -> p1.getEdad().compareTo(p2.getEdad()));
		personas.forEach(p -> System.out.println(p));
		List<Persona> personasFinal = personas.stream().filter(p -> p.getEdad() >= 18).collect(Collectors.toList());
		System.out.println(personasFinal);
		
		//FILTROS
		System.out.println("\nFiltro mayores de edad: ");		
		personas.stream()
			.filter(p -> p.getEdad() >= 18)
			.forEach(p -> System.out.println(p));
		
		System.out.println("\nFiltro entre 20 y 30 años: ");		
		personas.stream()
			.filter(p -> p.getEdad() >= 20 && p.getEdad() <= 30)
			.forEach(p -> System.out.println(p));
		
		System.out.println("\nFiltro entre 20 y 30 años con predicados: ");
		Predicate<Persona> p20 = p -> p.getEdad() >= 20;
		Predicate<Persona> p30 = p -> p.getEdad() <= 30;	
		Predicate<Persona> finalFilter = p20.and(p30);
		
		personas.stream()
			.filter(finalFilter)
			.forEach(p -> System.out.println(p));
		System.out.println("\nNumero de personas entre 20 y 30 años con predicados: " +personas.stream().filter(finalFilter).count());	
	}
}
