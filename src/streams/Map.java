package streams;

import java.util.Arrays;
import java.util.List;

import metodosreferenciados.Persona;

public class Map {

	public static void main(String[] args) {
		List<Persona> personas = 
				Arrays.asList( new Persona("Oscar",23)
						,new Persona ("Pepe",24)
						,new Persona ("Eva",14)
						,new Persona ("Tamara",44)
						,new Persona ("David",10));
		
		//FILTRAMOS LOS QUE SEAN MAYORES DE EDAD Y OBTENEMOS EL NOMBRE
		System.out.println("\nFILTRAMOS LOS QUE SEAN MAYORES DE EDAD Y OBTENEMOS EL NOMBRE");
		personas.stream()
			.filter(p -> p.getEdad() >= 18)
			.map(p -> p.getNombre())
			.forEach(p -> System.out.println(p));
		
		//FILTRAMOS LOS QUE SEAN MAYORES DE EDAD Y OBTENEMOS LA EDAD
		System.out.println("\nFILTRAMOS LOS QUE SEAN MAYORES DE EDAD Y OBTENEMOS LA EDAD");
		personas.stream()
			.filter(p -> p.getEdad() >= 18)
			.map(p -> p.getEdad())
			.forEach(p -> System.out.println(p));
		
		//MULTIPLICAMOS POR 2 LAS EDADES
		System.out.println("\nMULTIPLICAMOS POR 2 LAS EDADES");
		personas.stream()
			.map(p -> p.getEdad()*2)
			.forEach(p -> System.out.println(p));
		
		//SUMAMOS TODAS LAS EDADES
		System.out.println("\nSUMA DE EDADES");
		double suma = personas.stream()
			.mapToDouble(p -> p.getEdad())
			.sum();
		System.out.println(suma);
	}
}
