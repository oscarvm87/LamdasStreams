package metodosreferenciados;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Persona> personas = 
				Arrays.asList(new Persona("Oscar",24),
						new Persona("Pepe",35),
						new Persona ("Eva",37));
		
		System.out.println("Personas no ordenadas: ");
		personas.forEach(p -> System.out.println(p));
		System.out.println("Personas ordenadas: ");
		//OPCION A
		Collections.sort(personas, Persona::comparaEdad);
		personas.forEach(p -> System.out.println(p));
		//OPCION B
		Collections.sort(personas, (p1,p2) -> p1.getEdad().compareTo(p2.getEdad()));
		personas.forEach(p -> System.out.println(p));
	}
}
