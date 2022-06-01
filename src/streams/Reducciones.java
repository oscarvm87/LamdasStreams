package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import metodosreferenciados.Persona;

public class Reducciones {

	public static void main(String[] args) {
		List<Persona> personas = 
				Arrays.asList( new Persona("Oscar",23)
						,new Persona ("Pepe",24)
						,new Persona ("Eva",14)
						,new Persona ("Tamara",44)
						,new Persona ("David",10));
		
		
		System.out.println("\nSuma numeros");
		int[] numeros = {1,2,3,4,5,6,7,8,9};
		System.out.println(IntStream.of(numeros).sum());
		
		
		System.out.println("\nSuma de edades personas");
		System.out.println(personas
				.stream()
				.mapToDouble(p -> p.getEdad())
				.sum());		
		
		System.out.println("\nPromedio de edades personas");
		System.out.println(personas
				.stream()
				.mapToDouble(p -> p.getEdad())
				.average().getAsDouble());
		
		System.out.println("\nPromedio de números");
		System.out.println(IntStream.of(numeros).average().getAsDouble());
		
		System.out.println("\nMinimo y Maximo de edades");
		System.out.println(personas
				.stream()
				.mapToInt(p -> p.getEdad())
				.min().getAsInt());
		System.out.println(personas
				.stream()
				.mapToInt(p -> p.getEdad())
				.max().getAsInt());		
		
		System.out.println("\nCantidad de personas");
		System.out.println(personas
				.stream()
				.mapToDouble(p -> p.getEdad())
				.count());
		
		System.out.println("\nCantidad de números");
		System.out.println(IntStream.of(numeros).count());		
		
		//sumaryStatistics().getAverage();
	}
}
